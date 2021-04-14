package ceilingfan.operation;

import ceilingfan.properties.Direction;
import ceilingfan.properties.SpeedLevel;

/** Represents the Level 1 speed state of ceiling fan
 * @author Meenu Joy
 * created on April 14, 2021 12:35:00 a.m. est
 * @version 1.0
*/
public class Level1 implements CeilingFanState {

	@Override
	public void pull(CeilingFan fan, Direction direction) {
		fan.changeSpeed(new Level2(), direction, SpeedLevel.LEVEL2);		
	}

}
