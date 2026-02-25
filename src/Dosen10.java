public class Dosen10 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen10(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public String getJenisKelamin() {
        return jenisKelamin ? "Pria" : "Wanita";
    }
}
