abstract class OperasiBilanganAbs {
    protected double a, b, c;
    protected abstract void set_A(double a);
    protected abstract void set_B(double b);
    protected abstract void set_C();
    protected abstract double get_A();
    protected abstract double get_B();
    protected abstract double get_C();
    protected abstract void tampil();
}

class OperasiPenjumlahan extends OperasiBilanganAbs {
    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        this.c = a + b;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        return c;
    }

    protected void tampil() {
        System.out.println("SubClass -> Hasil Operasi Penjumlahan");
        System.out.println(this.a + " + " + this.b + " = " + this.c);
    }
}

class OperasiPengurangan extends OperasiBilanganAbs {
    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        this.c = a - b;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        return c;
    }

    protected void tampil() {
        System.out.println("SubClass -> Hasil Operasi Pengurangan");
        System.out.println(this.a + " - " + this.b + " = " + this.c);
    }
}

class OperasiPerkalian extends OperasiBilanganAbs {
    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        this.c = a * b;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        return c;
    }

    protected void tampil() {
        System.out.println("SubClass -> Hasil Operasi Perkalian");
        System.out.println(this.a + " x " + this.b + " = " + this.c);
    }
}

class OperasiPembagian extends OperasiBilanganAbs {
    protected void set_A(double a) {
        this.a = a;
    }

    protected void set_B(double b) {
        this.b = b;
    }

    protected void set_C() {
        this.c = a / b;
    }

    protected double get_A() {
        return a;
    }

    protected double get_B() {
        return b;
    }

    protected double get_C() {
        return c;
    }

    protected void tampil() {
        System.out.println("SubClass -> Hasil Operasi Pembagian");
        System.out.println(this.a + " / " + this.b + " = " + this.c);
    }
}

final class OperasiBilanganAbsCetak extends OperasiBilanganAbs {
    protected void cetakSemua(OperasiBilanganAbs[] OB, double a, double b) {
        for (int i = 0; i < OB.length; i++) {
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].set_C();
            OB[i].tampil();
            System.out.println("=====================");
        }
    }
}

final class Latihan {
    public static void main(String[] args) {
        double a = 6.5, b = 0.5;
        OperasiBilanganAbs[] obj = {
            new OperasiPenjumlahan(),
            new OperasiPengurangan(),
            new OperasiPerkalian(),
            new OperasiPembagian()
        };

        OperasiBilanganAbsCetak cetak = new OperasiBilanganAbsCetak();
        cetak.cetakSemua(obj, a, b);
    }
}
