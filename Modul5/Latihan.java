package Modul5;
import java.util.ArrayList;
import javax.swing.JOptionPane;

class VCD {
    protected String judul, sutradara, publisher, kategori, aktor;
    protected int stok;

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setAktor(String aktor) {
        this.aktor = aktor;
    }

    public String getAktor() {
        return aktor;
    }

    public void setSutradara(String sutradara) {
        this.sutradara = sutradara;
    }

    public String getSutradara() {
        return sutradara;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public void info(){
        System.out.println("VCD {");
        System.out.println("judul = " + judul);
        System.out.println("aktor = " + getAktor());
        System.out.println("sutradara = " + sutradara);
        System.out.println("publisher = " + publisher);
        System.out.println("kategori = " + kategori);
        System.out.println("stok = " + stok);
        System.out.println("}");
    }
}

class VCDAnakAnak extends VCD{
    public String childkategori = "A";

    public void info_khusus(){
        System.out.println("VCD ini Khusus untuk Anak-Anak" );
    }

    public void info(){

        super.info();
        info_khusus();
    }
}

class VCDRemaja extends VCD{
    public String childkategori  = "R";

    public void info_khusus(){
        System.out.println("VCD ini Khusus untuk Remaja di bawah 18 tahun" );
    }

    public void info(){
        super.info();
        info_khusus();
    }
}

class VCDDewasa extends VCD{
    public String childkategori = "D";

    public void info_khusus(){
        System.out.println("VCD ini Khusus untuk Dewasa di atas 18 tahun" );
    }

    public void info(){
        super.info();
        info_khusus();
    }
}

class VCDSemuaUmur extends VCD{
    public String childkategori = "SU";

    public void info_khusus(){
        System.out.println("VCD ini bisa di nikmati oleh semua umur" );
    }

    public void info(){
        super.info();
        info_khusus();
    }
}

public class Latihan {
    static ArrayList<VCDAnakAnak> ListVCDAnakAnak = new ArrayList<>();
    static ArrayList<VCDRemaja> ListVCDRemaja = new ArrayList<>();
    static ArrayList<VCDDewasa> ListVCDDewasa = new ArrayList<>();
    static ArrayList<VCDSemuaUmur> ListVCDSemuaUmur = new ArrayList<>();

    public static void main(String[] args) {
        DataDefault();
        JOptionPane.showMessageDialog(null, "Selamat Datang di Aplikasi Rental VCD", "Selamat Datang", JOptionPane.INFORMATION_MESSAGE);
        main_menu();
    }

    public static void main_menu(){
        String MainMenu = JOptionPane.showInputDialog("Silahkan pilih hal yang ingin dilakukan \n 1. Menambahkan VCD \n 2. Melihat VCD \n 3. Keluar");
        if (MainMenu.equals("1")) {
            menu_menambahkan();
        } else if(MainMenu.equals("2")){
            lihat_vcd();
        } else if(MainMenu.equals("3")){
            JOptionPane.showMessageDialog(null, "Terimakasih Telah Menggunakan Aplikasi Rental VCD", "Sampai Jumpa", JOptionPane.INFORMATION_MESSAGE);
        } else {
            main_menu();
        }
    }

