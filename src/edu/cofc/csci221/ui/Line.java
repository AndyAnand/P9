package edu.cofc.csci221.ui;

/**
 * This class abstracts a line in a two dimensional space that passes by two Points 
 * 
 * @author Andy Gajadhar
 * @since October 5, 2014
 *
 */

public class Line {
	
	//instances variables
	private Point start = null;
	private Point end = null;
	
	
	/**
	 * Pre-Conditions: start and end != null 
	 * 
	 * A line constructor
	 * 
	 * @param start a Point where the line starts
	 * @param end a Point where the line ends
	 * 
	 * Pos-Conditions: this line's start and and are set
	 */
	
	public Line(Point start, Point end){
		if(start != null && end != null){
			this.start = start;
			this.end = end;
		}
	}
	
	/**
	 * Pre-Conditions: None
	 * 
	 * gets the Point where the line starts
	 * 
	 * @return the Point where the line starts
	 */
	
	public Point getStart(){
		return this.start;
	}
	
	/**
	 * Pre-Conditions: None
	 * 
	 * gets the Point where the line ends
	 * 
	 * @return the Point where the line ends
	 */
	
	public Point getEnd(){
		return this.end;
	}
	
	/**
	 * Pre-Conditions: start is different of null
	 * 
	 * sets where the line starts
	 * 
	 * @param start a Point where this line will start
	 */
	
	public void setStart(Point start){
		if(start != null){
			this.start = start;
		}
	}
	
	/**
	 * Pre-Conditions: end is different of null
	 * 
	 * sets where the line ends
	 * 
	 * @param end a Point where this line will end
	 */
	
	public void setEnd(Point end){
		if(end != null){
			this.end = end;
		}
	}
	
	/**
	 * Pre-Conditions: None
	 * 
	 * check if a line has a valid start and end i.e. start and end != null
	 * 
	 * @return true if the line is valid and else otherwise
	 */
	
	public boolean isValid(){
		return this.start != null && this.end != null;
	}
}
