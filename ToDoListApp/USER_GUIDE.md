# User Guide - Aplikasi To Do List

## Panduan Cepat Penggunaan

Selamat datang di Aplikasi To Do List! Panduan ini akan membantu Anda memulai menggunakan aplikasi dengan cepat dan efektif.

---

## 🚀 Quick Start (Memulai Cepat)

### Langkah 1: Jalankan Aplikasi
```bash
cd /path/to/ToDoListApp
javac *.java
java TodoListGUI
```

### Langkah 2: Tambah Tugas Pertama
1. Ketik tugas di field input
2. Tekan **Enter** atau klik tombol **"Tambah"**
3. Tugas Anda akan muncul di daftar!

### Langkah 3: Kelola Tugas
- ✅ **Tandai selesai**: Klik checkbox
- 🗑️ **Hapus**: Klik icon tempat sampah
- 🧹 **Hapus semua**: Klik tombol "Hapus Semua"

---

## 📖 Panduan Lengkap Per Fitur

### 1️⃣ Menambahkan Tugas

#### Mengapa Fitur Ini Penting?
Menambahkan tugas adalah langkah pertama dalam mengelola aktivitas harian Anda. Dengan fitur ini, Anda dapat dengan cepat mencatat semua yang perlu dikerjakan.

#### Cara Menggunakan:

**Metode A: Menggunakan Mouse**
```
1. Klik pada kotak input (field teks putih)
2. Ketik nama tugas, contoh: "Beli bahan makanan"
3. Klik tombol biru "Tambah"
4. ✅ Tugas berhasil ditambahkan!
```

**Metode B: Menggunakan Keyboard (Lebih Cepat)**
```
1. Klik pada kotak input
2. Ketik nama tugas
3. Tekan Enter ⏎
4. ✅ Tugas berhasil ditambahkan!
```

#### Contoh Penggunaan:
- "Mengerjakan tugas kuliah Algoritma"
- "Meeting dengan tim jam 14.00"
- "Olahraga 30 menit"
- "Belanja bulanan"

#### Tips & Trik:
- 💡 Gunakan deskripsi yang jelas dan spesifik
- 💡 Tambahkan waktu jika tugas time-sensitive
- 💡 Pecah tugas besar menjadi sub-tugas kecil
- 💡 Gunakan Enter untuk input lebih cepat

#### Apa yang Terjadi Jika...
- **Input kosong?** → Muncul peringatan "Mohon masukkan task terlebih dahulu!"
- **Input hanya spasi?** → Dianggap kosong, peringatan akan muncul
- **Input terlalu panjang?** → Tetap diterima, tapi pastikan tetap readable

---

### 2️⃣ Menandai Tugas Selesai

#### Mengapa Fitur Ini Penting?
Menandai tugas yang sudah selesai memberikan kepuasan visual dan membantu Anda melacak progres. Ini juga memotivasi Anda untuk menyelesaikan tugas berikutnya!

#### Cara Menggunakan:
```
1. Temukan tugas yang sudah selesai dikerjakan
2. Klik checkbox (kotak kecil) di sebelah kiri teks tugas
3. 👁️ Perhatikan perubahan:
   - Checkbox tercentang (✓)
   - Teks berubah warna menjadi abu-abu
4. Untuk menandai kembali sebagai belum selesai, klik checkbox lagi
```

#### Visual Indicator:
```
SEBELUM (Belum Selesai):
□ Beli bahan makanan
   ↓
SETELAH (Sudah Selesai):
☑ Beli bahan makanan (warna abu-abu)
```

#### Best Practices:
- ✅ Tandai tugas segera setelah selesai
- ✅ Review tugas yang sudah selesai di akhir hari
- ✅ Jangan hapus tugas yang selesai terlalu cepat (untuk tracking)

#### Workflow Yang Disarankan:
1. **Pagi**: Lihat semua tugas yang belum selesai
2. **Siang**: Tandai tugas yang sudah dikerjakan
3. **Sore**: Review progres dan tambah tugas baru jika perlu
4. **Malam**: Lihat pencapaian hari ini, hapus atau archive

---

### 3️⃣ Menghapus Tugas Individual

#### Mengapa Fitur Ini Penting?
Tidak semua tugas perlu disimpan selamanya. Fitur hapus membantu menjaga daftar tugas tetap bersih dan fokus pada yang relevan.

