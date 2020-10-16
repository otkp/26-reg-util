package org.epragati.util.payment;

/**
 * @author biswaranjan.mohapatr
 *
 */
public class DAOUtility {
	
	/**
	 * @param s
	 * @return 's'
	 * This method is used to concatenate single quote with input String while passing to N1QL 
	 */
	public static String quote(String s) {
	    return new StringBuilder()
	        .append('\'')
	        .append(s)
	        .append('\'')
	        .toString();
	    
	}
	
	

}
