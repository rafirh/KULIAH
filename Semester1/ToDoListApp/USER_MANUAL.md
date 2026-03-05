# User Manual - Aplikasi To Do List

## Daftar Isi
1. [Pendahuluan](#pendahuluan)
2. [Persyaratan Sistem](#persyaratan-sistem)
3. [Instalasi dan Menjalankan Aplikasi](#instalasi-dan-menjalankan-aplikasi)
4. [Fitur-Fitur Aplikasi](#fitur-fitur-aplikasi)

---

## Pendahuluan

Aplikasi To Do List adalah aplikasi desktop berbasis Java GUI yang dirancang untuk membantu pengguna mengelola daftar tugas harian dengan mudah dan efisien. Aplikasi ini memiliki antarmuka yang modern dan user-friendly dengan fitur-fitur lengkap untuk menambah, menandai, dan menghapus tugas.

### Tujuan Aplikasi
- Memudahkan pengguna dalam mencatat dan mengelola tugas
- Menyediakan antarmuka yang intuitif dan mudah digunakan
- Membantu pengguna melacak progres penyelesaian tugas

---

## Persyaratan Sistem

### Minimum Requirements
- **Sistem Operasi**: Windows 7/8/10/11, macOS 10.12+, atau Linux
- **Java Runtime Environment (JRE)**: Versi 8 atau lebih tinggi
- **RAM**: Minimum 512 MB
- **Ruang Disk**: 50 MB ruang kosong
- **Resolusi Layar**: Minimum 1024 x 768 pixels

### Recommended Requirements
- **Java Runtime Environment (JRE)**: Versi 11 atau lebih tinggi
- **RAM**: 1 GB atau lebih
- **Resolusi Layar**: 1920 x 1080 pixels atau lebih tinggi

---

## Instalasi dan Menjalankan Aplikasi

### Langkah 1: Memastikan Java Terinstall
1. Buka Terminal (macOS/Linux) atau Command Prompt (Windows)
2. Ketik perintah: `java -version`
3. Jika Java sudah terinstall, versi akan ditampilkan
4. Jika belum terinstall, download Java dari [java.com](https://www.java.com)

### Langkah 2: Menyiapkan File Aplikasi
1. Pastikan semua file aplikasi berada dalam satu folder:
   - `TodoItem.java`
   - `TodoListModel.java`
   - `TodoListGUI.java`

### Langkah 3: Kompilasi Aplikasi
1. Buka Terminal/Command Prompt
2. Navigate ke folder aplikasi menggunakan perintah `cd`
   ```
   cd /path/to/ToDoListApp
   ```
3. Kompilasi semua file Java:
   ```
   javac *.java
   ```

### Langkah 4: Menjalankan Aplikasi
1. Setelah kompilasi berhasil, jalankan aplikasi dengan perintah:
   ```
   java TodoListGUI
   ```
2. Window aplikasi akan muncul di layar

---

## Fitur-Fitur Aplikasi

### 1. Antarmuka Utama

Aplikasi terdiri dari beberapa komponen utama:

#### Header
- Menampilkan judul aplikasi: "My To Do List"
- Terletak di bagian atas window

#### Area Daftar Tugas
- Menampilkan semua tugas yang telah ditambahkan
- Jika belum ada tugas, akan muncul pesan: "Belum ada tugas. Tambahkan tugas baru!"
- Setiap tugas ditampilkan dengan:
  - Checkbox untuk menandai status penyelesaian
  - Teks tugas
  - Tombol hapus (icon tempat sampah merah)

#### Panel Input
- Field teks untuk memasukkan tugas baru
- Tombol "Tambah" berwarna biru untuk menambahkan tugas

#### Panel Aksi
- Tombol "Hapus Semua" berwarna merah untuk menghapus semua tugas sekaligus

---

### 2. Menambah Tugas Baru

**Cara 1: Menggunakan Tombol**
1. Klik pada field input teks
2. Ketik nama tugas yang ingin ditambahkan
3. Klik tombol "Tambah" berwarna biru
4. Tugas baru akan muncul di daftar

**Cara 2: Menggunakan Keyboard**
1. Klik pada field input teks
2. Ketik nama tugas yang ingin ditambahkan
3. Tekan tombol **Enter** pada keyboard
4. Tugas baru akan muncul di daftar

**Catatan Penting:**
- Field input tidak boleh kosong
- Jika mencoba menambah tugas kosong, akan muncul dialog peringatan
- Setelah tugas berhasil ditambahkan, field input akan otomatis kosong dan siap untuk input berikutnya

---

### 3. Menandai Tugas Selesai

**Langkah-langkah:**
1. Cari tugas yang ingin ditandai sebagai selesai
2. Klik pada checkbox di sebelah kiri teks tugas
3. Checkbox akan tercentang (✓) dan teks tugas berubah warna menjadi abu-abu
4. Untuk menandai tugas sebagai belum selesai, klik checkbox lagi

**Indikator Visual:**
- **Tugas Belum Selesai**: Checkbox kosong (○), teks berwarna hitam
- **Tugas Selesai**: Checkbox tercentang (✓), teks berwarna abu-abu

---

### 4. Menghapus Tugas Individual

**Langkah-langkah:**
1. Arahkan mouse ke tugas yang ingin dihapus
2. Klik tombol icon tempat sampah (merah) di sebelah kanan tugas
3. Dialog konfirmasi akan muncul dengan pesan: "Apakah Anda yakin ingin menghapus task ini?"
4. Klik **"Yes"** untuk menghapus atau **"No"** untuk membatalkan
5. Jika memilih Yes, tugas akan langsung dihilangkan dari daftar

**Tips:**
- Hover mouse pada tombol hapus untuk melihat tooltip "Hapus"
- Background tombol akan berubah menjadi merah muda saat di-hover

---

### 5. Menghapus Semua Tugas

**Langkah-langkah:**
1. Klik tombol **"Hapus Semua"** berwarna merah di bagian bawah aplikasi
2. Dialog konfirmasi akan muncul dengan pesan: "Apakah Anda yakin ingin menghapus semua task?"
3. Klik **"Yes"** untuk menghapus semua tugas atau **"No"** untuk membatalkan
4. Jika memilih Yes, semua tugas akan dihapus dan pesan "Belum ada tugas" akan muncul

**Catatan:**
- Jika daftar tugas kosong dan Anda mengklik "Hapus Semua", akan muncul pesan: "Tidak ada task untuk dihapus!"
- Tindakan ini tidak dapat di-undo, pastikan sebelum mengklik Yes

---

### 6. Interaksi Hover

Aplikasi memiliki feedback visual saat mouse hover:

- **Item Tugas**: Background berubah menjadi abu-abu muda
- **Tombol Tambah**: Background biru menjadi lebih gelap
- **Tombol Hapus (Icon)**: Background berubah menjadi merah muda
- **Tombol Hapus Semua**: Background merah menjadi lebih gelap
