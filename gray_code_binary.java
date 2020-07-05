//convert gray code in binary
class GfG
{
    static String decimal(int x,int n){
        int b[]=new int[x];
        int i=0;
        while(x>0){
            b[i++]=x%2;
            x/=2;
        }
        String res="";
        for(int j=0;j<n-i;j++)
        res+="0";
        for(int j=i-1;j>=0;j--)
        res+=b[j];
        return res;
    }
    ArrayList <String> generateCode(int n)
    {
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i< 1<<n;i++){
            int x=i^i>>1;
            al.add(decimal(x,n));
        }
        return al;
    }
}