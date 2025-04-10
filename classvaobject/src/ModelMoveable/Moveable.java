package ModelMoveable;

interface Moveable {
	void moveUp();
	void moveDown();
	void moveLeft();
	void moveRight();
	public static void main(String args[])
	{
		MoveablePoint s1 = new MoveablePoint(4,5,6,8);
		s1.moveDown();
		System.out.println(s1.toString());
		MoveableCircle s2 = new MoveableCircle (s1,5);
		System.out.println(s2.toString());
	}

	}
