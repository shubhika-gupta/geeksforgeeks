//pattern matcher
class GfG
{
/* The function returns an array of strings 
present in the dictionary which matches
the string pattern.
You are required to complete this method */
public static boolean check(String pattern,String word){
    char ch[]=new char[128];
    if(pattern.length()!=word.length())
    return false;
    for(int i=0;i<word.length();i++){
        if(ch[pattern.charAt(i)]==0)
        ch[pattern.charAt(i)]=word.charAt(i);
        else if(ch[pattern.charAt(i)]!=word.charAt(i)){
            return false;
        }
    }
    return true;
}
public static ArrayList<String> findMatchedWords(ArrayList<String> dict, String pat)
	{
	    //add code here.
	    ArrayList<String> list=new ArrayList<>();
	    for(String s:dict){
	        if(check(pat,s)){
	            list.add(s);
	        }
	    }
return list;
	}
}