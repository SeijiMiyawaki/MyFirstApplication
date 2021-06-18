package com.example.dao;

import java.util.List;

import com.example.app.entity.Inquiry;

public interface InquiryDao {
	
	void insertInquiry(Inquiry inquiry);
	
	List<Inquiry> getAll();

}
