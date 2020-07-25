#include<string.h>
int main()
{
    char a[10];
    int i,len,count=0;
    scanf("%s",a);
    len=strlen(a);
    for(i=0;i<=len;i++)
    {
        if(a[i]=='C')
        {
            count=1;
            break;
        }
        else if((a[i]=='S')||(a[i]='E')){break;}
    }
    for(;i<=len;i++)
    {
        if(a[i]=='E')
        {
            count++;
            break;
        }
        else if((a[i]=='S')&&(count==1)){count=-100;break;}
        else if(a[i]=='S'){break;}
    }
    for(;i<=len;i++)
    {
        if(a[i]=='S')
        {
            count++;
        }
        else if(a[i]=='C'){count=-100;break;}
    }
    (count>0)?printf("yes"):printf("no");
    return 0;
}