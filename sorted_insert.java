//insert node in sorted linked list
class Solution {
    Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node newNode=new Node(key);
        if (head == null || head.data >= newNode.data)
		{
			newNode.next = head;
			head = newNode;
			return head;
		}

		// Locate the node before the point of insertion
		Node current = head;
		while (current.next != null && current.next.data < newNode.data) {
			current = current.next;
		}

		newNode.next = current.next;
		current.next = newNode;

		return head;
    }
}