package cardsMechanics;

/**
 * A class that represent the Paladin type of card.
 * 
 * @author T Ismael Verdugo
 * @see Card
 * @see AbstractCard
 */
public class Paladin extends AbstractCard implements Card {

	public Paladin(String name) {
		super(name);
		type="Paladin";
	}

	@Override
	public void defaultAction(Card card) {
		empowerOn(card, (1.0/3) );
		healOn(card, (1.0/3) );
	}

	@Override
	public void actOnDruid(Druid druid) {
		empowerOn(druid, (2.0/3) );
		healOn(druid, (2.0/3) );
	}
	
	@Override
	public void actOnHealer(Healer healer) {
		empowerOn(healer, (2.0/3) );
		healOn(healer, (2.0/3) );
	}
	
	@Override
	public void actOnMe(Card card) {
		card.actOnPaladin(this);
	}
}
