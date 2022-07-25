package com.cognizant.pension.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.pension.entity.PensionDetail;
import com.cognizant.pension.entity.ProcessPensionInput;

@RestController
public class Controller {
	
	@PostMapping("/ProcessPension/{processPensionInput}")
	public PensionDetail setPensionDetail(ProcessPensionInput processPensionInput) {
		PensionDetail pd = new PensionDetail();
		pd.setBankServiceCharge(Double.parseDouble(processPensionInput.getAadhaarNumber()));
		return pd;
		
	}

}
