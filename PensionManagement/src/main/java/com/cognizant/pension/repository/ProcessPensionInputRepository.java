package com.cognizant.pension.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.pension.entity.ProcessPensionInput;

@Repository
public interface ProcessPensionInputRepository extends JpaRepository<ProcessPensionInput, String> {
	
	

}
