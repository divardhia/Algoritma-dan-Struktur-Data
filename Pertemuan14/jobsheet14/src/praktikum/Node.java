/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author diva ardhia
 */
public class Node {

    int data;
    Node left, right;

    public Node() {
    }

    public Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
}
