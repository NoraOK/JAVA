package com.noraokeeffe.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.noraokeeffe.relationships.models.License;
import com.noraokeeffe.relationships.repositories.LicenseRepo;

@Service
public class LicenseService {
	public static int licenseNumber;

	private final LicenseRepo licenseRepo;
	
	public LicenseService(LicenseRepo licenseRepo) {
		this.licenseRepo = licenseRepo;
	}
	public License createLicense(License license) {
		return licenseRepo.save(license);
	}
////RETRIEVES a license by id/////////////////////////////////////////////////////////// 
	public License findLicense(Long id) {
		Optional<License> optionalLicense = licenseRepo.findById(id);
		if (optionalLicense.isPresent()) {
			return optionalLicense.get();
		} else {
			return null;
		}
	}
////GENERATES a license number//////////////////////////////////////////////////////////   
	public String generateLicenseNumber() {
		if (licenseRepo.findTopByOrderByNumberDesc().isEmpty()) {
			licenseNumber ++;
			return Integer.toString(licenseNumber);
		}else {
		List<License> top = licenseRepo.findTopByOrderByNumberDesc();
		licenseNumber = 1 + (Integer.parseInt(top.get(0).getNumber()));
		return Integer.toString(licenseNumber);
		}
	}

	
}
