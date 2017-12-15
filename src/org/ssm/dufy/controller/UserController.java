package org.ssm.dufy.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.ssm.dufy.entity.User;
import org.ssm.dufy.service.UserService;

@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/showName", method=RequestMethod.POST)
	public String showUserName(@RequestParam("id")int id, HttpServletRequest request, Model model) {
		User user = userService.getUserById(id);
		if (user != null) {
			request.setAttribute("name", user.getName());
			model.addAttribute("name", user.getName());
			return "showName";
		}
		request.setAttribute("error", "没有找到该用户！");
		return "error";
	}
}
