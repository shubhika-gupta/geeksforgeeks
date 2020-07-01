//Convert 0 to 5
class GfG {
    int convertfive(int num) {
        // Your code here
        String s=String.valueOf(num);
        char c[]=s.toCharArray();
        String res="";
        for(char ch:c){
            if(ch=='0')
            res+="5";
            else
            res+=ch+"";
        }
        return Integer.parseInt(res);
    }
}