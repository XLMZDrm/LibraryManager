CREATE TABLE SACH(
    `Ma_Sach` varchar(10) DEFAULT NULL,
    `Ten_Sach` varchar(50) DEFAULT NULL,
    `Ten_Tac_gia` varchar(50) DEFAULT NULL,
    `Nha_xb` varchar(50) DEFAULT NULL,
    `Gia_tien` mediumint(9) DEFAULT NULL,
    `So_luong` tinyint(4) DEFAULT NULL,
    PRIMARY KEY (Ma_Sach)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4