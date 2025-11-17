// === Script Auto Typing ke Elemen .ace_content ===

// Kode yang mau diketik
const code = `
import java.util.Scanner;

public class Main {

public static int hitungPendapatanHarian(int jumlah, int hargaJual) {
return jumlah * hargaJual;
}

public static int hitungKeuntunganHarian(int jumlah, int hargaJual, int biayaProduksi) {
return (hargaJual - biayaProduksi) * jumlah;
}

public static int totalKeuntunganMingguan(int[] keuntungan, int index) {
if (index == keuntungan.length) return 0;
return keuntungan[index] + totalKeuntunganMingguan(keuntungan, index + 1);
}

public static void tampilkanLaporan(int totalPendapatan, int totalKeuntungan) {
System.out.println("Total Pendapatan Mingguan: Rp" + totalPendapatan);
System.out.println("Total Keuntungan Mingguan: Rp" + totalKeuntungan);
}

public static void main(String[] args) {
Scanner in = new Scanner(System.in);

int n = in.nextInt();
int[] pendapatanHari = new int[n];
int[] keuntunganHari = new int[n];

for (int i = 0; i < n; i++) {
int jumlah = in.nextInt();
int hargaJual = in.nextInt();
int biayaProduksi = in.nextInt();

pendapatanHari[i] = hitungPendapatanHarian(jumlah, hargaJual);
keuntunganHari[i] = hitungKeuntunganHarian(jumlah, hargaJual, biayaProduksi);
}

int totalPendapatan = 0;
for (int i = 0; i < n; i++) {
totalPendapatan += pendapatanHari[i];
System.out.println("Hari ke-" + (i + 1) + " -> Pendapatan: Rp" + pendapatanHari[i] + " | Keuntungan: Rp" + keuntunganHari[i]);
}

int totalKeuntungan = totalKeuntunganMingguan(keuntunganHari, 0);
tampilkanLaporan(totalPendapatan, totalKeuntungan);
}
}

`;

// Ambil elemen target
const editorEl = document.querySelector('.ace_content');

// Klik dulu biar fokus
editorEl.click();

// Simulasikan pengetikan huruf demi huruf
let index = 0;
function typeNextChar() {
  if (index >= code.length) return;

  const char = code[index];
  const keyEvent = new KeyboardEvent('keydown', { key: char });
  editorEl.dispatchEvent(keyEvent);

  const inputEvent = new InputEvent('input', {
    data: char,
    inputType: 'insertText',
    bubbles: true,
    cancelable: true
  });
  editorEl.dispatchEvent(inputEvent);

  // masukkan karakter via execCommand (fallback lama, banyak editor masih support)
  document.execCommand('insertText', false, char);

  index++;
  setTimeout(typeNextChar, 10); // kecepatan ketik (ms)
}

// Mulai mengetik
setTimeout(typeNextChar, 500); // tunggu 0.5 detik setelah klik
