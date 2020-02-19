/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramKampus;

/**
 *
 * @author ASUS X441MA
 */
public class Kampus {

    public int jumlah;
    public int nilai1, nilai2;

    public int nilaiTerbaik(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }
}
