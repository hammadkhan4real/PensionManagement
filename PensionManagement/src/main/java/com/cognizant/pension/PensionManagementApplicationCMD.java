package com.cognizant.pension;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.pension.entity.ProcessPensionInput;
import com.cognizant.pension.repository.ProcessPensionInputRepository;

@Component
public class PensionManagementApplicationCMD implements CommandLineRunner {

	@Autowired ProcessPensionInputRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ProcessPensionInput ppi = new  ProcessPensionInput();
		ppi.setAadhaarNumber("80801234");
		repo.save(ppi);
	}

}
