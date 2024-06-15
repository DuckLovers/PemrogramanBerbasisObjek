/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul10;
import java.sql.ResultSet;
/**
 *
 * @author Pongo
 */
interface InterfaceCRUD {
    public ResultSet tampilData();
    public ResultSet cariData(String keyword);
    public String simpanData(String id, String nama, String alamat);
    public String ubahData(String id, String nama, String alamat);
    public String hapusData(String id);
}
