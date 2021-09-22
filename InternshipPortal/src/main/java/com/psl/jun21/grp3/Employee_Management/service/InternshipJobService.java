package com.psl.training.Employee_Management.service;


import java.util.List;

import com.psl.training.Employee_Management.model.InternshipProfile;

public interface InternshipJobService {
	
	List<InternshipProfile> getInternshipListFromCompanyById(Integer id);
}
