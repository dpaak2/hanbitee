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
	public PatientBean login(PatientBean patient) throws Exception{
/*	 if(patient.getPatPass().equals(temp.getPassword())){
		 flag=true;
	 }*/
		return this.findById(patient.getPatID());
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
	public PatientBean logout() throws Exception {
	
		return new PatientBean();
	}

}
