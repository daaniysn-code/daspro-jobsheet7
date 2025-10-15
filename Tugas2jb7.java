import java.util.Scanner;
public class Tugas2jb7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total=0;

        do{
            System.out.println("Masukan Jenis Kendaraan (1.Mobil = Rp.3000 2.Motor = Rp.2000 0 = keluar)");
            jenis = sc.nextInt();
            if (jenis == 1 || jenis == 2) {
                System.out.println("Masukan Durasi Parkir ");
                durasi = sc.nextInt();
            if (durasi > 5) {
                total += 12500;
            } else if (jenis == 1) {
                total += durasi * 3000;
            } else if (jenis == 2) {
                total += durasi * 2000;
            }
            }
                
        } while (jenis != 0);
        System.out.println("Total Pendapatan Parkir: Rp." + total);
    }
}