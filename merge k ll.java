//merge k list
class Merge
{
    Node sorted(Node a,Node b){
        if(a==null) return b;
        if(b==null) return a;
        if(a.data<b.data)
        {
            a.next=sorted(a.next,b);
            return a;
        }
        else{
            b.next=sorted(a,b.next);
            return b;
        }
    }
    Node mergeKList(Node[] a,int N)
    {
        //Add your code here.
        N--;
        while(N!=0){
            int i=0,j=N;
            while(i<j){
                a[i]=sorted(a[i],a[j]);
                i++;
                j--;
                if(i>=j)
                N=j;
            }
        }
        return a[0];
    }
}