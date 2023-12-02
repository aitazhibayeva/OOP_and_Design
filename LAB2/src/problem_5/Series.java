package problem_5;

public class Series extends Circuit{

	private Circuit first;
	private Circuit second;
	
	public Series(Circuit first, Circuit second) {
		this.first = first;
		this.second = second;
	}
	
	@Override
	public double getResistance() {
		return first.getResistance() + second.getResistance();
	}

	@Override
	public double getPotentialDiff() {
		return first.getPotentialDiff() + second.getPotentialDiff();
	}

	@Override
	public void applyPotentialDiif(double V) {
		first.applyPotentialDiif(V); 
	}
}