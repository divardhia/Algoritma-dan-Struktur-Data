/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugastiga;
import java.util.Scanner;
/**
 *
 * @author ASUS X441MA
 */
public class missisiipi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char huruf [] = {'M', 'I', 'S', 'S', 'I', 'S', 'S', 'I', 'P', 'I'};
        int a=0, b=0, c=0, d=0;
        for (int i=0; i<10; i++){
            switch (huruf[i]){
                case 'M':
                    a++;
                    break;
                case 'I':
                    b++;
                    break;
                case 'S':
                    c++;
                    break;
                case 'P':
                    d++;
                    break;
            }
        }
            System.out.println("Huruf M Ada : "+a);
            System.out.println("Huruf I Ada : "+b);
            System.out.println("Huruf S Ada : "+c);
            System.out.println("Huruf P Ada : "+d);
    }
}
