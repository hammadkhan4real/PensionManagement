package com.cognizant.pension.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.pension.entity.PensionDetail;

@Repository
public interface PensionManagementRepository extends JpaRepository<PensionDetail, Integer> {
	
	

}
