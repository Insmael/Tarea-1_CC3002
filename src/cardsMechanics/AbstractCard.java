package cardsMechanics;

/**
 * the abstract class of the implementation of the Card interface, it compiles various 
 * methods common of the specific card types.
 * 
 * @author T Ismael Verdugo
 * @see Card
 * @see Assassin
 * @see Druid
 * @see Healer
 * @see Hunter
 * @see Knight
 * @see Mage
 * @see Paladin
 * @see Shaman
 * @see Warlock
 */
public abstract class AbstractCard implements Card {
	private String name;
	private int lifePoints;
	private int attackPoints;
	private int damageCounter;
	protected String type;

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getLifePoints() {
		return lifePoints;
	}

	@Override
	public int getAttackPoints() {
		return attackPoints;
	}

	@Override
	public int getDamageCounter() {
		return damageCounter;
	}

	@Override
	public String getType() {
		return type;
	}

	/**
	 * Constructor to make cards, it receives the name of the 
	 * card, and the rest of the fields are initialized with the
	 * method setCardDefault {@link #setCardDefault()}.
	 * 
	 * @param name the name of the card
	 */
	public AbstractCard(String name) {
		this.name = name;
		setCardDefault();
	}

	/**
	 * method that set the fields of the card to their defaults
	 * values. life points equal to 100, attack points equal to 12,
	 * and damage counter equal to 0.
	 */
	public void setCardDefault() {
		lifePoints = 100;
		attackPoints = 12;
		damageCounter = 0;
	}

	@Override
	public void setCard(int lifePoints, int attackPoints, int damageCounter) {
		this.lifePoints = lifePoints;
		this.attackPoints = attackPoints;
		this.damageCounter = damageCounter;
	}

	@Override
	public boolean isOutOfCombat() {
		return damageCounter >= lifePoints;
	}

	/* Calls the method defaultAction over the assassin type of Card.
	 * It may be override by the implementation of some card types.
	 * 
	 * @see cardsMechanics.Card#actOnAssasin(cardsMechanics.Assassin)
	 */
	@Override
	public void actOnAssasin(Assassin assassin) {
		defaultAction(assassin);
	}

	@Override
	public void actOnDruid(Druid druid) {
		defaultAction(druid);
	}

	@Override
	public void actOnHealer(Healer healer) {
		defaultAction(healer);
	}

	@Override
	public void actOnHunter(Hunter hunter) {
		defaultAction(hunter);
	}

	@Override
	public void actOnKnight(Knight knight) {
		defaultAction(knight);
	}

	@Override
	public void actOnMage(Mage mage) {
		defaultAction(mage);
	}

	@Override
	public void actOnPaladin(Paladin paladin) {
		defaultAction(paladin);
	}

	@Override
	public void actOnShaman(Shaman shaman) {
		defaultAction(shaman);
	}

	@Override
	public void actOnWarlock(Warlock warlock) {
		defaultAction(warlock);
	}

	@Override
	public void actOn(Card card) {
		if (!isOutOfCombat() && !this.equals(card))
			card.actOnMe(this);
	}

	/**
	 * Set the default action of this card made over the parameter card.
	 * The default behavior of the method is to call the attackOn  method, 
	 * with an effectiveness of one but some types of card override it, so 
	 * it changes from type to type (of card).
	 * It's usage is to set a default action from an implementation of a card 
	 * thus all calls of actOn(), and explicitly, in actOn-CardType() use this 
	 * method to perform a default behavior.
	 * It's meant to be used with a combination of the attackOn(), healOn(), 
	 * empowerOn() and depowerOn() methods
	 * 
	 * @param card the card on which the action is resolve
	 * 
	 * @see #attackOn(Card, double)
	 * @see #healOn(Card, double)
	 * @see #empowerOn(Card, double)
	 * @see #depowerOn(Card, double)
	 */
	public void defaultAction(Card card) {
		attackOn(card, 1);
	}

	
	/**
	 * makes the damage counter of the parameter card go up in a value equal to the 
	 * attack points of this card by the multiplier effectiveness. the total value
	 * to be added to the damage counter is done by calling the damageBy method 
	 * {@link Card#damagedBy(double amount)} on the objective parameter card.
	 * <p>
	 * the maximum value to the damage counter is equal to the life points of the card.
	 * 
	 * @param card the card on which the attack is resolve
	 * @param Effectiveness the multiplier of the attack action
	 */
	public void attackOn(Card card, double Effectiveness) {
		card.damagedBy(attackPoints * Effectiveness);
	}

	/**
	 * makes the damage counter of the parameter card go down in a value equal to the 
	 * attack points of this card by the multiplier effectiveness. the total value
	 * to be rested to the damage counter is done by calling the healedBy method 
	 * {@link Card#healedBy(double amount)} on the objective parameter card.
	 * <p>
	 * the minimum value to the damage counter is equal to the 0.
	 * 
	 * @param card the card on which the heal is resolve
	 * @param Effectiveness the multiplier of the attack action
	 */
	public void healOn(Card card, double Effectiveness) {
		card.healedBy(attackPoints * Effectiveness);
	}
	
	/**
	 * makes the attack points of the parameter card go up in a value equal to the 
	 * attack points of this card by the multiplier effectiveness. the total value
	 * to be added to the attack points is done by calling the empoweredBy method 
	 * {@link Card#empoweredBy(double amount)} on the objective parameter card.
	 * <p>
	 * there is no maximum value to the attack points.
	 * 
	 * @param card the card on which the empower is resolve
	 * @param Effectiveness the multiplier of the attack action
	 */
	public void empowerOn(Card card, double Effectiveness) {
		card.empoweredBy(attackPoints * Effectiveness);
	}

	/**
	 * makes the attack points of the parameter card go down in a value equal to the 
	 * attack points of this card by the multiplier effectiveness. the total value
	 * to be rested to the attack points is done by calling the depoweredBy method 
	 * {@link Card#depoweredBy(double amount)} on the objective parameter card.
	 * <p>
	 * the minimum value to the attack points is equal to the 0.
	 * 
	 * @param card the card on which the empower is resolve
	 * @param Effectiveness the multiplier of the attack action
	 */
	public void depowerOn(Card card, double Effectiveness) {
		card.depoweredBy(attackPoints * Effectiveness);
	}

	@Override
	public void damagedBy(double d) {
		damageCounter += d;
		damageCounter = damageCounter > lifePoints ? lifePoints : damageCounter;
	}

	@Override
	public void healedBy(double d) {
		if (damageCounter == lifePoints) {}
		else {
			damageCounter -= d;
			damageCounter = damageCounter < 0 ? 0 : damageCounter;
		}
	}

	@Override
	public void empoweredBy(double d) {
		attackPoints += d;
	}

	@Override
	public void depoweredBy(double d) {
		attackPoints -= d;
		attackPoints = attackPoints < 0 ? 0 : attackPoints;
	}
}
