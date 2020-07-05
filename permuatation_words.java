//permuatations
class Permutation
{
    static ArrayList<String> al=new ArrayList<>();
    public void permutation(String S)
    {
        int n=S.length();
        permute(S,0,n-1);
        Collections.sort(al);
        for(String i:al)
        System.out.print(i+" ");
        al.clear();
    }
    public void permute(String s,int l,int r){
        if(l==r)
        al.add(s);
        for(int i=l;i<=r;i++){
            s=swap(s,l,i);
            permute(s,l+1,r);
            s=swap(s,l,i);
        }
    }
	public String swap(String a,int i,int j){
	    char temp; 
        char[] charArray = a.toCharArray(); 
        temp = charArray[i] ; 
        charArray[i] = charArray[j]; 
        charArray[j] = temp; 
        return String.valueOf(charArray); 
	} 
}