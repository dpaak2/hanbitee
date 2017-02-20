package domain;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data public class AdminBean {
	@Getter@Setter private String admID,admPass,admName,admGen,admPhone,admEmail,admPermission;
}
