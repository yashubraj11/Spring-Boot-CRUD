package com.Courcedb.Courcedb.CourceDao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.Courcedb.Courcedb.Model.CourceDto;
import com.Courcedb.Courcedb.Repository.CourceRepository;

@Repository
public class CourceDao {
	@Autowired
CourceRepository courceRepository;
	
	public void insertData(CourceDto courceDto) {
		courceRepository.save(courceDto);
		
	}
	public CourceDto fetchData(Long id) {
	    return courceRepository.findById(id)
	            .orElse(null); 
	}
	public List<CourceDto> fetchAll(){
		return courceRepository.findAll();
	}
	public void DeleteById(Long id) {
		courceRepository.deleteById(id);
		
	}
	public void Deleteall() {
		 courceRepository.deleteAll();
		 
	}
	public String updateCource(Long id, CourceDto courceDto) {
	    Optional<CourceDto> optionalCource = courceRepository.findById(id);

	    if (optionalCource.isPresent()) {
	        CourceDto existing = optionalCource.get();
	        existing.setName(courceDto.getName());
	        existing.setAge(courceDto.getAge());
	        existing.setEmail(courceDto.getEmail());
	        existing.setCource(courceDto.getCource());

	        courceRepository.save(existing);
	        return "Cource updated successfully!";
	    } else {
	        return "Cource with id " + id + " not found!";
	    }
	}



}
