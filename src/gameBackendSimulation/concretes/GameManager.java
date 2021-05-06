package gameBackendSimulation.concretes;

import gameBackendSimulation.abstracts.GameService;
import gameBackendSimulation.entities.Campaign;
import gameBackendSimulation.entities.Game;
import gameBackendSimulation.entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void add(Game entity) {
		System.out.println("Oyun eklendi. " + entity.getGameName() + " - " + entity.getGamePrice());
	}

	@Override
	public void update(Game entity) {
		System.out.println("Oyun güncellendi " + entity.getGameName());
	}

	@Override
	public void delete(Game entity) {
		System.out.println("Oyun silindi. " + entity.getGameName());

	}

	@Override
	public void sell(Game game, Gamer gamer) {
		System.out.println(game.getGameName() + " isimli oyun " + gamer.getFirstName() + gamer.getLastName() + " isimli oyuncuya " + game.getGamePrice() + " TL'ye satýldý.");
	}

	@Override
	public void sellWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		
		double newPrice = game.getGamePrice() - campaign.getDiscountAmount();
		System.out.println(game.getGameName() + " isimli oyun " + gamer.getFirstName() + gamer.getLastName() + " isimli oyuncuya " + newPrice + " TL'ye indirimli olarak satýldý.");

	}

}
