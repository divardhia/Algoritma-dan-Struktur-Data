/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diva ardhia
 */
public class DoubleLinkedList {

    Node head;
    int size;

    public DoubleLinkedList() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int kode, String judul, String distributor, int stok, int rusak) {
        if (isEmpty()) {
            head = new Node(null, kode, judul, distributor, stok, rusak, null);
        } else {
            Node newNode = new Node(null, kode, judul, distributor, stok, rusak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int kode, String judul, String distributor, int stok, int rusak) {
        if (isEmpty()) {
            addFirst(kode, judul, distributor, stok, rusak);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, kode, judul, distributor, stok, rusak, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int index, int kode, String judul, String distributor, int stok, int rusak) throws Exception {
        if (isEmpty()) {
            add(index, kode, judul, distributor, stok, rusak);
        } else if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, kode, judul, distributor, stok, rusak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, kode, judul, distributor, stok, rusak, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
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
                System.out.print(tmp.index + "\t" + tmp.kode + "\t" + tmp.judul + "\t" + tmp.distributor + tmp.stok + "\t" + tmp.rusak);
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists Kosong");
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        return head.kode;
    }

    public int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.kode;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.kode;
    }

    public void getValue(int search) {
        int awal = -1;
        Node tmp = head;
        for (int i = 0; i < size; i++) {
            if (tmp.kode == search) {
                awal = i;
                break;
            } else {
                tmp = tmp.next;
            }
        }

        if (awal == -1) {
            System.out.println("Data Tidak Tersedia");
        } else {
            System.out.println("kode CD : " + search + " ditemukan pada indeks ke: " + awal);
        }
    }
}
