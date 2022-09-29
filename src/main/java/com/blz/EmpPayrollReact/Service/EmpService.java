package com.blz.EmpPayrollReact.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blz.EmpPayrollReact.Dto.EmpDto;
import com.blz.EmpPayrollReact.Model.EmpModel;
import com.blz.EmpPayrollReact.Repository.IEmpRepository;

@Service
public class EmpService implements IEmpService{
	
	@Autowired
	IEmpRepository empRepo;

	// create method 
	@Override
	public EmpModel create(EmpDto empDto) {
		EmpModel emp = new EmpModel(empDto);
		empRepo.save(emp);
		return emp;
	}

	@Override
	public List<EmpModel> read() {
		List<EmpModel> lst = empRepo.findAll();
		
		return lst;
	}

	@Override
	public EmpModel delete(long id) {
		Optional <EmpModel> emp = empRepo.findById(id);
		if(emp.isPresent()) {
			empRepo.delete(emp.get());
		}
		
		return emp.get();
	}

	@Override
	public EmpModel update(long id,EmpDto empDto) {
		Optional<EmpModel> emp = empRepo.findById(id);
		emp.get().setName(empDto.getName());
		emp.get().setSalary(empDto.getSalary());
		emp.get().setGender(empDto.getGender());
		emp.get().setPhoto(empDto.getPhoto());
		emp.get().setDept(empDto.getDept());
		emp.get().setNote(empDto.getNote());
		empRepo.save(emp.get());
		return emp.get();
	}

	@Override
	public EmpModel get(long id) {
		Optional<EmpModel> emp = empRepo.findById(id);
		return emp.get();
		
	}

	@Override
	public List<EmpModel> getByName(String name) {
		List<EmpModel> lst= empRepo.findByName(name);
		return lst;
	}

}
