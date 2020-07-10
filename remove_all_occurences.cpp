//delete all ocuurences of a key
Node* deleteAllOccurances(Node *head,int key)
{
    //Your code here
    struct Node** pp = &head; 
    while (*pp) { 
  
        struct Node* entry = *pp; 
  
        // If key found, then put 
        // next at the address of pp 
        // delete entry. 
        if (entry->data == key) { 
            *pp = entry->next; 
            delete (entry); 
        } 
  
        // Else move to next 
        else
            pp = &(entry->next); 
    } 
    return head;
}