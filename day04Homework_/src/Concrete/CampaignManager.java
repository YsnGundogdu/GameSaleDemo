package Concrete;

import Abstract.CampaignService;
import Entity.Campaign;

public class CampaignManager implements CampaignService {
    @Override
    public void add(Campaign campaign) {
        System.out.println(campaign.getCampaignCode() + " : added.");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println(campaign.getCampaignCode() + " : deleted.");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println(campaign.getCampaignCode() + " : updated.");
    }
}
