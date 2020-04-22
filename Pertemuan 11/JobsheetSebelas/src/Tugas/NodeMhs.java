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
public class NodeMhs {
    String nim, nama, alamat;
    NodeMhs next;
    
    public NodeMhs(String NIM, String nm, String address, NodeMhs next){
        this.nim = NIM;
        this.nama = nm;
        this.alamat = address;
        this.next = next;
    }
}
