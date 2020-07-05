//column to title
class Solution {
    public String excelColumn(int A) {
        StringBuilder sb=new StringBuilder("");
        while(A>0){
            if(A%26==0){
                sb.append("Z");
                A=A/26-1;
            }
            else{
                sb.append((char)(65+A%26-1));
                A=A/26;
            }
        }
        return sb.reverse().toString();
        
    }
}