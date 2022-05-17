CREATE TABLE KHACH_HANG(
    `Ma_Khach_hang` varchar(10) DEFAULT NULL,
    `Password` mediumint(9) DEFAULT NULL,
    `Ten_Khach_hang` varchar(50) DEFAULT NULL,
    `Ngay_sinh` varchar(10) DEFAULT NULL,
    `Dia_Chi` varchar(10) DEFAULT NULL,
    `Phone` bigint(20) DEFAULT NULL,
    PRIMARY KEY (Ma_Khach_hang)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4