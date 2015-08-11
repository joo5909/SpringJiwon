package demo.controller;

import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import demo.model.Friends;
import demo.repository.JiwonRepository;

@Controller
public class JiwonController {
	
	@Autowired
	JiwonRepository jiwonRepository;


	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {

		return "home";
	}
	
	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form(Locale locale, Model model) {

		return "form";
	}	
	@RequestMapping(value = "/db", method = RequestMethod.GET)
	public String db(Locale locale, Model model) {

		return "db";
	}
	

	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public ModelAndView searchsubmit(
			@RequestParam(value="sNAME", required=true) String name){
		
		ModelAndView view = new ModelAndView();
		List<Friends> list;
					
		list = jiwonRepository.findByName(name);		
		view.setViewName("search");
		String user_id;		
		System.out.println("이름 : "+ name);
		
		if (list.size() == 0 )
		{
			view.addObject("search", "등록되지 않았습니다.");
			System.out.println("아이디 : 없음");
		}
		else
		{	
			user_id = list.get(0).getUser_id();
			view.addObject("search", user_id + "입니다.");
			System.out.println("아이디 : "+ user_id);
		}

		view.addObject("name", name+"의 아이디는");
		return view;
	}
	

	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public ModelAndView getsubmit(
			@RequestParam(value="gID", defaultValue="입력하지않았습니다.") String id,  
			@RequestParam(value="gPW", defaultValue="입력하지않았습니다.") String pwd){

		
		System.out.println("GET 방식전송 : "+ id + pwd);


		ModelAndView view = new ModelAndView();
		view.setViewName("get");
		view.addObject("id", id);
		view.addObject("pwd", pwd);
		
		return view;
	}

	@RequestMapping(value="/post", method=RequestMethod.POST)
	public ModelAndView postsubmit(
			@RequestParam(value="pID", defaultValue="입력하지않았습니다.") String id,  
			@RequestParam(value="pPW", defaultValue="입력하지않았습니다.") String pwd){

		
		System.out.println("POST 방식전송 : "+ id + pwd);

		ModelAndView view = new ModelAndView();
		view.setViewName("post");
		view.addObject("id", id);
		view.addObject("pwd", pwd);
		
		return view;
	}

}
