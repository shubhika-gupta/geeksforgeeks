// Solution class to implement function largestAndSecondLargest
class ArrayMax{
    
    // Function to find largest and second largest element in the array
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {
        //code here.
        ArrayList<Integer> list=new ArrayList<>();
        Set<Integer> set=new HashSet<>();
        for(int i:arr)
        set.add(i);
        ArrayList<Integer> al=new ArrayList<>(set);
       // System.out.println(al);
        Collections.sort(al);
        if(al.size()>=2){
        int max1=Collections.max(al);
        al.remove(new Integer(max1));
        int max2=Collections.max(al);
        al.remove(new Integer(max2));
        if(max1==max2){
            list.add(max1);
            if(al.size()>=1){
            int max3=Collections.max(al);
            list.add(max3);
            }
            else{
            list.add(-1);}
        }
        else if(max1>max2){
            list.add(max1);
            list.add(max2);
        }
        else{
            list.add(max2);
            list.add(max1);
        }
        }
        else if(al.size()<2){
            list.add(al.get(0));
            list.add(-1);
        }
        return list;
    }
}