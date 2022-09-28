package com.se.springbootcruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.springbootcruddemo.entity.NhanVien;
import com.se.springbootcruddemo.respository.NhanVienRespository;

@Service
public class NhanVienServiceImpl implements NhanVienService {

	@Autowired
	private NhanVienRespository nhanVienRespository;

	@Override
	public List<NhanVien> findByLuongNhoHon10000() {
		// TODO Auto-generated method stub
		return nhanVienRespository.findByLuongNhoHon10000();
	}

	@Override
	public int sumLuong() {
		// TODO Auto-generated method stub
		return nhanVienRespository.sumLuong();
	}

	@Override
	public List<NhanVien> findBymaMB747() {
		// TODO Auto-generated method stub
		return nhanVienRespository.findBymaMB747();
	}

	@Override
	public List<String> findMaByNVLaiBoeingVaAirbus() {
		// TODO Auto-generated method stub
		return nhanVienRespository.findMaByNVLaiBoeingVaAirbus();
	}

	@Override
	public List<String> findTenByNVLaiBoeing() {
		// TODO Auto-generated method stub
		return nhanVienRespository.findTenByNVLaiBoeing();
	}

}
