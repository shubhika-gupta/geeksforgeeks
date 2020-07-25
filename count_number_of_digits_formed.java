// number thus formed is of digits a and b. 
/* Surya has three number a, b and N. He was to find the count of numbers formed by digits a and b exactly of a length N such that the sum of the digits of the number thus formed also contains digits a and b only.

For Ex:

Input : a = 1 b = 3 n = 3 

Output : 1 

Explanation : The only number is 111 of length 3,

the sum of digits of 111 is 3, which is b.
*/
import java.util.Scanner;
class GFG 
{ 

	static int mod = (int) (1e9 + 7); 
	static int N = 1000005; 
	static int fact[] = new int[N], invfact[] = new int[N]; 

	// function to check if sum of 
	// digits is made of a and b 
	static int check(int x, int a, int b) 
	{ 
		// sum of digits is 0 
		if (x == 0) 
		{ 
			return 0; 
		} 

		while (x > 0) 
		{ 

			// if any of digits in sum is 
			// other than a and b 
			if (x % 10 != a & x % 10 != b) 
			{ 
				return 0; 
			} 

			x /= 10; 
		} 

		return 1; 
	} 

	// calculate the modInverse V / of a number in O(log n) 
	static int modInverse(int a, int m) 
	{ 
		int m0 = m; 
		int y = 0, x = 1; 
		if (m == 1) 
		{ 
			return 0; 
		} 

		while (a > 1) 
		{ 

			// q is quotient 
			int q = a / m; 
			int t = m; 

			// m is remainder now, process 
			// same as Euclid's algo 
			m = a % m; 
			a = t; 
			t = y; 

			// Update y and x 
			y = x - q * y; 
			x = t; 
		} 

		// Make x positive 
		if (x < 0) 
		{ 
			x += m0; 
		} 

		return x; 
	} 

	// function to pregenerate factorials 
	static void pregenFact() 
	{ 
		fact[0] = fact[1] = 1; 
		for (int i = 1; i <= 1000000; ++i) 
		{ 
			fact[i] = (int) ((long) fact[i - 1] * i % mod); 
		} 
	} 

	// function to pre calculate the 
	// modInverse of factorials 
	static void pregenInverse() 
	{ 
		invfact[0] = invfact[1] = 1; 

		// calculates the modInverse of 
		// the last factorial 
		invfact[1000000] = modInverse(fact[1000000], mod); 

		// precalculates the modInverse of 
		// all factorials by formulae 
		for (int i = 999999; i > 1; --i) 
		{ 
			invfact[i] = (int) (((long) invfact[i + 1] 
					* (long) (i + 1)) % mod); 
		} 
	} 

	// function that returns the value of nCi 
	static int comb(int big, int smal) 
	{ 
		return (int) ((long) fact[big] * invfact[smal] % mod 
				* invfact[big - smal] % mod); 
	} 

	// function that returns the count of numbers 
	static int count(int a, int b, int n) 
	{ 
		
		// function call to pre-calculate the 
		// factorials and modInverse of factorials 
		pregenFact(); 
		pregenInverse(); 

		// if a and b are same 
		if (a == b) 
		{ 
			return (check(a * n, a, b)); 
		} 

		int ans = 0; 
		for (int i = 0; i <= n; ++i) 
		{ 
			if (check(i * a + (n - i) * b, a, b) == 1) 
			{ 
				ans = (ans + comb(n, i)) % mod; 
			} 
		} 
		return ans; 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		int a,b,n;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		n=in.nextInt();
		System.out.println(count(a, b, n)); 
	} 
}