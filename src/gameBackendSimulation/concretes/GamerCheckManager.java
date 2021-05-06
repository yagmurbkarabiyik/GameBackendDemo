package gameBackendSimulation.concretes;

import gameBackendSimulation.abstracts.GamerCheckService;
import gameBackendSimulation.entities.Gamer;

public class GamerCheckManager implements GamerCheckService{

	@Override
	public boolean checkIfGamerReal(Gamer gamer) {
		
		if(!gamer.getNationalityId().isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	

	
}
