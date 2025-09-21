public class Day14 {
    public static void main(String[] args) {
        String nama = "Masriadi";
        String usia = "20";
        byte umur = Byte.parseByte(usia);
        String bulanLahir = "2";
        short bl = Short.parseShort(bulanLahir);
        String tanggalLahir = "20";
        int tglL = Integer.parseInt(tanggalLahir);
        String tahunLahir = "2004";
        short thnL = Short.parseShort(tahunLahir);
        String nomorwa = "6283137555097";
        long nomor = Long.parseLong(nomorwa);
        
                  String nilaiRtIjazah = "70.0";
                  float nilaiIjazah = Float.parseFloat(nilaiRtIjazah);
                  
                  String nilaiujian = "76.5";
                  double nilai = Double.parseDouble(nilaiujian);
                  
                  String jeniskelamin = "l";
                  char JK = jeniskelamin.charAt(0);
                  
                  String status = "true";
                  boolean status1 = Boolean.parseBoolean(status);
                           // OUTPUT MENGUBAH STRING JADI TIPE DATA PRMITIF
        System.out.println("==== biodata mahasiswa ====");
        System.out.println(Biodata);
        System.out.println("NAMA \t= " + nama);
        System.out.println("UMUR \t= " + umur + " TAHUN ");
        System.out.println("TANGGAL LAHIR \t= " + tglL + "-" + bl + "-" + thnL);
        System.out.println("NP \t= " + nomor);
        System.out.println("NILAI RATA RATA IJAZAH \t= " + nilaiIjazah);
        System.out.println("NILAI UJIAN \t= " + nilai);
        System.out.println("JENIS KELAMIN \t= " + JK);
        System.out.println("STATUS MAHASISWA \t= " + status1);
    
}
