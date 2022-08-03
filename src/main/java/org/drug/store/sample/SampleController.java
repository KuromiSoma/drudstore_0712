package org.drug.store.sample;
import java.util.List;

import org.apache.catalina.User;
import org.drug.store.ptuserlist.PtUserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

	@RequestMapping(path = "/member", method = RequestMethod.GET)
	String member(Model model) {
	    return "/sample/member";
	}
	
	public SampleService sampleService;

	@RequestMapping(path = "/member", method = RequestMethod.POST)
	String memberReg(Model model, @ModelAttribute  PtUserForm userForm ) {
		this.sampleService.insertUser(model, userForm);
	    List<User> list = this.sampleService.getUserList();
	    model.addAttribute("list", list);
		return "/sample/index";
	}
}