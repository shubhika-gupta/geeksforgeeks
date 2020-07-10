//pallindrome in linkedlist
class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        String s="";
        while(head!=null){
            s+=head.data+"";
            head=head.next;
        }
        return s.equals(new StringBuilder(s).reverse().toString());
    }    
}
