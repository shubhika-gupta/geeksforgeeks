//count submatrices with given sum
#include <stdio.h>

unsigned int array[5][5];
unsigned int subSum(int top, int left, int height, int width);

int main() {
    
    unsigned int N = 0, S = 0, count = 0;
    scanf("%d", &N);
    for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
            scanf("%d", &array[i][j]);
        }
    }
    scanf("%d", &S);
    
    for(int i = 0; i < N; i++) {
        for(int j = 0; j < N; j++) {
            
            int size = 1;
            unsigned int sum = -1;
            while(i + size <= N && j + size <= N) {
                sum = subSum(i, j, size, size);
                if(sum == S) {
                    count++;
                    break;
                } else if(sum > S) {
                    break;
                } 
                
                size++;
            }
        }
    } 
    
    printf("%d", count);
    
    return 0;
}

/** 
 * Finds the sum of a sub matrix, defined by top, left, height and width. 
 * Internal function, hence bounds not checked. 
 **/
unsigned int subSum(int top, int left, int height, int width) {
    unsigned int sum = 0;
    for(int i = top; i < top + height; i++) {
        for(int j = left; j < left + width; j++) {
            sum += array[i][j];
        }
    }

    return sum;
}