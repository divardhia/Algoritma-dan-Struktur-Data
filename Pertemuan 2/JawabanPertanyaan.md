# Jawaban 2.3.3

1. Karakteristik Class dan Objek
Class: diawali dengan huruf kapital
Objek: harus instansiasi di method main
2. kata kunci untuk mendeklarasikan class
class
3. berapa dan sebutkan atribut class Barang dan baris deklarasi atribut
atribut ada 2. String dan int pada baris 4 dan 5
4. berapa, sebutkan dan baris method
ada 4 yaitu tampilBarang(), tambahStok(), kurangStok(), dan hitungHargaTotal(), pada baris ke- 7,13,17,21
5. modifikasi kurangStok()
public void tambahstok (int n){
        if (stok>0){
        stok = stok + n;
        }
    }
    public void kurangstok (int n){
        if (stok>0){
        stok = stok - n;
        }
    }
    agar dapat memasukkan nilai dari luar method kedalam method tambahStok() untuk diolah didalam method tersebut
6. mengapa tipe data tambahStok() int
agar dapat mengembalikan nilai output sehingga bisa diolah pada proses berikutnya
7. mengapa tambahStok() bertipe data void
karena tidak perlu pengembalian nilai

# Jawaban 2.4.3
1. baris keberapa proses instansi dan nama objek
baris 16, objek yang dihasilkan adalah b1
2. cara mengakses atribut dan method dari objek
- namaObjek.namaAtribut = nilai Akses Atribut
- namaObjek.namaMethod()

# Jawaban 2.5.3
1. baris dilakukannya parameter
baris ke-9
2. tentang suatu baris dalam program
membuat akses baru untuk mengakses konstruktor Barang (String nm, String jn, int st, int hs) dan memberi nilai pada atribut
3. objek berparameter nama b3
Barang b3 = new Barang ("Canon", "Kamera DSLR", 1, 20000000);
        b3.tampilBarang();

# Jawaban 2.6.3
1. maksud kode program
untuk membuat Array of object yang menampung 3 objek persegi panjang
2. maksud kode program
untuk mengisi sebuah PersegiPanjang pada Array tersebut dengan membuat objek dahulu

# Jawaban 2.7.3
1. Mengapa program eror saat dijalankan?
karena pada index ppArray ke-1 belum dibuat objek PersegiPanjang. harus ada code ppArray[5] = new Persegi[].

#Jawaban 2.8.3
1. maksud konstruktor
suatu method, berbeda dengan method selain konstruktor. jika konstruktor saat deklarasi tidak memiliki tipe data, konstruktor hanya bisa dipanggil/dijalankan saat instansiasi dan nama methodnya sama persis dengan nama class nya.
2 - 5.
package ArraySegitiga;

/**
 *
 * @author ASUS X441MA
 */
public class Segitiga {
    public int alas;
    public int tinggi;
    public Segitiga (int a, int t){
        alas = a;
        tinggi = t;
    }
    public int hitungLuas(){
        return alas * tinggi;
    }
    public int hitungKeliling(){
        return alas * 3;
    }
}
public class ArraySegitiga {
    public static void main(String[] args) {
        Segitiga[] sgArray = new Segitiga[4];
        sgArray[0] = new Segitiga (10, 4);
        sgArray[1] = new Segitiga (20, 10);
        sgArray[2] = new Segitiga (15, 6);
        sgArray[3] = new Segitiga (25, 10);
        
        for (int i=0; i<4; i++){
            System.out.println("Segitiga ke- " +i+ " Alas = "+sgArray[i].alas+ ", Tinggi = "+sgArray[i].tinggi);
            System.out.println();
        }
        for (int i=0; i<4; i++){
            System.out.println("Luas Segitiga ke- " +i+ " Adalah "+sgArray[i].hitungLuas());
            System.out.println();
        }
        for (int i=0; i<4; i++){
            System.out.println("Keliling Segitiga ke- " +i+ " Adalah "+sgArray[i].hitungKeliling());
        }
    }
}
