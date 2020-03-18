/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS X441MA
 */
public class Liga {
    public String nama;
    public int p;
    public int gd;
    public int pts;
    Liga list[] = new Liga[20];
    Liga li ;
    int id;

    public Liga(String nama, int p, int gd, int pts) {
        this.nama = nama;
        this.p = p;
        this.gd = gd;
        this.pts = pts;
    }

    public Liga() {
    }
    
    public void tampil(){
        System.out.println("Nama = "+nama);
        System.out.println("Pelanggaran = "+p);
        System.out.println("Gol = "+gd);
        System.out.println("Poin = "+pts);
    }
    
    public void tambah(Liga lg){
        if (id<list.length) {
            list[id] = lg;
            id++;
        }else{
        //    System.out.println("Data sudah penuh!!");
        }
    }
    public void insertionSort(){
        int i,j;
        for (i = 1; i < list.length; i++) {
            Liga ling = new Liga();
            ling = list[i];
            j=i ;
            while((j>0) && (list[j-1].pts > ling.pts)){
                list[j] = list[j-1];
                j--;
            }
            list[j] = ling;
        }
        for(Liga l : list){
            l.tampil();
            System.out.println("------------------------------");
        }
    }
    
    public void insertionSortds(){
        int i,j;
        for (i = 1; i < list.length; i++) {
            Liga ling = new Liga();
            ling = list[i];
            j=i ;
            while((j>0) && (list[j-1].pts < ling.pts)){
                list[j] = list[j-1];
                j--;
            }
            list[j] = ling;
        }
        for(Liga l : list){
            l.tampil();
            System.out.println("------------------------------");
        }
    }
}
