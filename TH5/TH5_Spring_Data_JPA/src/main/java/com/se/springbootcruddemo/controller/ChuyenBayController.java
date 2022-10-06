package com.se.springbootcruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootcruddemo.entity.ChuyenBay;
import com.se.springbootcruddemo.service.ChuyenBayService;

@RestController
public class ChuyenBayController {
	
	@Autowired
    private ChuyenBayService chuyenBayService;
	
	@GetMapping('/chuyenBat')
	public List<ChuyenBay> timGaDen(){
		return Chuye
	}
}
