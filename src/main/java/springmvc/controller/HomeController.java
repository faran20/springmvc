package springmvc.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Faran Ahmed Yasir");
		return "home";
	}

	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public String fileupload(@RequestParam(value = "file1", required = false) CommonsMultipartFile file,
			HttpSession hs) {
//		System.out.println(file.getName());
//		System.out.println(file.getSize());
//		System.out.println(file.getFileItem());
		byte[] data = file.getBytes();
		String path = hs.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "images" + File.separator + file.getOriginalFilename();
		System.out.println(path);

		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("File Uploaded");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println("File Upload Error");
		}
		return "redirect:/about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Faran");
		modelAndView.setViewName("help");

		List<Integer> marks = new ArrayList<Integer>();
		marks.add(1);
		marks.add(2);
		marks.add(32);
		marks.add(42);
		marks.add(52);
		marks.add(62);

		modelAndView.addObject("marks", marks);

		return modelAndView;
	}

}
