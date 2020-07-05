//roman to integer
class RomanToNumber {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        // code here.
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=0,i=0;
        for(int j=1;j<str.length();i++,j++){
            if(map.get(str.charAt(i))>=map.get(str.charAt(j)))
            res+=map.get(str.charAt(i));
            else
            res-=map.get(str.charAt(i));
        }
        res+=map.get(str.charAt(i));
        return res;
    }
}