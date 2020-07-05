//minimum number of platforms
def minimumPlatform(n,arr,dep):
    '''
    :param n: number of activities
    :param arr: arrival time of trains
    :param dep: corresponding departure time of trains
    :return: Integer, minimum number of platforms needed
    '''
    # code here
    arr.sort() 
    dep.sort() 
   
    # plat_needed indicates 
    # number of platforms 
    # needed at a time 
    plat_needed = 1
    result = 1
    i = 1
    j = 0
   
    # Similar to merge in 
    # merge sort to process  
    # all events in sorted order 
    while (i < n and j < n): 
     
        # If next event in sorted 
        # order is arrival,  
        # increment count of 
        # platforms needed 
        if (arr[i] <= dep[j]): 
          
            plat_needed+= 1
            i+= 1
          
   
        # Else decrement count 
        # of platforms needed 
        elif (arr[i] > dep[j]): 
          
            plat_needed-= 1
            j+= 1
  
        # Update result if needed  
        if (plat_needed > result):  
            result = plat_needed 
          
    return result 