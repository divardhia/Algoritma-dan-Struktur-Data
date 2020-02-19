/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramPeminjaman;

/**
 *
 * @author ASUS X441MA
 */
public class Peminjaman {

    String id, member, game;
    int hari, harga;
    
    public int totalPembayaran(){
        return hari * harga;
    }
}
