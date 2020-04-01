# jawaban pertanyaan jobsheet 8

## pertanyaan 3.8.8
1. fungsi angka 4 pada pemanggil di class main.
Jawab : Fungsi dari angka 4 untuk mengisi jumlah data yang akan dibuat, jika data yang ada melebihi jumlah jumlah data yang ditentukan maka akan keluar statement data sudah penuh
2. Lakukan penambahan data angka 17 dan 98 pada program. Tampilkan hasilnya! 
jawab : <img Pertemuan 8 = '01.png'>
3. Pada soal nomor 2, mengapa data yang bisa dimasukkan ke dalam Stack hanya angka 17, 
sedangkan angka 98 tidak bisa? Jelaskan! 
Jawab : Karena batas maksimal pengisian adalah data 4. Pada proses sebelumnya salah satu 
data telah dihapus maka jika ditambah dengan angka 17 dan 98 maka yang dapat dimasukkan 
hanya angka 17 karena angka 17 adalah angka yang terlebih dahulu dimasukkan. Sehingga 
angka 98 tidak damat dimasukkan karena jumlah data yang diinginkan sudah penuh.
4. Modifikasi program tersebut sehingga pengguna dapat memasukkan data melalui keyboard 
(menggunakan Scanner)! Catatan: Anda dapat melakukan modifikasi dengan membentuk menu 
program
jawab : 
5. Pada konstruktor Stack, mengapa variabel top diinisialisasi dengan nilai -1? 
Jawab : Untuk memastikan nilai top itu sendiri berada pada indeks 0 

## pertanyaan 8.4.3
1. Perhatikan class Postfix, jelaskan fungsi dari method precedence! 
Jawab : Method precedence berfungsi untuk menentukan derajat masing-masing operator. Operator ‘^’ memiliki derajat tertinggi dari yang lain yaitu 3. Operator ‘%’, ‘/’, ‘*’ memiliki derajat lebih rendah daripada operator ‘^’ yaitu 2. Sedangkan operator ‘+’ dan ‘-‘ memiliti derajat yang sama yakni 1
2. Jalankan kembali program tersebut, masukkan ekspresi 5 ^ 2 + 8 / (6 – 3). Tampilkan hasilnya!
jawab : <img Pertemuan 8 = '3.png'>
3. Pada soal nomor 2, mengapa tanda kurung tidak ditampilkan pada hasil konversi? Jelaskan! 
Jawab : Karena jika ada tanda ‘(‘ maka di push ke stack sampai bertemu tanda ‘)’ maka pop isi stack sampai ditemukan tanda ‘(‘ kemudian ke postfix, sedangkan tanda ‘(‘ tidak dimasukkan ke postfix.
4. Jalankan kembali program tersebut dengan memasukkan operator @ atau # pada persamaan matematika. Bagaimana hasilnya? Mengapa? 
Jawab :  Operator  @ dan # tidak dikeluarkan karena tidak termasuk dari salah satu operator matematika.
<img Pertemuan 8 = '4.png'>