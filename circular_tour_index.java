//circular tour
class GfG
{
    int tour(int petrol[], int distance[])
    {
        int n=petrol.length;
        if(n==1){
            if(petrol[0]>=distance[0])
            return 0;
        }
	int start = 0; 
        int end = 1; 
        int curr_petrol = petrol[start] - distance[start]; 
          
        // If current amount of petrol in truck becomes less than 0, then 
        // remove the starting petrol pump from tour 
        while(end != start || curr_petrol < 0) 
        { 
              
            // If current amount of petrol in truck becomes less than 0, then 
            // remove the starting petrol pump from tour 
            while(curr_petrol < 0 && start != end) 
            { 
                // Remove starting petrol pump. Change start 
                curr_petrol -= petrol[start] - distance[start]; 
                start = (start + 1) % n; 
                  
                // If 0 is being considered as start again, then there is no 
                // possible solution 
                if(start == 0) 
                    return -1; 
            } 
            // Add a petrol pump to current tour 
            curr_petrol += petrol[end] - distance[end]; 
              
            end = (end + 1)%n; 
        } 
          
        // Return starting point 
        return start; 
    }
}