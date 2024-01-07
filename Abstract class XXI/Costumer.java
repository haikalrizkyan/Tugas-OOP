public class Costumer extends BaseInfo {
    public String nomorCostumer;
    public String namaCostumer;
    public String emailCostumer;
    public String nohpCostumer;

    @Override
    public void tampilkanInfo() {
        System.out.println("Tampilan Info Pemesanan Tiket dan Pesanan Costumer");

    }

    @Override
    void prosesPemesanan() {
        System.out.println("Proses Pemesanan Tiket dan Pesanan Costumer");
    }
    
}