#### Cara Menggunakan:
```
1. Arahkan mouse ke tugas yang ingin dihapus
2. 👀 Perhatikan: Background tugas berubah abu-abu muda (hover effect)
3. Klik icon tempat sampah merah 🗑️ di sebelah kanan
4. 📋 Dialog konfirmasi muncul:
   "Apakah Anda yakin ingin menghapus task ini?"
5. Klik "Yes" untuk hapus atau "No" untuk batal
6. ✅ Tugas terhapus dari daftar!
```

#### Visual Guide:
```
NORMAL:
[□ Beli bahan makanan                    🗑️]

HOVER (mouse di atas):
[□ Beli bahan makanan                    🗑️]
 ↑ Background abu-abu muda          ↑ Background merah muda

SETELAH KLIK:
[Dialog Konfirmasi]
┌─────────────────────────────────────┐
│ Apakah Anda yakin ingin             │
│ menghapus task ini?                 │
│                                     │
│         [Yes]    [No]               │
└─────────────────────────────────────┘
```

#### Kapan Harus Menghapus?
- ✅ Tugas sudah selesai dan tidak perlu di-track lagi
- ✅ Tugas sudah tidak relevan
- ✅ Tugas duplikat
- ✅ Tugas yang dibatalkan

#### Kapan Jangan Menghapus?
- ❌ Tugas belum selesai (gunakan checkbox untuk track)
- ❌ Ingin melihat history pencapaian
- ❌ Masih ragu apakah perlu dikerjakan

#### Tips & Trik:
- 💡 Hover pada icon untuk melihat tooltip "Hapus"
- 💡 Baca konfirmasi dengan teliti sebelum klik Yes
- 💡 Tidak ada undo, jadi pastikan sebelum menghapus

---

### 4️⃣ Menghapus Semua Tugas

#### Mengapa Fitur Ini Penting?
Kadang Anda perlu "fresh start" atau reset daftar tugas. Fitur ini sangat berguna untuk membersihkan daftar secara massal.

#### Cara Menggunakan:
```
1. Klik tombol "Hapus Semua" (merah) di bagian bawah
2. 📋 Dialog konfirmasi muncul:
   "Apakah Anda yakin ingin menghapus semua task?"
3. Klik "Yes" untuk hapus semua atau "No" untuk batal
4. ✅ Semua tugas terhapus!
5. 📝 Muncul pesan: "Belum ada tugas. Tambahkan tugas baru!"
```

#### Use Cases (Kapan Menggunakan):

**Scenario 1: Akhir Minggu**
```
Situasi: Semua tugas minggu ini sudah selesai
Action: Hapus semua untuk memulai minggu baru
Result: Daftar bersih untuk planning minggu depan
```

**Scenario 2: Perubahan Prioritas**
```
Situasi: Ada perubahan besar dalam planning
Action: Hapus semua dan buat daftar baru
Result: Fokus pada prioritas baru
```

**Scenario 3: Reset Harian**
```
Situasi: Ingin memulai hari dengan daftar baru
Action: Hapus semua tugas kemarin
Result: Fresh start untuk hari ini
```

#### ⚠️ Peringatan Penting:
```
┌─────────────────────────────────────────────┐
│  ⚠️  PERHATIAN!                            │
│                                             │
│  • Tindakan ini TIDAK DAPAT di-undo        │
│  • SEMUA tugas akan terhapus permanent     │
│  • Pastikan sudah backup jika perlu        │
│  • Baca dialog konfirmasi dengan teliti    │
└─────────────────────────────────────────────┘
```

#### Alternatif Sebelum Hapus Semua:
1. **Screenshot daftar** untuk dokumentasi
2. **Catat tugas penting** di tempat lain
3. **Tandai yang selesai** dulu sebelum hapus
4. **Pertimbangkan hapus individual** untuk kontrol lebih baik

---

## 🎯 Workflow Rekomendasi

### Workflow Harian

#### Pagi (07.00 - 09.00)
```
1. Buka aplikasi To Do List
2. Review tugas yang belum selesai dari kemarin
3. Tambahkan tugas baru untuk hari ini
4. Prioritaskan tugas (letakkan yang penting di atas)
```

#### Siang (12.00 - 13.00)
```
1. Review progres pagi
2. Tandai tugas yang sudah selesai (✓)
3. Tambah tugas baru jika ada yang muncul mendadak
4. Adjust prioritas jika perlu
```

#### Sore (17.00 - 18.00)
```
1. Tandai semua tugas yang selesai hari ini
2. Hapus tugas yang sudah tidak relevan
3. Tambahkan tugas untuk besok
4. Review pencapaian hari ini
```

