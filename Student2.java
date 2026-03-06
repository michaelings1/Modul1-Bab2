public class Student2 {

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;

    static int jumlahSiswa = 0;

    public Student2(){
        name = "";
        address = "";
        age = 0;
        jumlahSiswa++;
    }

    public Student2(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        jumlahSiswa++;
    }

    public void setName(String n){
        name = n;
    }

    public void setAddress(String a){
        address = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setMath(int math){
        mathGrade = math;
    }

    public void setEnglish(int english){
        englishGrade = english;
    }

    public void setScience(int science){
        scienceGrade = science;
    }

    private double getAverage(){
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade)/3;
        return result;
    }

    public void displayMessage(){
        System.out.println("Siswa dengan nama "+name);
        System.out.println("beralamat di "+address);
        System.out.println("berumur "+age);
        System.out.println("mempunyai nilai rata rata "+getAverage());
    }

    public static int getJumlahSiswa(){
        return jumlahSiswa;
    }
}