package serviceImpl;

import domain.PatientBean;
import service.PatientService;
import dao.PatientDAO;
import daoImpl.PatientDAOImpl;

public class PatientServiceImpl implements PatientService{
	private static PatientServiceImpl instance= new PatientServiceImpl(); //sigleton pattern
	private PatientBean session;
	private PatientDAO dao;
	public static PatientServiceImpl getInstance() {
		return instance;
	}
	public PatientServiceImpl() {
		dao=PatientDAOImpl.getInstance();
		session=new PatientBean();
	}

	@Override
	public PatientBean findById(String id) throws Exception {
		return dao.selectById(id);
	}

	@Override
	public boolean login(PatientBean patient) throws Exception{
		boolean check=false;
		
		PatientBean pat= new PatientBean();
		pat= findById(patient.getPatID());
		if(pat.getPatPass().equals(patient.getPatPass())){
			check=true;
			session=pat;
		}else{}
		return check;
	}

	@Override
	public int change(PatientBean patient) throws Exception{
	return dao.update(patient);
		
	}

	@Override
	public int remove(PatientBean patient) throws Exception{
	return dao.delete(patient);
	}

	@Override
	public int join(PatientBean patient) throws Exception{
		return dao.insert(patient);
	}

	@Override
	public boolean logout() throws Exception {
		session=null;
		return true;
	}

}
