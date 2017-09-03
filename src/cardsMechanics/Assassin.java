package cardsMechanics;

/**
 * A class that represent the Assassin type of card.
 * 
 * @author T Ismael Verdugo
 * @see Card
 * @see AbstractCard
 */
public class Assassin extends AbstractCard implements Card{

	

	public Assassin(String name) {
		super(name);
		type="Assassin";
	}

	@Override
	public void actOnHealer(Healer healer) {
		attackOn(healer, 2);
	}

	@Override
	public void actOnKnight(Knight knight) {
		attackOn(knight, 0.5);
	}
	
	@Override
	public void actOnMage(Mage mage) {
		attackOn(mage, 2);
	}

	@Override
	public void actOnMe(Card card) {
		card.actOnAssasin(this);
	}
}
