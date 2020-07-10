//implementation of two stacks using array
class Stacks
{
    // sq is the object of class TwoStack

    /* The method push to push element into the stack 2 */
    void push1(int x, TwoStack sq)
    {
        if(sq.top1<sq.top2-1){
            sq.top1++;
            sq.arr[sq.top1]=x;
        }
    }

    /* The method push to push element into the stack 2*/
    void push2(int x, TwoStack sq)
    {
        if(sq.top1<sq.top2-1){
            sq.top2--;
            sq.arr[sq.top2]=x;
        }
    }

    /* The method pop to pop element from the stack 1 */
    //Return the popped element
    int pop1(TwoStack sq)
    {
        if(sq.top1>=0){
            int x=sq.arr[sq.top1];
            sq.top1--;
            return x;
        }
        return -1;
    }

    /* The method pop to pop element from the stack 2 */
    //Return the popper element
    int pop2(TwoStack sq)
    {
        if(sq.top2<sq.size){
            int x=sq.arr[sq.top2];
            sq.top2++;
            return x;
        }
        return -1;
    }
}