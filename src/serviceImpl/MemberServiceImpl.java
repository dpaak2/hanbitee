package serviceImpl;

import domain.MemberBean;
import service.MemberService;
import dao.MemberDAO;
import daoImpl.MemberDAOImpl;

public class MemberServiceImpl implements MemberService{
	private static MemberServiceImpl instance= new MemberServiceImpl(); //sigleton pattern
	private MemberBean session;
	public static MemberServiceImpl getInstance() {
		return instance;
	}
	public MemberServiceImpl() {
		session=new MemberBean();
	}

	@Override
	public MemberBean findById(String id) throws Exception{
		return MemberDAOImpl.getInstance().selectById(id);
	}

	@Override
	public boolean login(MemberBean member) throws Exception{
		boolean check=false;
		MemberBean mem= new MemberBean();
		mem= findById(member.getId());
		if(mem.getPassword().equals(member.getPassword())){
			check=true;
			session=mem;
		}
		return check;
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

	@Override
	public boolean logout() throws Exception {
		session=null;
		return true;
	}

}
