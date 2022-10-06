package com.se.springbootcruddemo.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.se.springbootcruddemo.entity.NhanVien;

public interface NhanVienRespository extends JpaRepository<NhanVien, String> {
//	3. Tìm các nhân viên có lương nhỏ hơn 10,000.
	@Query(value = "select * from [dbo].[nhanvien] where [Luong]<10000", nativeQuery = true)
	public List<NhanVien> findByLuongNhoHon10000();

//	8. Cho biết tổng số lương phải trả cho các nhân viên.
	@Query(value = "select SUM([Luong]) from [dbo].[nhanvien]", nativeQuery = true)
	public int sumLuong();

//	10. Cho biết các nhân viên có thể lái máy bay có mã số 747.
	@Query(value = "SELECT        nhanvien.MaNV, nhanvien.Ten, nhanvien.Luong\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "where chungnhan.MaMB=747", nativeQuery = true)
	public List<NhanVien> findBymaMB747();

//	12. Cho biết mã số của các phi công vừa lái được Boeing vừa lái được Airbus.
	@Query(value = "SELECT        nhanvien.MaNV\r\n" + "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "where ([Loai] like '%Boeing%' or [Loai] like '%Airbus%')\r\n"
			+ "group by nhanvien.MaNV", nativeQuery = true)
	public List<String> findMaByNVLaiBoeingVaAirbus();

//	15. Cho biết tên của các phi công lái máy bay Boein
	@Query(value = "SELECT        nhanvien.Ten\r\n" + "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "where [Loai] like '%Boeing%'\r\n" + "group by nhanvien.Ten", nativeQuery = true)
	public List<String> findTenByNVLaiBoeing();

}
