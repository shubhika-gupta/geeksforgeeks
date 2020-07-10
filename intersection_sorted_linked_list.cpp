//intersection of two sorted linked list
Node* findIntersection(Node* a, Node* b)
{
    // Your Code Here
    /* base case */
    if (a == NULL || b == NULL) 
        return NULL; 
  
    /* If both lists are non-empty */
  
    /* advance the smaller list and call recursively */
    if (a->data < b->data) 
        return findIntersection(a->next, b); 
  
    if (a->data > b->data) 
        return findIntersection(a, b->next); 
  
    // Below lines are executed only 
    // when a->data == b->data 
    struct Node* temp 
        = (struct Node*)malloc( 
            sizeof(struct Node)); 
    temp->data = a->data; 
  
    /* advance both lists and call recursively */
    temp->next = findIntersection(a->next, b->next); 
    return temp; 
}