package edu.cofc.csci221.ui;

/**
 * 
 * This class models a KochLine, an essential kind of line that forms a Koch snowflake
 * 
 * @author Andy Gajadhar
 * @since November 30, 2014
 * 
 */

public class KochLine extends Line{
	
	//instances variables, 5 points that compose a koch line (4 segments of line)
	private Point p1,p2,p3,p4,p5;
	
	/**
	 * 	 * 
	 * constructor the builds a kochline, initializing its 5 points
	 * 
	 * Preconditions: None
	 * Postconditions: A kochline is built
	 * 
	 * @param start    the first point of the kochline
	 * @param end    the last point of the kochline
	 */
	public KochLine(Point start, Point end){
		super(start,end);
		this.p1 = new Point(start);		
		this.p5 = new Point(end);
		this.p2 = new Point();    //computed when the computeFractal method is called
		this.p3 = new Point();	  //computed when the computeFractal method is called
		this.p4 = new Point();    //computed when the computeFractal method is called
	}
	
	/**
	 * getLineA returns the first line of the kochline from the first point to the second
	 * 
	 * Preconditions: None
	 * Postconditions: the first segment of the kochline is returned
	 * 
	 * @return    a line
	 */
	public KochLine getLineA(){
		return new KochLine(this.p1, this.p2);
	}
	
	/**
	 * getLineB returns the second line of the kochline from the second point to the third
	 * 
	 * Preconditions: None
	 * Postconditions: the second segment of the kochline is returned
	 * 
	 * @return    a line
	 */
	public KochLine getLineB(){
		return new KochLine(this.p2, this.p3);
	}
	
	/**
	 * getLineC returns the third line of the kochline from the third point to the forth
	 * 
	 * Preconditions: None
	 * Postconditions: the third segment of the kochline is returned
	 * 
	 * @return    a line
	 */
	public KochLine getLineC(){
		return new KochLine(this.p3, this.p4);
	}
	
	/**
	 * getLineD returns the forth line of the kochline from the forth point to the fifth
	 * 
	 * Preconditions: None
	 * Postconditions: the forth segment of the kochline is returned
	 * 
	 * @return    a line
	 */
	public KochLine getLineD(){
		return new KochLine(this.p4, this.p5);
	}
	
	/**
	 * isKochLineValid checks if a kochline is valid
	 * 
	 * Preconditions: None
	 * Postconditions: the kochline will be classified as valid or not
	 * 
	 * @return true if the kochline is valid, false otherwise
	 */
	public Boolean isKochLineValid(){
		return getLineA().isValid() && getLineB().isValid() && getLineC().isValid() && getLineD().isValid();
	}
	
	/**
	 * computeFractal computes the three internal points coordinates and therefore the two internals segments of the kochline (p2-p3,p3-p4)
	 * 
	 * Preconditions: None
	 * Postconditions: the p2,p3 and p4 coordinates are calculated
	 */
	public void computeFractal(){
		//just using the formulas shown in the P9 program specification 
		int deltaX51 = p5.getX() - p1.getX();
		int deltaY51 = p5.getY() - p1.getY();
		
		p2.setX((int)(p1.getX() + deltaX51/3.0));
		p2.setY((int)(p1.getY() + deltaY51/3.0));
		
		p3.setX((int) (((p1.getX() + p5.getX())/2.0) + (((Math.sqrt(3)*(p1.getY() - p5.getY())))/6)) );
		p3.setY((int) (((p1.getY() + p5.getY())/2.0) - (((Math.sqrt(3)*(p1.getX() - p5.getX())))/6)) );    //after some tries, found that formula found in the specification was wrong, a '-' signal was placed instead of a '+' to fix it
	
		p4.setX((int)(p1.getX() + 2*deltaX51/3.0));
		p4.setY((int)(p1.getY() + 2*deltaY51/3.0));
	}
}
