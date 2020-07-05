//convert integer to words
class convert{
    static String one[] = { "", "one ", "two ", "three ", "four ", 
                            "five ", "six ", "seven ", "eight ", 
                            "nine ", "ten ", "eleven ", "twelve ", 
                            "thirteen ", "fourteen ", "fifteen ", 
                            "sixteen ", "seventeen ", "eighteen ", 
                            "nineteen " }; 
  
    // Strings at index 0 and 1 are not used, they is to 
    // make array indexing simple 
    static String ten[] = { "", "", "twenty ", "thirty ", "forty ", 
                            "fifty ", "sixty ", "seventy ", "eighty ", 
                            "ninety " }; 
    static String numToWords(int n, String s) 
    { 
        String str = ""; 
        // if n is more than 19, divide it 
        if (n > 19) { 
            str += ten[n / 10] + one[n % 10]; 
        } 
        else { 
            str += one[n]; 
        } 
  
        // if n is non-zero 
        if (n != 0) { 
            str += s; 
        } 
  
        return str; 
    } 
	public String convertToWords(int n){
		String out = ""; 
  
        // handles digits at ten millions and hundred 
        // millions places (if any) 
        out += numToWords((int)(n / 10000000), "crore "); 
  
        // handles digits at hundred thousands and one 
        // millions places (if any) 
        out += numToWords((int)((n / 100000) % 100), "lakh "); 
  
        // handles digits at thousands and tens thousands 
        // places (if any) 
        out += numToWords((int)((n / 1000) % 100), "thousand "); 
  
        // handles digit at hundreds places (if any) 
        out += numToWords((int)((n / 100) % 10), "hundred "); 
  
        if (n > 100 && n % 100 > 0) { 
            out += "and "; 
        } 
  
        // handles digits at ones and tens places (if any) 
        out += numToWords((int)(n % 100), ""); 
  
        return out; 
		
	}
}