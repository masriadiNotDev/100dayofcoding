import java.util.Scanner;

public class Day12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukan nama kamu : ");
    String nama = scanner.nextLine();

    System.out.print("Umur berapa : ");
    int umur = scanner.nextInt();
    scanner.nextLine(); 

    System.out.print("Domisili mana : ");
    String alamat = scanner.nextLine();

    System.out.print("Tempat lahir : ");
    String tl = scanner.nextLine();

    System.out.print("Bulan : ");
    String bulan = scanner.nextLine();

    System.out.print("Tanggal : ");
    String tanggal = scanner.nextLine();

    System.out.print("Tahun : ");
    String tahun = scanner.nextLine();

    System.out.println("------------ [BIODATA] ----------------------");
    System.out.println("[1] NAMA   : " + nama);
    System.out.println("[2] ALAMAT : " + alamat);
    System.out.println("[3] UMUR   : " + umur);
    System.out.println("[4] TTG    : " + tanggal + " " + bulan + " " + tahun + " di " + tl);
    System.out.println("---------------------------------------------");

    scanner.close();
  }
}
