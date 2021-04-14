package ceilingfan.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import ceilingfan.operation.CeilingFan;
import ceilingfan.properties.Operation;

/** Represents a test class to test the operations of the ceiling fan 
 * @author Meenu Joy
 * created on April 14, 2021 02:30:00 a.m. est
 * @version 1.0
*/
public class CeilingFanTest {

	public static void main(String[] args) {
		CeilingFan fan = new CeilingFan();
		System.out.print("==============CEILING FAN OPERATION==============\n");
		System.out.print("Default Fan Speed Level: "+ fan.getLevel() + ", Default Fan Direction: "+ fan.getDirection() + "\n");
		while(true) {
			System.out.print("Press 'C' to CHANGE Fan Speed or 'R' to REVERSE Direction\n\n");
			String action = readAction();
			if(Operation.validate(action))
			{
				fan.pull(Operation.getByKey(action));
			}           
		}		
	}
	
	/**
	 * read the type of pull operation need to performed on ceiling fan from the user
	 * if 'P' pressed, the ceiling fan will be pulled
	 * @param <K>
	 * @param <V>
	 *
	 * @param a string containing the operation key
	 * @return operation
	 */
	static String readAction() {
		try {
			return new BufferedReader(new InputStreamReader(System.in)).readLine();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		return null;
	}

}
