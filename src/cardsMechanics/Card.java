package cardsMechanics;

/**
 * The interface of a Card, it defines the expected behavior of a Card.
 * 
 * @author T Ismael Verdugo
 */
public interface Card {
	
	/**
	 * Return a String object that is the corresponding name of the card.
	 * 
	 * @return the name of the card
	 */
	public String getName();
	
	/**
	 * Return an integer object that is the amount of health of the card.
	 * 
	 * @return the life points of the card
	 */
	public int getLifePoints();
	
	/**
	 * Return an integer object that is the attack points of the card.
	 * 
	 * @return the attack points of the card
	 */
	public int getAttackPoints();
	
	/**
	 * Return an integer object that is the amount of damage of the card.
	 * 
	 * @return the damage counter
	 */
	public int getDamageCounter();
	
	/**
	 * Return a String object that is the name of the type of the card.
	 * 
	 * @return the type of the card
	 */
	public String getType();
	
	/**
	 * Makes this card interact on the card passed as parameter.
	 * <p>
	 * this method is used to make a dispatch to the method actOnMe of the other card.
	 * 
	 * @param card	the card in which the action resolves
	 */
	public void actOn(Card card);
	
	/**
	 * makes this card be the object on which the card passed as parameter interact.
	 * <p>
	 * this method is used to derivate the actOn method to the method of the card 
	 * passed as a parameter that act over an specific type of card.
	 * <p>
	 * when this card is out of combat, the actions made by this card are ignored or do nothing
	 * 
	 * @param card the card that makes the action over this object
	 * @see #actOnAssasin(Assassin)
	 * @see #actOnDruid(Druid)
	 * @see #actOnHealer(Healer)
	 * @see #actOnHunter(Hunter)
	 * @see #actOnKnight(Knight)
	 * @see #actOnMage(Mage)
	 * @see #actOnPaladin(Paladin)
	 * @see #actOnShaman(Shaman)
	 * @see #actOnWarlock(Warlock)
	 */
	public void actOnMe(Card card);
	
	/**
	 * Return a boolean representation of the ability of this card to perform actions.
	 * is true when it cannot commit more actions. it becomes true when the damage counter
	 * of the card is equal to the life points of the card.
	 * 
	 * @return a boolean that says if this card cannot perform actions
	 */
	public boolean isOutOfCombat();

	/**
	 * makes this card act on the assassin type of card.
	 * 
	 * @param assassin the Assassin Card type on which resolves the action
	 */
	public void actOnAssasin(Assassin assassin);
	
	/**
	 * makes this card act on the druid type of card.
	 * 
	 * @param druid the Druid Card type on which resolves the action
	 */
	public void actOnDruid(Druid druid);
	
	/**
	 * makes this card act on the healer type of card.
	 * 
	 * @param healer the Healer Card type on which resolves the action
	 */
	public void actOnHealer(Healer healer);
	/**
	 * makes this card act on the hunter type of card.
	 * 
	 * @param hunter the Hunter Card type on which resolves the action
	 */
	public void actOnHunter(Hunter hunter);
	/**
	 * makes this card act on the knight type of card.
	 * 
	 * @param knight the Knight Card type on which resolves the action
	 */
	public void actOnKnight(Knight knight);
	/**
	 * makes this card act on the mage type of card.
	 * 
	 * @param mage the Mage Card type on which resolves the action
	 */
	public void actOnMage(Mage mage);
	/**
	 * makes this card act on the paladin type of card.
	 * 
	 * @param paladin the Paladin Card type on which resolves the action
	 */
	public void actOnPaladin(Paladin paladin);
	/**
	 * makes this card act on the shaman type of card.
	 * 
	 * @param shaman the Shaman Card type on which resolves the action
	 */
	public void actOnShaman(Shaman shaman);
	/**
	 * makes this card act on the warlock type of card.
	 * 
	 * @param warlock the Warlock Card type on which resolves the action
	 */
	public void actOnWarlock(Warlock warlock);

	/**
	 * makes this card to augment his damage counter by the parameter d,
	 * where the damage counter only keep integer values, but the parameter
	 * d is double.
	 * <p>
	 * the maximum limit of the damage counter is equal to the value of the 
	 * life points of this card, if more damage where be taken by this card,
	 * is ignored.
	 * 
	 * @param amount the amount of damage points added to the damage counter
	 */
	public void damagedBy(double amount);

	/**
	 * makes this card to decrement his damage counter by the parameter d,
	 * where the damage counter only keep integer values, but the parameter
	 * d is double.
	 * <p>
	 * the minimum limit of the damage counter is equal to 0, if more heal
	 * where be taken by this card, is ignored.
	 * <p>
	 * when this card is out of combat (damage counter is equal to the life points),
	 * then it cannot be healed, thus the heal is ignored.
	 * 
	 * @param amount the amount of damage points rested to the damage counter
	 */
	public void healedBy(double amount);

	/**
	 * makes this card to augment his attack points by the parameter d,
	 * where the attack points only keep integer values, but the parameter
	 * d is double.
	 * <p>
	 * there is no maximum limit to this value.
	 * 
	 * @param amount the amount of attack points added to the damage counter
	 */
	public void empoweredBy(double amount);

	/**
	 * makes this card to decrement his attack points by the parameter d,
	 * where the attack points only keep integer values, but the parameter
	 * d is double.
	 * <p>
	 * the minimum limit of the attack points is equal to 0, if more depower
	 * where be taken by this card, is ignored.
	 * 
	 * @param amount the amount of attack points rested to the damage counter
	 */
	public void depoweredBy(double amount);
	
	/**
	 * Set the values of the fields of the card by the parameters given to it
	 * 
	 * @param lifePoints	the life points of the card
	 * @param attackPoints	the attack points of the card
	 * @param damageCounter	the damage counter of the card
	 */
	public void setCard(int lifePoints ,int attackPoints ,int damageCounter);

}
