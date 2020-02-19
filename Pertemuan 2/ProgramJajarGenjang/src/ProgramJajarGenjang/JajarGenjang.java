/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramJajarGenjang;

/**
 *
 * @author ASUS X441MA
 */
public class JajarGenjang {
    int panjang;
    int tinggi;
    int sisiMiring;
    
    public JajarGenjang (int p,int t, int s){
        panjang = p;
        tinggi = t;
        sisiMiring = s;
    }
    
    public int  hitungLuas(){
        return panjang * tinggi;
    } 
    public int  hitungKeliling(){
        return (panjang*2) + (sisiMiring*2);
    } 
}
