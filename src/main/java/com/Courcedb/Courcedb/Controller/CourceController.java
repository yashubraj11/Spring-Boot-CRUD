package com.Courcedb.Courcedb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Courcedb.Courcedb.Model.CourceDto;
import com.Courcedb.Courcedb.Service.Courceservice;

@RestController
public class CourceController {
	@Autowired
Courceservice courceservice;
	@PostMapping("/Cource")
	public String insertData(@RequestBody CourceDto courceDto) {
		return courceservice.insertData(courceDto);
	}
	@GetMapping("/cource/data/{id}")
	public CourceDto fetchData(@PathVariable Long id) {
	    return courceservice.fetchData(id);
	}
	@GetMapping("/cource/data")
	public List<CourceDto> fetchAllusers() {
		return courceservice.fetchAllusers();
		
	}
	@DeleteMapping("/cource/delete/{id}")
	public String deletebyid(@PathVariable long id) {
		return courceservice.Deletebyid(id);
	}
	@DeleteMapping("/cource/delete")
	public String deleteAll() {
		return courceservice.deleteall();
	}
	@PutMapping("/cource/update/{id}")
	public String updateCource(@PathVariable long id,@RequestBody CourceDto courceDto) {
		return courceservice.updateCource(id, courceDto);
	}
}
