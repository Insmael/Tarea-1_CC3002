package cardsMechanics;

/**
 * A class that represent the Warlock type of card.
 * 
 * @author T Ismael Verdugo
 * @see Card
 * @see AbstractCard
 */
public class Warlock extends AbstractCard implements Card{
	public Warlock(String name) {
		super(name);
		type="Warlock";
	}

	@Override
	public void actOnAssasin(Assassin card) {
		attackOn(card, 2);
	}

	@Override
	public void actOnMage(Mage mage) {
		attackOn(mage, 0.5);
	}

	@Override
	public void actOnMe(Card card) {
		card.actOnWarlock(this);
	}
}

