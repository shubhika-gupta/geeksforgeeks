//w4e3d1x1e1 
#include<stdio.h>
#include <string.h>
 int main()
{
    char s[1000];  
    int  i,j,k,count=0,n;
    scanf("%s",s);
     
    for(j=0;s[j];j++);
	 n=j;
 
    for(i=0;i<n;i++)  
    {
     	count=1;
    	if(s[i])
    	{
		
 		  for(j=i+1;j<n;j++)  
	      {   
	    	
	        if(s[i]==s[j])
    	    {
                 count++;
                 s[j]='\0';
	     	}
	      }  
	      printf("%c%d",s[i],count);
    	}
 	} 
 	 
     
    return 0;
}