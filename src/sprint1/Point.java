package sprint1;

import sprint1.Point;

public class Point 
{
	 private boolean isCorner;
     private boolean isMidpoint;
     private String pointState;
     private Point lookRight;
     private Point lookLeft;
     private Point lookUp;
     private Point lookDown;
     private int xCoordinate;
     private int yCoordinate;
     private static Point nullPoint = new Point(false,false,0,0);
     
     
     

 
 public Point(boolean iscorner, boolean ismidpoint, int x, int y)
 {
	 
	 isCorner = iscorner;
	 isMidpoint = ismidpoint;
	 pointState = "none";
	 lookRight = nullPoint;
	 lookLeft = nullPoint;
	 lookUp = nullPoint;
	 lookDown = nullPoint;
	 xCoordinate = x;
	 yCoordinate = y;
	 
 }
 
 Point(boolean iscorner, boolean ismidpoint, String point_state) //point occupied by a black piece, a white piece, or none
 {
	 if(point_state.toLowerCase() != "black" && point_state.toLowerCase() != "white" && point_state != "none")
	 {
		 System.out.print("point_state invalid argument");
	 }
	 else
	 {
	 pointState = point_state;
	 }
	 
	 isCorner = iscorner;
	 isMidpoint = ismidpoint;
	 lookRight = nullPoint;
	 lookLeft = nullPoint;
	 lookUp = nullPoint;
	 lookDown = nullPoint;
 }
 
 public boolean get_isCorner()
 {
	 return isCorner; 

 }
 
 
 public void set_to_Corner()
 {
	 isCorner = true;
	 isMidpoint = false;
 }
 
 public void set_to_Midpoint()
 {
	 isCorner = false;
	 isMidpoint = true;
 }
 
 public boolean get_isMidpoint()
 {
	 return isMidpoint;
 }

 public void set_point_state(String color) //color should be black, white, or none
 {
	 pointState = color.toLowerCase();
 }
 
 public String get_point_state()
 {
	 return pointState;
 }
 
 public boolean isEmpty() {
	 if (pointState=="none")
		 return true;
	 else
		 return false;
 }
 
 public void setLeft(Point left) {
	 lookLeft = left;
 }
 
 public void setRight(Point right) {
	 lookRight = right;
 }
 
 public void setUp(Point up) {
	 lookUp = up;
 }
 
 public void setDown(Point down) {
	 lookDown = down;
 }
 
 public Point getUp()
 {
	 return lookUp;
 }
 
 public Point getLeft()
 {
	 return lookLeft;
 }
 
 public Point getRight()
 {
	 return lookRight;
 }
 
 public Point getDown()
 {
	 return lookDown;
 }
 
 public void set_coords(int x, int y)
 {
	 this.xCoordinate = x;
	 this.yCoordinate = y;
 }
 

public int get_xcoord()
{
	return xCoordinate;
}

public int get_ycoord()
{
	return yCoordinate;
}
 

public boolean isPartOfMill()
{
  
  if(this == this.getnullPoint() || this.isEmpty())
  {
	  return false;
	  
  }
  if(this.isMidpoint && this != this.nullPoint)
  {
	if(!this.lookRight.pointState.isEmpty() && !this.lookLeft.pointState.isEmpty() && this.lookRight != this.nullPoint && this.lookLeft != this.nullPoint)
	{
	  if(this.pointState == this.lookLeft.pointState && this.pointState == this.lookRight.pointState)
	  {
		  return true;
	  }
	}
	
	if(!this.lookUp.pointState.isEmpty() && !this.lookDown.pointState.isEmpty() && this.lookUp != this.nullPoint && this.lookDown != this.nullPoint)
	{
		if(this.pointState == this.lookUp.pointState && this.pointState == this.lookDown.pointState)
		  {
			  return true;
		  }
	}
  }
	  
  if((!this.lookLeft.pointState.isEmpty()) && this.lookLeft != this.nullPoint)
	  {
		  if(this.pointState == this.lookLeft.pointState && this.lookLeft.pointState == this.lookLeft.lookLeft.pointState)
		  {
			  return true;
		  } 
	  }
	  
	  if(!this.lookRight.pointState.isEmpty() && this.lookRight != this.nullPoint)
	  {
		  if(this.pointState == this.lookRight.pointState && this.lookRight.pointState == this.lookRight.lookRight.pointState)
		  {
			  return true;
		  }
	  }
	  
	  if(!this.lookDown.pointState.isEmpty() && this.lookDown != this.nullPoint)
	  {
		  if(this.pointState == this.lookDown.pointState && this.lookDown.pointState == this.lookDown.lookDown.pointState)
		  {
			  return true;
		  }
	  }
	  
	  if(!this.lookUp.pointState.isEmpty() && this.lookUp != this.nullPoint)
	  {
		  if(this.pointState == this.lookUp.pointState && this.lookUp.pointState == this.lookUp.lookUp.pointState)
		  {
			  return true;
		  }
	  }
	  
	  
	  //if none of the above are true
		return false;  
  }
	
public Point getnullPoint()
{
	return nullPoint;
}
	  
	  
	  
	  
 
 
 
}

 