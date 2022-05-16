/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Date;

public class PhieuMuon {
    private String maMuon;
    private String maKhach;
    private String maSach;
    private Date ngayMuon;
    private Date hanTra;
    private Date ngayTra;

    @Override
    public String toString() {
        return "PhieuMuon [hanTra=" + hanTra + ", maKhach=" + maKhach + ", maMuon=" + maMuon + ", maSach=" + maSach
                + ", ngayMuon=" + ngayMuon + ", ngayTra=" + ngayTra + "]";
    }

    // private int tienCoc;
    public PhieuMuon() {

    }

    public PhieuMuon(String maMuon, String maKhach, String maSach, Date ngayMuon, Date hanTra, Date ngayTra) {
        this.maMuon = maMuon;
        this.maKhach = maKhach;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;

    }

    public String getMaMuon() {
        return maMuon;
    }

    public void setMaMuon(String mm) {
        this.maMuon = mm;
    }

    public String getMaKhach() {
        return maKhach;
    }

    public void setMaKhach(String mm) {
        this.maKhach = mm;
    }

    public String getSach() {
        return maSach;
    }

    public void setMaSach(String mm) {
        this.maSach = mm;
    }

    public Date getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(Date nm) {
        this.ngayMuon = nm;
    }

    public Date getHanTra() {
        return hanTra;
    }

    public void setHanTra(Date ht) {
        this.hanTra = ht;
    }

    public Date getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(Date ht) {
        this.ngayTra = ht;
    }
    // public int getTienCoc() {
    // return tienCoc;
    // }
    // public void setTienCoc(int tc) {
    // this.tienCoc = tc;
    // }
}
