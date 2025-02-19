public class MatkulMain23 {
    public static void main(String[] args) {
        Matkul23 alsd = new Matkul23("001", "Algoritma dan Struktur Data", 4, 4);
        alsd.tampilkanInformasi();
        alsd.ubahSKS(2);
        alsd.kurangiJam(2);

        Matkul23 basisData = new Matkul23("002", "Basis Data", 2, 4);
        basisData.tampilkanInformasi();
        basisData.tambahJam(6);
        basisData.ubahSKS(4);
    }
}
