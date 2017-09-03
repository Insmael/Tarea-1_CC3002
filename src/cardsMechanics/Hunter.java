package cardsMechanics;

/**
 * A class that represent the Hunter type of card.
 * 
 * @author T Ismael Verdugo
 * @see Card
 * @see AbstractCard
 */
public class Hunter extends AbstractCard implements Card{

	public Hunter(String name) {
		super(name);
		type="Hunter";
	}

	@Override
	public void actOnKnight(Knight knight) {
		attackOn(knight, 2);
	}
	
	@Override
	public void actOnShaman(Shaman shaman) {
		attackOn(shaman, 2);
	}

	@Override
	public void actOnMe(Card card) {
		card.actOnHunter(this);
	}
}
