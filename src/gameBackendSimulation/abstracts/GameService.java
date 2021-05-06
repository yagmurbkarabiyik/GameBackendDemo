package gameBackendSimulation.abstracts;

import gameBackendSimulation.entities.Campaign;
import gameBackendSimulation.entities.Game;
import gameBackendSimulation.entities.Gamer;

public interface GameService extends BaseService<Game>{
	
	public void sell (Game game, Gamer gamer);
	
	public void sellWithCampaign (Game game, Gamer gamer, Campaign campaign);
	

}
