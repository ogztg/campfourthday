package campFourthDay;

public class Campaign {
	private int id;
	private String campaignName;
	private double campaignAmount;
	
	public Campaign() {
		
	}

	public Campaign(int id, String campaignName, double campaignAmount) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.campaignAmount = campaignAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getCampaignAmount(Game game) {
		return game.getGameSale() - this.campaignAmount;
	}
	private double campaignAmount() {
		return 75;
	}

	public void setCampaignAmount(double campaignAmount) {
		this.campaignAmount = campaignAmount;
	}
}
