var kode = `

`;

// cari editor ELING (ACE editor) dan tempel kode
var el = document.querySelector('.ace_text-input');
if (el) {
  el.value = kode;
  el.dispatchEvent(new InputEvent('input', { bubbles: true }));
  console.log("✅ Kode BudiBakery.java berhasil ditempel ke editor!");
} else {
  console.log("❌ Editor tidak ditemukan. Pastikan halaman editor ELING sudah terbuka.");
}