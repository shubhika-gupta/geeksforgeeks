//multiply polynomials
#include <iostream> 
using namespace std; 

// A[] represents coefficients of first polynomial 
// B[] represents coefficients of second polynomial 
// m and n are sizes of A[] and B[] respectively 
int *multiply(int A[], int B[], int m, int n) 
{ 
int *prod = new int[m+n-1]; 

// Initialize the porduct polynomial 
for (int i = 0; i<m+n-1; i++) 
	prod[i] = 0; 

// Multiply two polynomials term by term 

// Take ever term of first polynomial 
for (int i=0; i<m; i++) 
{ 
	// Multiply the current term of first polynomial 
	// with every term of second polynomial. 
	for (int j=0; j<n; j++) 
		prod[i+j] += A[i]*B[j]; 
} 

return prod; 
} 

// A utility function to print a polynomial 
void printPoly(int poly[], int n) 
{ 
	for (int i=0; i<n; i++) 
	{ 
	cout << poly[i]; 
	if (i != 0) 
		cout << "x^" << i ; 
	if (i != n-1) 
	cout << " + "; 
	} 
} 

// Driver program to test above functions 
int main() 
{ 

int N,N1;
cin>>N;

int arr1[N],arr2[N1];

for(int i=0;i<N;i++)
{
    cin>>arr1[i];
}
cin>>N1;
for(int j=0;j<N1;j++)
{
    cin>>arr2[j];
}



	int *prod = multiply(arr1, arr2, N,N1); 

	printPoly(prod, N+N1-1); 

	return 0; 
} 
