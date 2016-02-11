package exercise1;



public class RedCar extends WrappableCar{

	public RedCar(Orientation dir) {
		super(dir,1);
	}
	@Override
	protected void calculateTurn() {
		checkedTurn = true;
	}	

}
