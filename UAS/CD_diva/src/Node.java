/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diva ardhia
 */
public class Node {

    int index, kode, stok, rusak;
    String judul, distributor;
    Node prev, next;

    Node(Node prev, int kode, String judul, String distributor, int stok, int rusak, Node next) {
        this.prev = prev;
        this.kode = kode;
        this.judul = judul;
        this.distributor = distributor;
        this.stok = stok;
        this.rusak = rusak;
        this.next = next;
    }
}
