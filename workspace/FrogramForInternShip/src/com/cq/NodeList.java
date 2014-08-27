/*package com.cq;
	class Node{
		public int value;
		public Node next;
		public Node(int value){
			this.value = value;
		}
	}
	public  class NodeList {//
		 
		
		 
		public  Node  firstNode;
		public int size;
		public LinkedList(){
			firstNode=null;
			size=0;
		}
		
		public  LinkedList<Node> getNodeList(int size){
			LinkedList<Node> nodeList = new LinkedList<Node>(); 
			this.size = size;
			int i;
			
			firstNode= new Node(0);
			firstNode.next=null;
			
			for(i=1;i<size;i++){
				Node node  = new Node(i);				
				node.next = firstNode;
				firstNode = node;			
			}
			return nodeList;
		}
		
		 
		public LinkedList<Node>   getInvertList(LinkedList<Node> nodeList){//
			LinkedList<Node> invertedNodeList = new LinkedList<Node>();
			 
			Node tempNode=(Node) nodeList.firstNode;
			invertedNodeList.firstNode = tempNode;
			invertedNodeList.firstNode.next=null;
			
			while((tempNode=tempNode.next)!=null){//put nodes into the stack
							
				tempNode=invertedNodeList.firstNode ;
				
				invertedNodeList.firstNode=tempNode;
				
			}
			
		    return invertedNodeList;
		}
		
	}
	
		 
	
	
 */