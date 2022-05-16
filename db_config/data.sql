SET
    ANSI_NULLS ON
GO
SET
    QUOTED_IDENTIFIER ON
GO
    CREATE TABLE dbo.KHACH_HANG(
        Ma_Khach_hang nchar(10) NOT NULL,
        Password nvarchar(50) NULL,
        Ten_Khach_hang nvarchar(50) NULL,
        Ngay_sinh date NULL,
        Dia_Chi nvarchar(50) NULL,
        Phone nvarchar(50) NULL,
        CONSTRAINT PK_KHACH_HANG PRIMARY KEY CLUSTERED (Ma_Khach_hang ASC) WITH (
            PAD_INDEX = OFF,
            STATISTICS_NORECOMPUTE = OFF,
            IGNORE_DUP_KEY = OFF,
            ALLOW_ROW_LOCKS = ON,
            ALLOW_PAGE_LOCKS = ON,
            OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF
        ) ON PRIMARY
    ) ON PRIMARY
GO
SET
    ANSI_NULLS ON
GO
SET
    QUOTED_IDENTIFIER ON
GO
    CREATE TABLE dbo.PHIEU_MUON(
        Ma_Phieu_muon nchar(10) NOT NULL,
        Ma_Khach_hang nchar(10) NULL,
        Ma_Sach nchar(10) NULL,
        Ngay_muon date NULL,
        Han_tra date NULL,
        Ngaytra date NULL,
        CONSTRAINT PK_PHIEU_MUON PRIMARY KEY CLUSTERED (Ma_Phieu_muon ASC) WITH (
            PAD_INDEX = OFF,
            STATISTICS_NORECOMPUTE = OFF,
            IGNORE_DUP_KEY = OFF,
            ALLOW_ROW_LOCKS = ON,
            ALLOW_PAGE_LOCKS = ON,
            OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF
        ) ON PRIMARY
    ) ON PRIMARY
GO
SET
    ANSI_NULLS ON
GO
SET
    QUOTED_IDENTIFIER ON
GO
    CREATE TABLE dbo.QUAN_TRI(
        Ma_Admin nchar(10) NOT NULL,
        Password nvarchar(50) NULL,
        CONSTRAINT PK_QUAN_TRI PRIMARY KEY CLUSTERED (Ma_Admin ASC) WITH (
            PAD_INDEX = OFF,
            STATISTICS_NORECOMPUTE = OFF,
            IGNORE_DUP_KEY = OFF,
            ALLOW_ROW_LOCKS = ON,
            ALLOW_PAGE_LOCKS = ON,
            OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF
        ) ON PRIMARY
    ) ON PRIMARY
GO
SET
    ANSI_NULLS ON
GO
SET
    QUOTED_IDENTIFIER ON
GO
    CREATE TABLE dbo.SACH(
        Ma_Sach nchar(10) NOT NULL,
        Ten_Sach nvarchar(50) NULL,
        Ten_Tac_gia nvarchar(50) NULL,
        Nha_xb nvarchar(50) NULL,
        Gia_tien int NULL,
        So_luong int NULL,
        CONSTRAINT PK_SACH PRIMARY KEY CLUSTERED (Ma_Sach ASC) WITH (
            PAD_INDEX = OFF,
            STATISTICS_NORECOMPUTE = OFF,
            IGNORE_DUP_KEY = OFF,
            ALLOW_ROW_LOCKS = ON,
            ALLOW_PAGE_LOCKS = ON,
            OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF
        ) ON PRIMARY
    ) ON PRIMARY
GO
ALTER TABLE
    dbo.PHIEU_MUON WITH CHECK
ADD
    CONSTRAINT FK_PHIEU_MUON_KHACH_HANG FOREIGN KEY(Ma_Khach_hang) REFERENCES dbo.KHACH_HANG (Ma_Khach_hang)
GO
ALTER TABLE
    dbo.PHIEU_MUON CHECK CONSTRAINT FK_PHIEU_MUON_KHACH_HANG
GO
ALTER TABLE
    dbo.PHIEU_MUON WITH CHECK
ADD
    CONSTRAINT FK_PHIEU_MUON_SACH FOREIGN KEY(Ma_Sach) REFERENCES dbo.SACH (Ma_Sach)
GO
ALTER TABLE
    dbo.PHIEU_MUON CHECK CONSTRAINT FK_PHIEU_MUON_SACH