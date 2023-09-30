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

        String huruf ="";

        if(80 < total){
            huruf = "A";
        }else if(73 < total ){
            huruf = "B+";
        }else if(65 < total ){
            huruf = "B";
        }else if(60 < total ){
            huruf = "C+";
        }else if(50 < total ){
            huruf = "C";
        }else if(39 < total ){
            huruf = "D";
        }else if(total<= 39 ){
            huruf = "E";
        }

        System.out.println("Nilai akhir = " + total + " dengan nilai huruf "+ huruf+" sehingga " + message);
    }
}
