CREATE TABLE KHACH_HANG(
    Ma_Khach_hang char(10) NOT NULL,
    Password varchar(50) NOT NULL,
    Ten_Khach_hang varchar(50) NOT NULL,
    Ngay_sinh date NOT NULL,
    Dia_Chi varchar(50) NOT NULL,
    Phone varchar(50) NOT NULL,
    PRIMARY KEY (Ma_Khach_hang)
)