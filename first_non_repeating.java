//first non repeating character
class Sol
{
    // return the first non-repeating char in S.
    // if there's no non-repeating char, return "-1"
    public static String find(String s)
    {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(java.util.Map.Entry<Character,Integer> ee:map.entrySet()){
            if(ee.getValue()==1){
                return String.valueOf(ee.getKey());
            }
        }
        return "-1";
    }
    
}