package com.se.springbootcruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.springbootcruddemo.entity.ChuyenBay;
import com.se.springbootcruddemo.respository.ChuyenBayRespository;

@Service
public class ChuyenBayServiceImpl implements ChuyenBayService {
	@Autowired
	private ChuyenBayRespository chuyenBayRespository;

	@Override
	public List<ChuyenBay> findByGaDen(String gaDen) {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findByGaDen(gaDen);
	}

	@Override
	public List<ChuyenBay> findByDoDaiDBNhoHon10000VaLoHon8000() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findByDoDaiDBNhoHon10000VaLoHon8000();
	}

	@Override
	public List<ChuyenBay> findBySGtoBMT() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findBySGtoBMT();
	}

	@Override
	public int sumCBFromSG() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.sumCBFromSG();
	}

	@Override
	public List<ChuyenBay> findCBByMBAirbusA320() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findCBByMBAirbusA320();
	}

	@Override
	public List<ChuyenBay> findDBFromAtoBAndToA() {
		// TODO Auto-generated method stub
		return chuyenBayRespository.findDBFromAtoBAndToA();
	}

}
