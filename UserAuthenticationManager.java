package campFourthDay;

public class UserAuthenticationManager implements UserAuthentication {

	@Override
	public boolean authentication(User user) {
		if(user.getDateOfBirth()==1991 && user.getFirstName()=="oguz" && user.getLastName()=="Tug" && user.getNationalityId()=="45896523632") {
			return true;
		}else {
			return false;
		}
		
	}

}
