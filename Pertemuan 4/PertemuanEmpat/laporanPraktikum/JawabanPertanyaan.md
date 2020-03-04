# Jawaban Pertanyaan

## Pertanyaan Brute Force dan Divide Conquer
1. tampil output prak1
<img src = 'outputprak1.PNG'>
2. Kenapa pada praktikum bagian 2 perlu di buat objek sebanyak 2 kali dari class minMax?
Pada baris pertama, itu diperlukan untuk membuat Array ppArray. Sedangkan di baris kedua diperlukan agar indeks untuk minMax() dimulai dari indeks 0.
3. Buat perhitungan nilai minimal dan maksimal terpisah dari class main. 
<img src = 'minmaxPer.PNG'>
4. arti angka 4 pd kode
Angka 4 pada kode tersebut berfungsi untuk mengisi parameter indeks_akhir dari method max_min bernilai 4 karena elemen dari Array ppArray adalah 5 dan indeks dari setiap Array diawali dengan indeks 0, agar berjumlah 5 indeks_akhir maka diisi dengan angka 4
5. Kenapa pada pencarian min max dengan algoritma kita memerlukan nilai indeks awal, indeks akhir dan indeks tengah? 
Untuk mengidentifikasi bahwa indeks_awal adalah 0 dan indeks_akhir bernilai 4 karena elemen dari Array ppArray adalah 5. Sedangkan indeks_tengah membagi elemen menjadi 2, hingga elemen terpisah salah satu lalu ditentukan cara memecahkan dan mencari solusinya. 
6. Apakah class Maxmin harus terpisah sepeti ini?Mengapa? 
Tidak harus terpisah, karena calss Maxmin hanya menyimpan variable maximum dan minimum. Variable tersebut dapat dipindahkan ke class MinMax dengan beberapa kode yang harus disesuaikan. 
7. Pada tahap 4 praktikum bagian 3 apakah bisa dilakukan tanpa menyimpan nilai array of object ke dalam array “arr”? 
Tidak bisa, karena Array “arr” penting untuk menyimoan nilai array of object.
8. Jika tahap 7 bisa dilakukan, bagaimana perubahan kode program secara keseluruhan! 
Karean tahap 7 tidak bisa tanpa Array “arr” maka tidak ada perubahan program
9. Ubahlah praktikum bagian 4 dengan method tanpa nilai kembalian! 
<img src = 'modifper1.png'>
10. Manakah yang lebih baik, algoritma brute force atau divide conquer?Jelaskan! 
Masing-masing dari Brute Force dan Divide Conquer memiliki kelebihan dan kelemahan tersendiri. Brute Force lebih baik memecahkan masalah seperti Linear Search, Buble Sort, dan  Selection Sort, sedangkan Divide and Conquer lebih baik untuk memecahkan masalah seperti Merge Sort, Quick Sort, dan Binary Search.
11. Pada praktikum 3 apakah kegunaan tanda “:” pada potongan code program.
Maksud dari tanda ”:” untuk menentukan hasil true atau false dari kondisi yang dilakukan. Jika hasil kondisi true maka maka kode yang akan dieksekusi adalah kode sebelum tanda “:”. sedangkan jika kondisi false maka kode program setelah tanda “:” yang diseksekusi.
12. Dengan melihat soal no 11, jelaskan pula tujuan penggunaan tanda “?” ! 
Digunakan sebagai operator pembanding antara nilai.maximum dengan nilai.minimum.

## Pertanyaan Notasi Big O
1. Berdasarkan kode pada Praktikum 4 di atas, Jika perulangan kedua pada kode di atas berubah menjadi?
2 + n*n*1 + n*n*1 = 2 + n^2 + n^2 = 2 + 2*(n^2) = n^2
2. Berdasarkan notasi yang ditentukan pada nomor 1, hitunglah jumlah instruksi jika n = 100! 
2 + n*n*1 + n*n*1 = 2 + n^2 + n^2 = 2 + 2*(n^2)
2 + 100*100*1 + 100*100*1 = 2 + 100^2 + 1002 = 2 + 2*(1002) = 200002 
3. Apakah terdapat perbedaan notasi di antara kedua kode (kode A dan Kode B) program berikut? Berikan penjelasan dari alasan yang dikemukakan! 
Berdasarkan kode A, perhitungan Big Notasi bisa ditentukan. Notasi yang akan dihasilkan adalah n*n*1. Sedangkan berdasarkan kode B, perhitungan Big Notasi tidak dapat ditentukan. Hal ini dikarenakan di perulangan kedua atau for kedua, tidak ada iterasi j. Jadi, notasi Big O pada for kedua tidak dapat dinyatakan karena program terus menerus dieksekusi.