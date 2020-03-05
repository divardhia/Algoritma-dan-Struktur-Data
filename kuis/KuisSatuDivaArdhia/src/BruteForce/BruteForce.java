/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BruteForce;

/**
 *
 * @author diva ardhia
 */
public class BruteForce {

    public static void match(char[] t, char[] p) {
        int j;
        int cek = 0;

        for (int i = 0; i <= t.length - p.length; i++) {
            j = 0;

            while (j < p.length && t[i + j] == p[j]) {
                j++;
            }
            if (j >= p.length) {
                cek++;
            }
        }
        if (cek > 0) {
            System.out.println("DATA COCOK");
        } else {

        }
    }

    public static void main(String[] args) {
        char[] x = {'N', 'G', 'A'};
        char[] y = {'S', 'E', 'M', 'A', 'N', 'G', 'A', 'T'};
        match(y, x);
    }
}
