//needle in haystack
class Sol
{
    public static int NeedleinHaystack(String haystack, String needle) 
    {
        //code here.
        if(needle==null)
        return 0;
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        else
        return -1;
    }
}