    public static void menu_menambahkan(){
        String judul, aktor, sutradara, publisher, stok;
        String MainMenu = JOptionPane.showInputDialog("Silahkan pilih kategori VCD yang ingin ditambahkan \n"+ 
                                                        "1. VCD Anak-Anak \n" + 
                                                        "2. VCD Remaja \n" + 
                                                        "3. VCD Dewasa \n" +
                                                        "4. VCD Semua Umur \n" +
                                                        "5. Kembali ");
        if (MainMenu.equals("5")) {
            main_menu();
        } else {
            judul = JOptionPane.showInputDialog("Masukkan Judul VCD");
            aktor = JOptionPane.showInputDialog("Masukkan Aktor pada VCD");
            sutradara = JOptionPane.showInputDialog("Masukkan Sutradara pada VCD");
            publisher = JOptionPane.showInputDialog("Masukkan Publisher pada VCD");
            stok = JOptionPane.showInputDialog("Masukkan jumlah stok VCD yang tersedia");
            if (MainMenu.equals("1")) { 
                VCDAnakAnak vcdAnakAnak = new VCDAnakAnak();
                vcdAnakAnak.setJudul(judul);
                vcdAnakAnak.setAktor(aktor);
                vcdAnakAnak.setSutradara(sutradara);
                vcdAnakAnak.setPublisher(publisher);
                vcdAnakAnak.setKategori(vcdAnakAnak.childkategori);
                vcdAnakAnak.setStok(Integer.parseInt(stok));
                ListVCDAnakAnak.add(vcdAnakAnak);
                JOptionPane.showMessageDialog(null, "VCD Anak-Anak berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                menu_menambahkan();
            } else if (MainMenu.equals("2")) {
                VCDRemaja vcdRemaja = new VCDRemaja();
                vcdRemaja.setJudul(judul);
                vcdRemaja.setAktor(aktor);
                vcdRemaja.setSutradara(sutradara);
                vcdRemaja.setPublisher(publisher);
                vcdRemaja.setKategori(vcdRemaja.childkategori);
                vcdRemaja.setStok(Integer.parseInt(stok));
                
                ListVCDRemaja.add(vcdRemaja);
                JOptionPane.showMessageDialog(null, "VCD Remaja berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                menu_menambahkan();
            } else if (MainMenu.equals("3")) {
                VCDDewasa vcdDewasa = new VCDDewasa();
                vcdDewasa.setJudul(judul);
                vcdDewasa.setAktor(aktor);
                vcdDewasa.setSutradara(sutradara);
                vcdDewasa.setPublisher(publisher);
                vcdDewasa.setKategori(vcdDewasa.childkategori);
                vcdDewasa.setStok(Integer.parseInt(stok));
                
                ListVCDDewasa.add(vcdDewasa);
                JOptionPane.showMessageDialog(null, "VCD Dewasa berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                menu_menambahkan();
            } else if (MainMenu.equals("4")) {
                VCDSemuaUmur vcdSemuaUmur = new VCDSemuaUmur();
                vcdSemuaUmur.setJudul(judul);
                vcdSemuaUmur.setAktor(aktor);
                vcdSemuaUmur.setSutradara(sutradara);
                vcdSemuaUmur.setPublisher(publisher);
                vcdSemuaUmur.setKategori(vcdSemuaUmur.childkategori);
                vcdSemuaUmur.setStok(Integer.parseInt(stok));
                
                ListVCDSemuaUmur.add(vcdSemuaUmur);
                JOptionPane.showMessageDialog(null, "VCD Semua Umur berhasil ditambahkan!", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                menu_menambahkan();
            } else {
                menu_menambahkan();
            }
        }
    }

    public static void lihat_vcd() {
        System.out.println("Daftar VCD Anak-Anak:");
        for (VCDAnakAnak vcd : ListVCDAnakAnak) {
            vcd.info();
        }
        
        System.out.println("Daftar VCD Remaja:");
        for (VCDRemaja vcd : ListVCDRemaja) {
            vcd.info();
        }
        
        System.out.println("Daftar VCD Dewasa:");
        for (VCDDewasa vcd : ListVCDDewasa) {
            vcd.info();
        }
        
        System.out.println("Daftar VCD Semua Umur:");
        for (VCDSemuaUmur vcd : ListVCDSemuaUmur) {
            vcd.info();
        }
        main_menu();
    }

    public static void DataDefault() {
        // Data Default VCD Anak-Anak
        VCDAnakAnak vcdAnakAnak1 = new VCDAnakAnak();
        vcdAnakAnak1.setJudul("Upin & Ipin: Keris Siamang Tunggal");
        vcdAnakAnak1.setAktor("Puteri Balqis");
        vcdAnakAnak1.setSutradara("Adam Bin Amiruddin");
        vcdAnakAnak1.setPublisher("Les' Copaque Production");
        vcdAnakAnak1.setKategori(vcdAnakAnak1.childkategori);
        vcdAnakAnak1.setStok(15);
        ListVCDAnakAnak.add(vcdAnakAnak1);
        
        VCDAnakAnak vcdAnakAnak2 = new VCDAnakAnak();
        vcdAnakAnak2.setJudul("Boboiboy: The Movie");
        vcdAnakAnak2.setAktor("Nur Fathiah Diaz");
        vcdAnakAnak2.setSutradara("Nizam Razak");
        vcdAnakAnak2.setPublisher("Animonsta Studios");
        vcdAnakAnak2.setKategori(vcdAnakAnak2.childkategori);
        vcdAnakAnak2.setStok(12);
        ListVCDAnakAnak.add(vcdAnakAnak2);
    
        // Tambahkan data default untuk kategori VCD Remaja
        VCDRemaja vcdRemaja1 = new VCDRemaja();
        vcdRemaja1.setJudul("Spider-Man: Into the Spider-Verse");
        vcdRemaja1.setAktor("Shameik Moore");
        vcdRemaja1.setSutradara("Bob Persichetti, Peter Ramsey, Rodney Rothman");
        vcdRemaja1.setPublisher("Sony Pictures Animation");
        vcdRemaja1.setKategori(vcdAnakAnak1.childkategori);
        vcdRemaja1.setStok(12);
        ListVCDRemaja.add(vcdRemaja1);

        VCDRemaja vcdRemaja2 = new VCDRemaja();
        vcdRemaja2.setJudul("The Hunger Games");
        vcdRemaja2.setAktor("Jennifer Lawrence");
        vcdRemaja2.setSutradara("Gary Ross");
        vcdRemaja2.setPublisher("Lionsgate Films");
        vcdRemaja2.setStok(10);
        vcdRemaja2.setKategori(vcdAnakAnak2.childkategori);
        ListVCDRemaja.add(vcdRemaja2);
    
        // Tambahkan data default untuk kategori VCD Dewasa
        VCDDewasa vcdDewasa1 = new VCDDewasa();
        vcdDewasa1.setJudul("The Wolf of Wall Street");
        vcdDewasa1.setAktor("Leonardo DiCaprio");
        vcdDewasa1.setSutradara("Martin Scorsese");
        vcdDewasa1.setPublisher("Paramount Pictures");
        vcdDewasa1.setKategori(vcdDewasa1.childkategori);
        vcdDewasa1.setStok(10);
        ListVCDDewasa.add(vcdDewasa1);

        VCDDewasa vcdDewasa2 = new VCDDewasa();
        vcdDewasa2.setJudul("Pulp Fiction");
        vcdDewasa2.setAktor("John Travolta");
        vcdDewasa2.setSutradara("Quentin Tarantino");
        vcdDewasa2.setPublisher("Miramax Films");
        vcdDewasa2.setKategori(vcdDewasa2.childkategori);
        vcdDewasa2.setStok(8);
        ListVCDDewasa.add(vcdDewasa2);

        // Tambahkan data default untuk kategori VCD Semua Umur
        VCDSemuaUmur vcdSemuaUmur1 = new VCDSemuaUmur();
        vcdSemuaUmur1.setJudul("Finding Nemo");
        vcdSemuaUmur1.setAktor("Albert Brooks");
        vcdSemuaUmur1.setSutradara("Andrew Stanton");
        vcdSemuaUmur1.setPublisher("Walt Disney Pictures");
        vcdSemuaUmur1.setKategori(vcdSemuaUmur1.childkategori);
        vcdSemuaUmur1.setStok(15);
        ListVCDSemuaUmur.add(vcdSemuaUmur1);

        VCDSemuaUmur vcdSemuaUmur2 = new VCDSemuaUmur();
        vcdSemuaUmur2.setJudul("Toy Story");
        vcdSemuaUmur2.setAktor("Tom Hanks");
        vcdSemuaUmur2.setSutradara("John Lasseter");
        vcdSemuaUmur2.setPublisher("Pixar Animation Studios");
        vcdSemuaUmur2.setKategori(vcdSemuaUmur2.childkategori);
        vcdSemuaUmur2.setStok(10);
        ListVCDSemuaUmur.add(vcdSemuaUmur2);
    }
    
}
