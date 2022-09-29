package com.blz.EmpPayrollReact.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blz.EmpPayrollReact.Dto.EmpDto;
import com.blz.EmpPayrollReact.Model.EmpModel;
import com.blz.EmpPayrollReact.Service.IEmpService;

//@CrossOrigin(origins = "http://localhost:9090/")
@RestController
@RequestMapping("/emppayrollreact")
public class EmpController {

	@Autowired
	IEmpService empService;
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public EmpModel create(@RequestBody EmpDto empDto){
		return empService.create(empDto);
	}
	
	@GetMapping("/read")
	public List<EmpModel> read(){
		return empService.read();
	}
	@GetMapping("/get/{id}")
	public EmpModel get(@PathVariable long id) {
		return empService.get(id);
	}
	@DeleteMapping("/delete/{id}")
	public EmpModel delelte(@PathVariable long id) {
		return empService.delete(id);
	}
	@PutMapping("/update/{id}")
	public EmpModel update(@PathVariable long id,@RequestBody EmpDto empDto) {
		return empService.update(id,empDto);
	}
	
	@GetMapping("/getbyname/{name}")
	public List<EmpModel> getByName(@PathVariable String name) {
		return empService.getByName(name);
	}
}
