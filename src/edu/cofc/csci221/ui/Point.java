package edu.cofc.csci221.ui;

/**
 * This is the Point class, it abstracts a point in a 2D-space
 * @author Andy Gajadhar
 * 
 * @since October 5, 2014
 */

public class Point {
	//instance variables
	private int x = 0, y = 0;
	
	/**
	 * Pre-Conditions: None
	 * 
	 * initializes the point with x and y = 0
	 * 
	 * Pos-Conditions: x and y = 0
	 */
	
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	
	/**
	 * Pre-Conditions: see setX and setY 
	 * 
	 * @param x an integer representing the x coordinate
	 * @param y an integer representing the y coordinate
	 * 
	 * Pos-Conditions: Set the x and y coordinates of this point with the argument values
	 */
	
	public Point(int x, int y){
		this.setX(x);
		this.setY(y);
	}
	
	/**
	 * Pre-Conditions: Point != null and see setX and setY 
	 * 
	 * @param point a point in a 2D space
	 * 
	 * Pos-Conditions: Set the x and y coordinates of this point with the argument values
	 */
	
	public Point(Point point){
		if(point != null){
			this.setX(point.getX());
			this.setY(point.getY());
		}
	}
	
	/**
	 * Pre-Conditions: None
	 * 
	 * gets x coordinate
	 * 
	 * @return the x coordinate
	 */
	
	public int getX(){
		return this.x;
	}
	
	/**
	 * Pre-Conditions: None
	 * 
	 * gets y coordinate
	 * 
	 * @return the y coordinate
	 */
	
	public int getY(){
		return this.y;
	}
	
	/**
	 * Pre-Conditions: x >= 0 and x <= GridConstants.MAX_PANEL_WIDTH
	 * sets the x coordinate value
	 * 
	 * @param x a value for the x coordinate
	 * 
	 * Post-Conditions: the x coordinate of this point is set a value x (pre-conditions matched) or 0(otherwise)
	 */
	
	public void setX(int x){
		if(x >= 0 && x <= GridConstants.MAX_PANEL_WIDTH){
			this.x = x;
		}else
			this.x = 0;
	}
	
	/**
	 * Pre-Conditions: y >= 0 and y <= GridConstants.MAX_PANEL_HEIGHT
	 * sets the y coordinate value
	 * 
	 * @param y a value for the x coordinate
	 * 
	 * Post-Conditions: the y coordinate of this point is set a value y (pre-conditions matched) or 0(otherwise)
	 */
	
	public void setY(int y){
		if(y >= 0 && y <= GridConstants.MAX_PANEL_HEIGHT){
			this.y = y;
		}else
			this.y = 0;
	}
	
	/**
	 * Pre-Conditions: p!=null and p.getX() >= 0 and p.getX() <= GridConstants.MAX_PANEL_WIDTH
	 * and p.getY() >= 0 and p.getY() <= GridConstants.MAX_PANEL_HEIGHT
	 * sets the x,y coordinates with the coordinate's values of p
	 * 
	 * @param p a point
	 * 
	 * Post-Conditions: the x and y coordinates of this point are set with p ones(pre-conditions matched) or 0(otherwise)
	 */
	
	public void setPoint(Point p){
		if(p != null){
			this.setX(p.getX());
			this.setY(p.getY());
		}
	}
}
