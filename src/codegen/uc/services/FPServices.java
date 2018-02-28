package uc.services;

/**
 * Service class to give function points measures.
 * @author Daniel Althviz
 *
 */
public class FPServices {
	
	//Complexity
	public static final String LOW = "Low";
	public static final String MEDIUM = "Medium";
	public static final String HIGH = "High";
	
	//EI
	public static final String EI = "EI";
	public static final Integer LOW_EI = 3;
	public static final Integer MEDIUM_EI = 4;
	public static final Integer HIGH_EI = 6;
	
	//EO
	public static final String EO = "EO";
	public static final Integer LOW_EO = 4;
	public static final Integer MEDIUM_EO = 5;
	public static final Integer HIGH_EO = 7;
	
	//EQ
	public static final String EQ = "EQ";
	public static final Integer LOW_EQ = 3;
	public static final Integer MEDIUM_EQ = 4;
	public static final Integer HIGH_EQ = 6;
	
	//ILF (RET - DET)
	public static final String ILF = "ILF";
	public static final Integer LOW_ILF = 7;
	public static final Integer MEDIUM_ILF = 10;
	public static final Integer HIGH_ILF = 15;
	
		
	//EI
	/**
	 * Give the number of Function Points (FP) of the given combination 
	 * of DETs and FTRS for an External Input (EI). 	
	 * @param det Number of DETs
	 * @param ftr Number of FTRs
	 * @return fp Functional Points
	 */
	public Integer fpEI(Integer det, Integer ftr) {
		
		Integer result = 0;
		String complexity = LOW;
		if(det >= 1 && det <= 4) {
			if(ftr <= 1) {
				complexity = LOW;
			}
			else if(ftr == 2) {
				complexity = LOW;				
			}else {
				complexity = MEDIUM;
			}
		}else if(det >=5 && det <= 15) {
			if(ftr <= 1) {
				complexity = LOW;
			}
			else if(ftr == 2) {
				complexity = MEDIUM;				
			}else {
				complexity = HIGH;
			}
		}else {
			if(ftr <= 1) {
				complexity = MEDIUM;
			}
			else if(ftr == 2) {
				complexity = HIGH;
			}else {
				complexity = HIGH;
			}
		}
		
		result = fp(EI, complexity);
		return result;
	}
	
	//EO
	/**
	 * Give the number of Function Points (FP) of the given combination 
	 * of DETs and FTRS for an External Output (EO). 	
	 * @param det Number of DETs
	 * @param ftr Number of FTRs
	 * @return fp Functional Points
	 */
	public Integer fpEO(Integer det, Integer ftr) {
		
		Integer result = 0;
		String complexity = LOW;
		if(det >= 1 && det <= 4) {
			if(ftr <= 1) {
				complexity = LOW;
			}
			else if(ftr >= 2 && ftr <= 3) {
				complexity = LOW;				
			}else {
				complexity = MEDIUM;
			}
		}else if(det >=5 && det <= 15) {
			if(ftr <= 1) {
				complexity = LOW;
			}
			else if(ftr >= 2 && ftr <= 3) {
				complexity = MEDIUM;				
			}else {
				complexity = HIGH;
			}
		}else {
			if(ftr <= 1) {
				complexity = MEDIUM;
			}
			else if(ftr >= 2 && ftr <= 3) {
				complexity = HIGH;
			}else {
				complexity = HIGH;
			}
		}
		
		result = fp(EO, complexity);
		return result;
	}
		
	//EQ
	/**
	 * Give the number of Function Points (FP) of the given combination 
	 * of DETs and FTRS for an External InQuiry (EQ). 	
	 * @param det Number of DETs
	 * @param ftr Number of FTRs
	 * @return fp Functional Points
	 */
	public Integer fpEQ(Integer det, Integer ftr) {
		
		Integer result = 0;
		String complexity = LOW;
		if(det >= 1 && det <= 4) {
			if(ftr <= 1) {
				complexity = LOW;
			}
			else if(ftr >= 2 && ftr <= 3) {
				complexity = LOW;				
			}else {
				complexity = MEDIUM;
			}
		}else if(det >=5 && det <= 15) {
			if(ftr <= 1) {
				complexity = LOW;
			}
			else if(ftr >= 2 && ftr <= 3) {
				complexity = MEDIUM;				
			}else {
				complexity = HIGH;
			}
		}else {
			if(ftr <= 1) {
				complexity = MEDIUM;
			}
			else if(ftr >= 2 && ftr <= 3) {
				complexity = HIGH;
			}else {
				complexity = HIGH;
			}
		}
		
		result = fp(EQ, complexity);
		return result;
	}
	
	//ILF
	/**
	 * Give the number of Function Points (FP) of the given combination 
	 * of DETs and RETs for an Internal Logical File (ILF). 	
	 * @param det Number of DETs
	 * @param ret Number of RETs
	 * @return fp Functional Points
	 */
	public Integer fpILF(Integer det, Integer ret) {
		
		Integer result = 0;
		String complexity = LOW;
		if(det >= 1 && det <= 19) {
			if(ret == 1) {
				complexity = LOW;
			}
			else if(ret >= 2 && ret <= 5) {
				complexity = LOW;				
			}else {
				complexity = MEDIUM;
			}
		}else if(det >=20 && det <= 50) {
			if(ret == 1) {
				complexity = LOW;
			}
			else if(ret >= 2 && ret <= 5) {
				complexity = MEDIUM;				
			}else {
				complexity = HIGH;
			}
		}else {
			if(ret == 1) {
				complexity = MEDIUM;
			}
			else if(ret >= 2 && ret <= 5) {
				complexity = HIGH;				
			}else {
				complexity = HIGH;
			}
		}
		
		result = fp(ILF, complexity);
		return result;
	}
	 
	/**
	 * Give the function points taking into account data or function types
	 * and complexity.
	 * @param type
	 * @param complexity
	 * @return FP - function points
	 */
	private Integer fp(String type, String complexity) {
		
		Integer result = LOW_EI;
		
		if(EI.equals(type)) {
			if(LOW.equals(complexity)) {
				result = LOW_EI;
			}else if(MEDIUM.equals(complexity)) {
				result = MEDIUM_EI;
			}else if(HIGH.equals(complexity)){
				result = HIGH_EI;
			}
		}else if(EO.equals(type)){
			if(LOW.equals(complexity)) {
				result = LOW_EI;
			}else if(MEDIUM.equals(complexity)) {
				result = MEDIUM_EI;
			}else if(HIGH.equals(complexity)){
				result = HIGH_EI;
			}
		}else if(EQ.equals(type)){
			if(LOW.equals(complexity)) {
				result = LOW_EI;
			}else if(MEDIUM.equals(complexity)) {
				result = MEDIUM_EI;
			}else if(HIGH.equals(complexity)){
				result = HIGH_EI;
			}
		}else if(ILF.equals(type)){
			if(LOW.equals(complexity)) {
				result = LOW_EI;
			}else if(MEDIUM.equals(complexity)) {
				result = MEDIUM_EI;
			}else if(HIGH.equals(complexity)){
				result = HIGH_EI;
			}
		}
		
		return result;
	}

}
