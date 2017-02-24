package serviceImpl;

import service.DoctorService;

public class DoctorServiceImpl implements DoctorService{
	public static DoctorServiceImpl instance=new DoctorServiceImpl();
	public static DoctorServiceImpl getInstance(){return instance;}
}
