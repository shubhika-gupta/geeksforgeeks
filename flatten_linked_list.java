//flatten linked list
struct compare { 
    bool operator()(Node* a, Node* b) 
    { 
        return a->data > b->data; 
    } 
};
Node *flatten(Node *root)
{
   // Your code here
   Node* ptr = root; 
    Node* head = NULL; 
  
    // Min Heap which will return 
    // smallest element currently 
    // present in heap 
    priority_queue<Node*,vector<Node*>, compare> pq; 
  
    // Push the head nodes of each 
    // downward linked list 
    while (ptr != NULL) { 
        pq.push(ptr); 
        ptr = ptr->next; 
    } 
  
    // This loop will execute 
    // till the map becomes empty 
    while (!pq.empty()) { 
  
        // Pop out the node that 
        // contains element 
        // currently in heap 
        Node* temp = pq.top(); 
        pq.pop(); 
  
        // Push the next node pointed by 
        // the current node into heap 
        // if it is not null 
        if (temp->bottom != NULL) { 
            pq.push(temp->bottom); 
        } 
  
        // Create new linked list 
        // that is to be returned 
        if (head == NULL) { 
            head = temp; 
            ptr = temp; 
        } 
        else { 
            ptr->bottom = temp; 
            ptr = temp; 
        } 
    } 
  
    // Pointer to head node 
    // in the linked list 
    return head; 
}