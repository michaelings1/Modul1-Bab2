//Nama : Michael Renanda
//Kelas : TI - B
//NIM : 255150707111027
public class Main {
    public static void main(String[] args) {

        Buku teknologi1 = new Buku("Pemrograman Java","Teknologi", new Penulis("James Gosling"),
        "Buku ini membahas konsep dasar pemrograman Java untuk membuat aplikasi modern");
        Buku teknologi2 = new Buku("Artificial Intelligence","Teknologi", new Penulis("Stuart Russell"), 
        "Buku ini menjelaskan konsep kecerdasan buatan serta penerapannya dalam teknologi modern");
        Buku teknologi3 = new Buku("Jaringan Komputer","Teknologi", new Penulis("Andrew S. Tanenbaum"),
        "Buku ini membahas cara kerja jaringan komputer serta komunikasi data antar perangkat");
        Buku teknologi4 = new Buku("Basis Data","Teknologi", new Penulis("Raghu Ramakrishnan"),
        "Buku ini menjelaskan pengelolaan data menggunakan sistem basis data modern");
        Buku teknologi5 = new Buku("Machine Learning","Teknologi", new Penulis("Tom M. Mitchell"),
        "Buku ini membahas teknik pembelajaran mesin untuk analisis data dan prediksi");

        Buku filsafat1 = new Buku("Filsafat Hidup","Filsafat", new Penulis("Socrates"),
        "Buku ini membahas pemikiran filsafat tentang kehidupan manusia dan kebijaksanaan");
        Buku filsafat2 = new Buku("Logika Berpikir","Filsafat", new Penulis("Aristoteles"),
        "Buku ini menjelaskan cara berpikir logis untuk memahami berbagai persoalan kehidupan");
        Buku filsafat3 = new Buku("Etika Manusia","Filsafat", new Penulis("Immanuel Kant"),
        "Buku ini membahas konsep etika dan moralitas dalam kehidupan manusia");
        Buku filsafat4 = new Buku("Filsafat Barat","Filsafat", new Penulis("Friedrich Nietzsche"),
        "Buku ini menjelaskan perkembangan pemikiran filsafat barat dari masa klasik");
        Buku filsafat5 = new Buku("Filsafat Timur","Filsafat", new Penulis("Confucius"), 
        "Buku ini membahas nilai kebijaksanaan dan ajaran moral dalam filsafat timur");

        Buku sejarah1 = new Buku("Sejarah Dunia","Sejarah", new Penulis("Yuval Noah Harari"),
        "Buku ini menjelaskan perjalanan panjang peradaban manusia dari masa lampau");
        Buku sejarah2 = new Buku("Sejarah Indonesia","Sejarah", new Penulis("Slamet Muljana"), 
        "Buku ini membahas perkembangan bangsa Indonesia dari masa kerajaan");
        Buku sejarah3 = new Buku("Peradaban Kuno","Sejarah", new Penulis("Will Durant"),
        "Buku ini menjelaskan berbagai peradaban kuno yang pernah berkembang");
        Buku sejarah4 = new Buku("Perang Dunia","Sejarah", new Penulis("Antony Beevor"),
        "Buku ini membahas konflik besar dunia dan dampaknya bagi manusia");
        Buku sejarah5 = new Buku("Sejarah Asia","Sejarah", new Penulis("John Keay"),
        "Buku ini menjelaskan perkembangan sejarah dan budaya negara negara Asia");

        Buku agama1 = new Buku("Pengantar Ilmu Agama","Agama", new Penulis("Karen Armstrong"),
        "Buku ini membahas konsep dasar agama serta nilai spiritual kehidupan manusia");
        Buku agama2 = new Buku("Etika dalam Agama","Agama", new Penulis("Seyyed Hossein Nasr"),
        "Buku ini menjelaskan hubungan antara ajaran agama dan etika manusia");
        Buku agama3 = new Buku("Sejarah Agama Dunia","Agama", new Penulis("Huston Smith"),
        "Buku ini membahas perkembangan berbagai agama besar di dunia");
        Buku agama4 = new Buku("Nilai Moral Agama","Agama", new Penulis("Al-Ghazali"),
        "Buku ini menjelaskan pentingnya nilai moral dalam kehidupan manusia");
        Buku agama5 = new Buku("Agama dan Kehidupan","Agama", new Penulis("Nurcholish Madjid"),
        "Buku ini membahas hubungan antara agama dan kehidupan sosial manusia");

        Buku psikologi1 = new Buku("Psikologi Kepribadian","Psikologi", new Penulis("Sigmund Freud"),
        "Buku ini menjelaskan teori kepribadian manusia dan perkembangan psikologi modern");
        Buku psikologi2 = new Buku("Psikologi Pendidikan","Psikologi", new Penulis("Jean Piaget"),
        "Buku ini membahas proses belajar manusia dari sudut pandang psikologi");
        Buku psikologi3 = new Buku("Psikologi Sosial","Psikologi", new Penulis("Philip Zimbardo"),
        "Buku ini menjelaskan perilaku manusia dalam interaksi sosial masyarakat");
        Buku psikologi4 = new Buku("Psikologi Anak","Psikologi", new Penulis("Lev Vygotsky"),
        "Buku ini membahas perkembangan mental dan kognitif anak sejak kecil");
        Buku psikologi5 = new Buku("Psikologi Perkembangan","Psikologi", new Penulis("Erik Erikson"),
        "Buku ini menjelaskan tahap perkembangan manusia dari bayi hingga dewasa");

        Buku politik1 = new Buku("Politik Modern","Politik", new Penulis("Samuel P. Huntington"),
        "Buku ini membahas dinamika sistem politik modern dalam dunia global");
        Buku politik2 = new Buku("Sistem Politik","Politik", new Penulis("Robert A. Dahl"),
        "Buku ini menjelaskan struktur dan sistem politik dalam pemerintahan");
        Buku politik3 = new Buku("Demokrasi Dunia","Politik", new Penulis("Francis Fukuyama"),
        "Buku ini membahas perkembangan demokrasi di berbagai negara dunia");
        Buku politik4 = new Buku("Politik Indonesia","Politik", new Penulis("Miriam Budiardjo"),
        "Buku ini menjelaskan sistem politik dan pemerintahan di Indonesia");
        Buku politik5 = new Buku("Teori Politik","Politik", new Penulis("Niccolo Machiavelli"),
        "Buku ini membahas teori kekuasaan dan strategi dalam dunia politik");

        Buku fiksi1 = new Buku("Petualangan Nusantara","Fiksi", new Penulis("Andrea Hirata"),
        "Cerita petualangan menjelajahi berbagai daerah indah di Indonesia");
        Buku fiksi2 = new Buku("Misteri Kota Tua","Fiksi", new Penulis("Agatha Christie"),
        "Cerita misteri tentang kejadian aneh yang terjadi di kota tua");
        Buku fiksi3 = new Buku("Legenda Gunung","Fiksi", new Penulis("Tere Liye"),
        "Cerita legenda tentang rahasia gunung dan kehidupan masyarakat");
        Buku fiksi4 = new Buku("Rahasia Hutan","Fiksi", new Penulis("J. K. Rowling"),
        "Cerita petualangan di hutan penuh misteri dan makhluk ajaib");
        Buku fiksi5 = new Buku("Dunia Imajinasi","Fiksi", new Penulis("J. R. R. Tolkien"),
        "Cerita fantasi tentang dunia imajinasi penuh petualangan menegangkan");

        Buku[] daftarBuku = {
                teknologi1, teknologi2, teknologi3, teknologi4, teknologi5,
                filsafat1, filsafat2, filsafat3, filsafat4, filsafat5,
                sejarah1, sejarah2, sejarah3, sejarah4, sejarah5,
                agama1, agama2, agama3, agama4, agama5,
                psikologi1, psikologi2, psikologi3, psikologi4, psikologi5,
                politik1, politik2, politik3, politik4, politik5,
                fiksi1, fiksi2, fiksi3, fiksi4, fiksi5
        };

        for(int i = 0; i < daftarBuku.length; i++){
            daftarBuku[i].tampilkan();
        }

        System.out.println("================================");
        System.out.println("PERBANDINGAN BUKU");

        System.out.println("Buku 1 : " + teknologi1.judul);
        System.out.println("Buku 2 : " + teknologi2.judul);

        double kesamaan = teknologi1.cekKesamaan(teknologi2);

        System.out.println("Tingkat Kesamaan : " + kesamaan + "%");

    }
}