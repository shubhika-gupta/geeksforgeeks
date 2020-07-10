//generate binary numbers using queue
class solve{
    static ArrayList<String> generate(long n)
    {
        Queue<String> q=new LinkedList<>();
        ArrayList<String> al=new ArrayList<>();
        q.add("1");
        while(n-->0){
            String s1=q.peek();
            q.remove();
            al.add(s1);
            String s2=s1;
            q.add(s1+"0");
            q.add(s2+"1");
        }
        return al;
    }
    
}