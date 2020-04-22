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
public class LinkedListMhs {

    NodeMhs head;
    int size;

    public LinkedListMhs() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nim, String nama, String alamat) {
        head = new NodeMhs(nim, nama, alamat, head);
        size++;
    }

    public void add(String nim, String nama, String alamat) throws Exception {
        if (isEmpty()) {
            addFirst(nim, nama, alamat);
        } else {
            NodeMhs tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            NodeMhs next = (tmp == null) ? null : tmp.next;
            tmp.next = new NodeMhs(nim, nama, alamat, null);
        }
        size++;
    }

    public void cariIndex(int index) {
        NodeMhs tmp = head;

        for (int i = 1; i < index; i++) {
            tmp = tmp.next;
        }
        System.out.println(tmp.nim + "\t" + tmp.nama + "\t" + tmp.alamat);
    }

    public void removeByValue(String nim) throws Exception {
        NodeMhs prev = head;
        NodeMhs cur = head.next;
        for (int i = 1; i < size; i++) {
            prev = prev;
            cur = prev.next;
        }
        prev.next = cur.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMhs tmp = head;
            while (tmp != null) {
                System.out.println(tmp.nim + "\t" + tmp.nama + "\t" + tmp.alamat);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("LinkedLists kosong");
        }
    }
}
