package campFourthDay;

public class UserManager implements UserService {
	private UserAuthentication userAuthentication;
	
	public  UserManager(UserAuthentication userAuthentication) {
		this.userAuthentication = userAuthentication;
	}

	@Override
	public void add(User user) {
		if(userAuthentication.authentication(user)== true) {
			System.out.println("Oyuncu dogrulama islemi basarili: " + user.getFirstName() + " " + user.getLastName() + " sisteme basariyla kaydedildi.");
			
		}else {
			System.out.println("Dogrulama islemi basarisiz.");
		}
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + "isimli kullanýcý sistemden silindi.");
		
		
	}

	@Override
	public void update(User user) {
		System.out.println("Oyuncu bilgileri guncellendi: " + user.getNationalityId());
		
	}

}
