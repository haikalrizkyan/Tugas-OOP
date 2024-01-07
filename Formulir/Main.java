public class Main {
    public static void main(String[] args) {
        FormulirMahasiswa formulir01 = new FormulirMahasiswa();
        formulir01.cara_bayar();
        formulir01.tata_tertib();

        FormulirDosen formulir02 = new FormulirDosen();
        formulir02.cara_bayar();
        formulir02.tata_tertib();

        FormulirAdmin formulir03 = new FormulirAdmin();
        formulir03.cara_bayar();
        formulir03.tata_tertib();

    }
    
}
