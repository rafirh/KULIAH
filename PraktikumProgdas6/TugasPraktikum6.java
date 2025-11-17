// Nama: Muhammad Rafi Rahman Habibi
// NIM: 255150700111005
// Kelas: TI-A

class Buku {
    String judul;
    String[] penulis;

    Buku(String judul, String[] penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    void tampilkanInfo(int nomor) {
        System.out.print(nomor + ". " + judul + " (Penulis: ");
        for (int i = 0; i < penulis.length; i++) {
            System.out.print(penulis[i]);
            if (i < penulis.length - 1)
                System.out.print(", ");
        }
        System.out.println(")");
    }
}

class Kategori {
    String namaKategori;
    Buku[] daftarBuku;

    Kategori(String namaKategori, Buku[] daftarBuku) {
        this.namaKategori = namaKategori;
        this.daftarBuku = daftarBuku;
    }

    void tampilkanKategori() {
        System.out.println("Kategori: " + namaKategori);
        for (int i = 0; i < daftarBuku.length; i++) {
            daftarBuku[i].tampilkanInfo(i + 1);
        }
        System.out.println();
    }
}

public class TugasPraktikum6 {
    public static void main(String[] args) {

        Kategori[] daftarKategori = {

            new Kategori("Teknologi", new Buku[] {
                new Buku("Belajar Java Modern", new String[] {
                    "Raka Putra", "Selvi Maulida"
                }),
                new Buku("Arsitektur Komputer", new String[] {
                    "Darwin Saputro"
                }),
                new Buku("Basis Data Lanjut", new String[] {
                    "Lulu Amelia", "Rio Hartanto"
                }),
                new Buku("Keamanan Siber", new String[] {
                    "Rendi Akbar", "Vira Kurniasih"
                }),
                new Buku("Pengantar AI", new String[] {
                    "Dimas Ariawan"
                })
            }),

            new Kategori("Filsafat", new Buku[] {
                new Buku("Filsafat Barat Klasik", new String[] {
                    "Yusuf Rahadian"
                }),
                new Buku("Teori Pengetahuan", new String[] {
                    "Arman Prasetyo", "Bela Sari"
                }),
                new Buku("Logika Simbolik", new String[] {
                    "Galuh Nirmala"
                }),
                new Buku("Filsafat Eksistensial", new String[] {
                    "Dewa Adi", "Karin Lestari"
                }),
                new Buku("Pemikiran Tokoh Dunia", new String[] {
                    "Made Wirawan"
                })
            }),

            new Kategori("Sejarah", new Buku[] {
                new Buku("Sejarah Asia Tenggara", new String[] {
                    "Reno Adriansyah"
                }),
                new Buku("Peradaban Kuno Dunia", new String[] {
                    "Sofia Hadid"
                }),
                new Buku("Sejarah Revolusi Dunia", new String[] {
                    "Johan Pratama", "Tisa Surya"
                }),
                new Buku("Kerajaan Besar Nusantara", new String[] {
                    "Guntur Prakoso"
                }),
                new Buku("Perang Dunia I & II", new String[] {
                    "Hana Lestari", "Riko Dewantara"
                })
            }),

            new Kategori("Agama", new Buku[] {
                new Buku("Pemahaman Iman Sehari-hari", new String[] {
                    "Lina Wulandari"
                }),
                new Buku("Ajaran Kebaikan Hidup", new String[] {
                    "Bramantyo Rendra", "Wira Saputra"
                }),
                new Buku("Sejarah Agama Dunia", new String[] {
                    "Nabila Kurnia"
                }),
                new Buku("Makna Doa dan Ibadah", new String[] {
                    "Rizal Oktavian", "Ayu Maharani"
                }),
                new Buku("Harmoni Antar Umat", new String[] {
                    "Hilda Maryati"
                })
            }),

            new Kategori("Psikologi", new Buku[] {
                new Buku("Psikologi Kepribadian", new String[] {
                    "Fauzan Rahman"
                }),
                new Buku("Kecerdasan Emosional", new String[] {
                    "Serli Anggraini", "Beni Wirawan"
                }),
                new Buku("Perkembangan Manusia", new String[] {
                    "Dedi Ramadhan"
                }),
                new Buku("Psikologi Sosial Modern", new String[] {
                    "Karina Wijaya", "Leo Fernando"
                }),
                new Buku("Motivasi dan Perilaku", new String[] {
                    "Rafidah Prameswari"
                })
            }),

            new Kategori("Politik", new Buku[] {
                new Buku("Sistem Politik Global", new String[] {
                    "Alex Darmawan"
                }),
                new Buku("Hubungan Internasional", new String[] {
                    "Cici Paramita", "Haris Nugroho"
                }),
                new Buku("Teori Demokrasi", new String[] {
                    "Imam Wiratama"
                }),
                new Buku("Politik Ekonomi Dunia", new String[] {
                    "Safira Putri", "Najmi Ridwan"
                }),
                new Buku("Analisis Kebijakan Publik", new String[] {
                    "Reza Mahardika"
                })
            }),

            new Kategori("Fiksi", new Buku[] {
                new Buku("Langit di Atas Kota", new String[] {
                    "Alya Saraswati"
                }),
                new Buku("Petualangan Arka", new String[] {
                    "Nino Perdana", "Sisi Amelia"
                }),
                new Buku("Bulan Merah", new String[] {
                    "Kirana Wening"
                }),
                new Buku("Rahasia Hutan Gelap", new String[] {
                    "Romi Januar", "Nadira Utami"
                }),
                new Buku("Jejak Kaki di Pasir", new String[] {
                    "Farah Ningrum"
                })
            })
        };

        for (Kategori k : daftarKategori) {
            k.tampilkanKategori();
        }
    }
}
