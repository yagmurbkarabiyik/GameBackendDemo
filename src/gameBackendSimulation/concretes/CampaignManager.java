package gameBackendSimulation.concretes;

import gameBackendSimulation.abstracts.CampaignService;
import gameBackendSimulation.entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign entity) {
		
		System.out.println("Kampanya sisteme eklendi. " + entity.getCampaignName()); 
	}

	@Override
	public void update(Campaign entity) {
		System.out.println("Kampanya güncellendi . " + entity.getCampaignName()); 

	}

	@Override
	public void delete(Campaign entity) {
		System.out.println("Kampanya silindi. " + entity.getCampaignName()); 

	}

}
