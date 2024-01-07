public class Mahasiswa {
    private String nim;
    private String nama;
    private String umur;
    private String alamat;

    public Mahasiswa(String nim, String nama, String umur, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
        this.alamat = alamat;
    }
    public String getNim() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getUmur() {
        return umur;
    }
    public String getAlamat() {
        return alamat;
    }
}