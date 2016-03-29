
import java.awt.Point;
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
    int a;
    int b;
    int m; // m is prime number
    
    //Galois Field
    ArrayList<Point> GaloisField; //list of points satisfy Galois field
    
    //point multiplication eq. -> q=k.p
    long q; //will be public key
    long k; //will be private key
    long p; // basis point
    
    //constructor
    public ECC(int a, int b, int m){
        this.a = a;
        this.b = b;
        this.p = m; 
    }
    
    public void setK(long k){
        this.k = k;
    }
    
    public void setP(long p){
        this.p = p;
    }
    
    //get galois field points
    public void countGaloisField(){
        
    }
    
    // scalar multiplication of a point, count q -> q= k.p
    public void doScalarMultiply(int k){
        
    }
    
    public long getQ(){
        return this.q;
    }
    
}
