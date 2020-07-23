#include<stdio.h>
#include<math.h>
 // returns the leftmost position of the repeating digit if present, else -1.
int unique_digit(int n)
{
	int a[10]={-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,};
	int r,pos=0;
	while(n)
	{
		r=n%10;
		
		if(a[r]==-1)
		a[r]=pos;
		else
		return a[r];		
		
		pos++;
		n /= 10;
	}
	return -1;
}



int main()
{
	int pos,st,end,i,x,y;
	scanf("%d %d", &st, &end);
	for(i=st;i<=end;++i)
	{
		pos=unique_digit(i);
		if(pos==-1)
		{ printf("%d ", i); continue; }
		else
		if(pos==0)
		continue;
		
		/*
		1105
		pos=2;
		x=100;
		y = 1105%100 = 5
		i = i+ (95) - 1 = 1199
		which in next iteration becomes 1200 
		*/
		
		x=pow(10,pos);
		y=i%x;
		
		i = i + (x-y) -1;  // minus 1 as for will also increment it by 1 always.
	}
}