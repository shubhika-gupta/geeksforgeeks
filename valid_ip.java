//Valid Ip
class Solution {

    public boolean isValidIP(String s) {
        // Write your code here
        s.trim();
        if(s.equals("0.0.0.0."))
        return false;
        if(s==null||s.length()<4)
        return false;
        String str[]=s.split("\\.+");
        if(str.length>4||str.length<4)
        return false;
        int count=0;
        for(int i=0;i<str.length;i++){
            if(str[i].charAt(0)=='0'&&str[i].length()!=1)
            return false;
            if(!Character.isDigit(str[i].charAt(0)))
            return false;
            if(str[i]==null||str[i].charAt(0)=='\0')
            return false;
            int k=Integer.parseInt(str[i]);
            if(k>=0&&k<=255)
            count++;
            //System.out.print(k+" "+count);}
        }
        if(count==4)
        return true;
        else
        return false;
    }
}