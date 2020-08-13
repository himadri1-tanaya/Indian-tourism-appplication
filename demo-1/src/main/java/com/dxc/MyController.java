package com.dxc;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController 
{
	@RequestMapping("/home")
  public String home()
  {
	  return"home";
  }
	@RequestMapping("/add")
	public String add(@RequestParam int num1,@RequestParam int num2,HttpSession session,Model m)
	{
		int c;
		c=num1+num2;
		m.addAttribute("c", c);
		return "redirect:sq";
	}
	@RequestMapping("/sq")
	public String squre(HttpSession session,Model m)
	{
		int k=(int)m.getAttribute("c");
		k=k*k;
		m.addAttribute("k",k);
		return "result";
	}
}
