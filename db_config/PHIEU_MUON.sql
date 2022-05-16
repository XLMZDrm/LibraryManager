CREATE TABLE PHIEU_MUON(
`Ma_Phieu_muon` varchar(10) DEFAULT NULL,
  `Ma_Khach_hang` varchar(10) DEFAULT NULL,
  `Ma_Sach` varchar(10) DEFAULT NULL,
  `Ngay_muon` varchar(10) DEFAULT NULL,
  `Han_tra` varchar(10) DEFAULT NULL,
  `Ngaytra` varchar(10) DEFAULT NULL,
    PRIMARY KEY (Ma_Phieu_muon),
    FOREIGN KEY (Ma_Khach_hang) REFERENCES KHACH_HANG (Ma_Khach_hang),
    FOREIGN KEY (Ma_Sach) REFERENCES SACH (Ma_Sach)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4