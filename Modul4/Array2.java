package Modul4;
import Modul4.Array2;

public class Array2 {
    private String[][] Mahasiswa;
    private int[][] data, hasil;

    public void setMahasiswa(String[][] mahasiswa) {
        Mahasiswa = mahasiswa;
    }
    public String[][] getMahasiswa() {
        return Mahasiswa;
    }
    public void setData(int[][] data) {
        this.data = data;
    }
    public int[][] getData() {
        return data;
    }
    public void setPerkalianSkalar(int[][] data, int a){
        hasil = data;
        int i, j;
        for(i=0; i<data.length; i++){
            for(j=0; j<data[i].length;j++){
                hasil[i][j]=a*data[i][j];
            }
        }
        data = null;
    }
    public int[][] getPerkalianSkalar(){
        return hasil;
    }

    public void tampil(String a){
        System.out.println(a);
        a = null;
    }

    public void tampil(String data[][]){
        int i,j;
        for(i=0;i<data.length;i++){
            for(j=0;j<data[i].length;j++){
                System.out.println(data[i][j]);
            }
            System.out.println();
        }
        data = null;
    }

    public void tampil(int data[][]){
        int i,j;
        for(i=0;i<data.length;i++){
            for(j=0;j<data[i].length;j++){
                System.out.println(data[i][j]);
            }
            System.out.println();
        }
        data = null;
    }

    public void hapus(){
        Mahasiswa = null;
        data = null;
        hasil = null;
    }
}
