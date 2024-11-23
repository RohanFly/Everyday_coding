package linkedList;

public class Main {
	
	static Node delete_index(Node head,int index)
	{
		int count=0;
		Node prev=null,temp=head;
		if(head==null) return null;
		if(index==1)
		{
			head=head.next;
			return head;
			
		}
		while(temp!=null)
		{
			count++;
			if(count==index)
			{
				prev.next=prev.next.next;
				break;
			}
			else
			{
				prev=temp;
				temp=temp.next;
			}
		}
		return head;
		}
	
	static Node Insert_head(Node head,int val)
	{
		return new Node(val,head);
	}
	
	static Node Insert_Tail(int val,Node head)
	{
		Node mover=head;
		while(mover.next!=null)
			mover=mover.next;
		
		mover.next=new Node(100);
		
		return head;
	}
	
	static Node Insert_At_Any(int val,Node head,int index)
	{
		if(head==null) return new Node(val);
		if(index==1) return new Node(val,head);
		
		int cnt=0;
		Node temp=head;
		
		while(temp!=null)
		{
			cnt++;
			if(cnt==index-1)
			{
				Node insert=new Node(val,temp.next);
				temp.next=insert;
				break;
			}
			temp=temp.next;
		}
		return head;
	}
	
	public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,6};
	Node head=new Node(arr[0]);
	Node mover=head;
		
	for(int i=1;i<arr.length;i++) //inserting array ele into LL
	{
		
		Node temp=new Node(arr[i]);
		mover.next=temp;
		mover=temp;
	}
//	head=delete_index(head,1);
//	head=Insert_head(head,5);
//	head=Insert_Tail(100,head);
	head=Insert_At_Any(10,head,3);
	mover=head;
	
	while(mover!=null) //Traversing LL
	{
		System.out.println(mover.data);
		mover=mover.next;
	}

	}

}
