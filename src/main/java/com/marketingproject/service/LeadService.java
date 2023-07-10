package com.marketingproject.service;


import java.util.List;

import com.marketingproject.entity.Lead;

public interface LeadService {

	void saveLead(Lead lead);

	List<Lead> getLeads();

	void deleteLead(long id);

	Lead getLeadById(long id);





}
