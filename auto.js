// === Script Auto Typing ke Elemen .ace_content ===

// Kode yang mau diketik
const code = `import java.util.*;

public class utp2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int baris = input.nextInt();
int kolom = input.nextInt();
int harga = -1;

boolean[][] kursiTerisi = new boolean[baris][kolom];

// Input status kursi
for (int i = 0; i < baris; i++) {
for (int j = 0; j < kolom; j++) {
kursiTerisi[i][j] = input.next().equalsIgnoreCase("true");
}
}

int n = input.nextInt();
input.nextLine(); // konsumsi newline

for (int index = 0; index < n; index++) {
String perintah = input.nextLine().trim();

if (perintah.equals("CEK_KURSI")) {
for (int i = 0; i < baris; i++) {
for (int j = 0; j < kolom; j++) {
System.out.print((kursiTerisi[i][j] ? "X" : "O"));
if (j < kolom - 1) System.out.print(" ");
}
System.out.println();
}
} else if (perintah.startsWith("PESAN")) {
String[] arr = perintah.split("\\\\s+");
int pBaris = Integer.parseInt(arr[1]) - 1;
int pKolom = Integer.parseInt(arr[2]) - 1;

if (kursiTerisi[pBaris][pKolom]) {
System.out.printf("Kursi baris %d kolom %d sudah dipesan sebelumnya!\\n",
pBaris + 1, pKolom + 1);
} else {
kursiTerisi[pBaris][pKolom] = true;
System.out.printf("Kursi baris %d kolom %d berhasil dipesan.\\n",
pBaris + 1, pKolom + 1);
}

} else if (perintah.startsWith("SETHARGA")) {
String[] arr = perintah.split("\\\\s+");
harga = Integer.parseInt(arr[1]);
System.out.println("Harga kursi diubah menjadi " + harga + ".");

} else if (perintah.equals("HITUNG_PENDAPATAN")) {
if (harga == -1) {
System.out.println("Harga kursi belum ditetapkan!");
} else {
int total = 0;
for (int i = 0; i < baris; i++) {
for (int j = 0; j < kolom; j++) {
if (kursiTerisi[i][j]) total += harga;
}
}
System.out.println("Pendapatan: " + total);
}

} else if (perintah.equals("KOSONGKAN")) {
for (int i = 0; i < baris; i++) {
Arrays.fill(kursiTerisi[i], false);
}
System.out.println("Semua kursi telah dikosongkan.");
}
}

input.close();
}
}`;

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
