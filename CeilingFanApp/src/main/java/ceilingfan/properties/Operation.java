package ceilingfan.properties;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/** Represents the types of pull operations performed on ceiling fan 
 * @author Meenu Joy
 * created on April 14, 2021 12:50:00 a.m est
 * @version 1.0
*/
public enum Operation {
	CHANGE_SPEED("C"), REVERSE_DIRECTION("R");
	private final String key;
    private static final Map<String, Operation> operations = new HashMap<String, Operation>();

	static {
        Stream.of(Operation.values()).forEach(operation -> operations.put(operation.getKey(), operation));
    }
	
	Operation(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
    
    /**
	 * validates the pull operations performed on ceiling fan
	 * @param <K>
	 * @param <V>
	 *
	 * @param a string containing the operation key
	 * @return a boolean value with a valid flag
	 */
    public static boolean validate(String key) {
    	boolean valid = operations.keySet().stream().anyMatch(d -> key.equalsIgnoreCase(d));
    	if(!valid) {
    		System.out.print("Please perform correct action! ");
    	} 
    	return valid;
    }
    
    /**
	 * returns a pull operation to perform based on the pull type
	 * @param <K>
	 * @param <V>
	 *
	 * @param a string containing the pull operation key
	 * @return pull operation
	 */
    public static Operation getByKey(String key) {
    	return operations.get(key.toUpperCase());
    }

}
