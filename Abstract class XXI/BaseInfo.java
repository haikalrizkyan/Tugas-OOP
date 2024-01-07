public abstract class BaseInfo {
    public String namaPelayanKasir;
    public String waktuPenayangan;
    public int namaFilm;

    public void tampilkanInfo() {
        System.out.println("Tampilan Info Pemesanan: ");

    }

    abstract void prosesPemesanan();
}