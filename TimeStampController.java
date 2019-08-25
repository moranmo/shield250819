package com.jwt.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
/*import org.springframework.web.bind.annotation.PostMapping;*/
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.TimeStamp;
import com.jwt.service.TimeStampService;


@Controller
public class TimeStampController {

	private static final Logger logger = Logger
			.getLogger(TimeStampController.class);

	public TimeStampController() {
		System.out.println("TimeStampController()");
	}

	@Autowired
	private TimeStampService timeStampService;
	
	@RequestMapping(value = "/" )
	public ModelAndView listTimeStamp(ModelAndView model) throws IOException {
		List<TimeStamp> listTimeStamp = timeStampService.getAllTimeStamp();
		
		model.addObject("listTimeStamp", listTimeStamp);

		model.setViewName("home");
		return model;
	}









	@RequestMapping(value = "/saveTimeStamp", method = RequestMethod.POST  )
	@ResponseBody
	public ModelAndView saveTimeStamp(@Valid @ModelAttribute TimeStamp timeStamp, BindingResult result,ModelAndView model ) {
//		public String saveTimeStamp(@Valid @ModelAttribute TimeStamp timeStamp, BindingResult result,ModelAndView model ) {


		if (result.hasErrors()) {
			model.setViewName("error");
			return new ModelAndView("error");
//			return "error";
		}
		if (timeStamp.getId() == 0) { // if customer id is 0 then creating the
			// customer other updating the customer
			timeStampService.addTimeStamp(timeStamp);
//			return new ModelAndView("redirect:/");
			return new ModelAndView("success");
//			return "success";
			
		}
//		return new ModelAndView("redirect:/"); 
		return new ModelAndView("success");
//		return "";

	}
	
	@RequestMapping(value = "/deleteAllTimeStamp", method = RequestMethod.GET)
	public ModelAndView deleteAllTimeStamp(HttpServletRequest request) {
//		int customerId = Integer.parseInt(request.getParameter("id"));
		timeStampService.deleteAllTimeStamp();
		return new ModelAndView("redirect:/");
	}










}