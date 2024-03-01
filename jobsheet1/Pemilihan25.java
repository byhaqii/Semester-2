import java.util.Scanner;

public class Pemilihan25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

        System.out.println("Input Nilai Tugas : ");
        nilaiTugas = sc.nextInt();
        System.out.println("Input Nilai Kuis : ");
        nilaiKuis = sc.nextInt();
        System.out.println("Input Nilai UTS : ");
        nilaiUTS = sc.nextInt();
        System.out.println("Input Nilai Uas : ");
        nilaiUAS = sc.nextInt();

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || 
            nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("NILAI TIDAK VALID");
        }

        System.out.println("=============================");

        double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
        System.out.println("Nilai akhir : " + nilaiAkhir);

        String nilaiHuruf = " ";
        if (nilaiAkhir > 80 && nilaiAkhir <= 100){
            nilaiHuruf = "A";
        }else if (nilaiAkhir > 73 && nilaiAkhir <= 80 ){
            nilaiHuruf = "B+";
        }else if (nilaiAkhir  > 65 && nilaiAkhir <= 73){
            nilaiHuruf = "B";
        }else if (nilaiAkhir > 60 && nilaiAkhir <= 65){
            nilaiHuruf = "C+";
        }else if (nilaiAkhir > 50 && nilaiAkhir <= 60){
            nilaiHuruf = "C";
        }else if (nilaiAkhir > 39 && nilaiAkhir <= 60){
            nilaiHuruf = "D";
        }else{
            nilaiHuruf = "E";
        }
        System.out.println("Nilai Huruf :" +nilaiHuruf);

        String pesan = " ";
        if (nilaiHuruf == "A" || nilaiHuruf == "B+" || nilaiHuruf == "B" || nilaiHuruf == " C+" || nilaiHuruf == "C"){
            pesan = "LULUS";
        }else{
            pesan = "TIDAK LULUS";
        }
        System.out.println("=============================");
        System.out.println("Anda dinyatakan " +pesan);
    }
}
