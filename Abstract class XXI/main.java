public class main {
    public static void main(String[] args) {
        Tiket pesantiket = new Tiket();
        pesantiket.tampilkanInfo();
        pesantiket.prosesPemesanan();

        Popcorn pesanpopcorn = new Popcorn();
        pesanpopcorn.tampilkanInfo();
        pesanpopcorn.prosesPemesanan();

        Costumer pelanggan = new Costumer();
        pelanggan.tampilkanInfo();
        pelanggan.prosesPemesanan();
    }
    
}
