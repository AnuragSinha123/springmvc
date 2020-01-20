package com.sopra.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@RequestMapping("/hello")
public class HelloWorldController {

	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showform()
	{
		return "helloworld-form";
	}
	
	//need a controller method to show the initial HTML form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	// new controller method to read from data and
	// add data to the model
	@RequestMapping("/processFormVersionTwo")
	public String letsshout(HttpServletRequest request  , Model model)
	{
		// read the request parameter from the html form
		String theName = request.getParameter("studentName");
		
		//convert the data to all caps
		theName = theName.toUpperCase();
		
		//create the msg
		String result = " Yo" + theName;
		
		//add msg to the model
		model.addAttribute("message", result);
		return "helloworld";
	}
	// add data to the model
		@RequestMapping("/processFormVersionThree")
		public String processFormVersionThree(@RequestParam("studentName") String theName , Model model)
		{
			// read the request parameter from the html form
			//String theName = request.getParameter("studentName"); no need of this now bec of requestparam
			
			//convert the data to all caps
			theName = theName.toUpperCase();
			
			//create the msg
			String result = " Hey bro " + theName;
			
			//add msg to the model
			model.addAttribute("message", result);
			return "helloworld";
		}
}
