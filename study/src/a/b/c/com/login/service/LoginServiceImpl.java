package a.b.c.com.login.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.login.dao.LoginDAO;
import a.b.c.com.member.vo.MemberVO;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
	Logger logger = Logger.getLogger(LoginServiceImpl.class);
	
	private LoginDAO loginDAO;
	
	@Autowired(required=false)
	public LoginServiceImpl(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}

	@Override
	public List<MemberVO> loginCheck(MemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("LoginServiceImpl loginCheck() 함수 진입 >>> : ");
		
		return loginDAO.loginCheck(mvo);
	}


}
