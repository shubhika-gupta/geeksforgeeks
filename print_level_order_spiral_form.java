//print level order spiral form
class Spiral
{
     int height(Node root){
         if(root==null)
         return 0;
         int l=height(root.left);
         int r=height(root.right);
         if(l>r)
         return 1+l;
         else
         return 1+r;
     }
     void print(Node node,int lvl,boolean flag){
         if(node==null)
         return;
         if(lvl==1){
         System.out.print(node.data+" ");
         return;}
         else if(lvl>1){
         if(flag){
             print(node.left,lvl-1,flag);
             print(node.right,lvl-1,flag);
         }
             else{
                 print(node.right,lvl-1,flag);
                 print(node.left,lvl-1,flag);
             }
         }
     }
      void printSpiral(Node node) 
      {
           if(node==null)
           return;
           int h=height(node);
           boolean ltr=false;
           for(int i=1;i<=h;i++){
               print(node,i,ltr);
               ltr=!ltr;
           }
      }
}