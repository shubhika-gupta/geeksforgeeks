//delete node without head 
void deleteNode(Node *pos)
{
   // Your code here
   if (pos == NULL) // If linked list is empty 
        return; 
    else { 
  
        if (pos->next == NULL) { 
            //printf("This is last node, require head, can't be freed\n"); 
            return; 
        } 
  
        struct Node* temp = pos->next; 
  
        // Copy data of the next node to current node 
        pos->data = pos->next->data; 
  
        // Perform conventional deletion 
        pos->next = pos->next->next; 
  
        free(temp); 
}
}