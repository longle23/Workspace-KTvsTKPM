package com.se.springbootcruddemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.se.springbootcruddemo.entity.ChuyenBay;
import com.se.springbootcruddemo.entity.MayBay;
import com.se.springbootcruddemo.service.ChuyenBayService;
import com.se.springbootcruddemo.service.MayBayService;


@RestController
@RequestMapping("/mayBay")
public class MayBayController {
	
	@Autowired
	private MayBayService mayBayService;

//  2. Cho biết các loại máy bay có tầm bay lớn hơn 10,000km.
    @GetMapping("/findByTamBayLonHon10000")
    public List<String> findByTamBayLonHon10000() {
    	return mayBayService.findByTamBayLonHon10000();
    }
//	7. Có bao nhiêu loại máy báy Boeing.
    @GetMapping("/sumMayBayBoeing")
    public int sumMayBayBoeing() {
    	return mayBayService.sumMayBayBoeing();
    }
//	11. Cho biết mã số của các loại máy bay mà nhân viên có họ Nguyễn có thể lái.
    @GetMapping("/findMaByNameNguyen")
    public List<String> findMaByNameNguyen() {
    	return mayBayService.findMaByNameNguyen();
    }
//	13. Cho biết các loại máy bay có thể thực hiện chuyến bay VN280
    @GetMapping("/findLoaiByCBVN280")
    public List<String> findLoaiByCBVN280() {
    	return mayBayService.findLoaiByCBVN280();
    }
//	16. Với mỗi loại máy bay có phi công lái cho biết mã số, loại máy báy và tổng số phi công có thể lái loại máy bay đó.
    
    @GetMapping("/findMaLoaiVaTongPhiCong")
    public List<Object[]> findMaLoaiVaTongPhiCong() {
    	return mayBayService.findMaLoaiVaTongPhiCong();
    }
}
