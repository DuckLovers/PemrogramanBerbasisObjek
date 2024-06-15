package Modul4;

public class LatihanPengurangan {
    public static void main(String[] args) {
        kelasLatihan A = new kelasLatihan();
        kelasLatihan B = new kelasLatihan();
        kelasLatihan C = new kelasLatihan();
          
        float[][] a = {
            {1,2},
            {3,5},
            {6,7}
        };
        float[][] b = {
            {9,11},
            {13,16},
            {18,20}
        };


        System.out.println("Matrik A");
        A.setAngka(a);
        A.tampil(A.getAngka());
        System.out.println("Matrik B");
        B.setAngka(b);
        B.tampil(B.getAngka());
        System.out.println("Matrik C dari Hasil Pengurangan Matrik A dan Matrik B");
        A.setHasilPengurangan(A.getAngka(), B.getAngka());
        float[][] c = A.getHasil();
        C.setAngka(c);
        C.tampil(C.getAngka());
        System.out.println("Hasil Matrik C dikalikan 0.5");
        float x = 0.5f;
        C.setHasilSkalar(C.getAngka(), x);
        C.tampil(C.getHasil());
        
    }
}
