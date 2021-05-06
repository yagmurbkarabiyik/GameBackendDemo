package gameBackendSimulation.concretes;

import gameBackendSimulation.abstracts.GamerCheckService;
import gameBackendSimulation.abstracts.GamerService;
import gameBackendSimulation.entities.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
		
	}
	
	@Override
	public void add(Gamer entity) {
		if(gamerCheckService.checkIfGamerReal(entity)) {
			System.out.println("e-devlet doðrulamasý baþarýlý. Oyuncu sisteme eklendi. " + entity.getFirstName()  + entity.getLastName());
		}
		else {
			System.out.println("Oyuncu eklenemedi. ");
		}
	}

	@Override
	public void update(Gamer entity) {
		System.out.println("Oyuncu güncellendi. " + entity.getFirstName() + entity.getLastName());
	}

	@Override
	public void delete(Gamer entity) {
		System.out.println("Oyuncu silindi. " + entity.getFirstName() + entity.getLastName());

	}

	
}
