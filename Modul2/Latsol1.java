package Modul2;

class Barang_Jualan { 
    private String nama;
    private int stok;
    private int harga_satuan;
    private int harga_total;

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public void setHarga_satuan(int harga_satuan) {
        this.harga_satuan = harga_satuan;
    }
    public void setHarga_total(int stok, int harga_satuan) {
        this.harga_total = stok * harga_satuan;
    }

    // Getter
    public String getNama() {
        return nama;
    }
    public int getStok() {
        return stok;
    }
    public int getHarga_satuan() {
        return harga_satuan;
    }
    public int getHarga_total() {
        return harga_total;
    }

    public void info(){
        System.out.println("Nama Alat Tulis : " + nama);
        System.out.println("Stok : " + stok);
        System.out.println("Harga Satuan : " + harga_satuan);
        System.out.println("Harga " + nama + " : " + harga_total);
    }
}

public class Latsol1 {
    public static void main(String[] args) {
        Barang_Jualan bolpoint = new Barang_Jualan();
        bolpoint.setNama("Bolpoint");
        bolpoint.setStok(10);
        bolpoint.setHarga_satuan(2000);
        bolpoint.setHarga_total(bolpoint.getStok(), bolpoint.getHarga_satuan());
        
        Barang_Jualan pensil = new Barang_Jualan();
        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHarga_satuan(1000);
        pensil.setHarga_total(pensil.getStok(), pensil.getHarga_satuan());
        
        Barang_Jualan penghapus = new Barang_Jualan();
        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHarga_satuan(500);
        penghapus.setHarga_total(penghapus.getStok(), penghapus.getHarga_satuan());
        
        bolpoint.info();
        pensil.info();
        penghapus.info();

        int total = bolpoint.getHarga_total() + pensil.getHarga_total() + penghapus.getHarga_total();
        System.out.println("Total Harga: " + total);    
    }
}
