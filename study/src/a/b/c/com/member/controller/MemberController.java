package a.b.c.com.member.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import a.b.c.com.member.service.MemberService;
import a.b.c.com.member.vo.MemberVO;

/* <상대경로>
1.   / : 최상위 경로
2.  ./ : 현재 경로
3. ../ : 상위 디렉토리
*/

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
	
	//회원가입 입력 폼
	@RequestMapping(value="register", method=RequestMethod.GET)
	public String register(Model Model) {
		logger.info("MemberController register 함수 진입 >>> : ");
		
		return "member/register";
	}
	
	@RequestMapping(value="memberInsert", method=RequestMethod.POST)
	public String memberInsert(MemberVO mvo , Model Model) {
		System.out.println("MemberController memberInsert() 진입 >>> : ");

		logger.info("MemberController mvo.getMid() >>> : " + mvo.getMid());
		logger.info("MemberController mvo.getMpw() >>> : " + mvo.getMpw());
		logger.info("MemberController mvo.getMname() >>> : " + mvo.getMname());
		
		int insertCnt = memberservice.memberInsert(mvo);
		if(insertCnt > 0) {
				logger.info("MemberController memberInsert insertCnt >>> : " + insertCnt);
				
				return "member/loginForm";
		}
		
		return "member/loginForm";
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
	/*
	@GetMapping("/loginForm")
	public String loginForm() {
		return "member/loginForm";
	}
	
	@GetMapping("/register")
	public String register() {
		return "member/register";
	}*/
}
