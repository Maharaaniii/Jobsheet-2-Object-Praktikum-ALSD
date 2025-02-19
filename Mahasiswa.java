public class Mahasiswa {
    String nim;
    String nama;
    String kelas;
    double ipk;
    public Mahasiswa() {

    }
    public Mahasiswa(String nma, String nm, double ipk, String klas) {
        nama =nma;
        nim = nm;
        ipk = ipk;
        kelas = klas;
    }
    
    void tampilkanInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Kelas: " + kelas);
    }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }
    void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.00 && ipkBaru <= 4.00) {
            ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui: " + ipk);
        } else {
            System.out.println("IPK tidak valid, IPK harus antara 0.00 dan 4.00");
        }
    }
    String nilaiKinerja(){
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

}
