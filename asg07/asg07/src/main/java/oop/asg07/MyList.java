/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.asg07;



/**
 *
 * @author Luong
 */
public  class MyList implements Item {
         Node start;
	 Node end;
	public MyList()
	{
		start = end = null;
		
	}

public void append(Item newData) {
	
		Node newNode = new Node(newData.clone(), null);
		if (start == null)
		{
			start = newNode;
			end = start;
		}
		else
		{
			end.next = newNode;
			end = newNode;
			end.next = null;
		}
	}
public void appendList(MyList other) {
	
		Node p = other.start;
		while (p != null)
		{
			this.append(p.data.clone());
			p = p.next;
		}
	}
	 
         @Override
         public Item clone() {
	
		MyList ds = new MyList();
		Node p = this.start;
		while (p != null)
		{
			ds.append(p.data.clone());
			p = p.next;
		}
		return ds;
	}
         @Override
	public String toString() {
	
		String rsString = "(";
		Node p = this.start;
		while (p != end)
		{
			rsString = rsString + p.data.toString() + ", ";	
			p = p.next;
		}
		rsString = rsString + p.data.toString() + ")";
		return rsString;
	}
	
	public int length() {
	
		int length = 0;
		Node p = this.start;
		while (p != null)
		{
			length++;
			p = p.next;
		}
		return length;
	}
	public boolean equals(Item otherItem){ 
	
		return this.toString().equals(otherItem.toString());
	}
	
	public Item find(Item key){ 
	
		String keyString = key.toString();
		Node p = this.start;
		while ((p != null) && (p.data.toString().equals(keyString)))
		{
			p = p.next;
		}
		return p.data;
	}
	
	private void insert(Item newData){
	
		Node newNode = new Node(newData.clone(), null);
		if (start == null)
		{
			start = newNode;
			end = start;
		}
		else
		{
			Node oldStart;
			oldStart = start;
			start = newNode;
			start.next = oldStart;
		}
	}
	public void invert() {
	
		MyList l = new MyList();
		Node p = this.start;
		while (p != null)
		{
			l.insert(p.data);
			p = p.next;
		}
		this.start = l.start;
		this.end = l.end;
	}

   
}


     
         



       
        
    
   

    