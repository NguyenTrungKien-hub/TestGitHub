package ModelMoveable;

class MoveableCircle  implements Moveable{
	private int radius;
	 MoveablePoint center;
	MoveableCircle(MoveablePoint moveablepoint , int radius)
	{
		
		this.radius=radius;
		this.center=moveablepoint;
	}	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public MoveablePoint getCenter() {
		return center;
	}

	public void setCenter(MoveablePoint center) {
		this.center = center;
	}

	public void moveUp() {
		int y = this.center.getY();
		y=y+center.getySpeed();
	}


	public void moveDown() {
		int y = this.center.getY();
		y=y-center.getySpeed();
		
	}

	public void moveLeft() {
		int x = this.center.getX();
		x=x-center.getxSpeed();
		
	}

	
	public void moveRight() {
		int x = this.center.getX();
		x=x+center.getxSpeed();
	
	}

	public String toString() {
		return "MoveableCircle [radius=" + radius + ", center=" + center + "]";
	}
	
	}

