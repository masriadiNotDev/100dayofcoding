import java.util.Scanner;
public class Day15 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int angka1, angka2, tambah, kurang;

        System.out.printf("Angka Pertama : ");
          angka1 = inp.nextInt();
        System.out.printf("Angka Kedua : ");
          angka2 = inp.nextInt();
     tambah = angka1 + angka2;
     kurang = angka1 - angka2;
    
     System.out.println("Hasil penjumlahan : " + tambah);
     System.out.println("Hasil pengurangan : " + kurang);


    }
}
