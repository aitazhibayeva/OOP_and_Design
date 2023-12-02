package problem_5;

public class Parallel extends Circuit{

	private Circuit first;
	private Circuit second;
	
	public Parallel(Circuit first, Circuit second) {
		this.first = first;
		this.second = second;
	}
	
	@Override
	public double getResistance() {
		return Math.pow(1/first.getResistance() + 1/second.getResistance(), -1);
	}

	@Override
	public double getPotentialDiff() {
		return first.getPotentialDiff();
	}

	@Override 
	public void applyPotentialDiif(double V) {
		first.applyPotentialDiif(V);
		second.applyPotentialDiif(V);
	}
}
