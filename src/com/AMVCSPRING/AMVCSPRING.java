package com.AMVCSPRING;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AMVCSPRING {

	
	@RequestMapping("/hi")
	public String printHi(ModelMap Model)
	{
	   Model.addAttribute("message", "This is the controller!");
	   return "hi";
	}
	/*
	public ModelAndView hiThere(){
		String message = "<br><div style='text-align:center;'>"
				+ "<h3>********** <br>Hello World, Spring MVC Tutorial\n</h3>\n"
				+ "This message is coming <br>from CrunchifyHelloWorld.java **********</div><br><br>";
		return new ModelAndView("hi", "message", message);		
	}
	*/
}
