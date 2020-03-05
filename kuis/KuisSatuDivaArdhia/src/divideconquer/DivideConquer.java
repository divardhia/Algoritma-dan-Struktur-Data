/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package divideconquer;

/**
 *
 * @author diva ardhia
 */
public class DivideConquer {

    public static void tOH(int numDisc, char source, char destination, char spare) {
        if (numDisc > 1) {
            tOH(numDisc - 1, source, spare, destination);
            System.out.println("Pindah Gelang " + numDisc + " dari tower " + source + " ke tower " + destination);
            tOH(numDisc - 1, spare, destination, source);
        } else {
            System.out.println("Pindah 1 Gelang dari tower " + source + " ke tower " + destination);
        }
    }

    public static void main(String[] args) {
        int n = 4;
        tOH(n, 'A', 'C', 'B');
    }
}
