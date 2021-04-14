package ceilingfan.operation;

import ceilingfan.properties.Direction;
import ceilingfan.properties.Operation;
import ceilingfan.properties.SpeedLevel;

/** Represents a ceiling fan with its properties
 * @author Meenu Joy
 * created on April 14, 2021 01:05:00 a.m. est
 * @version 1.0
*/
public class CeilingFan {
	
	private CeilingFanState state;
	
	private Direction directon;
	
	private SpeedLevel level;
	
	public CeilingFan() {
		state = new Off();
		level = SpeedLevel.OFF;
		directon = Direction.CLOCKWISE;
	}
	
	public SpeedLevel getLevel() {
		return level;
	}
	
	public Direction getDirection() {
		return directon;
	}	
	
	/**
	 * change the speed of the ceiling fan to next level 
	 * @param <K>
	 * @param <V>
	 *
	 * @param the new speed state of the ceiling fan
	 * @return nothing
	 */
	public void changeSpeed(CeilingFanState state, Direction direction, SpeedLevel level) {
		this.state = state;
		this.level = level;
		this.directon = direction;
	}		
	
	/**
	 * Perform the pull operation of ceiling fan based on the pull operation type
	 * @param <K>
	 * @param <V>
	 *
	 * @param an enum containing the pull operation need to be performed
	 * @return nothing
	 */
	public void pull(Operation operation) {
		if(operation.equals(Operation.CHANGE_SPEED)) {
			state.pull(this, directon);
		}
		else {
			reverse();
		}
		System.out.println("Current Fan Speed Level: " + this.level.toString() + ", Current Fan Direction: " + this.directon.toString());
	}
	
	/**
	 * reverse the direction of ceiling fan
	 * @param <K>
	 * @param <V>
	 *
	 * @param nothing
	 * @return nothing
	 */
	private void reverse() {
		if(this.directon.equals(Direction.CLOCKWISE)) {
			this.directon = Direction.COUNTER_CLOCKWISE;
		}
		else {
			this.directon = Direction.CLOCKWISE;
		}
	}

}
