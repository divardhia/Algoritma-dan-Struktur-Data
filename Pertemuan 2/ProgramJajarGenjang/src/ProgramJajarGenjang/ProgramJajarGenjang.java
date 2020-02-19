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
public class ProgramJajarGenjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JajarGenjang[] jgArray = new JajarGenjang[5];
        jgArray[0] = new JajarGenjang (10, 4, 5);
        jgArray[1] = new JajarGenjang (20, 10, 12);
        jgArray[2] = new JajarGenjang (15, 6, 7);
        jgArray[3] = new JajarGenjang (25, 10, 8);
        jgArray[3] = new JajarGenjang (9, 7, 6);
        
        for (int i=0; i<5; i++){
            System.out.println("Jajar Genjang ke- " +i+ " Panjang = "+jgArray[i].panjang+ ", Tinggi = "+jgArray[i].tinggi+ ", Sisi Miring = " +jgArray[i].sisiMiring);
            System.out.println();
        }
        for (int i=0; i<5; i++){
            System.out.println("Luas Jajar Genjang ke- " +i+ " Adalah "+jgArray[i].hitungLuas());
            System.out.println();
        }
        for (int i=0; i<5; i++){
            System.out.println("Keliling Jajar Genjang ke- " +i+ " Adalah "+jgArray[i].hitungKeliling());
        }
    }
    
}
