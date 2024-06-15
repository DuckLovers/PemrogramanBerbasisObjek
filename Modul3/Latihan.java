package Modul3;

class Menghitung{
    int[] deret;
    public void setDeret(int[] input) {
        this.deret = input;
        input = null;
    }
    public int[] getDeret() {
        return deret;
    }
    public float rata_rata(){
        float hasil = 0;
        for(int i = 0; i < deret.length; i++){
            hasil += deret[i];
        }
        hasil /= deret.length;
        return hasil;
    }
    public int maksimum(){
        int hasil = 0;
        for(int i = 0; i < deret.length; i++){
            if(i == 0){
                hasil = deret[i];
            } else{
                if(deret[i]> hasil){
                    hasil = deret[i];
                }
            }
        }
        return hasil;
    }
    public int minimum(){
        int hasil = 0;
        for(int i = 0; i < deret.length; i++){
            if(i == 0){
                hasil = deret[i];
            } else{
                if(deret[i] < hasil){
                    hasil = deret[i];
                }
            }
        }
        return hasil;
    }

    public String cari(int search){
        String hasil = "";
        for(int i = 0; i < deret.length; i++){
            if(deret[i] == search){
                hasil += i + " ";
            } 
        }
        return hasil;
    }
    public void tampil(int a[]){
        String data = "";
        for(int i = 0; i < a.length; i++){
            if (i == 0) {
                data += a[i];
            } else {
                data += ". " + a[i];
            }
        }
        System.out.println(data);
        a = null;
        data = null;
    }
    public void hapus(){
        deret = null;
    }
}

public class Latihan {
    public static void main(String[] args) {
        Menghitung ob = new Menghitung();
        int[] list = {-5,-3,-6,-3,-4};
        ob.setDeret(list);
        System.out.println("Bilangannya = ");
        ob.tampil(ob.getDeret());
        System.out.println("Rata-ratanya adalah = " + ob.rata_rata());
        System.out.println("Nilai Maksimumnya adalah = " + ob.maksimum());
        System.out.println("Nilai Minimumnya adalah = " + ob.minimum());
        System.out.println("Index dimana angka -3 berada adalah = " + ob.cari(-3));
        ob.hapus();
    }
}
