package com.blz.EmpPayrollReact.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blz.EmpPayrollReact.Model.EmpModel;

public interface IEmpRepository extends JpaRepository<EmpModel, Long>{

	List<EmpModel> findByName(String name);

}
