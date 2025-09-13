public class Day7 {
    public static void main(String[] args) {
        
        // Tipe data char digunakan untuk menyimpan satu karakter
        char huruf = 'A'; // menyimpan karakter 'A'
        char simbol = '#'; // menyimpan karakter simbol '#'
        char angkaChar = '7'; // meskipun terlihat seperti angka, ini adalah karakter

        // Menampilkan nilai char
        System.out.println("Contoh char:");
        System.out.println("Huruf: " + huruf);
        System.out.println("Simbol: " + simbol);
        System.out.println("Angka sebagai char: " + angkaChar);
        
        // Kita juga bisa menampilkan nilai ASCII/Unicode dari char
        int kodeAscii = huruf; // konversi otomatis dari char ke int (kode Unicode)
        System.out.println("Kode ASCII dari '" + huruf + "' adalah: " + kodeAscii);
        
        // Tipe data boolean digunakan untuk menyimpan nilai true atau false
        boolean isSiswa = true;  // menyatakan bahwa seseorang adalah siswa
        boolean sudahLulus = false; // menyatakan bahwa seseorang belum lulus

        // Menampilkan nilai boolean
        System.out.println("\nContoh boolean:");
        System.out.println("Apakah siswa? " + isSiswa);
        System.out.println("Sudah lulus? " + sudahLulus);
        
        // Boolean biasanya digunakan dalam kondisi
        if (isSiswa) {
            System.out.println("Selamat datang, siswa!");
        }

        if (!sudahLulus) {
            System.out.println("Silakan lanjut belajar untuk lulus.");
        }
    }
}
