import java.util.Scanner;

class PemilihanPercobaan_08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input08.nextInt();

        String operation = (angka%2 == 0) ? "genap": "ganjil";
        System.out.println("Angka " +angka+ " adalah bilangan "+ operation);

        // if( angka %2 == 0 ){
        //     System.out.println("Angka "+angka+" adalah bilangan genap");
        // }else{
        //     System.out.println("Angka "+angka+" adalah bilangan ganjil");
        // }
    }
}