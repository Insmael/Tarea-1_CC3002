package cardsMechanics;

/**
 * A class that represent the Shaman type of card.
 * 
 * @author T Ismael Verdugo
 * @see Card
 * @see AbstractCard
 */
public class Shaman extends AbstractCard implements Card{

	public Shaman(String name) {
		super(name);
		type="Shaman";
	}

	@Override
	public void defaultAction(Card card) {
		depowerOn(card, (1.0/3) );
		attackOn(card, (1.0/3) );
	}

	@Override
	public void actOnDruid(Druid druid) {
		depowerOn(druid, (2.0/3) );
		attackOn(druid, (2.0/3) );
	}

	@Override
	public void actOnWarlock(Warlock warlock) {
		depowerOn(warlock, (2.0/3) );
		attackOn(warlock, (2.0/3) );
	}
	
	@Override
	public void actOnMe(Card card) {
		card.actOnShaman(this);
	}
}
