import java.util.ArrayList;
import java.util.Scanner;

public class KampusApp {
    public static void main(String[] args) {
        KampusApp kampusApp = new KampusApp();
        kampusApp.showMenu();
    }

    private Scanner scanner;
    private Database database;

    public KampusApp() {
        scanner = new Scanner(System.in);
        database = new Database();
    }

    public void showMenu() {
        System.out.println("------------------------");
        System.out.println("Selamat Datang di Aplikasi Kampus");
        System.out.println("Pilihan Menu:");
        System.out.println("1 -> Tambah Data Mahasiswa");
        System.out.println("2 -> Ubah Data Mahasiswa");
        System.out.println("3 -> Hapus Data Mahasiswa");
        System.out.println("4 -> Cari Data Mahasiswa");
        System.out.println("5 -> Tampilkan Semua Data Mahasiswa");
        System.out.println("0 -> Keluar Aplikasi");
        System.out.print("Silahkan masukan menu yang dipilih:");
        int menuYangDipilih = scanner.nextInt();
        scanner.nextLine();
        switch(menuYangDipilih) {
            case 1:
            menuTambah();
            case 2:
            menuUbah();
            case 3:
            menuHapus();
            case 4:
            menuCari();
            case 5:
            menuTampilkanSemuaData();
            case 0: {
                System.out.print("* Terimakasih sudah menggunakan Aplikasi Kampus *");
                System.exit(0);
            }
        }
        scanner.close();
    }

    public void menuTambah() {
        System.out.println("----- Menu Tambah Mahasiswa -----");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkkan umur: ");
        String umur = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nim, nama, umur, alamat);
        database.create(mahasiswa);
        System.out.println("* Data Mahasiswa Telah Ditambahkan *");
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Umur: " + mahasiswa.getUmur());
        System.out.println("Alamat: " + mahasiswa.getAlamat());
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuUbah() {
        System.out.println("----- Menu Ubah Data Mahasiswa -----");
        System.out.print("Masukkan NIM Sebelumnya: ");
        String nimLama = scanner.nextLine();
        System.out.print("Masukkan NIM Baru: ");
        String nimBaru = scanner.nextLine();
        System.out.print("Masukkan Nama Baru: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan umur Baru: ");
        String umur = scanner.nextLine();
        System.out.print("Masukkan alamat Baru: ");
        String alamat = scanner.nextLine();
        Mahasiswa mahasiswa = new Mahasiswa(nimBaru, nama, umur, alamat);
        database.update(mahasiswa, nimLama);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuCari() {
        System.out.println("----- Menu Cari Data Mahasiswa -----");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        Mahasiswa mahasiswa = database.read(nim);
        if(mahasiswa == null) {
            System.out.println("* NIM tidak ditemukan *");
        } else {
            System.out.println("* NIM: " + mahasiswa.getNim() + "*");
            System.out.println("* Nama: " + mahasiswa.getNama() + "*");
            System.out.println("* Umur: " + mahasiswa.getUmur() + "*");
            System.out.println("*Alamat: " + mahasiswa.getAlamat() + "*");
        }
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine(); 
        showMenu();
    }

    public void menuHapus() {
        System.out.println("----- Menu Cari Data Mahasiswa -----");
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        database.delete(nim);
        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }

    public void menuTampilkanSemuaData() {
        System.out.println("----- Menu tampilkan Semua Data -----");
        ArrayList<Mahasiswa> semuaMahasiswa = database.getAllMahasiswa();

        if (semuaMahasiswa.isEmpty()) {
            System.out.println("* Tidak ada data mahasiswa yang tersimpan *");
        } else {
            System.out.println("Data Mahasiswa: ");
            for ( Mahasiswa mahasiswa: semuaMahasiswa) {
                System.out.println("NIM: " + mahasiswa.getNim() + " | Nama: " + mahasiswa.getNama() + " | Umur: " + mahasiswa.getUmur() + " | Alamat: " + mahasiswa.getAlamat());
            }
        }

        System.out.println("Tekan Enter untuk melanjutkan...");
        scanner.nextLine();
        showMenu();
    }
}
