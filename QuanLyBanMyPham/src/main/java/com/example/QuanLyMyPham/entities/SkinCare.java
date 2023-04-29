package com.example.QuanLyMyPham.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "skincare")
public class SkinCare {
	@Id
	@Column(name = "MaSkinCare ")    // tên cột, trong bảng , phải viết giống 100%
	private String MaSkinCare ;         // được mapping sang trường thông tin là id, trong class này
	  
	@Column(name = "TenSkinCare")
	private String TenSkinCare;
	  
	@Column(name = "AnhSkinCare")
	private String AnhSkinCare;
	
	@Column(name = "DVT")
	private String DVT;
	
	@Column(name = "DonGia")
	private int DonGia;
	
	@Column(name = "MoTaSkinCare")
	private String MoTaSkinCare;
	
	@Column(name = "SoLuong")
	private int SoLuong;
	
	@Column(name = "MaLoaiSkinCare")
	private String MaLoaiSkinCare;
	
	@Column(name = "MaNhaCungCap")
	private String MaNhaCungCap;
	
	@ManyToOne
    @JoinColumn(name = "loai_skin_care_id")
    private LoaiSkinCare loaiSkinCare;
	
	public String getMaSkinCare() {
		return MaSkinCare;
	}

	public void setMaSkinCare(String maSkinCare) {
		MaSkinCare = maSkinCare;
	}

	public String getTenSkinCare() {
		return TenSkinCare;
	}

	public void setTenSkinCare(String tenSkinCare) {
		TenSkinCare = tenSkinCare;
	}

	public String getAnhSkinCare() {
		return AnhSkinCare;
	}

	public void setAnhSkinCare(String anhSkinCare) {
		AnhSkinCare = anhSkinCare;
	}

	public String getDVT() {
		return DVT;
	}

	public void setDVT(String dVT) {
		DVT = dVT;
	}

	public int getDonGia() {
		return DonGia;
	}

	public void setDonGia(int donGia) {
		DonGia = donGia;
	}

	public String getMoTaSkinCare() {
		return MoTaSkinCare;
	}

	public void setMoTaSkinCare(String moTaSkinCare) {
		MoTaSkinCare = moTaSkinCare;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public String getMaLoaiSkinCare() {
		return MaLoaiSkinCare;
	}

	public void setMaLoaiSkinCare(String maLoaiSkinCare) {
		MaLoaiSkinCare = maLoaiSkinCare;
	}

	public String getMaNhaCungCap() {
		return MaNhaCungCap;
	}

	public void setMaNhaCungCap(String maNhaCungCap) {
		MaNhaCungCap = maNhaCungCap;
	}

	
}

