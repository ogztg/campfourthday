package campFourthDay;

public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(1);
		user.setFirstName("oguz");
		user.setLastName("Tug");
		user.setDateOfBirth(1991);
		user.setNationalityId("45896523632");
		
		Campaign campaign = new Campaign();
		campaign.setId(454);
		campaign.setCampaignName("Bahar firsati");
		campaign.setCampaignAmount(75);
		
		Game game = new Game();
		game.setId(12);
		game.setGameName("Call Of Duty");
		game.setGameSale(789);
		
		UserManager userManager = new UserManager(new UserAuthenticationManager());
		userManager.add(user);
		
		System.out.println("*******************************************");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.applyToCampaign(campaign);
		
		System.out.println("******************************************");
		
		GameSaleManager gameSaleManager = new GameSaleManager(new CampaignManager());
		gameSaleManager.display(game, user, campaign);
		

	}

}
