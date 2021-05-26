package Entity;

public class Campaign {

    private int id;
    private String campaignCode;
    private int campaignPercent;

    public Campaign(){

    }

    public Campaign(int id, String campaignCode, int campaignPercent) {
        this.id = id;
        this.campaignCode = campaignCode;
        this.campaignPercent = campaignPercent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignCode() {
        return campaignCode;
    }

    public void setCampaignCode(String campaignCode) {
        this.campaignCode = campaignCode;
    }

    public int getCampaignPercent() {
        return campaignPercent;
    }

    public void setCampaignPercent(int campaignPercent) {
        this.campaignPercent = campaignPercent;
    }
}
