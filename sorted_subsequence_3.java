//sorted subsequence of size 3
class GfG {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        int max=n-1,min=0;
        int small[]=new int[n];
        small[0]=-1;
        for(int i=1;i<n;i++){
            if(arr.get(i)<=arr.get(min)){
                min=i;
                small[i]=-1;
            }
            else{
                small[i]=min;
            }
        }
        int great[]=new int[n];
        great[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            if(arr.get(i)>=arr.get(max)){
                max=i;
                great[i]=-1;
            }
            else
            great[i]=max;
        }
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(small[i]!=-1&&great[i]!=-1){
                al.add(arr.get(small[i]));
                al.add(arr.get(i));
                al.add(arr.get(great[i]));
                Collections.sort(al);
                return al;
               // System.out.println(al);
            }
        }
        return al;
}
}