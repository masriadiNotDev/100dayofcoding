public class Day6 {
  public static void main(String[] args) {
float nilaiFloat = 3.14f; 
// Literal 3.14 adalah double secara default, jadi perlu ditambahkan 'f' di akhir 
// agar dianggap float. Jika tidak, akan terjadi error saat kompilasi.

double nilaiDouble = 3.141592653589793;
// Tidak perlu menambahkan 'd' karena literal desimal dianggap double secara default.

System.out.println("Nilai Float: " + nilaiFloat);  
// Menampilkan nilai float (dengan presisi ~6-7 digit)

System.out.println("Nilai Double: " + nilaiDouble);  
// Menampilkan nilai double (dengan presisi lebih tinggi, ~15-16 digit)
  }
}
