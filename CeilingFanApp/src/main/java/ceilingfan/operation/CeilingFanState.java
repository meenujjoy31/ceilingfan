package ceilingfan.operation;

import ceilingfan.properties.Direction;

/** Represents the state of ceiling fan 
 * @author Meenu Joy
 * created on April 14, 2021 12:30:00 a.m. est
 * @version 1.0
*/
public interface CeilingFanState {
	void pull(CeilingFan fan, Direction direction); 
}
