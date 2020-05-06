/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasTiga;

/**
 *
 * @author diva ardhia
 */
public class DoubleLinkedLists {

    Node head;
    int size;

    public DoubleLinkedLists() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int nilai, String nama) {
        if (isEmpty()) {
            head = new Node(null, nilai, nama, null);
        } else {
            Node newNode = new Node(null, nilai, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("\nNama : " + tmp.nama);
                System.out.println("Nilai : " + tmp.nilai);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void bubbleAscending() {
        Node tmp = head;

        for (int i = 0; i < size - 1; i++) {
            if (tmp.nilai > tmp.next.nilai) {
                int save1 = tmp.nilai;
                int save2 = tmp.next.nilai;
                String save3 = tmp.nama;
                String save4 = tmp.next.nama;
                tmp.nilai = save2;
                tmp.next.nilai = save1;
                tmp.nama = save4;
                tmp.next.nama = save3;
            }
            if (tmp.next != null) {
                tmp = tmp.next;
            }
        }
    }

    public void bubbleDescending() {
        Node tmp = head;

        for (int i = 0; i < size - 1; i++) {
            if (tmp.nilai < tmp.next.nilai) {
                int save1 = tmp.nilai;
                int save2 = tmp.next.nilai;
                String save3 = tmp.nama;
                String save4 = tmp.next.nama;
                tmp.nilai = save2;
                tmp.next.nilai = save1;
                tmp.nama = save4;
                tmp.next.nama = save3;
            }
            if (tmp.next != null) {
                tmp = tmp.next;
            }
        }
    }

    public void sortAscending() {
        int half = 0;
        if (size % 2 == 0) {
            half = size / 2;
        } else {
            half = (size + 1) / 2;
        }

        for (int i = 0; i <= half; i++) {
            bubbleAscending();
        }

        System.out.println("===================");
        System.out.println("Sort By Ascending\n");
    }

    public void sortDescending() {
        int half = 0;
        if (size % 2 == 0) {
            half = size / 2;
        } else {
            half = (size + 1) / 2;
        }
        for (int i = 0; i <= half; i++) {
            bubbleDescending();
        }

        System.out.println("===================");
        System.out.println("Sort By Descending\n");
    }
}
