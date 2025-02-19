public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 rani = new Dosen23("R4N1", "Umi Maharani, S.H.M.H.,", "Bisnis", true, 2020);
        rani.tampilkanInformasi();
        rani.setStatusAktif(false);
        rani.hitungMasaKerja(2025);
        rani.ubahKeahlian("Sosial Humaniora");

        Dosen23 Adevian = new Dosen23("D3V1", "Adevian Fairuz Pratama, S.T.,M.T.,", "Informatika", false, 2019);
        Adevian.tampilkanInformasi();
        Adevian.setStatusAktif(false);
        Adevian.hitungMasaKerja(2025);
        Adevian.ubahKeahlian("Matematika");
    }
}
