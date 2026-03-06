//Nama : Michael Renanda
//Kelas : TI - B
//NIM : 255150707111027
public class MainStudent2 {
    public static void main(String[] args){

        Student2 ari = new Student2();
        Student2 nando = new Student2("Nando","Surabaya",25);
        Student2 budi = new Student2("Budi","Jakarta",20);
        Student2 adi = new Student2("Adi","Bandung",20);

        System.out.println("Jumlah objek student yang dibuat: " + Student2.getJumlahSiswa());

    }
}