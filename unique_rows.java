//unique rows
class GfG
{
    public static void printMat(int a[][],int r, int c)
    {
        //add code here.
        LinkedHashSet<ArrayList<Integer>> set=new LinkedHashSet<>();
        for(int i=0;i<r;i++){
            ArrayList<Integer> al=new ArrayList<>();
            for(int j=0;j<c;j++){
                al.add(a[i][j]);
            }
            set.add(al);
        }
        ArrayList<ArrayList<Integer>> list=new ArrayList<>(set);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++)
            System.out.print(list.get(i).get(j)+" ");
            System.out.print("$");
        }
    }
}