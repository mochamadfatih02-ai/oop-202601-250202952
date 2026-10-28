# Catatan Minggu 03: Inheritance

## Yang saya kerjakan
- Pada minggu ini, saya mengimplementasikan tiga subclass dari `Aset`, yaitu `Ruang`, `Laptop`, dan `AlatLab`. Setiap subclass memiliki atribut khusus: `Ruang` memiliki kapasitas, `Laptop` memiliki spesifikasi dan nomor inventaris, sedangkan `AlatLab` memiliki laboratorium dan tingkat risiko. 
- Pada setiap konstruktor, saya memanggil `super(kode, nama)` terlebih dahulu agar validasi pada kelas induk tetap berlaku, kemudian memvalidasi atribut milik subclass tersebut dan melempar `IllegalArgumentException` apabila data tidak memenuhi aturan. Selain itu, saya membuat getter untuk setiap atribut dan melakukan override pada `getJenis()` agar mengembalikan jenis aset yang sesuai.
- Hasil pengujian menunjukkan bahwa seluruh tes minggu 1 sampai 3 berhasil (19 tes tanpa kegagalan).

## Keputusan desain
(Apa yang Anda putuskan dan kenapa. Rujuk docs/asumsi.md bila perlu.)

## Kendala
- Kendala pertama muncul saat menjalankan pengujian di PowerShell. Skrip `uji.ps1` tidak dapat dijalankan karena kebijakan eksekusi (Execution Policy) pada Windows memblokir skrip. Saya mengatasinya dengan mengubah kebijakan tersebut hanya untuk sesi PowerShell yang sedang dibuka menggunakan `Set-ExecutionPolicy -Scope Process -ExecutionPolicy Bypass`, lalu `.\scripts\uji.ps1 03` sehingga setelah itu script berjalan

- Kendala kedua berkaitan dengan method `getJenis()` pada `Ruang`. Pada awalnya, method tersebut saya tulis dengan tipe kembalian `String`. Setelah memeriksa `Aset.java`, saya menemukan bahwa tipe kembalian yang benar adalah enum `JenisAset`, sehingga saya mengubahnya menjadi `JenisAset.RUANG`.

## Penggunaan AI
- Alat yang dipakai: (nama, atau "tidak memakai")
- Bagian yang dibantu AI: (kelas/metode)
- Prompt utama: (tempel 1-3 prompt yang paling menentukan)
- Yang saya ubah atau tolak dari saran AI, dan alasannya:
- Satu hal yang saya pahami lebih baik sekarang:

## Dokumentasi
![alt text](Assets/minggu3.1.png)
![alt text](Assets/minggu3.2.png)
