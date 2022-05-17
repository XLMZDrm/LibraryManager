/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

import Models.PhieuMuon;
import Models.Sach;

public class PhieuMuonData {
    public static PreparedStatement ps;
    public static ResultSet rs;

    public static ResultSet showTextfield(String sql) {
        try {
            ps = ConnectDatabase.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }

    public static void InsertPhieu(PhieuMuon p) {
        String sql = "insert into PHIEU_MUON values(?,?,?,?,?,?)";
        try {
            System.out.println(p.toString());
            ps = ConnectDatabase.getConnect().prepareStatement(sql);
            ps.setString(1, p.getMaMuon());
            ps.setString(2, p.getMaKhach());
            ps.setString(3, p.getSach());
            ps.setDate(4, p.getNgayMuon());
            ps.setDate(5, p.getHanTra());
            ps.setDate(6, p.getNgayTra());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm phiếu thành công!", "Thông báo", 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "phiếu không được thêm", "Thông báo", 1);
        }
    }

    public boolean UpdatePhieu(PhieuMuon p) {
        try {
            ps = ConnectDatabase.getConnect().prepareStatement("UPDATE PHIEU_MUON SET  Ma_Khach_hang = ?, Ma_Sach = ?,"
                    + "Ngay_muon = ?, Han_tra = ? where Ma_Phieu_muon = ?");
            ps.setString(5, p.getMaMuon());
            ps.setString(1, p.getMaKhach());
            ps.setString(2, p.getSach());
            ps.setDate(3, p.getNgayMuon());
            ps.setDate(4, p.getHanTra());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean DeletePhieu(String ms) {
        try {
            ps = ConnectDatabase.getConnect().prepareStatement("DELETE FROM PHIEU_MUON WHERE Ma_Phieu_muon = ?");
            ps.setString(1, ms);
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
