package nghiapt.edu.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
		// Get value form properties
	   @Value("${wellcome}")
	   private String wellcome;
	
	@RequestMapping("/")
	   @ResponseBody
	   public String hello() {
		System.out.println("Demo Controller is Calling");
	     return wellcome;
	   }
}