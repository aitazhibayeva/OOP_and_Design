package inher;
public abstract class Animal  {
	protected String name;
	protected int x;
	protected int weight;
	public Gender gen;
	private Status docStatus;
	public Animal () {
		docStatus = Status.OK;
	}
	public Animal(String name) {
		this();
		this.name = name;
	}
	public Animal(char gen) {
		this(gen=='F'?Gender.FEMALE:Gender.MALE);
	}
	public Animal(Gender gender) {
		this.gen = gender;
	}
	public Animal(Gender gender, String name, int weight) {
		this(name);
		this.gen = gender;
		this.weight = weight;
	}
	public  Status getDocStatus() {
		return docStatus;
	}
	public void setDocStatus(Status docStatus) {
		this.docStatus = docStatus;
	}
	public final void move(int dx) {
		x+=dx;
	}
	public final void move(int seconds, int speed) {
		move(speed*seconds);
	}
	public static boolean crossTheBorder(Animal a) {
		return a.weight < 30 && a.docStatus == Status.OK;
	}
	public boolean crossTheBorder() {
		return crossTheBorder(this);
	}
	public final String voice(int n){
		String res = "";
		for (int i = 0; i < n; i++) {
			res+= voice() +" ";
		}
		return res;
	}
	public abstract String eat() ;
	public abstract String voice() ;

	public String toString() {

		return "name=" + name + ", docStatus=" + docStatus;

	}
	public final void printToString() {
		System.out.println(this.toString());
	}

}
