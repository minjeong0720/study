package a.b.c.com.member.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.member.service.MemberService;
import a.b.c.com.member.vo.MemberVO;

@Controller
public class MemberController {
	
	Logger logger = Logger.getLogger(MemberController.class);

	private MemberService memberservice;
	
	//생성자 오토와이어드
	@Autowired(required=false)
	public MemberController(MemberService memberservice) {
		this.memberservice = memberservice;
	}
	
	//회원가입 입력 폼
	@GetMapping("memForm")
	public String memForm() {
		logger.info("MemberController memForm() 함수 진입 >>> : ");
		return "member/MemForm";
	}
	
	@RequestMapping(value="registerForm", method=RequestMethod.GET)
	public String registerForm(Model Model) {
		logger.info("MemberController registerForm 함수 진입 >>> : ");
		
		return "member/register";
	}
	
	@RequestMapping(value="memInsert", method=RequestMethod.GET)
	public String memberInsert(MemberVO mvo , Model Model) {
		System.out.println("dddd");

		logger.info("MemberController register 함수 진입 >>> :");
		logger.info("MemberController mvo.getMid() >>> : " + mvo.getMid());
		logger.info("MemberController mvo.getMpw() >>> : " + mvo.getMpw());
		logger.info("MemberController mvo.getMname() >>> : " + mvo.getMname());
		
		
		
		int insertCnt = memberservice.memberInsert(mvo);
		if(insertCnt > 0) {
				logger.info("MemberController register nCnt >>> : " + insertCnt);
				
				
				return "member/register";
		}
		
		return "member/registerForm";
	}
	
	
	@GetMapping("/head")
	public String head() {
		return "fragment/head";
	}
	
	@GetMapping("/footer")
	public String footer() {
		return "fragment/footer";
	}
	
	@GetMapping("/sidebar")
	public String sidebar() {
		return "fragment/sidebar";
	}
	
	@GetMapping("/content")
	public String content() {
		return "fragment/content";
	}
	
	@GetMapping("/loginForm")
	public String loginForm() {
		return "member/loginForm";
	}
	
	@GetMapping("/register")
	public String register() {
		return "member/register";
	}
}
