package com.Courcedb.Courcedb.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Courcedb.Courcedb.CourceDao.CourceDao;
import com.Courcedb.Courcedb.Model.CourceDto;

@Service
public class Courceservice {
	@Autowired
CourceDao courceDao;
	
public String insertData(CourceDto courceDto) {
courceDao.insertData(courceDto);
return "Data saved";
}
public CourceDto fetchData(Long id) {
    return courceDao.fetchData(id);
}
public List<CourceDto> fetchAllusers() {
	return courceDao.fetchAll();
	
}
public String Deletebyid(long id) {
	 courceDao.DeleteById(id);
	 return "Data deleted";
}
public String deleteall() {
	courceDao.Deleteall();
	return "Deleted successfully";
}
public String updateCource(long id,CourceDto courceDto) {
	return courceDao.updateCource(id, courceDto);
}
}
