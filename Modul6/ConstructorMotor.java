package Modul6;

public class ConstructorMotor extends ConstructorKendaraan {
    private String warna;

    protected ConstructorMotor(String merkin, String warnain){
        super(merkin);
        this.warna = warnain;

        merkin = null;
        warnain = null;
    }

    protected String getWarna() {
        return warna;
    }

    protected void hapus(){
        warna = null;
        super.hapus();
    }
}
