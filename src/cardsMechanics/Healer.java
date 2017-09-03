package cardsMechanics;

/**
 * A class that represent the Healer type of card.
 * 
 * @author T Ismael Verdugo
 * @see Card
 * @see AbstractCard
 */
public class Healer extends AbstractCard implements Card{

	public Healer(String name) {
		super(name);
		type="Healer";
	}

	@Override
	public void defaultAction(Card card) {
		healOn(card, 0.5);
	}

	@Override
	public void actOnWarlock(Warlock warlock) {
		attackOn(warlock, 1);
	}
	
	@Override
	public void actOnMe(Card card) {
		card.actOnHealer(this);
	}
}
