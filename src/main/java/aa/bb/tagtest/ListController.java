package aa.bb.tagtest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListController {
	@RequestMapping("list")
	public String process(Model model) {
		String msg = "로그인 성공으로 비지니스 로직을 수행합니다.";
		model.addAttribute("message", msg);
		
		return "home";
	}
}
