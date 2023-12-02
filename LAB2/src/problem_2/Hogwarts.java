package problem_2;

import java.util.Objects;

public class Hogwarts {
	
	private String house;
    private String founder;
   
    public Hogwarts(String house, String founder) {
        this.house = house;
        this.founder = founder;
    }

    public String getHouse() {
        return house;
    }

    public String getFounder() {
        return founder;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return house.equals(hogwarts.house) && founder.equals(hogwarts.founder);
    }
    
	public int hashCode() {
		return Objects.hash(founder, house);
	}
	
	public String spell() {
		return "bibbidi-bobbidi-boo";
	}
	
	public String toString() {
		return "House: " + house + ", founder: " + founder;
	}
}
