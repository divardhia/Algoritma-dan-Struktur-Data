/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsi;

/**
 *
 * @author ASUS X441MA
 */
public class fungsiA {
    static void fibonacci(){
        int n = 10, a = 0, h = 1, s;
                
        for(int i = 2; i <= n; i++){
            System.out.print(a + " ");
            s = a + h;
            a = h;
            h = s;
        }
    }
        
    public static void main(String[] args){
        fibonacci();
    }
}
