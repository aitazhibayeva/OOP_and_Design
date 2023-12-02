package problem_2;

import java.util.Objects;

public class Wizard extends Hogwarts{
	
	private String character;
	private String spell;

    public Wizard(String house, String founder,String character, String spell) {
        super(house, founder);
        this.character = character;
        this.spell = spell;
    }

    public String getCharacter() {
        return character;
    }
    public String getSpell() {
		return spell;
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		Wizard wiz = (Wizard) o;
		return character.equals(wiz.character);
	}

	public int hashCode() {
		return Objects.hash(character);
	}

	public String spell() {
		return super.spell()+ " is worse than " + spell;
	}
	
	public String toString() {
    	return super.toString() + ", character: " + character;
    }

	

	
}
