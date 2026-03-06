//Nama : Michael Renanda
//Kelas : TI - B
//NIM : 255150707111027
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa : ");
        int jumlah = input.nextInt();
        input.nextLine();

        Student[] siswa = new Student[jumlah];

        for(int i=0; i<jumlah; i++){

            System.out.println("Data siswa ke-"+(i+1));

            System.out.print("Nama : ");
            String nama = input.nextLine();

            System.out.print("Alamat : ");
            String alamat = input.nextLine();

            System.out.print("Umur : ");
            int umur = input.nextInt();

            System.out.print("Nilai Math : ");
            double math = input.nextDouble();

            System.out.print("Nilai English : ");
            double eng = input.nextDouble();

            System.out.print("Nilai Science : ");
            double sci = input.nextDouble();
            input.nextLine();

            siswa[i] = new Student(nama, alamat, umur, math, eng, sci);
        }

        System.out.println("===== DATA NAMA SISWA =====");

        for(int i=0;i<jumlah;i++){
            siswa[i].displayMessage();
            System.out.println();
        }
    }
}