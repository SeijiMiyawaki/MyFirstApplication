package com.example.service;

import java.util.List;

import com.example.app.entity.Inquiry;

public interface InquiryService {
	
	void save(Inquiry inquiry);
	
	void update(Inquiry inquiry);
	
	List<Inquiry> getAll();

}
