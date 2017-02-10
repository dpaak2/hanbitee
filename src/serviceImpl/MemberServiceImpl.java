package serviceImpl;

import domain.MemberBean;
import service.MemberService;
import dao.MemberDAO;
import dao.MemberDAOImpl;

public class MemberServiceImpl implements MemberService{
	private static MemberServiceImpl instance= new MemberServiceImpl(); //sigleton pattern
	
	public static MemberServiceImpl getInstance() {
		return instance;
	}

	@Override
	public MemberBean findById(String id) throws Exception{
		return MemberDAOImpl.getInstance().selectById(id);
	}

	@Override
	public boolean login(MemberBean pw) throws Exception{
		
		return false;
	}

	@Override
	public void change(MemberBean member) throws Exception{
	
		
	}

	@Override
	public void remove(MemberBean member) throws Exception{
	
	}

	@Override
	public void join(MemberBean member) throws Exception{
		MemberDAOImpl.getInstance().insert(member);
	}

}