#### Malam (Opsional)
```
1. Quick check: ada tugas urgent untuk besok?
2. Tambahkan catatan jika perlu
3. Tutup aplikasi dengan tenang 😌
```

---

### Workflow Mingguan

#### Senin (Planning)
```
✓ Hapus semua tugas minggu lalu yang sudah selesai
✓ Buat daftar goals mingguan
✓ Breakdown goals menjadi tugas harian
✓ Set prioritas untuk minggu ini
```

#### Selasa - Jumat (Execution)
```
✓ Follow workflow harian
✓ Update progres setiap hari
✓ Tandai yang selesai, hapus yang tidak relevan
```

#### Sabtu - Minggu (Review & Prep)
```
✓ Review pencapaian minggu ini
✓ Hapus atau archive tugas yang selesai
✓ Planning untuk minggu depan
✓ Fresh start untuk minggu baru
```

---

## 💡 Tips & Best Practices

### Tips Produktivitas

1. **Gunakan Deskripsi Jelas**
   ```
   ❌ Buruk: "Belajar"
   ✅ Baik: "Belajar Algoritma bab 3 (1 jam)"
   ```

2. **Prioritaskan dengan Nomor**
   ```
   1. Meeting client (09.00)
   2. Revisi proposal
   3. Email follow-up
   ```

3. **Time-Boxing**
   ```
   ✓ "Coding project (2 jam) - 14.00-16.00"
   ✓ "Olahraga (30 menit) - 06.30"
   ```

4. **Pecah Tugas Besar**
   ```
   Tugas Besar: "Buat website"
   ↓ Pecah menjadi:
   □ Design wireframe
   □ Setup development environment
   □ Coding halaman home
   □ Testing
   ```

### Tips Mengelola Tugas

5. **Rule of 5**
   ```
   Fokus pada maksimal 5 tugas penting per hari
   Terlalu banyak = overwhelming
   ```

6. **2-Minute Rule**
   ```
   Jika tugas < 2 menit → Kerjakan langsung
   Jangan masukkan ke daftar, buang waktu
   ```

7. **Color Coding Mental**
   ```
   Belum selesai (hitam) = To Do
   Selesai (abu-abu) = Done
   Fokus pada yang hitam dulu!
   ```

### Tips Interface

8. **Gunakan Keyboard**
   ```
   Enter untuk tambah = Lebih cepat
   Tab untuk navigasi = Efisien
   ```

9. **Hover untuk Info**
   ```
   Hover pada tombol = Lihat tooltip
   Hover pada tugas = Visual feedback
   ```

10. **Regular Cleanup**
    ```
    Setiap akhir hari: Hapus yang tidak perlu
    Jaga daftar tetap lean dan fokus
    ```

---

## 🎨 Memahami Visual Interface

### Color Scheme & Meaning

```
┌─────────────────────────────────────────────┐
│  🎨 PANDUAN WARNA                           │
├─────────────────────────────────────────────┤
│                                             │
│  🔵 BIRU (Tombol Tambah)                   │
│     → Aksi positif, menambah sesuatu       │
│                                             │
│  🔴 MERAH (Tombol Hapus/Hapus Semua)       │
│     → Aksi destruktif, hati-hati!          │
│                                             │
│  ⚫ HITAM (Teks Tugas Aktif)               │
│     → Tugas yang masih perlu dikerjakan    │
│                                             │
│  🩶 ABU-ABU (Teks Tugas Selesai)           │
│     → Tugas yang sudah selesai             │
│                                             │
│  ⬜ PUTIH (Background)                     │
│     → Area kerja utama                     │
│                                             │
│  🔳 ABU MUDA (Hover Background)            │
│     → Indikator interaktif                 │
│                                             │
└─────────────────────────────────────────────┘
```

### Layout Understanding

```
┌─────────────────────────────────────────────┐
│           MY TO DO LIST                     │ ← Header
├─────────────────────────────────────────────┤
│                                             │
│  □ Tugas 1                           🗑️   │ ← Item 1
│  ☑ Tugas 2 (selesai)                🗑️   │ ← Item 2
│  □ Tugas 3                           🗑️   │ ← Item 3
│                                             │
│  (scroll jika banyak tugas)                │ ← Scrollable
│                                             │
├─────────────────────────────────────────────┤
│  [Input Tugas Baru...]     [Tambah]       │ ← Input Area
├─────────────────────────────────────────────┤
│           [Hapus Semua]                    │ ← Action Button
└─────────────────────────────────────────────┘
```
