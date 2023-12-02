package inher;

public class Dog extends Animal{
	int favBoneSize;
	public Dog() {

	}
	public Dog(String name, int fav) {
		super(name);
		this.favBoneSize = fav;
	}

	public String voice() {
		return "gav";
	}

	void findPedigree() {
		System.out.println("Pedigrre found! yahoo");
	}
	public String toString() {
		return super.toString() + ", fav bone size "+favBoneSize;
	}
	public String eat() {
		return "bones, pedigree - nyam";
	}
}
