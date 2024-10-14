# Minpro-2-PBO

Nama : Athira Fahmi

NIM : 2309116010

Kelas : Sistem Informasi A


<h1> Struktur Projek </h1>
 
![image](https://github.com/user-attachments/assets/009c465a-94f3-48cd-b690-aa8a25676563)

Struktur Projek ini menggunakan konsep Pemrograman Berorientasi Objek (OOP) dengan beberapa prinsip:

1. Inheritance (Pewarisan): Ada dua subclass, PendonorTetap dan PendonorSporadis, yang mewarisi dari superclass Donor.

2. Encapsulation (Enkapsulasi): Kelas Donor menggunakan getter dan setter untuk mengakses dan mengubah atribut privat.

3. Abstraction (Abstraksi): Kelas abstrak Donor mendefinisikan perilaku umum pendonor. Di sisi lain, interface CRUD menetapkan method untuk operasi dasar.

4. Interface: Interface CRUD diimplementasikan oleh kelas PengelolaDonor, yang menangani operasi seperti menambah, menghapus, mencari, memperbarui, dan menampilkan donor.

5. Final Keyword: Kelas PendonorTetap dan PendonorSporadis dideklarasikan sebagai final, artinya tidak bisa diwarisi lagi. Beberapa atribut juga final untuk menjaga integritas data.

<h2>Package data:</h2>

Donor: Kelas abstrak yang menjadi superclass dari PendonorTetap dan PendonorSporadis.

PendonorTetap: Subclass dari Donor untuk pendonor tetap.

PendonorSporadis: Subclass dari Donor untuk pendonor sporadis.

PengelolaDonor: Kelas yang mengimplementasikan interface CRUD dan mengelola daftar donor.

CRUD: Interface yang mendefinisikan metode CRUD.

<h2>Package main:</h2>

Main: Kelas utama yang menjalankan program dan menyediakan antarmuka menu untuk pengguna.

<h1> Cara Kerja Program </h1>

1. Menu Utama

![image](https://github.com/user-attachments/assets/8dcb6b18-f1d1-4483-bb1b-4f42f017f3ac)


Pada Menu Utama, pengguna akan ditampilkan menu utama seperti diatas:

2. Tambah Donor

![image](https://github.com/user-attachments/assets/a21fa519-0e1f-4751-8c6a-517dca9e25aa)

Pada Menu Tambah Donor, Pengguna dapat memilih jenis pendonor:

Pendonor Tetap: Donor yang melakukan donasi secara tetap dengan jumlah donasi yang telah ditentukan.

Pendonor Sporadis: Donor yang melakukan donasi secara sporadis pada acara atau event tertentu.

Setelah memilih jenis donor, pengguna mengisi informasi berupa nama, usia, dan golongan darah.

3. Hapus Donor

![image](https://github.com/user-attachments/assets/bf684ddd-b0f5-4ee5-92e5-a3919fd6ecef)

Pada Menu Hapus Donor Pengguna dapat menghapus donor dari daftar dengan memasukkan ID donor yang ingin dihapus

4. Tampilkan Semua Donor

![image](https://github.com/user-attachments/assets/811319af-84d3-4a4a-9607-4cba0764025b)

Pada Menu Tampilkan Semua Donor Program akan menampilkan daftar lengkap semua donor dalam format tabel.

5. Cari Donor

![image](https://github.com/user-attachments/assets/22aa043e-4f15-4b56-b1a4-374aea691a5a)

Pada Menu Cari Donor Pengguna dapat mencari donor berdasarkan ID, dan program akan menampilkan informasi donor yang ditemukan.

6. Update Donor

![image](https://github.com/user-attachments/assets/95dbb288-6094-4e93-84f9-74bacb160d9b)

Pada Menu Update Donor Pengguna dapat memperbarui informasi donor dengan memasukkan ID donor, kemudian mengganti nama, usia, dan golongan darah.

