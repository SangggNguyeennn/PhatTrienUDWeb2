package com.example.QuanLyMyPham.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "loaiskincare")
public class LoaiSkinCare {
	@Id
	@Column(name = "MaLoaiSkinCare")    // tên cột, trong bảng , phải viết giống 100%
	private String MaLoaiSkinCare;         // được mapping sang trường thông tin là id, trong class này
	  
	@Column(name = "TenLoaiSkinCare")
	private String TenLoaiSkinCare;
	
	@OneToMany(mappedBy = "loaiSkinCare")
    private List<SkinCare> skinCares;

	public String getMaLoaiSkinCare() {
		return MaLoaiSkinCare;
	}

	public void setMaLoaiSkinCare(String maLoaiSkinCare) {
		MaLoaiSkinCare = maLoaiSkinCare;
	}

	public String getTenLoaiSkinCare() {
		return TenLoaiSkinCare;
	}

	public void setTenLoaiSkinCare(String tenLoaiSkinCare) {
		TenLoaiSkinCare = tenLoaiSkinCare;
	}
	  

}
