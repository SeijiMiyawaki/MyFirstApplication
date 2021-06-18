package com.example.app.survey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/servey")
public class ServeyController {
	
	@GetMapping("/form")
	public String form(ServeyForm serveyForm,
			Model model,
			@ModelAttribute("complete") String complete) {
		model.addAttribute("title", "Servey Form");
		return "servey/form";
	}
	
	@PostMapping("/form")
	public String formGoBack(ServeyForm serveyForm, Model model) {
		model.addAttribute("title", "Servey Form");
		return "servey/form";
	}
	
	@PostMapping("/confirm")
	public String confirm(@Validated ServeyForm serveyForm,
			BindingResult result,
			Model model) {
		if(result.hasErrors()) {
			model.addAttribute("title", "Servey Form");
			return "servey/form";
		}
		model.addAttribute("title", "Confirm Page");
		return "servey/confirm";
	}
	
	@PostMapping("/complete")
	public String complete(@Validated ServeyForm serveyForm,
			BindingResult result,
			Model model,
			RedirectAttributes redirectAttributes) {
		if(result.hasErrors()) {
			model.addAttribute("title", "Servey Form");
			return "servey/form";
		}
		redirectAttributes.addFlashAttribute("complete", "Registered!");
		return "redirect:/servey/form";
		
	}
//	Survey survey = new Survey();
//	survey.setAge(surveyForm.getAge());
//	survey.setSatisfaction(surveyForm.getSatisfaction());
//	survey.setComment(surveyForm.getComment());
//	survey.setCreated(LocalDateTime.now());
//	
//	surveyService.save(survey);
//	redirectAttributes.addFlashAttribute("complete", "Completed!");
//	return "redirect:/survey/form?complete";

}
