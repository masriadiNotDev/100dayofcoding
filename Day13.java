import java.util.Scanner;
public class Evaluasi {  
    public static void main(String[] args) { 
        System.out.println("SELAMAT DATANG DI PROGRAM EVALUASI JAVA");
        Scanner inp = new Scanner(System.in);
        String nama;
        String nim;
        String alamat; 
        String hoby;
        int usia;


        int tabungan = 1000000;
int tambh_uang = 500000;
int hasil = tambh_uang + tambh_uang;
int kurang_uang = 200000;
int hasilsemua = hasil - kurang_uang;


        float tinggi_badan;
        final double PHI = 3.14159;
        // input masukan dari user
             System.out.print("Masukkan nama   : ");
        nama = inp.nextLine();
        System.out.print("Masukkan NIM    : ");
        nim = inp.nextLine();
        System.out.print("Masukkan alamat : ");
        alamat = inp.nextLine();
        System.out.print("Masukkan usia   : ");
        usia = inp.nextInt();
        System.out.print("Masukkan tinggi badan : ");
        tinggi_badan = inp.nextFloat();
        inp.nextLine(); // membersihkan buffer
        System.out.print("Masukkan hobi   : ");
        hoby = inp.nextLine();
        System.out.print("Apakah masih mahasiswa? (true/false): ");
        boolean statusMahasiswa = inp.nextBoolean();

System.out.printf("Masukkan jari-jari lingkaran: ");
float r = inp.nextFloat();
double luas = PHI * r * r;

// OUTPUTNYA 
                System.out.println("===== B I O D A T A =====");
                System.out.println("NAMA           : " + nama);
                System.out.println("NIM            : " + nim);
                System.out.println("UMUR           : " + usia);
                System.out.println("ALAMAT         : " + alamat);
                System.out.println("HOBI           : " + hoby);
                System.out.println("TINGGI BADAN   : " +tinggi_badan);
                System.out.println("SISA TABUNGAN  : " + hasilsemua);
                System.out.println("STATUS MHSISWA : " + statusMahasiswa);
                System.out.println("LUAS LINGKARN  : " + luas);
            System.out.println("===== SELESAI =====");
    }}
