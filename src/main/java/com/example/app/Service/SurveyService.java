package com.example.app.Service;

import java.util.List;

import com.example.app.entity.Survey;

public interface SurveyService {
	
	void save(Survey survey);
	
	List<Survey> getAll();

}
