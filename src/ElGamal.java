
import java.awt.Point;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javafx.util.Pair;
import javax.xml.bind.DatatypeConverter;

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
    
    public Pair<Point, Point> Encrypt(Point Pm, long k, Point pub, Point B){
        
        Pair<Point, Point> Pc = new Pair(ECC.doScalarMultiply(k, B), ECC.doPlus(Pm, ECC.doScalarMultiply(k, pub)));
        
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
    
    public String EncryptElGamal(String message, Point pub, Point B) throws UnsupportedEncodingException{
        String res = ""; //hexadecimal
        ArrayList<Point> Pm = toPoints(message);
        System.out.println("Pm size"+ Pm.size());
        ArrayList<Byte> bytes = new ArrayList<>();
        for(int i=0; i<Pm.size(); i++){
            long k = (long)(Math.random() * (255-0)); // RANDOM K
            Pair<Point,Point>Pc = Encrypt(Pm.get(i),k,pub,B); //encrypt
            byte b1 = (byte) getIndex(Pc.getKey());
            bytes.add(b1);
            byte b2 = (byte) getIndex(Pc.getValue());
            bytes.add(b2);
        }
        System.out.println("bytes size "+bytes.size());
        byte[] bytesArr = new byte[bytes.size()];
        for (int i = 0; i < bytes.size(); i++) {
          bytesArr[i] = bytes.get(i);
        }
        res = byteToHexa(bytesArr);
        System.out.println("");
        return res;
    }
    
    public String DecryptElGamal(String ciphertext, long priB) throws UnsupportedEncodingException{
        String res = ""; //decrypted string
        ArrayList<Pair<Point,Point>>Pc = toPointPair(ciphertext);
        for(int i=0; i<Pc.size(); i++){
            Point Pm = Decrypt(Pc.get(i),priB);
            res += Character.toString((char)getIndex(Pm));
        }
        return res;
    }
    
    public ArrayList<Pair<Point,Point>> toPointPair(String ciphertext) throws UnsupportedEncodingException{
        byte[] b = hexaToByte(ciphertext);
        ArrayList<Pair<Point,Point>> res = new ArrayList<>();
        for(int i=0; i<b.length; i+=2){
            Point key = ECC.GaloisField.get(b[i] & 0xFF);
            Point value = ECC.GaloisField.get(b[i+1] & 0xFF);
            res.add(new Pair(key, value));
        }
        
        return res;
    }
            
    public int getIndex(Point P){
        for(int i=0; i<ECC.GaloisField.size(); i++){
            if(P.equals(ECC.GaloisField.get(i)))
                return i;
        }
        return -1;
    }
    
    public String byteToHexa(byte[] bytes){
        String res = "";
        res += DatatypeConverter.printHexBinary(bytes);
//        for (int i = 0;i<bytes.length;i++){
////            System.out.print("0x"+Integer.toHexString(bytes[i] & 0xFF) + " ");
//            System.out.println("byte"+i+" "+bytes[i]);
//            
//            System.out.println("res" + res);
//        }
        
        return res;
    }
    
    public byte[] hexaToByte(String hexString) throws UnsupportedEncodingException{
        byte[] byteRes = DatatypeConverter.parseHexBinary(hexString);
//        String result= new String(byteRes, "UTF-8");
        return byteRes;
    }
    
    public static void main(String[] args) throws UnsupportedEncodingException{
        ECC.setEq(43, 46, 241);
        ECC.countGaloisField();
//        for (long i = 0;i<ECC.GaloisField.size();i++){
//            System.out.println("G"+i+" "+ECC.GaloisField.get((int) i));
//        }
        String message = "Hello World";
        ElGamal E = new ElGamal();
        long priB = 105;
        Point B = new Point(12,230); //basis
        Point pub = E.generatePublicKey(priB, B);
        String encrypted = E.EncryptElGamal(message,pub,B);
        System.out.println("Encrypt: "+ encrypted);
        String decrypted = E.DecryptElGamal(encrypted, priB);
        System.out.println("Decrypt " + decrypted);
    }
}
