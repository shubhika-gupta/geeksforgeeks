//integer to roman
class GfG
{
    String convertToRoman(int n)
    {
	// Your code here	
	    String[] m = {"", "M", "MM", "MMM"};
        String[] c = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] x = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String thousand=m[n/1000];
        String hundred=c[(n%1000)/100];
        String ten=x[(n%100)/10];
        String ones=i[(n%10)];
        String ans=thousand+hundred+ten+ones;
       // System.out.print(ans);
        return ans;
    }
}