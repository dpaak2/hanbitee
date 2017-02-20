package domain;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data public class PatientBean{

	@Getter@Setter 
	private String patID,nurID,docID,patPass,patName,patGen,patJumin,patAddr,patPHone,patEmail,patJob;
}