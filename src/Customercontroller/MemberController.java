package Customercontroller;

import service.MemberService;
import serviceImpl.MemberServiceImpl;;
public class MemberController {
	private MemberService service;
	public MemberController(){
		service=new MemberServiceImpl();
	}

}
