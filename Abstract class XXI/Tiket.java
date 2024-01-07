public class Tiket extends BaseInfo {
    public String namaFilm;
    public String hargaTiket;
    public String noStudio;

    @Override
    public void tampilkanInfo() {
        System.out.println("Tampilan Info Pemesanan Tiket");

    }

    @Override
    public void prosesPemesanan() {
        System.out.println("Proses Pemesanan Tiket");
    } 
    
}
