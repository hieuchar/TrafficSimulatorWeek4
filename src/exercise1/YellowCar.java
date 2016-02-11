package exercise1;


public class YellowCar extends WrappableCar {
	public YellowCar(Orientation dir) {
		super(dir,3);
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void calculateTurn() {
		int r = rand.nextInt(100);
		if(r >= 75){
			rightTurn();			
		}
		checkedTurn = true;
	}

	

}
