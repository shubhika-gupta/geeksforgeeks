//find duplicates in an array
class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int count[]=new int[100000];
        Arrays.fill(count,0);
        for(int i:arr){
            count[i]++;
        }
        ArrayList<Integer> list=new ArrayList<>();
        boolean flag=false;
        for(int i=0;i<100000;i++){
            if(count[i]>1){
                list.add(i);
                flag=true;
            }
        }
        if(flag){
            return list;
        }
        else{
            list.add(-1);
            return list;
        }
    }
}
