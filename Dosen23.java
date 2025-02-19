public class Dosen23 {
    String idDosen;
    String nama;
    String bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen23() {

    }
    public Dosen23(String id, String nm, String bdg, Boolean status, int thnGabung){
        idDosen = id;
        nama = nm;
        bidangKeahlian = bdg;
        statusAktif = status;
        tahunBergabung = thnGabung;
    }
    void tampilkanInformasi(){
        System.out.println("Nama: " + nama);
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println("Tahun Bergabung: " + tahunBergabung);
    }
    void setStatusAktif(boolean status){
        status = true;
    }
    void hitungMasaKerja(int thnSkrg){
        tahunBergabung = thnSkrg;
        System.out.println("Masa kerja saat ini: " + tahunBergabung);
    }
    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian telah diubah menjadi: " + bidangKeahlian);
    }
}
