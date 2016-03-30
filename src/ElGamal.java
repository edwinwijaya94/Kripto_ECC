
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
        
        return null;
    }
  
    
}
