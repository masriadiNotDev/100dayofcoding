import java.util.Scanner;  // MODULE DARI SCANNER
public class Day11 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);  // 

       System.out.printf("masukan Nama : "); // INPUT DARI SCANNER
       String nama = scanner.nextLine(); // MEMBUAT SCANNER ATAU INPUT TEXT BERTIPE STRING 
       System.out.printf("Masukan umur : ");
       int umur = scanner.nextInt(); // SCANNER TIPE DATA INTEGER 
    System.out.printf("Halo nama saya " + nama + ", saya berumur " + umur);  // OUTPUT DARI SCANNER  

    /////////////
    /// JADI PERBEDAAN SCANNER DARI TIPE DATA STRING DAN INTEGER
    /// STRING ==> nextLine();
    /// INTEGER ==> nextInt();
    /////////////
    }
}
