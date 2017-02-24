package serviceImpl;

import domain.PatientBean;
import service.PatientService;
import dao.PatientDAO;
import daoImpl.PatientDAOImpl;

public class PatientServiceImpl implements PatientService{
	private static PatientServiceImpl instance= new PatientServiceImpl(); //sigleton pattern
	private PatientBean session;
	private PatientDAO dao;
	private PatientBean bean;
	public PatientBean getSession(){
		return session;
	}
	public static PatientServiceImpl getInstance() {
		return instance;
	}
	public PatientServiceImpl() {
		dao=PatientDAOImpl.getInstance();
		session=new PatientBean();
	}

	@Override
	public PatientBean findById(String id) throws Exception {
		session=new PatientBean();
		return dao.selectById(id);
	}

	@Override
	public PatientBean login(PatientBean patient) throws Exception{
/*	 if(patient.getPatPass().equals(temp.getPassword())){
		 flag=true;
	 }*/
		session=this.findById(patient.getPatID());
		return session;
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
	@Override
	public String getBirth(String patJumin) {
		String birth=""; /*930701*/
		String yy=patJumin.substring(0,2);
		String mm=patJumin.substring(2,4);
		String dd=patJumin.substring(4,6);
		birth= yy+"년"+mm+"월"+dd+"일";
		return birth;
	}
	@Override
	public String getAge(String patJumin) {
		int age=0;
		age= 117-Integer.parseInt(patJumin.substring(0,2));
		return String.valueOf(age);
	}

}
