package domain;

public class MemberBean {
	protected String id, name,ssn,email,phone,password,profileImg,rank;

	    public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
		public void setName(String name){
	    	this.name=name;
	    }
	    public String getName(){
	    	return name;
	    }
	    public void setSsn(String ssn){
	    	this.ssn=ssn;
	    }
	    public String getSsn(){
	    	return ssn;
	    }
	    public void setPassword(String password){
	    	this.password=password;
	    }
	    public String getPassword(){
	    	return password;
	    }
	    public void setProfileImg(String profileImg){
	    	this.profileImg=profileImg;
	    }
	    public String getProfileImg(){
	    	return profileImg;
	    }

		public String getId() {
			return id;
		}
		public void setId (String id) {
			this.id = id;
		}
		public String calcGender(String ssn) {
			char ch = this.ssn.charAt(7);
			String gender = "";
			switch (ch) {
			case '1':
			case '3':
				gender = "남자";
				break;
			case '2':
			case '4':
				gender = "여자";
				break;
			case '5':
			case '6':
				gender = "외국인";
				break;
			}
			return gender;
		}

	    public void setEmail(String email){
	    	this.email=email;
	    }
	    public String getEmail(){
	    	return email;
	    }

	    public void setPhone(String phone){
	    	this.phone=phone;
	    }
	    public String getPhone(){
	    	return phone;
	    }
		@Override
		public String toString() {
			return String.format("%s%s%s [****] %s%s" ,id,name,email,phone,rank);
		}


	}

