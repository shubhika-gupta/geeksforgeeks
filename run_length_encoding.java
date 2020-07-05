//run length encoding
class GfG
 {
	String encode(String str)
	{
          //Your code here
          String s="";
          int count=1;
          for(int i=0;i<str.length()-1;i++){
              if(str.charAt(i)==str.charAt(i+1)){
                  count++;
              }
              else{
              s+=str.charAt(i)+""+count;
              count=1;}
          }
          s+=str.charAt(str.length()-1)+""+count;
          return s;
	}
}