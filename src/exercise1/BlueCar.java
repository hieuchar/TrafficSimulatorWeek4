package exercise1;

import java.util.ArrayList;

public class BlueCar extends Car{

	public BlueCar(Orientation dir) {
		super(dir,0);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void calculateTurn() {
		int r = rand.nextInt(100);
		if(r >= 50){
			leftTurn();
		}
		else{
			rightTurn();
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
