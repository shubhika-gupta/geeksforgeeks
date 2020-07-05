//multiply two strings
class Sol
{
    public String multiply(String a,String b)
    {
        //code here.
        java.math.BigInteger n1=new BigInteger(a);
        java.math.BigInteger n2=new BigInteger(b);
        java.math.BigInteger n3=n1.multiply(n2);
        return n3.toString();
    }
}