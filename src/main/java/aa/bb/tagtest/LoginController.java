package aa.bb.tagtest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	private String formViewName = "loginform";
	
//	@ModelAttribute("command")
//	public LoginCommand formBack() {
//		return new LoginCommand();
//	}
	
	@ModelAttribute("command")
	public LoginCommand formBack(HttpServletRequest request) {
		if(request.getMethod().equalsIgnoreCase("get")) {
			//...
		} else {
			//...
		}
		
		return new LoginCommand();
	}
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String form() {
		return formViewName;				
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String submit(LoginCommand loginCommand) {
		if(loginCommand.getUserid().equals("aa") && loginCommand.getPasswd().equals("bb")) return "redirect:/list";
		else return formViewName;
	}
}