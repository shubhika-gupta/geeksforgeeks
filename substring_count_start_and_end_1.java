//find all substring which start and end with 1
class StringBinary{
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        int count=0;
        for(char c:str.toCharArray()){
            if(c=='1')
            count++;
        }
        return (count*(count-1))/2;
    }
}