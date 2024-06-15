class OperasiBilangan{
    protected double a,b,c;
    public void set_A(double a) {
        this.a = a;
    }

    public void set_B(double b) {
        this.b = b;
    }

    public void set_C() {
        this.c = 0;
    }

    public double get_A() {
        return a;
    }

    public double get_B() {
        return b;
    }

    public double get_C() {
        return c;
    }
    
    protected void tampil(){
        System.out.println("SuperClass -> Hasil Operasi");
        System.out.println("Nilai a = " + this.a + ", Nilai b = " + this.b + ", Nilai c = " + this.c);
    }
}

class OperasiPenjumlahan extends OperasiBilangan{
    protected double a,b,c;
    public void set_A(double a) {
        this.a = a;
    }

    public void set_B(double b) {
        this.b = b;
    }

    public void set_C() {
        this.c = a + b;
    }

    public double get_A() {
        return a;
    }

    public double get_B() {
        return b;
    }

    public double get_C() {
        return c;
    }
    
    protected void tampil(){
        System.out.println("SubClass -> Hasil Operasi Penjumlahan");
        System.out.println( this.a + " + " + this.b + " = " + this.c);
    }
}

class OperasiPengurangan extends OperasiBilangan{
    protected double a,b,c;
    public void set_A(double a) {
        this.a = a;
    }

    public void set_B(double b) {
        this.b = b;
    }
LatihanM8
    public void set_C() {
        this.c = a - b;
    }

    public double get_A() {
        return a;
    }

    public double get_B() {
        return b;
    }

    public double get_C() {
        return c;
    }
    
    protected void tampil(){
        System.out.println("SubClass -> Hasil Operasi Pengurangan");
        System.out.println( this.a + " - " + this.b + " = " + this.c);
    }
}

class OperasiPerkalian extends OperasiBilangan{
    protected double a,b,c;
    public void set_A(double a) {
        this.a = a;
    }

    public void set_B(double b) {
        this.b = b;
    }

    public void set_C() {
        this.c = a * b;
    }

    public double get_A() {
        return a;
    }

    public double get_B() {
        return b;
    }

    public double get_C() {
        return c;
    }
    
    protected void tampil(){
        System.out.println("SubClass -> Hasil Operasi Perkalian");
        System.out.println( this.a + " x " + this.b + " = " + this.c);
    }
}

class OperasiPembagian extends OperasiBilangan{ 
    protected double a,b,c;
    public void set_A(double a) {
        this.a = a;
    }

    public void set_B(double b) {
        this.b = b;
    }

    public void set_C() {
        this.c = a / b;
    }

    public double get_A() {
        return a;
    }

    public double get_B() {
        return b;
    }

    public double get_C() {
        return c;
    }
    
    protected void tampil(){
        System.out.println("SubClass -> Hasil Operasi Pembagian");
        System.out.println( this.a + " / " + this.b + " = " + this.c);
    }
}

class OperasiBilanganCetak extends OperasiBilangan{
    public void cetakSemua(OperasiBilangan[] OB, double a, double b){
        for(int i = 0; i < OB.length; i++){
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].set_C();
            OB[i].tampil();
            System.out.println("=================");
        }
    }
}

public class Latihan extends OperasiBilangan {
    public static void main(String[] args) {
        double a = 10.5, b = 0.5;
        OperasiBilangan[] obj = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        OperasiBilanganCetak cetak = new OperasiBilanganCetak();

        cetak.set_A(a);
        cetak.set_B(b);
        cetak.set_C();
        cetak.tampil();

        cetak.cetakSemua(obj, a, b);
    }
}
