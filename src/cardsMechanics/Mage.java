package cardsMechanics;

/**
 * A class that represent the Mage type of card.
 * 
 * @author T Ismael Verdugo
 * @see Card
 * @see AbstractCard
 */
public class Mage extends AbstractCard {

	public Mage(String name) {
		super(name);
		type="Mage";
	}

	@Override
	public void actOnHunter(Hunter hunter) {
		attackOn(hunter, 2);
	}

	@Override
	public void actOnPaladin(Paladin paladin) {
		attackOn(paladin, 2);
	}
	
	@Override
	public void actOnMe(Card card) {
		card.actOnMage(this);
	}
}
