
import java.awt.Point;
import java.math.BigInteger;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edwin
 */
public class ECC {
    
    /*ATTRIBUTES*/
    
    //elliptic equation coefficient -> (y2=x3+ax+b)%m
    static long a;
    static long b;
    static long m; // m is prime number
    
    //Galois Field
    ArrayList<Point> GaloisField; //list of points satisfy Galois field
    
    //point multiplication eq. -> q=k.p
//    Point q; //will be public key
    long k; //will be private key
    Point p; // basis point
    
    //constructor
    public ECC(long a, long b, long m){
        this.a = a;
        this.b = b;
        this.m = m;
        GaloisField = new ArrayList<Point>();
    }
    
    public void setK(long k){
        this.k = k;
    }
    
    public void setP(Point p){
        this.p = p;
    }
    
    //get galois field points
    public void countGaloisField(){
        for (long i = 0;i<m;i++){
            long x = i; 
            long y2 = (((x*x*x)+(a*x)+b)) % m;
            for(long j =0;j<m;j++){
                if (((j*j) % m) == y2){
                    GaloisField.add(new Point((int)x,(int)j));
                }
            }
        }  
    }
    
    public static Point doDouble(Point p){
        if (p.y==0){
            p.y = (int) Long.MAX_VALUE;
        }
        long lambda;
        Point out = new Point();
        
        lambda = (((3*p.x*p.x) % m) + a) % m;
        BigInteger inv = BigInteger.valueOf(2*p.y).modInverse(BigInteger.valueOf(m));
        long invs = inv.longValue();
        
        lambda *= invs;
        
        lambda %= m;
        
        out.x = (int) (((lambda*lambda) - (2*p.x)) % m);
        out.y = (int) (((lambda*(p.x-out.x)) - p.y) % m);
        
        if (out.y < 0){
            out.y += m;
        }
//        out.x = (((lambda*lambda) % m) - (2*p.x % m) + m) % m;
//        out.y = (((lambda*(p.x - out.x)) % m) - p.y + m) % m;
        
        return out;
    }
    
    public static Point doPlus(Point p, Point q){
        Point out = new Point();
        if (p.x == Long.MAX_VALUE ){
            out.x = q.x;
            out.y = q.y;
        }
        else if (q.x == Long.MAX_VALUE){
            out.x = p.x;
            out.y = p.y;
        }
        else if(p.x == 0 && p.y == 0){
            out = q;
        }
        else if(q.x == 0 && q.y == 0){
            out = p;
        }
        else{
            long lambda = (p.y - q.y + m) % m;
            System.out.println("pxqx "+(p.x-q.x));
            BigInteger inv = BigInteger.valueOf(p.x - q.x).modInverse(BigInteger.valueOf(m));
            long invs = inv.longValue();
            lambda *= invs;
            
            out.x = (int) (((lambda*lambda) - p.x - q.x) % m);
            
            out.y = (int) (((lambda*(p.x-out.x)-p.y)%m));
            if (out.y<0){
                out.y+=m;
            }
        }
        return out;
    }
    
    public static Point doMinus(Point p,Point q){
        Point tempQ = new Point();
        
        tempQ.x = q.x;
        tempQ.y = -q.y;
        
        return (doPlus (p,tempQ));
        
    }
    
    // scalar multiplication of a point, count q -> q= k.p
    public static void doScalarMultiply(long k, Point p,Point out){
        long temp = k;
        Point tempP = p;
        
//        while(temp>=2){
//            if (k%2 != 0){
//                out = doPlus(out,tempP);
//                System.out.println("out after plus "+out);
//            }
//            tempP = doDouble(tempP);
//            System.out.println("tempP "+tempP);
//            k = temp;
//            temp = k/2;
//        }
//            if(temp>=2){
//                doScalarMultiply(temp, out);
//            }
        if (temp == 1){
            out = doPlus(out,p);
        }else if(temp >= 2){
            doScalarMultiply(temp/2, p, out);
            out = doDouble(out);
            if (temp % 2 > 0){
                out = doPlus(out,p);
            }
        }
    }
    
    public static void main(String[] args){
        ECC a = new ECC(1,6,11);
        a.countGaloisField();
//        for (long i = 0;i<a.GaloisField.size();i++){
//            System.out.println("G"+i+" "+a.GaloisField.get((int) i));
//        }
        System.out.println("doPlus: "+a.doPlus(new Point(2,4),new Point(5,9)));
        System.out.println("doMinus: "+a.doMinus(new Point(2,4),new Point(5,9)));
        System.out.println("doback: "+a.doPlus(new Point(5,9),a.doMinus(new Point(2,4),new Point(5,9))));
        System.out.println("doDouble "+a.doDouble(new Point(2,4)));
        Point pri = new Point (0,0);
        a.doScalarMultiply(5,new Point(0,1),pri);
        System.out.println("doMultiply "+pri);     
    }
    
//    public Point getQ(){
//        return this.q;
//    }
    
}
