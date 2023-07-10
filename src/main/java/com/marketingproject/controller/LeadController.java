package com.marketingproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingproject.dto.LeadDto;
import com.marketingproject.entity.Lead;
import com.marketingproject.service.LeadService;
//import com.marketingproject.util.EmailService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	@Autowired
//	private EmailService emailService;

	// http://localhost:8080/view
	@RequestMapping("/view")
	public String viewLeadPage() {
		return "create_lead";

	}

	// http://localhost:8080/saveLead
//	@RequestMapping("/saveLead")
//	public String saveOneLead(Lead lead, ModelMap model) {
//		leadService.saveLead(lead);
//		emailService.sendEmail(lead.getEmail(), "Regarding the holiday on May 1 2023", "Dear All,"
//				+ "This mail is to inform you that the holiday is announced on may01 2023 due to Workers day ");
//		model.addAttribute("msg", "Lead is Saved!!!!");
//		return "create_lead";
//	}

	// http://localhost:8080/saveLead
//	@RequestMapping("/saveLead")
//	public String saveOneLead(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
//			@RequestParam("email") String email, @RequestParam("mobile") long mobile, ModelMap model) {
//		Lead lead = new Lead();
//		lead.setFirstName(firstName);
//		lead.setLastName(lastName);
//		lead.setEmail(email);
//		lead.setMobile(mobile);
//		leadService.saveLead(lead);
//		emailService.sendEmail(lead.getEmail(), "Welcome", "testing");
//		model.addAttribute("msg", "Lead is Saved!!!");
//		return "create_lead";
//
//	}
	// http://localhost:8080/saveLead
	@RequestMapping("/saveLead")
	public String saveOneLead(LeadDto dto,ModelMap model) {
		Lead lead= new Lead();
		lead.setFirstName(dto.getFirstName());
		lead.setLastName(dto.getLastName());
		lead.setEmail(dto.getEmail());
		lead.setMobile(dto.getMobile());
		leadService.saveLead(lead);
		model.addAttribute("msg", "Lead is Saved!!!!");
		return "create_lead";
		
	}
	// http://localhost:8080/listall
	@RequestMapping("/listall")
	public String getAllLead(Lead lead, ModelMap model) {
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads", leads);
		return "list_lead";
	}

	// http://localhost:8080/delete
	@RequestMapping("/delete")
	public String deleteLeadById(@RequestParam("id") long id, ModelMap model) {
		leadService.deleteLead(id);
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads", leads);
		return "list_lead";
	}

	// http://localhost:8080/update
	@RequestMapping("/update")
	public String getLeadByID(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadService.getLeadById(id);
		model.addAttribute("lead", lead);
		return "update_lead";
	}

	// http://localhost:8080/updateLead
	@RequestMapping("/updateLead")
	public String updateOneLead(Lead lead, ModelMap model) {
		leadService.saveLead(lead);
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads", leads);
		return "list_lead";
	}

}