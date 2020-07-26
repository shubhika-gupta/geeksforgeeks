//continuos large sum and values
#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    int a[n];
    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);
    int max_so_far = 0, max_ending_here = 0,start =0, end = 0, s=0;

    for (int i=0; i< n; i++ )
    {
        max_ending_here += a[i];

        if (max_so_far < max_ending_here)
        {
            max_so_far = max_ending_here;
            start = s;
            end = i;
        }

        if (max_ending_here < 0)
        {
            max_ending_here = 0;
            s = i + 1;
        }
    }
    printf("Sum : %d\n",max_so_far);

    for(int i=start;i<=end;i++)
        printf("%d ",a[i]);
    return 0;
}