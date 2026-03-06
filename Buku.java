public class Buku {

    String judul;
    String kategori;
    Penulis penulis;
    String sinopsis;

    public Buku(String judul, String kategori, Penulis penulis, String sinopsis) {
        this.judul = judul;
        this.kategori = kategori;
        this.penulis = penulis;
        this.sinopsis = sinopsis;
    }

    public void tampilkan() {
        System.out.println("Judul Buku : " + judul);
        System.out.println("Kategori   : " + kategori);
        System.out.println("Penulis    : " + penulis.nama);
        System.out.println("Sinopsis   : " + sinopsis);
        System.out.println("Jumlah Kata Sinopsis : " + hitungJumlahKata());
        System.out.println();
    }

    public int hitungJumlahKata() {
        String[] kata = sinopsis.split(" ");
        return kata.length;
    }

    public double cekKesamaan(Buku bukuLain) {

        int sama = 0;
        int total = 4;

        if (this.judul.equals(bukuLain.judul)) {
            sama++;
        }

        if (this.kategori.equals(bukuLain.kategori)) {
            sama++;
        }

        if (this.penulis.nama.equals(bukuLain.penulis.nama)) {
            sama++;
        }

        if (this.sinopsis.equals(bukuLain.sinopsis)) {
            sama++;
        }

        return (sama * 100.0) / total;
    }

    public Buku copy() {
        return new Buku(
                this.judul,
                this.kategori,
                new Penulis(this.penulis.nama),
                this.sinopsis
        );
    }
}