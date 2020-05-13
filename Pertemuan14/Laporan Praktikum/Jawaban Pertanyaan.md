# Jawaban Pertanyaan 

## Pertanyaan
1. Mengapa dalam Binary search tree proses pencarian data bisa lebih efektif dilakukan dibanding binary tree biasa? 
Jawab : Karena binary tree memiliki sifat semua left-child harus lebih kecil daripada right- child dan parent-nya dan memiliki node yang terurut.

2. Untuk apakah di class Node, kegunaan dari atribut left dan right? 
Jawab : Kegunaan left dan right adalah untuk melakukan pengecekan, traverse(pertukaran) baik itu preorder,inorder,dan postorder serta saat melakukan pencarian node. 

3. a. Untuk apakah kegunaan dari atribut root di dalam class BinaryTree? 
Jawab : Berfungsi sebagai nilai awal pada tree yang akan dibuat. 
b. Ketika objek tree pertama kali dibuat, apakah nilai dari root? 
Jawab : Nilai dari root adalah nilai awal yang dibuatpada tree. 

4. Ketika tree masih kosong, dan akan ditambahkan sebuah node baru, proses apa yang akan terjadi? 
Jawab : Proses yang dilakukan setelah pengecekan adalah penambahan node. Setelah itu data pada Node akan di traverse baik secara preorder, inorder, dan postorder.

5. Perhatikan method add(), di dalamnya terdapat baris program seperti di bawah ini. Jelaskan secara detil untuk apa baris program tersebut? 
Jawab : Operasi add mirip dengan operasi find. Untuk melakukan add sebuah node, pertama kita harus mencari tempat yang tepat untuk meletakkan node tersebut. 
Jika data lebih kecil dari nilai current.data, maka akan di lakukan pencarian tempat pada sebelah kiri dari root.

6. Apa perbedaan antara traverse mode pre-order, in-order dan post-order? 
Jawab : PreOrder: Cetak isi node yang dikunjungi, kunjungi Left Child, kunjungi Right Child.  
InOrder : Kunjungi Left Child, Cetak isi node yang dikunjungi, kunjungi Right Child.  
PostOrder : Kunjungi Left Child, Kunjungi Right Child, cetak isi node yang dikunjungi. 

7. Perhatikan method delete(). Sebelum proses penghapusan node, didahului 
dengan proses pencarian node yang akan dihapus. Selain ditujukan untuk mencari 
node yang akan dihapus (current), proses pencarian tersebut juga akan mencari 
parent dari node yang akan dihapus (parent). Menurut Anda, mengapa diperlukan 
juga untuk mengetahui parent dari node yang akan dihapus?
Jawab : Setelah melakukan travere pada node yang akan dihapus, 
mencari parent dari node yang akan dihapus di perlukan di karenakan, 
harus ada pemutusan link node antara node parent dan node yang akan di hapus. 

8. Untuk apakah dibuat variabel dengan nama isLeftChild di dalam method delete()? 
Jawab : Untuk mengecek data pada tree dan mencari posisi node yang akan di hapus.

9. Untuk apakah method getSuccessor()? 
Jawab : Untuk mendapatkan nilai node yang berada dibawah node tertentu. 

10. Di ulasan teori, disebutkan bahwa ketika suatu node yang memiliki 2 child dihapus, 
node tersebut digantikan oleh node successor, dimana node successor bisa didapat dengan 2 cara, 
yaitu 1) mencari nilai terbesar dari sub tree di sebelah kirinya, 
atau 2) mencari nilai terkecil dari subtree di sebelah kanannya. 
Manakah 1 dari 2 cara tersebut yang diimplementasikan dalam method getSuccessor() di program di atas?
jawab :
<img src = '10.png'>

11. Apakah kegunaan dari atribut data dan idxLast yang ada di class BinaryTreeArray?
Jawab : Atribut data digunakan untuk mendeklarasi array yang nantinya akan di isi elemen. 
Atribut idxLast digunakan untuk member batas berapa elemen yang harus di tampilkan dimulai dari index ke-0 sampai index ke-idxLast.

12. Apakah kegunaan dari method populateData() dan traverseInOrder()? 
Jawab : populateData() berfungsi untuk mengisi data dan meletakkannya sesuai indeks pada implementasi menggunakan array.  
Sedangkan traverseInOrder() berfungsi untuk melakukan traverse data pada array

13. Jika suatu node binary tree disimpan dalam array indeks 2, maka di indeks berapakah posisi left-child dan rigth child masin-masing?
Jawab : Jika suatu node berada pada indeks 2, maka left-child dari node tersebut berada di indeks (2i+1) => (2*2+1) = 5
dan right-child dari node tersebut berada di indeks (2i+2) => (2*2+2) = 6, 
dan parent dari node tersebut terletak di indeks ((i-1)/2) => ((2-1)/2) = ½ =0,5. 