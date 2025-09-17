public class Day10 {
    // blank final di level class
    final int ANGKA_TETAP;  

    // constructor untuk isi blank final
    public Day10() {
        ANGKA_TETAP = 100; // masih boleh inisialisasi sekali di sini
        // ANGKA_TETAP = 200; //  error kalau coba ubah lagi
    }

    public static void main(String[] args) {
        // Variabel biasa
        int umur = 20;         // inisialisasi
        System.out.println("Umur awal: " + umur);
        umur = 25;             // update (boleh)
        System.out.println("Umur setelah update: " + umur);

        // Final variabel langsung diisi
        final double PI = 3.14159;
        System.out.println("Nilai PI: " + PI);
        // PI = 3.14; // error kalau coba update

        // Blank final variabel (diisi sekali setelah deklarasi)
        final String NAMA;
        NAMA = "Adi"; // boleh inisialisasi pertama
        System.out.println("Nama: " + NAMA);
        // NAMA = "Budi"; //  error kalau coba ubah lagi

        // Contoh final pada array
        final int[] angka = {1, 2, 3};
        angka[0] = 10; //  boleh ubah isi array
        System.out.println("Isi array[0]: " + angka[0]);
        // angka = new int[5]; // error, tidak bisa ganti referensi array

        // Akses blank final di level class
        Day10 demo = new Day10();
        System.out.println("ANGKA_TETAP: " + demo.ANGKA_TETAP);
    }
}
