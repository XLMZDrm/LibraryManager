USE [master]
GO
/****** Object:  Database [QLTvien]    Script Date: 5/16/2022 10:47:01 PM ******/
CREATE DATABASE [QLTvien]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QLTvien', FILENAME = N'C:\sql\QLTvien.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'QLTvien_log', FILENAME = N'C:\sql\QLTvien_log.ldf' , SIZE = 4224KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [QLTvien] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLTvien].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLTvien] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLTvien] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLTvien] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLTvien] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLTvien] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLTvien] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [QLTvien] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLTvien] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLTvien] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLTvien] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLTvien] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLTvien] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLTvien] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLTvien] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLTvien] SET  DISABLE_BROKER 
GO
ALTER DATABASE [QLTvien] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLTvien] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLTvien] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLTvien] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLTvien] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLTvien] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLTvien] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLTvien] SET RECOVERY FULL 
GO
ALTER DATABASE [QLTvien] SET  MULTI_USER 
GO
ALTER DATABASE [QLTvien] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLTvien] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLTvien] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLTvien] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [QLTvien] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QLTvien] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [QLTvien] SET QUERY_STORE = OFF
GO
USE [QLTvien]
GO
/****** Object:  Table [dbo].[KHACH_HANG]    Script Date: 5/16/2022 10:47:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KHACH_HANG](
	[Ma_Khach_hang] [nchar](10) NOT NULL,
	[Password] [nvarchar](50) NULL,
	[Ten_Khach_hang] [nvarchar](50) NULL,
	[Ngay_sinh] [date] NULL,
	[Dia_Chi] [nvarchar](50) NULL,
	[Phone] [nvarchar](50) NULL,
 CONSTRAINT [PK_KHACH_HANG] PRIMARY KEY CLUSTERED 
(
	[Ma_Khach_hang] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PHIEU_MUON]    Script Date: 5/16/2022 10:47:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PHIEU_MUON](
	[Ma_Phieu_muon] [nchar](10) NOT NULL,
	[Ma_Khach_hang] [nchar](10) NULL,
	[Ma_Sach] [nchar](10) NULL,
	[Ngay_muon] [date] NULL,
	[Han_tra] [date] NULL,
	[Ngaytra] [date] NULL,
 CONSTRAINT [PK_PHIEU_MUON] PRIMARY KEY CLUSTERED 
(
	[Ma_Phieu_muon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[QUAN_TRI]    Script Date: 5/16/2022 10:47:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[QUAN_TRI](
	[Ma_Admin] [nchar](10) NOT NULL,
	[Password] [nvarchar](50) NULL,
 CONSTRAINT [PK_QUAN_TRI] PRIMARY KEY CLUSTERED 
(
	[Ma_Admin] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SACH]    Script Date: 5/16/2022 10:47:01 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SACH](
	[Ma_Sach] [nchar](10) NOT NULL,
	[Ten_Sach] [nvarchar](50) NULL,
	[Ten_Tac_gia] [nvarchar](50) NULL,
	[Nha_xb] [nvarchar](50) NULL,
	[Gia_tien] [int] NULL,
	[So_luong] [int] NULL,
 CONSTRAINT [PK_SACH] PRIMARY KEY CLUSTERED 
(
	[Ma_Sach] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[PHIEU_MUON]  WITH CHECK ADD  CONSTRAINT [FK_PHIEU_MUON_KHACH_HANG] FOREIGN KEY([Ma_Khach_hang])
REFERENCES [dbo].[KHACH_HANG] ([Ma_Khach_hang])
GO
ALTER TABLE [dbo].[PHIEU_MUON] CHECK CONSTRAINT [FK_PHIEU_MUON_KHACH_HANG]
GO
ALTER TABLE [dbo].[PHIEU_MUON]  WITH CHECK ADD  CONSTRAINT [FK_PHIEU_MUON_SACH] FOREIGN KEY([Ma_Sach])
REFERENCES [dbo].[SACH] ([Ma_Sach])
GO
ALTER TABLE [dbo].[PHIEU_MUON] CHECK CONSTRAINT [FK_PHIEU_MUON_SACH]
GO
USE [master]
GO
ALTER DATABASE [QLTvien] SET  READ_WRITE 
GO
