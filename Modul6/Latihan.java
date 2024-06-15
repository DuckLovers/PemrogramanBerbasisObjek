import javax.swing.JOptionPane;
import java.util.ArrayList;

class Universitas {
    private static String namaUniversitas;

    public static void setNamaUniversitas(String nama) {
        namaUniversitas = nama;
    }

    public static String getNamaUniversitas() {
        return namaUniversitas;
    }
}

class Mahasiswa extends Universitas {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        super();
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String info() {
        String pesan = "";
        pesan += "NIM: " + this.getNim() + "\n";
        pesan += "Nama: " + this.getNama() + "\n";
        pesan += "Alamat: " + this.getAlamat() + "\n";
        pesan += "Jurusan: " + this.getJurusan();
        return pesan;
    }
}

class DaftarMahasiswa {
    private ArrayList<Mahasiswa> daftarMahasiswa;

    public DaftarMahasiswa() {
        daftarMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public String tampil() {
        String pesan = "Daftar Mahasiswa:\n";
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            pesan += mahasiswa.info() + "\n\n";
        }
        return pesan;
    }
}

public class Latihan {
    public static void main(String[] args) {
        DaftarMahasiswa daftarMahasiswa = new DaftarMahasiswa();

        Universitas.setNamaUniversitas(JOptionPane.showInputDialog("Masukkan Nama Universitas:"));

        char input;
        do {
            String nim = JOptionPane.showInputDialog("Masukkan NIM:");
            String nama = JOptionPane.showInputDialog("Masukkan Nama:");
            String alamat = JOptionPane.showInputDialog("Masukkan Alamat:");
            String jurusan = JOptionPane.showInputDialog("Masukkan Jurusan (61=MATEMATIKA, 62=BIOLOGI,"+ 
                                                            "63=KIMIA, 64=FISIKA, 65=TEKNIK INFORMATIKA,"+
                                                            "66=TEKNIK ARSITEKTUR):");

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.tambahMahasiswa(mahasiswa);

            input = JOptionPane.showInputDialog("Apakah Anda ingin memasukkan data lagi? (Y/T):").charAt(0);
        } while (input == 'Y' || input == 'y');

        String pesan = "================================\n";
        pesan += "Nama Universitas: " + Universitas.getNamaUniversitas() + "\n";
        pesan += "================================\n";
        pesan += daftarMahasiswa.tampil();
        JOptionPane.showMessageDialog(null, pesan);
    }
}
