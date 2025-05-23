package ModelMoveable;

class MoveablePoint implements Moveable {
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;

	MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}

	public String toString() {
		return "MoveablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

	public void moveUp() {
		y=y+ySpeed;
	}

	public void moveDown() {
		y=y-ySpeed;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public void setxSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

	public void setySpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}

	public void moveLeft() {
		x=x-xSpeed;
	}

	public void moveRight() {
		x=x+xSpeed;
	}

}
