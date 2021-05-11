package campFourthDay;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Uyguland�: " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi: " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya G�ncellendi: " + campaign.getCampaignName());
		
	}

	@Override
	public void applyToCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasi kullanildi.");
		
	}
	

}
