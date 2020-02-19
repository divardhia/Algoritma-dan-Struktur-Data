/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPacman;

import java.util.Scanner;

/**
 *
 * @author ASUS X441MA
 */
public class MainPacman {

    static Scanner input = new Scanner(System.in);
		
	public static void setting(){
		System.out.println("Game PacMan : ");
		System.out.println("w = bergerak ke atas");
		System.out.println("s = bergerak ke bawah");
		System.out.println("a = bergerak ke kiri");
		System.out.println("d = bergerak ke kanan");
		
	}

	public static void warning(){
		System.out.println("Mohon masukkan input yang tepat !!!");
		input();

	}

	public static void over(){
		System.out.println("Koordinat tidak boleh kurang dari 0 !!!");
		input();
	}

	public static void input(){
		Pacman pc = new Pacman();
		pc.width = 5;
		pc.height = 5;

		setting();
		System.out.print("Masukkan kontrol : ");
		pc.select = input.nextLine() .toLowerCase();

		switch (pc.select) {
			case "w": 
						if ((pc.y-1) < 0) {
							over();
						}
			break;
			case "s":
						if ((pc.y + 1) >= pc.width) {
							over();
						}
						
			break;
			case "a":	
						if ((pc.x-1) < 0) {
							over();
						}
			break;
			case "d":
						if ((pc.x + 1) >= pc.height) {
							over();
						}						
			break;
			default:
		}

		switch(pc.select){
			case "w" : pc.moveUp();
			break;
			case "s" : pc.moveDown();
			break;
			case "a" : pc.moveLeft();
			break;
			case "d" : pc.moveRight();
			break;
			default: warning();
		}

		pc.printPosition();
		System.out.println("Titik Koordinat adalah (" + pc.x + " , " + pc.y + ")");
		input();
	}

	public static void main(String[]args){
		input();
	}
    
}
