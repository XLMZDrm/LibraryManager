/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Data.Connect;
import Data.KhachHangData;
import Data.PhieuMuonData;
import Data.SachData;
import Object.KhachHang;
import Object.NhaXb;
import Object.PhieuMuon;
import Object.Sach;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class JAdminUpdate extends javax.swing.JFrame {
        private static String DB_URL = "jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6492801";
        private static String USER_NAME = "sql6492801";
        private static String PASSWORD = "nM1BVn6uQA";
        SachData sachdata = new SachData();
        KhachHangData khachhangdata = new KhachHangData();
        PhieuMuonData phieumuondata = new PhieuMuonData();
        public static PreparedStatement ps = null;
        public static PreparedStatement ps2 = null;
        public static String sqlSach = "SELECT * FROM SACH order by Ma_Sach asc";
        public static String sqlKhach = "SELECT * FROM KHACH_HANG order by Ma_Khach_hang asc";
        public static String sqlPhieu = "SELECT * FROM PHIEU_MUON order by Ma_Phieu_muon asc";

        /**
         * Creates new form JAdminUpdate
         */
        public JAdminUpdate() {
                this.setLocation(100, 10);
                initComponents();
                UpdateTable.LoadData(sqlSach, tbSach);
                UpdateTable.LoadData(sqlKhach, tbKhach);
                UpdateTable.LoadData(sqlPhieu, tbMuon);
                ProcessCrt(false);
                ProcessCrt2(false);
                ProcessCrt3(false);
                loadcbsach();
                loadcb();
                loadcbsachMuon();
        }

        public void ProcessCrt(boolean b) {
                this.btAddSach.setEnabled(b);
                this.btEditSach.setEnabled(b);
                this.btDelSach.setEnabled(b);
        }

        public void ProcessCrt2(boolean b) {
                this.btAddKhach.setEnabled(b);
                this.btEditKhach.setEnabled(b);
                this.btDelKhach.setEnabled(b);
        }

        public void ProcessCrt3(boolean b) {
                this.btAddPhieu.setEnabled(b);
                this.btEditPhieu.setEnabled(b);
                this.btDelPhieu.setEnabled(b);
                lbNgayTra.setVisible(false);
                lblngaytra.setVisible(false);
                txtNgayTra.setVisible(false);
        }

        public void loadsach() {
                try {
                        Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
                        Statement stm = con.createStatement();
                        ResultSet rs = stm
                                        .executeQuery("SELECT * FROM SACH where Ma_sach= '"
                                                        + this.cbMaSach.getSelectedItem() + "'");
                        while (rs.next()) {
                                String sl = rs.getString("So_luong");
                                JOptionPane.showMessageDialog(null, "số lượng sách còn là '" + sl + "'", "thông báo",
                                                1);

                        }
                } catch (SQLException ex) {
                        Logger.getLogger(JAdminUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        public void loadcb() {
                try {
                        Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
                        Statement stm = con.createStatement();
                        ResultSet rs = stm.executeQuery("SELECT * FROM KHACH_HANG");
                        while (rs.next()) {
                                String makh = rs.getString("Ma_Khach_hang");
                                cbKH.addItem(makh);
                        }
                } catch (SQLException ex) {
                        Logger.getLogger(JAdminUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        public void loadcbsach() {
                try {
                        Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
                        Statement stm = con.createStatement();
                        ResultSet rs = stm.executeQuery("SELECT * FROM SACH");
                        while (rs.next()) {
                                String masach = rs.getString("Ma_Sach");
                                cbMaSach.addItem(masach);
                        }
                } catch (SQLException ex) {
                        Logger.getLogger(JAdminUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        public void loadcbsachMuon() {
                try {
                        Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
                        Statement stm = con.createStatement();
                        ResultSet rs = stm.executeQuery("SELECT * FROM SACH");
                        while (rs.next()) {
                                String masach = rs.getString("Ma_Sach");
                                cbSachMuon.addItem(masach);
                        }
                } catch (SQLException ex) {
                        Logger.getLogger(JAdminUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jTabbedPane1 = new javax.swing.JTabbedPane();
                jPanel2 = new javax.swing.JPanel();
                txtTenSach = new javax.swing.JTextField();
                txtTenTacGia = new javax.swing.JTextField();
                txtNhaXb = new javax.swing.JTextField();
                txtGia = new javax.swing.JTextField();
                jLabel2 = new javax.swing.JLabel();
                txtSoLuong = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tbSach = new javax.swing.JTable();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                txtLookSach = new javax.swing.JTextField();
                jLabel6 = new javax.swing.JLabel();
                btLookSach = new javax.swing.JButton();
                jLabel7 = new javax.swing.JLabel();
                txtMaSach = new javax.swing.JTextField();
                btAddSach = new javax.swing.JButton();
                btEditSach = new javax.swing.JButton();
                btDelSach = new javax.swing.JButton();
                btNewSach = new javax.swing.JButton();
                jPanel3 = new javax.swing.JPanel();
                jPanel6 = new javax.swing.JPanel();
                txtNgayMuon = new javax.swing.JTextField();
                txtHanTra = new javax.swing.JTextField();
                jLabel19 = new javax.swing.JLabel();
                jLabel20 = new javax.swing.JLabel();
                jScrollPane4 = new javax.swing.JScrollPane();
                tbMuon = new javax.swing.JTable();
                jLabel21 = new javax.swing.JLabel();
                jLabel22 = new javax.swing.JLabel();
                txtLookPhieu = new javax.swing.JTextField();
                jLabel23 = new javax.swing.JLabel();
                btLookMuon = new javax.swing.JButton();
                txtMaPhieuMuon = new javax.swing.JTextField();
                btAddPhieu = new javax.swing.JButton();
                btEditPhieu = new javax.swing.JButton();
                btDelPhieu = new javax.swing.JButton();
                btNewPhieu = new javax.swing.JButton();
                btTra = new javax.swing.JButton();
                lbNgayTra = new javax.swing.JLabel();
                lblngaytra = new javax.swing.JLabel();
                txtNgayTra = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                cbMaSach = new javax.swing.JComboBox();
                cbKH = new javax.swing.JComboBox();
                cbSachMuon = new javax.swing.JComboBox();
                jPanel1 = new javax.swing.JPanel();
                jPanel4 = new javax.swing.JPanel();
                txtPassword = new javax.swing.JTextField();
                txtTenKhach = new javax.swing.JTextField();
                txtNgaySinh = new javax.swing.JTextField();
                txtDiaChi = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                txtPhone = new javax.swing.JTextField();
                jLabel9 = new javax.swing.JLabel();
                jScrollPane2 = new javax.swing.JScrollPane();
                tbKhach = new javax.swing.JTable();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                txtLookKhach = new javax.swing.JTextField();
                jLabel12 = new javax.swing.JLabel();
                btLookKhach = new javax.swing.JButton();
                jLabel13 = new javax.swing.JLabel();
                txtMaKhach = new javax.swing.JTextField();
                btAddKhach = new javax.swing.JButton();
                btEditKhach = new javax.swing.JButton();
                btDelKhach = new javax.swing.JButton();
                btNewKhach = new javax.swing.JButton();
                btRet = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel2.setText("Mã sách");

                jLabel3.setText("Tên sách");

                tbSach.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Title 1", "Title 2", "Title 3", "Title 4"
                                }));
                tbSach.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tbSachMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(tbSach);

                jLabel4.setText("Tên tác giả");

                jLabel5.setText("Nhà xuất bản");

                jLabel6.setText("Giá tiền");

                btLookSach.setText("Tìm kiếm");
                btLookSach.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btLookSachActionPerformed(evt);
                        }
                });

                jLabel7.setText("Số lượng");

                btAddSach.setText("Thêm");
                btAddSach.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btAddSachActionPerformed(evt);
                        }
                });

                btEditSach.setText("Sửa");
                btEditSach.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btEditSachActionPerformed(evt);
                        }
                });

                btDelSach.setText("Xóa");
                btDelSach.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btDelSachActionPerformed(evt);
                        }
                });

                btNewSach.setText("Nhập mới");
                btNewSach.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btNewSachActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(69, 69, 69)
                                                                .addComponent(btNewSach)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btAddSach)
                                                                .addGap(134, 134, 134)
                                                                .addComponent(btEditSach)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(btDelSach)
                                                                .addGap(120, 120, 120))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                                .createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(jScrollPane1))
                                                                                .addGroup(jPanel2Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addContainerGap()
                                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                false)
                                                                                                                                                .addComponent(jLabel2,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel4,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                false)
                                                                                                                                                .addComponent(txtMaSach,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                289,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(txtTenSach)
                                                                                                                                                .addComponent(txtTenTacGia))
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                false)
                                                                                                                                                .addComponent(jLabel5,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                74,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel6,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel7,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)))
                                                                                                                .addGroup(jPanel2Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(182, 182,
                                                                                                                                                182)
                                                                                                                                .addComponent(btLookSach)
                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                .addComponent(txtLookSach,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                295,
                                                                                                                                                Short.MAX_VALUE)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel2Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(txtNhaXb,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                242,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(txtGia)
                                                                                                                .addComponent(txtSoLuong))))
                                                                .addContainerGap()));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(64, 64, 64)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(txtLookSach,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btLookSach))
                                                                .addGap(39, 39, 39)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btAddSach)
                                                                                .addComponent(btEditSach)
                                                                                .addComponent(btDelSach)
                                                                                .addComponent(btNewSach))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel2)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(txtMaSach,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtNhaXb,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel3)
                                                                                .addComponent(jLabel6)
                                                                                .addComponent(txtTenSach,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtGia,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel7)
                                                                                .addComponent(txtTenTacGia,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtSoLuong,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                302,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(16, Short.MAX_VALUE)));

                jTabbedPane1.addTab("Cập nhật sách", jPanel2);

                jLabel19.setText("Mã phiếu mượn");

                jLabel20.setText("Mã Khách Hàng");

                tbMuon.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Title 1", "Title 2", "Title 3", "Title 4"
                                }));
                tbMuon.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tbMuonMouseClicked(evt);
                        }
                });
                jScrollPane4.setViewportView(tbMuon);

                jLabel21.setText("Mã Sách");

                jLabel22.setText("Ngày mượn");

                jLabel23.setText("Hạn trả");

                btLookMuon.setText("Tìm kiếm");
                btLookMuon.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btLookMuonActionPerformed(evt);
                        }
                });

                btAddPhieu.setText("Thêm");
                btAddPhieu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btAddPhieuActionPerformed(evt);
                        }
                });

                btEditPhieu.setText("Sửa");
                btEditPhieu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btEditPhieuActionPerformed(evt);
                        }
                });

                btDelPhieu.setText("Xóa");
                btDelPhieu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btDelPhieuActionPerformed(evt);
                        }
                });

                btNewPhieu.setText("Nhập mới");
                btNewPhieu.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btNewPhieuActionPerformed(evt);
                        }
                });

                btTra.setText("Trả sách");
                btTra.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btTraActionPerformed(evt);
                        }
                });

                lblngaytra.setText("Ngày Trả");

                jButton1.setText("Kiểm tra sách");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jScrollPane4,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                jPanel6Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                jPanel6Layout.createSequentialGroup()
                                                                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                                false)
                                                                                                                                                                                .addComponent(jLabel19,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                .addComponent(jLabel20,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                .addComponent(jLabel21,
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addComponent(txtMaPhieuMuon,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                289,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addComponent(cbKH,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addComponent(cbSachMuon,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                                                false)
                                                                                                                                                                                                .addComponent(jLabel22,
                                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                74,
                                                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                                                .addComponent(jLabel23,
                                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                                                                .addComponent(lbNgayTra)
                                                                                                                                                                                .addComponent(lblngaytra)))
                                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGap(273, 273,
                                                                                                                                                                273)
                                                                                                                                                .addComponent(btEditPhieu)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                151,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(btDelPhieu))
                                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addGap(182, 182,
                                                                                                                                                                                                182)
                                                                                                                                                                                .addComponent(btLookMuon)
                                                                                                                                                                                .addGap(18, 18, 18))
                                                                                                                                                                .addGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                jPanel6Layout.createSequentialGroup()
                                                                                                                                                                                                .addContainerGap()
                                                                                                                                                                                                .addComponent(btNewPhieu)
                                                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                                                                .addComponent(
                                                                                                                                                                                                                                btAddPhieu)
                                                                                                                                                                                                                .addComponent(jButton1))
                                                                                                                                                                                                .addGap(10, 10, 10)))
                                                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addComponent(txtLookPhieu,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                253,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                                .addComponent(cbMaSach,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                .addGroup(jPanel6Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(txtNgayMuon,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                242,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(txtHanTra)
                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                jPanel6Layout.createSequentialGroup()
                                                                                                                                                                .addComponent(btTra)
                                                                                                                                                                .addGap(52, 52, 52))
                                                                                                                                .addComponent(txtNgayTra))))
                                                                .addContainerGap()));
                jPanel6Layout.setVerticalGroup(
                                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addGap(37, 37, 37)
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jButton1)
                                                                                .addComponent(cbMaSach,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(txtLookPhieu,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btLookMuon))
                                                                .addGap(39, 39, 39)
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btAddPhieu)
                                                                                .addComponent(btEditPhieu)
                                                                                .addComponent(btDelPhieu)
                                                                                .addComponent(btTra)
                                                                                .addComponent(btNewPhieu))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel19)
                                                                                .addComponent(jLabel22)
                                                                                .addComponent(txtMaPhieuMuon,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtNgayMuon,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel20)
                                                                                .addComponent(jLabel23)
                                                                                .addComponent(txtHanTra,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(cbKH,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel6Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel21)
                                                                                                .addComponent(cbSachMuon,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel6Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(lblngaytra)
                                                                                                .addComponent(txtNgayTra,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(lbNgayTra)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                31,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(jScrollPane4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                252,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)));

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 830, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addGap(0, 21, Short.MAX_VALUE)
                                                                                .addComponent(jPanel6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 21, Short.MAX_VALUE))));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 605, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(jPanel6,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE))));

                jTabbedPane1.addTab("Cập nhật phiếu mượn", jPanel3);

                jLabel8.setText("Mã khách hàng");

                jLabel9.setText("Password");

                tbKhach.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null },
                                                { null, null, null, null }
                                },
                                new String[] {
                                                "Title 1", "Title 2", "Title 3", "Title 4"
                                }));
                tbKhach.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tbKhachMouseClicked(evt);
                        }
                });
                jScrollPane2.setViewportView(tbKhach);

                jLabel10.setText("Tên khách hàng");

                jLabel11.setText("Ngày sinh");

                jLabel12.setText("Địa chỉ");

                btLookKhach.setText("Tìm kiếm");
                btLookKhach.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btLookKhachActionPerformed(evt);
                        }
                });

                jLabel13.setText("Số điện thoại");

                btAddKhach.setText("Thêm");
                btAddKhach.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btAddKhachActionPerformed(evt);
                        }
                });

                btEditKhach.setText("Sửa");
                btEditKhach.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btEditKhachActionPerformed(evt);
                        }
                });

                btDelKhach.setText("Xóa");
                btDelKhach.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btDelKhachActionPerformed(evt);
                        }
                });

                btNewKhach.setText("Nhập mới");
                btNewKhach.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btNewKhachActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel4Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel4Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel4Layout.createSequentialGroup()
                                                                                                                                                .addGroup(jPanel4Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                false)
                                                                                                                                                                .addComponent(jLabel8,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(jLabel9,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(jLabel10,
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                86,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                .addGroup(jPanel4Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                false)
                                                                                                                                                                .addComponent(txtMaKhach,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                289,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(txtPassword)
                                                                                                                                                                .addComponent(txtTenKhach))
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addGroup(jPanel4Layout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                false)
                                                                                                                                                                .addComponent(jLabel11,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(jLabel12,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(jLabel13,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)))
                                                                                                                .addGroup(jPanel4Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(95, 95, 95)
                                                                                                                                .addComponent(btNewKhach)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addGroup(jPanel4Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(jPanel4Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(btAddKhach)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                                .addComponent(btEditKhach)
                                                                                                                                                                .addGap(106, 106,
                                                                                                                                                                                106))
                                                                                                                                                .addGroup(jPanel4Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(btLookKhach)
                                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                                .addComponent(txtLookKhach,
                                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                253,
                                                                                                                                                                                Short.MAX_VALUE)))))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel4Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel4Layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                false)
                                                                                                                                .addComponent(txtNgaySinh,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                242,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(txtDiaChi)
                                                                                                                                .addComponent(txtPhone))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel4Layout.createSequentialGroup()
                                                                                                                                                .addComponent(btDelKhach)
                                                                                                                                                .addGap(80, 80, 80))))
                                                                                .addComponent(jScrollPane2,
                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                792, Short.MAX_VALUE))
                                                                .addContainerGap()));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(64, 64, 64)
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(txtLookKhach,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(btLookKhach))
                                                                .addGap(39, 39, 39)
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(btAddKhach)
                                                                                .addComponent(btEditKhach)
                                                                                .addComponent(btDelKhach)
                                                                                .addComponent(btNewKhach))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel8)
                                                                                .addComponent(jLabel11)
                                                                                .addComponent(txtMaKhach,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtNgaySinh,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel9)
                                                                                .addComponent(jLabel12)
                                                                                .addComponent(txtPassword,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtDiaChi,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel10)
                                                                                .addComponent(jLabel13)
                                                                                .addComponent(txtTenKhach,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(txtPhone,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jScrollPane2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                285,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(28, Short.MAX_VALUE)));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 830, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(0, 14, Short.MAX_VALUE)
                                                                                .addComponent(jPanel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 14, Short.MAX_VALUE))));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 605, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                                .addComponent(jPanel4,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE))));

                jTabbedPane1.addTab("Cập nhật khách hàng", jPanel1);

                btRet.setText("Quay lại");
                btRet.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btRetActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTabbedPane1)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(btRet)
                                                                .addContainerGap()));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jTabbedPane1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                633,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                11,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(btRet)
                                                                .addContainerGap()));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void tbSachMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbSachMouseClicked
                // TODO add your handling code here:
                ProcessCrt(true);
                this.btAddSach.setEnabled(false);
                try {
                        int row = this.tbSach.getSelectedRow();
                        String IDrow = (this.tbSach.getModel().getValueAt(row, 0)).toString();
                        String sql1 = "SELECT * FROM SACH where Ma_Sach='" + IDrow + "'";
                        ResultSet rs = UpdateTable.ShowTextField(sql1);
                        if (rs.next()) {
                                this.txtMaSach.setText(rs.getString("Ma_Sach"));
                                this.txtTenSach.setText(rs.getString("Ten_Sach"));
                                this.txtNhaXb.setText(rs.getString("Nha_Xb"));
                                this.txtTenTacGia.setText(rs.getString("Ten_Tac_gia"));
                                this.txtGia.setText((rs.getString("Gia_tien")));
                                this.txtSoLuong.setText(rs.getString("So_luong"));
                        }
                } catch (Exception e) {

                }
        }// GEN-LAST:event_tbSachMouseClicked

        private void btLookSachActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btLookSachActionPerformed
                // TODO add your handling code here:
                if (this.txtLookSach.getText().length() == 0) {
                        String sql1 = "SELECT * from SACH ";
                        UpdateTable.LoadData(sql1, tbSach);
                } else {
                        String sql1 = "SELECT * from SACH WHERE Ma_Sach like N'%" + this.txtLookSach.getText() + "%' "
                                        + "or Ten_Sach like N'%" + this.txtLookSach.getText() + "%'"
                                        + "or Ten_Tac_gia like N'%" + this.txtLookSach.getText() + "%'"
                                        + "or Nha_Xb like N'%" + this.txtLookSach.getText() + "%'";
                        UpdateTable.LoadData(sql1, tbSach);
                }

        }// GEN-LAST:event_btLookSachActionPerformed

        private void btAddSachActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btAddSachActionPerformed
                // TODO add your handling code here:
                if (this.txtMaSach.getText().length() == 0 || this.txtTenSach.getText().length() == 0
                                || this.txtNhaXb.getText().length() == 0 || this.txtTenTacGia.getText().length() == 0
                                || this.txtGia.getText().length() == 0 || this.txtSoLuong.getText().length() == 0)
                        JOptionPane.showMessageDialog(null, "Phải điền đủ thông tin", "thông báo", 2);
                else if (this.txtMaSach.getText().length() > 10)
                        JOptionPane.showMessageDialog(null, "Mã sách không được lớn hơn 10 ký tự", "thông báo", 2);
                else {
                        Sach s = new Sach(this.txtMaSach.getText(), this.txtTenSach.getText(),
                                        this.txtTenTacGia.getText(),
                                        this.txtNhaXb.getText(),
                                        Integer.parseInt(this.txtGia.getText()),
                                        Integer.parseInt(this.txtSoLuong.getText()));
                        SachData.InsertSach(s);
                        this.btLookSach.doClick();
                }

        }// GEN-LAST:event_btAddSachActionPerformed

        private void btNewSachActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btNewSachActionPerformed
                // TODO add your handling code here:
                ProcessCrt(false);
                this.btAddSach.setEnabled(true);
                this.txtGia.setText(null);
                this.txtMaSach.setText(null);
                this.txtNhaXb.setText(null);
                this.txtTenSach.setText(null);
                this.txtTenTacGia.setText(null);
                this.txtSoLuong.setText(null);
        }// GEN-LAST:event_btNewSachActionPerformed

        private void btEditSachActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btEditSachActionPerformed
                // TODO add your handling code here:
                if (this.txtMaSach.getText().length() == 0 || this.txtTenSach.getText().length() == 0
                                || this.txtNhaXb.getText().length() == 0 || this.txtTenTacGia.getText().length() == 0
                                || this.txtGia.getText().length() == 0 || this.txtSoLuong.getText().length() == 0)
                        JOptionPane.showMessageDialog(null, "Phải điền đủ thông tin", "thông báo", 2);
                else if (this.txtMaSach.getText().length() > 10)
                        JOptionPane.showMessageDialog(null, "Mã sách không được lớn hơn 10 ký tự", "thông báo", 2);
                else {
                        Sach s = new Sach(this.txtMaSach.getText(), this.txtTenSach.getText(),
                                        this.txtTenTacGia.getText(),
                                        this.txtNhaXb.getText(),
                                        Integer.parseInt(this.txtGia.getText()),
                                        Integer.parseInt(this.txtSoLuong.getText()));
                        if (sachdata.UpdateSach(s)) {
                                JOptionPane.showMessageDialog(null, "Bạn đã sửa thành công", "Thông báo", 1);
                        } else
                                JOptionPane.showMessageDialog(null, "Mã sách bị trùng hoặc diền thông tin không hợp lệ",
                                                "Thông báo",
                                                2);
                        this.btLookSach.doClick();
                }

        }// GEN-LAST:event_btEditSachActionPerformed

        private void btDelSachActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btDelSachActionPerformed
                // TODO add your handling code here:
                if (this.txtMaSach.getText().length() == 0)
                        JOptionPane.showMessageDialog(null, "Mã sách không thể bỏ trống", "thông báo", 2);
                else if (this.txtMaSach.getText().length() > 10)
                        JOptionPane.showMessageDialog(null, "Mã sách không được lớn hơn 10 ký tự", "thông báo", 2);
                else {
                        if (sachdata.DeleteSach(this.txtMaSach.getText())) {
                                JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công", "Thông báo", 1);
                        } else
                                JOptionPane.showMessageDialog(null, "Sách đang cho mượn", "Thông báo", 2);
                        this.btLookSach.doClick();
                }
        }// GEN-LAST:event_btDelSachActionPerformed

        private void tbKhachMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbKhachMouseClicked
                // TODO add your handling code here:
                ProcessCrt2(true);
                this.btAddKhach.setEnabled(false);
                try {
                        int row = this.tbKhach.getSelectedRow();
                        String IDrow = (this.tbKhach.getModel().getValueAt(row, 0)).toString();
                        String sql1 = "SELECT * FROM KHACH_HANG where Ma_Khach_hang='" + IDrow + "'";
                        ResultSet rs = UpdateTable.ShowTextField(sql1);
                        if (rs.next()) {
                                this.txtMaKhach.setText(rs.getString("Ma_Khach_hang"));
                                this.txtPassword.setText(rs.getString("Password"));
                                this.txtTenKhach.setText(rs.getString("Ten_Khach_hang"));
                                this.txtNgaySinh.setText(rs.getString("Ngay_sinh"));
                                this.txtDiaChi.setText(rs.getString("Dia_Chi"));
                                this.txtPhone.setText(rs.getString("Phone"));

                        }
                } catch (Exception e) {

                }
        }// GEN-LAST:event_tbKhachMouseClicked

        private void btLookKhachActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btLookKhachActionPerformed
                // TODO add your handling code here:
                if (this.txtLookKhach.getText().length() == 0) {
                        String sql1 = "SELECT * from KHACH_HANG ";
                        UpdateTable.LoadData(sql1, tbKhach);
                } else {
                        String sql1 = "SELECT * from KHACH_HANG WHERE Ma_Khach_hang like N'%"
                                        + this.txtLookKhach.getText() + "%' "
                                        + "or Ten_Khach_hang like N'%" + this.txtLookKhach.getText()
                                        + "%' or Phone like '%"
                                        + this.txtLookKhach.getText() + "%'"
                                        + "or Mail like N'%" + this.txtLookKhach.getText() + "%'";
                        UpdateTable.LoadData(sql1, tbKhach);
                }
        }// GEN-LAST:event_btLookKhachActionPerformed

        private void btAddKhachActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btAddKhachActionPerformed
                // TODO add your handling code here:
                try {
                        if (this.txtMaKhach.getText().length() == 0 || this.txtTenKhach.getText().length() == 0
                                        || this.txtNgaySinh.getText().length() == 0
                                        || this.txtPassword.getText().length() == 0
                                        || this.txtDiaChi.getText().length() == 0
                                        || this.txtPhone.getText().length() == 0)
                                JOptionPane.showMessageDialog(null, "Phải điền đủ thông tin", "thông báo", 2);
                        else if (this.txtMaKhach.getText().length() > 10)
                                JOptionPane.showMessageDialog(null, "Mã khách hàng không được lớn hơn 10 ký tự",
                                                "thông báo", 2);
                        else {
                                KhachHang s = new KhachHang(this.txtMaKhach.getText(), this.txtPassword.getText(),
                                                this.txtTenKhach.getText(), Date.valueOf(this.txtNgaySinh.getText()),
                                                this.txtDiaChi.getText(), this.txtPhone.getText());
                                KhachHangData.InsertKhachHang(s);
                                this.btLookKhach.doClick();
                        }
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Mã KH bị trùng hoặc thông tin không hợp lệ", "Thông báo",
                                        2);
                }

        }// GEN-LAST:event_btAddKhachActionPerformed

        private void btEditKhachActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btEditKhachActionPerformed
                // TODO add your handling code here:
                if (this.txtMaKhach.getText().length() == 0 || this.txtTenKhach.getText().length() == 0
                                || this.txtNgaySinh.getText().length() == 0 || this.txtPassword.getText().length() == 0
                                || this.txtDiaChi.getText().length() == 0 || this.txtPhone.getText().length() == 0)
                        JOptionPane.showMessageDialog(null, "Phải điền đủ thông tin", "thông báo", 2);
                else if (this.txtMaKhach.getText().length() > 10)
                        JOptionPane.showMessageDialog(null, "Mã khách hàng không được lớn hơn 10 ký tự", "thông báo",
                                        2);
                else {
                        KhachHang s = new KhachHang(this.txtMaKhach.getText(), this.txtPassword.getText(),
                                        this.txtTenKhach.getText(), Date.valueOf(this.txtNgaySinh.getText()),
                                        this.txtDiaChi.getText(), this.txtPhone.getText());
                        if (khachhangdata.UpdateKhachHang(s)) {
                                JOptionPane.showMessageDialog(null, "Bạn đã sửa thành công", "Thông báo", 1);
                        } else
                                JOptionPane.showMessageDialog(null, "thông tin không hợp lệ", "Thông báo", 2);
                        this.btLookKhach.doClick();
                }
        }// GEN-LAST:event_btEditKhachActionPerformed

        private void btDelKhachActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btDelKhachActionPerformed
                // TODO add your handling code here:
                if (this.txtMaKhach.getText().length() == 0)
                        JOptionPane.showMessageDialog(null, "Mã sách không thể bỏ trống", "thông báo", 2);
                else if (this.txtMaKhach.getText().length() > 10)
                        JOptionPane.showMessageDialog(null, "Mã sách không được lớn hơn 10 ký tự", "thông báo", 2);
                else {
                        if (khachhangdata.DeleteKhachHang(this.txtMaKhach.getText())) {
                                JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công", "Thông báo", 1);
                        } else
                                JOptionPane.showMessageDialog(null, "KH đang mượn sách", "Thông báo", 2);
                        this.btLookKhach.doClick();
                }
        }// GEN-LAST:event_btDelKhachActionPerformed

        private void btNewKhachActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btNewKhachActionPerformed
                // TODO add your handling code here:
                ProcessCrt2(false);
                this.btAddKhach.setEnabled(true);
                this.txtMaKhach.setText(null);
                this.txtPassword.setText(null);
                this.txtTenKhach.setText(null);
                this.txtDiaChi.setText(null);
                this.txtNgaySinh.setText(null);
                this.txtPhone.setText(null);
        }// GEN-LAST:event_btNewKhachActionPerformed

        private void tbMuonMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tbMuonMouseClicked
                // TODO add your handling code here:
                ProcessCrt3(true);
                this.btAddPhieu.setEnabled(false);
                try {
                        int row = this.tbMuon.getSelectedRow();
                        String IDrow = (this.tbMuon.getModel().getValueAt(row, 0)).toString();
                        String sql1 = "SELECT * FROM PHIEU_MUON where Ma_Phieu_muon='" + IDrow + "'";
                        ResultSet rs = UpdateTable.ShowTextField(sql1);
                        if (rs.next()) {
                                this.txtMaPhieuMuon.setText(rs.getString("Ma_Phieu_muon"));
                                this.cbSachMuon.setSelectedItem(rs.getString("Ma_sach"));
                                this.txtNgayMuon.setText(rs.getString("Ngay_muon"));
                                this.txtHanTra.setText(rs.getString("Han_tra"));
                                this.cbKH.setSelectedItem(rs.getString("Ma_Khach_hang"));
                        }
                } catch (Exception e) {

                }
        }// GEN-LAST:event_tbMuonMouseClicked

        private void btLookMuonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btLookMuonActionPerformed
                // TODO add your handling code here:
                if (this.txtLookPhieu.getText().length() == 0) {
                        String sql1 = "SELECT * from PHIEU_MUON ";
                        UpdateTable.LoadData(sql1, tbMuon);
                } else {
                        String sql1 = "SELECT * from PHIEU_MUON WHERE Ma_Phieu_muon like N'%"
                                        + this.txtLookPhieu.getText() + "%' "
                                        + "or Ma_Khach_hang like N'%" + this.txtLookPhieu.getText()
                                        + "%' or Ma_Sach like N'%"
                                        + this.txtLookPhieu.getText() + "%'";
                        UpdateTable.LoadData(sql1, tbMuon);
                }
        }// GEN-LAST:event_btLookMuonActionPerformed

        private void btAddPhieuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btAddPhieuActionPerformed

                try {
                        Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
                        Statement stm = con.createStatement();
                        ResultSet rs = stm
                                        .executeQuery("SELECT * FROM SACH where Ma_sach= '"
                                                        + this.cbSachMuon.getSelectedItem() + "'");
                        while (rs.next()) {
                                String sl = rs.getString("So_luong");
                                if (this.txtMaPhieuMuon.getText().length() == 0
                                                || this.txtNgayMuon.getText().length() == 0
                                                || this.txtHanTra.getText().length() == 0)
                                        JOptionPane.showMessageDialog(null, "Phải điền đủ thông tin", "Thông báo", 2);
                                else if (this.txtMaPhieuMuon.getText().length() > 10)
                                        JOptionPane.showMessageDialog(null, "MÃ phiếu mượn không được lớn hơn 10 ký tự",
                                                        "Thông báo", 2);
                                else if (Integer.parseInt(sl) <= 0)
                                        JOptionPane.showMessageDialog(null, "Sách đã hết", "Thông báo", 2);
                                else {
                                        PhieuMuon p = new PhieuMuon(this.txtMaPhieuMuon.getText(),
                                                        this.cbKH.getSelectedItem().toString(),
                                                        this.cbSachMuon.getSelectedItem().toString(),
                                                        Date.valueOf(this.txtNgayMuon.getText()),
                                                        Date.valueOf(this.txtHanTra.getText()),
                                                        Date.valueOf(LocalDate.MIN));
                                        PhieuMuonData.InsertPhieu(p);
                                        this.btLookMuon.doClick();
                                }

                        }
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Mã phiếu bị trùng hoặc thông tin không hợp lệ",
                                        "Thông báo", 2);
                }

                String sql = "UPDATE SACH SET So_luong = ? where Ma_Sach = ?";
                String sql1 = "SELECT So_luong from SACH where Ma_Sach = '" + this.cbSachMuon.getSelectedItem() + "'";
                try {
                        ps = Connect.getConnect().prepareStatement(sql);
                        ResultSet rs = UpdateTable.ShowTextField(sql1);
                        ps.setString(2, this.cbSachMuon.getSelectedItem().toString());
                        int count = 0;
                        if (rs.next())
                                count = rs.getInt("So_luong");
                        ps.setInt(1, count - 1);
                        ps.execute();
                        this.btLookSach.doClick();
                } catch (Exception ex) {
                }
        }// GEN-LAST:event_btAddPhieuActionPerformed

        private void btEditPhieuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btEditPhieuActionPerformed
                // TODO add your handling code here:
                if (this.txtMaPhieuMuon.getText().length() == 0 || this.txtNgayMuon.getText().length() == 0
                                || this.txtHanTra.getText().length() == 0)
                        JOptionPane.showMessageDialog(null, "Phải điền đủ thông tin", "thông báo", 2);
                else if (this.txtMaPhieuMuon.getText().length() > 10)
                        JOptionPane.showMessageDialog(null, "Mã phiếu mượn không được lớn hơn 10 ký tự", "thông báo",
                                        2);
                else {
                        PhieuMuon p = new PhieuMuon(this.txtMaPhieuMuon.getText(),
                                        this.cbKH.getSelectedItem().toString(),
                                        this.cbSachMuon.getSelectedItem().toString(),
                                        Date.valueOf(this.txtNgayMuon.getText()),
                                        Date.valueOf(this.txtHanTra.getText()), Date.valueOf(LocalDate.MIN));
                        if (phieumuondata.UpdatePhieu(p)) {
                                JOptionPane.showMessageDialog(null, "Bạn đã sửa thành công", "Thông báo", 1);
                        } else
                                JOptionPane.showMessageDialog(null, "thông tin không hợp lệ", "Thông báo", 2);
                        this.btLookMuon.doClick();
                }
        }// GEN-LAST:event_btEditPhieuActionPerformed

        private void btDelPhieuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btDelPhieuActionPerformed
                // TODO add your handling code here:
                if (this.txtMaPhieuMuon.getText().length() == 0)
                        JOptionPane.showMessageDialog(null, "Mã phiếu không thể bỏ trống", "thông báo", 2);
                else if (this.txtMaPhieuMuon.getText().length() > 10)
                        JOptionPane.showMessageDialog(null, "Mã phiếu không được lớn hơn 10 ký tự", "thông báo", 2);
                else {
                        if (phieumuondata.DeletePhieu(this.txtMaPhieuMuon.getText())) {
                                JOptionPane.showMessageDialog(null, "Bạn đã xóa thành công", "Thông báo", 1);
                        } else
                                JOptionPane.showMessageDialog(null, "Có lỗi xảy ra", "Thông báo", 2);
                        this.btLookMuon.doClick();
                }
        }// GEN-LAST:event_btDelPhieuActionPerformed

        private void btNewPhieuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btNewPhieuActionPerformed
                // TODO add your handling code here:
                this.txtMaPhieuMuon.setText(null);
                this.txtNgayMuon.setText(null);
                this.txtHanTra.setText(null);
                ProcessCrt3(false);
                this.btAddPhieu.setEnabled(true);

        }// GEN-LAST:event_btNewPhieuActionPerformed

        private void btRetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btRetActionPerformed
                // TODO add your handling code here:
                test t = new test();
                t.setVisible(true);
                dispose();
        }// GEN-LAST:event_btRetActionPerformed

        private void btTraActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btTraActionPerformed
                // TODO add your handling code here:
                String sql = "UPDATE SACH SET So_luong = ? where Ma_Sach = ?";
                String sql1 = "SELECT So_luong from SACH where Ma_Sach = '" + this.cbSachMuon.getSelectedItem() + "'";
                String sql2 = "UPDATE PHIEU_MUON SET Ngaytra = (select CURDATE()) where Ma_Phieu_muon = ?";
                try {
                        ps2 = Connect.getConnect().prepareStatement(sql2);
                        ps2.setString(1, this.txtMaPhieuMuon.getText());
                        System.out.println(this.txtMaPhieuMuon.getText());
                        ps2.execute();

                        this.btLookMuon.doClick();
                        ps2.close();
                        ps = Connect.getConnect().prepareStatement(sql);
                        ResultSet rs = UpdateTable.ShowTextField(sql1);
                        ps.setString(2, this.cbSachMuon.getSelectedItem().toString());
                        int count = 0;
                        if (rs.next())
                                count = rs.getInt("So_luong");

                        ps.setInt(1, count + 1);
                        ps.execute();
                        this.btLookMuon.doClick();
                        ps.close();
                        JOptionPane.showMessageDialog(null, "Trả sách thành công", "Thông báo", 1);
                } catch (Exception ex) {
                }
        }// GEN-LAST:event_btTraActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
                loadsach();
        }// GEN-LAST:event_jButton1ActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(JAdminUpdate.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(JAdminUpdate.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(JAdminUpdate.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(JAdminUpdate.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {

                                new JAdminUpdate().setVisible(true);
                        }
                });
        }

        public JTable getTbSach() {
                return tbSach;
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btAddKhach;
        private javax.swing.JButton btAddPhieu;
        private javax.swing.JButton btAddSach;
        private javax.swing.JButton btDelKhach;
        private javax.swing.JButton btDelPhieu;
        private javax.swing.JButton btDelSach;
        private javax.swing.JButton btEditKhach;
        private javax.swing.JButton btEditPhieu;
        private javax.swing.JButton btEditSach;
        private javax.swing.JButton btLookKhach;
        private javax.swing.JButton btLookMuon;
        private javax.swing.JButton btLookSach;
        private javax.swing.JButton btNewKhach;
        private javax.swing.JButton btNewPhieu;
        private javax.swing.JButton btNewSach;
        private javax.swing.JButton btRet;
        private javax.swing.JButton btTra;
        private javax.swing.JComboBox cbKH;
        private javax.swing.JComboBox cbMaSach;
        private javax.swing.JComboBox cbSachMuon;
        private javax.swing.JButton jButton1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JScrollPane jScrollPane2;
        private javax.swing.JScrollPane jScrollPane4;
        private javax.swing.JTabbedPane jTabbedPane1;
        private javax.swing.JLabel lbNgayTra;
        private javax.swing.JLabel lblngaytra;
        private javax.swing.JTable tbKhach;
        private javax.swing.JTable tbMuon;
        private javax.swing.JTable tbSach;
        private javax.swing.JTextField txtDiaChi;
        private javax.swing.JTextField txtGia;
        private javax.swing.JTextField txtHanTra;
        private javax.swing.JTextField txtLookKhach;
        private javax.swing.JTextField txtLookPhieu;
        private javax.swing.JTextField txtLookSach;
        private javax.swing.JTextField txtMaKhach;
        private javax.swing.JTextField txtMaPhieuMuon;
        private javax.swing.JTextField txtMaSach;
        private javax.swing.JTextField txtNgayMuon;
        private javax.swing.JTextField txtNgaySinh;
        private javax.swing.JTextField txtNgayTra;
        private javax.swing.JTextField txtNhaXb;
        private javax.swing.JTextField txtPassword;
        private javax.swing.JTextField txtPhone;
        private javax.swing.JTextField txtSoLuong;
        private javax.swing.JTextField txtTenKhach;
        private javax.swing.JTextField txtTenSach;
        private javax.swing.JTextField txtTenTacGia;
        // End of variables declaration//GEN-END:variables
}
