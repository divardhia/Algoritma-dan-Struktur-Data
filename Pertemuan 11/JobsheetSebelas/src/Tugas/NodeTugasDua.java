/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author diva ardhia
 */
public class NodeTugasDua {

    int data;
    NodeTugasDua next;

    public NodeTugasDua(int data, NodeTugasDua next) {
        this.data = data;
        this.next = next;
    }

    public NodeTugasDua() {
        next = null;
        data = 0;
    }

    public void setNext(NodeTugasDua n) {
        next = n;
    }

    public NodeTugasDua getNext() {
        return next;
    }
}
