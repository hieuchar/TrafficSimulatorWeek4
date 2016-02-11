package exercise1;

import java.util.ArrayList;

public class PurpleCar extends Car{

	public PurpleCar(Orientation dir) {
		super(dir,2);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void calculateTurn() {
		int r = rand.nextInt(100);
		if(r >= 75){
			leftTurn();
		}
		checkedTurn = true;
	}

	@Override
	public void act() {
		currentX = this.getX();
		currentY = this.getY();
		if(this.isTouching(Car.class)){
			ArrayList<Car> crash = new ArrayList<Car>();
			crash.add(this);
			crash.addAll(this.getIntersectingObjects(Car.class));
			try { 
				throw new CarCrashException(crash);
			} catch (CarCrashException e) {
				
			}
		}
		else {
			this.move(speed.ordinal());
			if(this.isAtEdge()){
				this.getWorld().removeObject(this);
			}
		}		
		
	}

}
