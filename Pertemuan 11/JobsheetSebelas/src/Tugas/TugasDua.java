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
public class TugasDua {

    int size;
    NodeTugasDua top;

    public TugasDua() {
        top = null;
        size = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }

    void push(int data) {
        NodeTugasDua tgs = new NodeTugasDua(data, null);
        if (top == null) {
            top = tgs;
        } else {
            tgs.setNext(top);
            top = tgs;
        }
        size++;
    }

    public int pop() throws Exception {
        if (isEmpty()) {
            System.out.println("Data Kosong!");
        }
        NodeTugasDua tg = top;
        top = tg.getNext();
        return tg.data;
    }

    public int head() throws Exception {
        if (isEmpty()) {
            System.out.println("Data Kosong!");
        }
        return top.data;
    }

    void print() {
        System.out.print("Stack : ");
        if (size == 0) {
            System.out.println("Data Kosong!");
            return;
        }
        NodeTugasDua tug = top;
        while (tug != null) {
            System.out.print(tug.data + " ");
            tug = tug.getNext();
        }
        System.out.println();
    }
}
