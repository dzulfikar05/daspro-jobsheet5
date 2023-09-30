import java.util.Scanner;
public class PemilihanPercobaan2_08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.print("Nilai UAS     : ");
        float uas = input08.nextFloat();
        System.out.print("Nilai UTS     : ");
        float uts = input08.nextFloat();
        System.out.print("Nilai Kuis    : ");
        float kuis = input08.nextFloat();
        System.out.print("Nilai Tugas   : ");
        float tugas = input08.nextFloat();
        
        float total = (uas*0.4f) + (uts*0.3f) + (kuis*0.1f) + (tugas*0.2f);
        
        String message = total < 65 ? "Remidi" : "Tidak remidi";

        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}
