CREATE TABLE KHACH_HANG(
    `Ma_Khach_hang` varchar(10) DEFAULT NULL,
    `Password` varchar(50) DEFAULT NULL,
    `Ten_Khach_hang` varchar(50) DEFAULT NULL,
    `Ngay_sinh` varchar(10) DEFAULT NULL,
    `Dia_Chi` text DEFAULT NULL,
    `Phone` char(10) DEFAULT NULL,
    PRIMARY KEY (Ma_Khach_hang)
) ENGINE = InnoDB DEFAULT CHARSET = utf8mb4