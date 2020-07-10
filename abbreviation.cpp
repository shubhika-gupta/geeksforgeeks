//abbreviation of names
#include<stdio.h>
#include<string.h>
int main()
{
    char name[500];
    scanf("%[^\n]s",name);
    int i=0,j=0;
    while(name[i]!='\0')
    {
        if(name[i]==32 & j<1)
        {
            printf("%c ",name[i+1]);
            j++;
        }
        else if(i==0)
            printf("%c ",name[0]);
        else if(name[i]==32)
        {
            while(name[i]!='\0')
            {
                printf("%c",name[i+1]);
                i++;
            }
        }
        i++;
    }
}