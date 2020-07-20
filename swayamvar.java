//This is The Coding Area
import java.util.*;
class swayamvar{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    String bride=sc.nextLine();
    String groom=sc.nextLine();
    Queue<Character> q1=new LinkedList<>();
    Queue<Character> q2=new LinkedList<>();
    int res=0;
    for(int i=0;i<n;i++){
      q1.add(bride.charAt(i));
      q2.add(groom.charAt(i));
    }
    while(true){
      int flag=0;
      int s=q2.size();
      while(s--){
        if(q1.peek()==q2.peek()){
          q1.remove();
          q2.remove();
          res++;
          flag=1;
          break;
        }
        else{
          char ch=q2.peek();
          q2.remove();
          q2.add(ch);
        }
      }
      if(flag==0){
        System.out.print(n-res);
        break;
      }
    }
  }
}