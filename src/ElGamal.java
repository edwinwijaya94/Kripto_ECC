
import java.awt.Point;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javafx.util.Pair;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Edwin
 */
public class ElGamal {
    
    public Point generatePublicKey(long k, Point B){
        Point q = ECC.doScalarMultiply(k, B);
        return q;
    }
    
    public Pair<Point, Point> Encrypt(Point Pm, long priA, Point pub, Point B){
        
        Pair<Point, Point> Pc = new Pair(ECC.doScalarMultiply(priA, B), ECC.doPlus(Pm, ECC.doScalarMultiply(priA, pub)));
        
        return Pc;
    }
    
    public Point Decrypt(Pair<Point,Point>Pc, long priB){
        Point Pm = new Point(ECC.doMinus(Pc.getValue() ,ECC.doScalarMultiply(priB,Pc.getKey())));
        
        return Pm;
    }
    
    
    public ArrayList<Point> toPoints(String message) throws UnsupportedEncodingException{
        byte[] b = message.getBytes("UTF-8");
        ArrayList<Point> res = new ArrayList<>();
        for(int i=0; i<b.length; i++){
            int temp = b[i];
            res.add(ECC.GaloisField.get(temp));
        }
        
        return res;
    }
  
    public static void main(String[] args){
        ECC.setEq(12, 14, 307);
        ECC.countGaloisField();
        for (long i = 0;i<ECC.GaloisField.size();i++){
            System.out.println("G"+i+" "+ECC.GaloisField.get((int) i));
        }
        
        ElGamal E = new ElGamal();
        long priB = 3;
        long priA = 5;
        Point B = new Point(2,53); //basis
        Point Pm= new Point(111,8); //message
        Point pub = E.generatePublicKey(priB, B);
        System.out.println("Pub Bob "+ pub.toString());
        Pair<Point,Point>Pc = E.Encrypt(Pm, priA, pub, B);
        System.out.println("encrypted " + Pc.toString());  
        Point res = E.Decrypt(Pc, priB);
        System.out.println("Decrypted " + res);
    }
}
