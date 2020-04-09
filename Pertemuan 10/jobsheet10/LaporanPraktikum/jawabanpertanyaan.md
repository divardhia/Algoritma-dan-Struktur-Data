# Jawaban Pertanyaan Jobsheet 10

1. fungsi atribut Q
jawaban : untuk menyimpan data Queue

2. fungsi atribut max, size, front, dan rear pada class Queue
jawaban: variabel untuk menyimpan nilai indeks array data maksimal, data antrian, data terdepan, dan data paling belakang di Queue 

3. Pada method Create, mengapa atribut front dan rear diinisialisasi dengan nilai -1, tidak 0?
Jelaskan!
jawaban: karena data masih kosong sehingga front dan rear tidak menunjuk ke data manapun.

4. Perhatikan method IsFull, jika kondisi IF diubah menjadi size == max-1, apa yang terjadi? 
Mengapa demikian? 
jawaban: maka terjadi kesalahan data yaitu tersisa 1 antrian lagi karena karena data antrian (size) lebih kecil daripada data maksimum sehingga masih tersisa antrian yang belum penuh.

5. Pada method Enqueue, jelaskan maksud dan kegunaan dari potongan kode berikut! 
jawaban: artinya rear berada pada indeks terakhir

6. method Enqueue, baris kode program manakah yang menunjukkan bahwa 
data baru disimpan pada posisi terakhir di dalam queue?
jawaban: 
if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }

7. Mengapa method Dequeue mempunyai tipe kembalian int, tidak bertipe void? 
jawaban: agar bisa return atau mengulang data 

8. Perhatikan kembali method Dequeue, baris kode program manakah yang menunjukkan bahwa 
data yang dikeluarkan adalah data pada posisi paling depan di dalam queue? 
jawaban: 
data = Q[front];
            size--;

9. Pada method Dequeue, jelaskan maksud dan kegunaan dari potongan kode berikut!
jawaban: data yang paling depan dari queue tidak berada di indeks terakhir array

10. Perhatikan kembali method Dequeue, baris kode program manakah yang menunjukkan bahwa 
data terlebih dahulu disimpan variabel lain sebelum diambil/dihapus? 
jawaban: 
if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }

11. Pada method print, mengapa pada proses perulangan variabel i tidak dimulai dari 0 (int i=0), 
melainkan int i=front? 
jawaban: karena front tidak selalu berada di indeks ke-0

12. Perhatikan kembali method print, jelaskan maksud dari potongan kode berikut!
jawaban: untuk menampilkan semua data yang ada di dalam queue

13. modifikasi program dengan menambahkan method baru bernama peekRear yang 
digunakan memeriksa data yang berada di posisi belakang! Tambahkan pula daftar menu class 
QueueMain sehingga method peekRear dapat dipanggil! 