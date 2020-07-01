//third largest element
class GfG
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    Arrays.sort(a);
	    if(n<3)
	    return -1;
	    return a[n-3];
    }
}
