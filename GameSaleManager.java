package campFourthDay;

public class GameSaleManager implements GameSale {
	private CampaignService campaignService;
	
	public  GameSaleManager(CampaignService campaignService) {
		this.campaignService = campaignService;
	}

	@Override
	public void display(Game game, User user, Campaign campaign) {
		campaignService.applyToCampaign(campaign);
		System.out.println(game.getGameName() + " oyunu " + user.getFirstName() + " isimli kullaniciya"
				+ " " + campaign.getCampaignName() + " kampanyasi kullanilarak" + " " + campaign.getCampaignAmount(game)
				+ "tl'ye satildi.");
		
	}

	@Override
	public void update(Game game, User user, Campaign campaign) {
		System.out.println("Oyun basariyla güncellendi.");
		
	}

	@Override
	public void delete(Game game, User user, Campaign campaign) {
		System.out.println("Oyun basariyla silindi.");
		
	}

}
