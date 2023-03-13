package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import springmvc.models.User;
import springmvc.services.UserService;

@Controller
public class RegisterController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void registerForm(Model model) {
		model.addAttribute("mainTitle", "Register");
		model.addAttribute("mainHeading", "Registration");
		model.addAttribute("tagline", "Please enter all fields");
	}

	@RequestMapping("/register")
	public String register() {
		// TODO Auto-generated constructor stub
		return "register";
	}

	@RequestMapping(path = "/submitForm", method = RequestMethod.POST)
	public RedirectView submitForm(@ModelAttribute("user") User user, BindingResult bindingResult) {
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("register");
		if (bindingResult.hasErrors()) {
			return redirectView;
		}

		System.out.println(user);
		userService.createUser(user);

		return redirectView;
	}

}
