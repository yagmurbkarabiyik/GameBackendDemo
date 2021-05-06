package gameBackendSimulation;

import gameBackendSimulation.concretes.CampaignManager;
import gameBackendSimulation.concretes.GameManager;
import gameBackendSimulation.concretes.GamerCheckManager;
import gameBackendSimulation.concretes.GamerManager;
import gameBackendSimulation.entities.Campaign;
import gameBackendSimulation.entities.Game;
import gameBackendSimulation.entities.Gamer;

public class Main {

	public static void main(String[] args) {

		Gamer gamer = new Gamer();
		gamer.setFirstName("Yaðmur");
        gamer.setLastName(" Karabýyýk");
        gamer.setId(1);
        gamer.setBirthYear(2001);
        gamer.setNationalityId("95232");
        
        GamerManager gamerManager = new GamerManager(new GamerCheckManager());
        gamerManager.add(gamer);
        
        System.out.println("*******************************");
        
        Campaign campaign = new Campaign();
        campaign.setId(1);
        campaign.setCampaignName("Bahar indirimi");
        campaign.setDiscountAmount(25);

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);
        
	
        System.out.println("********************************");
        
        Game game = new Game();
        game.setId(1);
        game.setGameName("Payday");
        game.setGamePrice(95);
        
        GameManager gameManager = new GameManager();
        gameManager.add(game);
        gameManager.sell(game, gamer);
        gameManager.sellWithCampaign(game, gamer, campaign);
        
        
        
	}
	

}
