// overlapping intervals
class Sol
{
    public static ArrayList<pair> overlappedInterval(ArrayList<pair> vec, int n) 
    {
       // code here
       if(vec.size()<=1){
           return vec;
       }
       vec.sort((i1,i2)->Integer.compare(i1.first,i2.first));
       ArrayList<pair> al=new ArrayList<>();
       int start=vec.get(0).first;
       int end=vec.get(0).second;
       for(pair i:vec){
           if(i.first<=end){
               end=Math.max(end,i.second);
               start=Math.min(start,i.first);
           }
           else{
               al.add(new pair(start,end));
               start=i.first;
               end=i.second;
           }
       }
       al.add(new pair(start,end));
       Collections.sort(al,new Comparator<pair>(){ 
            public int compare(pair i1,pair i2) 
            { 
                if(i1.first==i2.first)
                return i1.second - i2.second; 
                return i1.first-i2.first;
            } 
        }); 
        
        return al;
    }

}