package cardsMechanics;

/**
 * A class that represent the Druid type of card.
 * 
 * @author T Ismael Verdugo
 * @see Card
 * @see AbstractCard
 */
public class Druid extends AbstractCard implements Card{

	public Druid(String name) {
		super(name);
		type="Druid";
	}

	@Override
	public void defaultAction(Card card) {
		empowerOn(card, 1);
		attackOn(card, 0.5);
	}
	
	@Override
	public void actOnAssasin(Assassin card) {
		empowerOn(card, 1);
	}

	@Override
	public void actOnHunter(Hunter hunter) {
		attackOn(hunter, 0.5);
	}
	
	@Override
	public void actOnMe(Card card) {
		card.actOnDruid(this);
	}
}
