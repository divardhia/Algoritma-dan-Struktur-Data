
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diva ardhia
 */
public class Main {

    public static void main(String[] args) {
        LinkedList input = new LinkedList();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("add data : ");
            for (int i = 0; i < 12; i++) {
                System.out.print((i + 1) + "\t : ");
                double data1 = sc.nextDouble();
                System.out.print((i + 1) + "\t : ");
                double data2 = sc.nextDouble();
                System.out.print((i + 1) + "\t : ");
                double data3 = sc.nextDouble();
                System.out.println();
                input.add(data1, data2, data3);
            }
            System.out.println();
            System.out.println("\t 2018 \t\t 2019 \t\t 2020");
            input.print();
            input.clear();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
