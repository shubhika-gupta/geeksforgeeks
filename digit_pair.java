import java.util.*;
class digit_pair{
static int score(int num){
  int a=0,b=0,c=0,l=0,s=0;
  int sc=0;
  a=num%10;
  num/=10;
  b=num%10;
  num/=10;
  c=num%10;
  num/=10;
  l=a>b?a:b;
  l=c>l?c:l;
  s=a<b?a:b;
  s=c<s?c:s;
  sc=l*11+s*7;
  sc=sc%100;
  return sc;
}
  static int pair(int sc_array[],int n){
   int first_digit[]=new int[10];
    Arrays.fill(first_digit,0);
    int pairs=0,msb;
    for(int i=0;i<n;i=i+2){
      msb=sc_array[i]/10;
      for(int j=i+2;j<n;j=j+2){
        if(msb==sc_array[j]/10){
          if(first_digit[msb]<2)
          first_digit[msb]++;
        }
      }
    }
    for(int i=1;i<n;i=i+2){
      msb=sc_array[i]/10;
      for(int j=i+2;j<n;j=j+2){
        if(msb==sc_array[j]/10){
          if(first_digit[msb]<2)
          first_digit[msb]++;
        }
      }
    }
    for(int i=0;i<10;i++){
      pairs+=first_digit[i];
    }
    return pairs;
  }
  public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
    int n=Integer.parseInt(sc.nextLine());
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=sc.nextInt();
    int bit[]=new int[n];
    for(int i=0;i<n;i++)
      bit[i]=score(a[i]);
    int p=pair(bit,n);
    System.out.print(p);
  }
}
      