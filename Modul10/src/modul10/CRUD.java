/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Pongo
 */
public class CRUD extends AbstractCRUD implements InterfaceCRUD {
    private String id, nama, alamat;
    private Connection CRUDkoneksi;
    private PreparedStatement CRUDpsmt;
    private Statement CRUDstat;
    private ResultSet CRUDhasil;
    private String CRUDquery;
    
    public CRUD(){
        try {
            KoneksiMysql connection = new KoneksiMysql();
            CRUDkoneksi = connection.getKoneksi();
        } catch(SQLException ex) {
            System.out.println(ex);
        }
    }
    
    public void setID(String id){
        this.id = id;
    }
    
    public String getID(){
        return id;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public ResultSet tampilData(){
        CRUDquery = "SELECT * FROM siswa";
        try {
            CRUDstat = CRUDkoneksi.createStatement();
            CRUDhasil = CRUDstat.executeQuery(CRUDquery);
        } catch (Exception e){
            System.out.println(e);
        }
        return CRUDhasil;
    }
    
    public ResultSet cariData(String keyword) {
        CRUDquery = "SELECT * FROM siswa WHERE id LIKE '%" + keyword + "%' OR nama LIKE '%" + keyword + "%'";
        try {
            CRUDstat = CRUDkoneksi.createStatement();
            CRUDhasil = CRUDstat.executeQuery(CRUDquery);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return CRUDhasil;
    }
    
    public String simpanData(String id, String nama, String alamat){
        CRUDquery = "INSERT INTO siswa VALUES(?,?,?)";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, id);
            CRUDpsmt.setString(2, nama);
            CRUDpsmt.setString(3, alamat);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            return "Data Berhasil Tersimpan";
        } catch (Exception e){
            return "Data Gagal Disimpan" + e.getMessage();
        }
    }
    
    public String ubahData(String id, String nama, String alamat){
        CRUDquery = "UPDATE siswa SET nama=?, alamat=? WHERE id=?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, nama);
            CRUDpsmt.setString(2, alamat);
            CRUDpsmt.setString(3, id);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            return "Data Berhasil Diubah";
        } catch (Exception e){
            System.out.println(e);
            return "Data Gagal Diubah" + e.getMessage();
        }
    }
    
    public String hapusData(String id){
        CRUDquery = "DELETE FROM siswa WHERE id=?";
        try {
            CRUDpsmt = CRUDkoneksi.prepareStatement(CRUDquery);
            CRUDpsmt.setString(1, id);
            CRUDpsmt.executeUpdate();
            CRUDpsmt.close();
            return "Data Berhasil Dihapus";
        } catch (Exception e){
            System.out.println(e);
            return "Data Gagal Dihapus" + e.getMessage();
        }
    }
}
