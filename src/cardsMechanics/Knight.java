package cardsMechanics;

/**
 * A class that represent the Knight type of card.
 * 
 * @author T Ismael Verdugo
 * @see Card
 * @see AbstractCard
 */
public class Knight extends AbstractCard implements Card{

	public Knight(String name) {
		super(name);
		type="Knight";
	}

	@Override
	public void actOnPaladin(Paladin paladin) {
		attackOn(paladin, 0.5);
	}

	@Override
	public void actOnMe(Card card) {
		card.actOnKnight(this);	
	}
}
