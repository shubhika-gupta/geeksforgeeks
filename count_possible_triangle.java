//count possible traingles
class Count_possible_triangle
{
    // Function to find number of triangles that can be formed
    // arr[]: input array
    // n: size of array
    static long findNumberOfTriangles(int arr[], int n)
    {
        Arrays.sort(arr); 
        int count = 0; 
        for (int i = 0; i < n - 2; ++i) { 
            int k = i + 2; 
            for (int j = i + 1; j < n; ++j) { 
                while (k < n && arr[i] + arr[j] > arr[k]) 
                    ++k; 
                if (k > j) 
                    count += k - j - 1; 
            } 
        } 
        return count; 
    }
}