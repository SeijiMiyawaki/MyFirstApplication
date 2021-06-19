package com.example.app.repository;

import java.util.List;

import com.example.app.entity.Survey;

public interface SurveyDao {
	
	void insertSurvey(Survey survey);
	
	List<Survey> getAll();

}
