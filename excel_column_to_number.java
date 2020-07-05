//excel column to number
class Solution {
    public int excelColumnNumber(String A) {
        char[] b = A.toCharArray();
        int result= 0;
        for(int i=0;i<b.length;i++){
            result = result*26 + (b[i]-'A' + 1);
        }
        return result;
    }
}