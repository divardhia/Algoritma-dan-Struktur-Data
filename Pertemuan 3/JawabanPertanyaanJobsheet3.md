# Jawaban 2.3.3

1. Base lain dalam algoritma divide conquer
jawaban : Base lain algoritma divide and conquer adalah pencarian nilai factorial yang didasarkan pada perhitungan rekursif dan membagi maslaah menjadi beberapa bagian uang disebut upa-masalah.
2. jelaskan tahapan masing - masing bagian pada kode program
jawaban : 
Divide : membagi masalah menjadi beberapa upa-masalah yang memiliki kemiripan edngan masalah 
semula namun berukuran lebih kecil. 
Conquer : menyelesaikan masing-masing upa-masalah (secara rekursif). 
Combine : menggabungkan solusi masing-masing upa masalah sehingga membentuk solusi maslah 
semula
3. 

4. 

5. Buktikan dengan inputan elemen yang di atas 20 angka, apakah ada perbedaan waktu eksekusi?
jawaban : ada, lbh lama divide conquer

# Jawaban 2.4.3

1.  Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()! 
Jawab : PangkatBF() melakukan perhitungan dengan straightforward yaitu maju kedepan secara berurutan sedangkan PangkatDC() melakukan perhituangan dengan membagi dahulu perhitungan sehingga menjadi permasalah yang kecil lalu dikombinasikan lagi sampai menemukan 1 solusi utama.
2. Jelaskan arti potongan kode tersebut Jawab : Jika pemangkat ganjil, pemangkat akan dibagi 2 lalu dikalikan dengan angka yang dipangkat. Contoh : 35 = 32 * 32 * 3
3. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan! 
Jawab : Sudah 
4. 

5. 

# Jawaban 2.5.3

1. Berikan  ilustrasi  perbedaan  perhitungan  keuntungan  dengan  method  TotalBF() ataupun TotalDC() 
Jawab : Keuntungan totalBF() dalah menghasilkan algoritma baku untuk tugas-tugas komputasi 
seperti penjumlahan/perkalian n bauh  bilangan, menentukan elemen minimum atau 
maksimum didalam sebuah tabel. 
Keuntungan totalDC() adalah memiliki efisien algoritma yang tinggi. Pendekatan divide 
and conquer ini lebih efisien dalam menyelesaikan algoritma sorting
2. output dari kedua jenis algoritma tersebut bisa jadi memiliki hasil berbeda di belakang 
koma. Bagaimana membatasi output di belakang koma agar menjadi standar untuk kedua jenis 
algoritma tersebut. 
Jawab : Cara membatasi output dibelakang koma agar menjadi standard untuk kedua jenis 
algoritma tersebut adalah mengganti tipe data yang digunakan dari int ke float atau 
double. 
3. Mengapa terdapat formulasi return value
Jawab : Proses combine pada method devide conquer. 
4. Kenapa dibutuhkan variable mid pada method TotalDC()? 
Jawab : Untuk membagi elemen menjadi beberapa bagian.
5. Program perhitungan keuntungan  suatu  perusahaan  ini  hanya  untuk  satu  perusahaan  saja. Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan dengan 
program! 
jawab : 