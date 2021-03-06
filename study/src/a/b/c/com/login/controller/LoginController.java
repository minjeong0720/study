package a.b.c.com.login.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.common.K_Session;
import a.b.c.com.login.service.LoginService;
import a.b.c.com.member.vo.MemberVO;


@Controller
public class LoginController {
	Logger logger = Logger.getLogger(LoginController.class);
	
	private LoginService loginSerivce;

	//생성자 오토와이어드
	@Autowired(required=false)
	public LoginController(LoginService loginSerivce) {
		this.loginSerivce = loginSerivce;
	}
	
	//로그인 입력 폼
	@GetMapping("loginForm")
	public String loginForm() {
		logger.info("LoginController loginForm() 함수 진입 >>> : ");
		return "member/loginForm";
	}
	
	//로그인
	@PostMapping("login")
	public String login(HttpServletRequest req, MemberVO mvo, Model model) {
		logger.info("LoginController login() 함수 진입 >>> : ");
		
		
		List<MemberVO> listLogin = loginSerivce.loginCheck(mvo);
		mvo.toString();
		logger.info("LoginController login listLogin.size() >>> : " + listLogin.size());
		
		if(listLogin.size() == 1) {
			K_Session ks = K_Session.getInstance();	
			String kID = ks.getSession(req);
			
			if(kID != null && kID.equals(listLogin.get(0).getMid())) {
				logger.info("LoginController login >>> : 로그인 중 >>> : 다른 페이지로 이동하기 >>> : " + kID);
				model.addAttribute("listLogin", listLogin);
				return "main/mainPage";
			}else {
				ks.setSession(req, mvo.getMid());
				logger.info("LoginController login >>> : 세션부여하기 >>> : " + mvo.getMid());
				
				model.addAttribute("listLogin", listLogin);
				return "member/login";
			}
		}
		return "member/loginForm";		
	}
	
	//로그아웃
	@GetMapping("logout")
	public String logout(HttpServletRequest req, MemberVO mvo, Model model) {
		logger.info("LoginController logout() 함수 진입 >>> : ");
		K_Session ks = K_Session.getInstance();
		ks.killSession(req);
		
		logger.info("로그아웃이 완료되었습니다!");
		
		return "/";
	}
	
}
