CREATE TABLE PHIEU_MUON(
    Ma_Phieu_muon char(10) NOT NULL,
    Ma_Khach_hang char(10) NOT NULL,
    Ma_Sach char(10) NOT NULL,
    Ngay_muon date NOT NULL,
    Han_tra date NOT NULL,
    Ngaytra date NOT NULL,
    PRIMARY KEY (Ma_Phieu_muon),
    FOREIGN KEY (Ma_Khach_hang) REFERENCES KHACH_HANG (Ma_Khach_hang),
    FOREIGN KEY (Ma_Sach) REFERENCES SACH (Ma_Sach)
)