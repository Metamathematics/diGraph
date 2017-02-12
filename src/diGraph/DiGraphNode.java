package diGraph;

public class DiGraphNode {
	
	private Object key;
	public List neighbors;
	
	
	public DiGraphNode(Object key){
		this.key = new Object();
		this.key = key;
	}
	
	
	
	public List getNeighbors(){
		return neighbors;
	}

	public void setNeighbor(DiGraphNode key){
		
		if (neighbors != null) neighbors.insert(key);
		else neighbors = new List(key);
		
	}
	
	public Object getKey(){
		return key;
	}
	
	
}
