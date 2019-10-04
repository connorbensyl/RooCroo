package sprint1;


import sprint1.Gui1;


public class Board 
{
	Square outerSquare = new Square();
	Square middleSquare = new Square();
	Square innerSquare = new Square();
	
	public void connectIntersquarePoints() {
		//outer square + middle square connect
		outerSquare.topMiddle.setDown(middleSquare.topMiddle);
		middleSquare.topMiddle.setUp(outerSquare.topMiddle);
		
		outerSquare.middleLeft.setRight(middleSquare.middleLeft);
		middleSquare.middleLeft.setLeft(outerSquare.middleLeft);
		
		outerSquare.bottomMiddle.setUp(middleSquare.bottomMiddle);
		middleSquare.bottomMiddle.setDown(outerSquare.bottomMiddle);
		
		outerSquare.middleRight.setLeft(middleSquare.middleRight);
		middleSquare.middleRight.setRight(outerSquare.middleRight);
		
		//middle square + inner square connect
		middleSquare.topMiddle.setDown(innerSquare.topMiddle);
		innerSquare.topMiddle.setUp(middleSquare.topMiddle);
		
		middleSquare.middleLeft.setRight(innerSquare.middleLeft);
		innerSquare.middleLeft.setLeft(middleSquare.middleLeft);
		
		middleSquare.bottomMiddle.setUp(innerSquare.bottomMiddle);
		innerSquare.bottomMiddle.setDown(middleSquare.bottomMiddle);
		
		middleSquare.middleRight.setLeft(innerSquare.middleRight);
		innerSquare.middleRight.setRight(middleSquare.middleRight);
	}
	
	public void connectAllLocalPoints() {
		outerSquare.connectLocalPoints();
		middleSquare.connectLocalPoints();
		innerSquare.connectLocalPoints();
	}
	
	public void setSquareCoords()
	{   
		
		//coordinates for points on outer square
		outerSquare.topLeft.set_coords(350, 70);
		outerSquare.middleLeft.set_coords(350, 320);
		outerSquare.bottomLeft.set_coords(350, 570);
		outerSquare.bottomMiddle.set_coords(600, 580);
		outerSquare.bottomRight.set_coords(850,580);
		outerSquare.middleRight.set_coords(670,320);
		outerSquare.topRight.set_coords(850, 70);
		outerSquare.topMiddle.set_coords(600, 70);
		
		//coordinates for points on middle square
		middleSquare.topLeft.set_coords(450, 170);
		middleSquare.middleLeft.set_coords(450, 320);
		middleSquare.bottomLeft.set_coords(450, 470);
		middleSquare.bottomMiddle.set_coords(600,490);
		middleSquare.bottomRight.set_coords(750,480);
		middleSquare.middleRight.set_coords(x, y);
	}
	
	
}
