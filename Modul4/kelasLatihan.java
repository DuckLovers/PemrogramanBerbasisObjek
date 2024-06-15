package Modul4;

public class kelasLatihan {
    float[][] angka, hasil;
    public float[][] getAngka() {
        return angka;
    }
    public void setAngka(float[][] a) {
        angka = a;
    }
    public float[][] getHasil() {
        return hasil;
    }
    public void setHasilSkalar(float a[][], float x) {
        hasil = a;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                hasil[i][j] = a[i][j] * x;
            }
        }
    }
    public void setHasilPenjumlahan(float a1[][], float a2[][]) {
        hasil = a1;
        for(int i = 0; i < a1.length && i < a2.length; i++){
            for(int j = 0; j < a1[i].length  && j < a2[i].length; j++){
                hasil[i][j] = a1[i][j] + a2[i][j];
            }
        }
    }
    public void setHasilPengurangan(float a1[][], float a2[][]) {
        hasil = a1;
        for(int i = 0; i < a1.length  && i < a2.length; i++){
            for(int j = 0; j < a1[i].length  && j < a2[i].length; j++){
                hasil[i][j] = a1[i][j] - a2[i][j];
            }
        }
    }
    public void tampil(float a[][]){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.println(a[i][j]);
            }
            System.out.println();
        }
    }
}