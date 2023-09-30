import java.util.Scanner;

public class TugasPertemuan5_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int skor =0, answer;
        String nama;
        System.out.println("Selamat datang di Pelatihan Matematika Dzul !");
        System.out.println();

        System.out.print("Masukkan nama anda : ");
        nama = input.nextLine();

        System.out.println("Jawablah pertanyaan di bawah ini.");
        
        System.out.print("10 + 5 = ");
        answer = input.nextInt();
        if(answer == 15){
            System.out.println("BENAR !");
            System.out.println();
            skor += 25;
        }else{
            System.out.println("SALAH !");
            System.out.println();
        }
        
        System.out.print("30 - 8 = ");
        answer = input.nextInt();
        if(answer == 22){
            System.out.println("BENAR !");
            System.out.println();
            skor += 25;
        }else{
            System.out.println("SALAH !");
            System.out.println();
        }

        System.out.print("5 * 6 = ");
        answer = input.nextInt();
        if(answer == 30){
            System.out.println("BENAR !");
            System.out.println();
            skor += 25;
        }else{
            System.out.println("SALAH !");
            System.out.println();
        }

        System.out.print("40 / 5 = ");
        answer = input.nextInt();
        if(answer == 8){
            System.out.println("BENAR !");
            System.out.println();
            skor += 25;
        }else{
            System.out.println("SALAH !");
            System.out.println();
        }

        System.out.println();
        System.out.println("Anda telah menyelesaikan semua soal test matematika dasar.");

        if(skor > 75){
            System.out.println("Selamat "+nama+" , anda skor anda berada di atas KKM!");
            if(skor <= 90){
                System.out.println("Skor anda adalah "+ skor+". Tingkatkan Lagi ! ");
            }else{
                System.out.println("Skor anda adalah "+ skor+". Pertahankan ! ");
            }
        }else{
            System.out.println(nama+" , Skor anda masih belum mencukupi KKM.");
            System.out.println("Skor anda adalah " + skor+". Tetap Semangat Belajar !");

        }
    }
}
