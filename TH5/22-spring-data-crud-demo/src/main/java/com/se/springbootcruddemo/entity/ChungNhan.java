package com.se.springbootcruddemo.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor @AllArgsConstructor
@ToString
@Entity
@Table(name = "chungnhan")
@IdClass(ChungNhanPK.class)
public class ChungNhan implements Serializable {
	@Id
	@ManyToOne
	@JoinColumn(name = "MaNV")
	private NhanVien nhanVien;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "MaMB")
	private MayBay mayBay;

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public MayBay getMayBay() {
		return mayBay;
	}

	public void setMayBay(MayBay mayBay) {
		this.mayBay = mayBay;
	}
	
	
}
