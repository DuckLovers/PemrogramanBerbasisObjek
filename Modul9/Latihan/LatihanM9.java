// interface Mouse {
//     void klik_kanan();
//     void klik_kiri();
// }

// interface Keyboard {
//     void tekan_enter();
// }

// interface Printer {
//     void cetak_data();
// }

// abstract class Komputer implements Mouse, Keyboard, Printer {
//     abstract void hidupkan_os();
//     abstract void matikan_os();
//     abstract String getNama();
// }

// class PC extends Komputer implements Mouse, Keyboard, Printer{
//     private String nama = "PC";
//     public String getNama() {
//         return nama;
//     }
//     public void hidupkan_os() {
//         System.out.println("PC dihidupkan...");
//     }
//     public void matikan_os() {
//         System.out.println("PC dimatikan...");
//     }
//     public void klik_kanan() {
//         System.out.println("PC klik kanan...");
//     }
//     public void klik_kiri() {
//         System.out.println("PC klik kiri...");
//     }
//     public void tekan_enter() {
//         System.out.println("PC tekan enter...");
//     }
//     public void cetak_data() {
//         System.out.println("PC cetak data...");
//         hidupkan_os();
//         klik_kanan();
//         klik_kiri();
//         tekan_enter();
//         matikan_os();
//     }
// }

// class Laptop extends Komputer implements Mouse, Keyboard, Printer {
//     private String nama = "Laptop";
//     public String getNama() {
//         return nama;
//     }
//     public void hidupkan_os() {
//         System.out.println("Laptop dihidupkan...");
//     }
//     public void matikan_os() {
//         System.out.println("Laptop dimatikan...");
//     }
//     public void klik_kanan() {
//         System.out.println("Laptop klik kanan...");
//     }
//     public void klik_kiri() {
//         System.out.println("Laptop klik kiri...");
//     }
//     public void tekan_enter() {
//         System.out.println("Laptop tekan enter...");
//     }
//     public void cetak_data() {
//         System.out.println("Laptop cetak data...");
//         hidupkan_os();
//         klik_kanan();
//         klik_kiri();
//         tekan_enter();
//         matikan_os();
//     }
// }

// class Netbook extends Komputer implements Mouse, Keyboard, Printer  {
//     private String nama = "Netbook";
//     public String getNama() {
//         return nama;
//     }
//     public void hidupkan_os() {
//         System.out.println("Netbook dihidupkan...");
//     }
//     public void matikan_os() {
//         System.out.println("Netbook dimatikan...");
//     }
//     public void klik_kanan() {
//         System.out.println("Netbook klik kanan...");
//     }
//     public void klik_kiri() {
//         System.out.println("Netbook klik kiri...");
//     }
//     public void tekan_enter() {
//         System.out.println("Netbook tekan enter...");
//     }
//     public void cetak_data() {
//         System.out.println("Netbook cetak data...");
//         hidupkan_os();
//         klik_kanan();
//         klik_kiri();
//         tekan_enter();
//         matikan_os();
//     }
// }

// final class KomputerCetak {
//     final void Cetak(Komputer[] obj) {
//         for (int i = 0; i < obj.length; i++) {
//             System.out.println("========" + obj[i].getNama() + "========");
//             obj[i].cetak_data();
//         }
//     }
// }

// public class LatihanM9 {
//     public static void main(String[] args) {
//         System.out.println("");
//         Komputer[] obj = {
//             new PC(),
//             new Laptop(),
//             new Netbook()
//         };
//         KomputerCetak cetak = new KomputerCetak();
//         cetak.Cetak(obj);
//     }
// }
