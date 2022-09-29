package com.blz.EmpPayrollReact.Service;

import java.util.List;

import com.blz.EmpPayrollReact.Dto.EmpDto;
import com.blz.EmpPayrollReact.Model.EmpModel;

public interface IEmpService {

	EmpModel create(EmpDto empDto);

	List<EmpModel> read();

	EmpModel delete(long id);

	EmpModel update(long id, EmpDto empDto);

	EmpModel get(long id);

	List<EmpModel> getByName(String name);

}
