package Modul5;

public class Kendaraan {
    private String merk, warna;
    protected String namaClass = "Kendaraan";

    public void setMerk(String merk) {
        this.merk = merk;
        merk = null;
    }

    public String getMerk() {
        return merk;
    }

    public void setWarna(String warna) {
        this.warna = warna;
        warna = null;
    }

    public String getWarna() {
        return warna;
    }

    protected void tampil(String a){
        System.out.println(a);
        a = null;
    }

    protected String keterangan(){
        return "Ini adalah class" + namaClass;
    }

    protected void hapus(){
        warna = null;
        merk = null;
        namaClass = null;
    }
}
