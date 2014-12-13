package Domain;

public abstract class Obstacle extends GameObjects {
	/*
	 * this is an abstract class for different kinds of Obstacles.
	 * objectType for lokums assigned to be 2.
	 */

	static int OBSTACLE_TYPE=2;
	
	public Obstacle(){
		objectType=OBSTACLE_TYPE;
	}
	public int getObjectType(){
		return objectType;
	}
}
