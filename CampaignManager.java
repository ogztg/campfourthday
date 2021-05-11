package campFourthDay;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya Uygulandý: " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Kampanya Silindi: " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Kampanya Güncellendi: " + campaign.getCampaignName());
		
	}

	@Override
	public void applyToCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + " kampanyasi kullanildi.");
		
	}
	

}
