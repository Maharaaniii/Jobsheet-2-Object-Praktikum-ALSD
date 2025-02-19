public class Matkul23 {
    String kodeMK;
    String nama;
    int SKS;
    int jmlJam;

    public Matkul23() {

    }
    public Matkul23(String kode, String nma, int sks, int jmlJm) {
        kodeMK = kode;
        nama = nma;
        SKS = sks;
        jmlJam = jmlJm;
    }

    void tampilkanInformasi() {
        System.out.println("Nama mata kuliah: " + nama);
        System.out.println("Kode mata kuliah: " + kodeMK);
        System.out.println("Jumlah SKS: " + SKS);
        System.out.println("Jumlah jam: " + jmlJam);
    }
    void ubahSKS(int sksBaru) {
        SKS = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + SKS);
    }
    void tambahJam(int jam) {
        jmlJam = jam;
        System.out.println("Jam telah ditambah menjadi: " + jmlJam);
    }
    void kurangiJam(int jam) {
        jam = jam;
        System.out.println("Jam telah dikurangi menjadi: " + jam);
    }
}
