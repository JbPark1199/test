package com.ezen.pge15;

import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
	
	@RequestMapping(value = "/scoreinput")
	public String sc1() {
		return "scoreinput";
	}
	
	@RequestMapping(value = "/scoresave", method = RequestMethod.POST)
	public String sc2(HttpServletRequest request, Model md) {
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
		
		int tot = kor+eng+mat;
		double avg = tot/3;
		
		double h1[] = {0,60,70,80,90};
		String h2[] = {"F","D","C","B","A"};
		ChoiceFormat cf = new ChoiceFormat(h1, h2);
		String hak = cf.format(avg);
		
		md.addAttribute("name", name);
		md.addAttribute("kor", kor);
		md.addAttribute("eng", eng);
		md.addAttribute("mat", mat);
		md.addAttribute("tot", tot);
		md.addAttribute("avg", avg);
		md.addAttribute("hak", hak);
		
		return "scoreoutput";
	}
	
}
