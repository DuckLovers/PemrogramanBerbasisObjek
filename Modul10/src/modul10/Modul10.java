/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modul10;

/**
 *
 * @author Pongo
 */
public class Modul10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try{
            Form_Siswa form = new Form_Siswa();
            form.setVisible(true);
        } catch (Exception ex){
            System.out.println(ex.toString());
        }
    }
    
}
