//vitamin p
//http://code.activestate.com/recipes/415384-decimal-to-roman-numerals/
//http://www.roseindia.net/java/java-tips/45examples/misc/roman/roman.shtml

public class RomanNumerals {

	
	 // Parallel arrays used in the conversion process.
    private static final String[] RCODE = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[]    BVAL  = {1000, 900, 500, 400,  100, 90, 50, 40, 10, 9, 5, 4, 1};
	
	
	public String toRoman(int nmber) {
		

        if (binary <= 0 || binary >= 4000) {
            throw new NumberFormatException("Value outside roman numeral range.");
        }
        String roman = "";         // Roman notation will be accumualated here.
        
        // Loop from biggest value to smallest, successively subtracting,
        // from the binary value while adding to the roman representation.
        for (int i = 0; i < RCODE.length; i++) {
            while (binary >= BVAL[i]) {
                binary -= BVAL[i];
                roman  += RCODE[i];
            }
        }
        return roman;
		
		
//		switch (nmber) {
//			case 1: return "I";
//			case 2: return "II";
//			case 3: return "III";
//			case 4: return "IV";
//			case 5: return "V";
//			case 6: return "VI";
//			case 7: return "VII";
//			case 8: return "VIII";
//			case 9: return "IX";
//			case 10: return "X";
//		}
	}

}
