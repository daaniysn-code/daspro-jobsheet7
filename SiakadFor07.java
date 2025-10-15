import java.util.Scanner;
public class SiakadFor07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;

        for (int i =1; i<= 10; i++){
            System.out.println("Masukan Nilai Mahasiswa ke-" + i + ":");
            nilai = input.nextDouble();
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
        }
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);

    }
}
