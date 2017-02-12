package diGraph;

//ADS Gruppe 1
//Sergey Gerodes 192 73 70 
//Bastian Häuser 215 01 45
//Lazaros Dimitriadis 192 84 96


public class DiGraph {
	
	private List nodeList; 
	
	public DiGraph(){
		
	}
	
	
	public DiGraphNode addNode(Object key){	
		
		DiGraphNode newNode = new DiGraphNode(key);
		
		if (nodeList == null) nodeList = new List(newNode);
		else nodeList.insert(newNode);
		
		return newNode;
	}
	
	
	public void addEdge(DiGraphNode v1, DiGraphNode v2){
		//DiGraphNode node1 = find(v1);
		//DiGraphNode node2 = find(v2);
		
		v1.setNeighbor(v2);
		v2.setNeighbor(v1);
	}
	
	public DiGraphNode find(Object key){
		
		ListItem l = nodeList.getHead();
		DiGraphNode v = null;
		
		while (l.next != null){
			l = l.next;
			v = l.key;
			if ( key.equals(v.getKey()) ) return v;
			
		}
		return null;
	}
	
	
	public DiGraph(Object[] keys, boolean[][] adjacencyMatrix){

		nodeList = new List(null);
		
		for (int i = 0; i < keys.length; ++i){
			addNode(keys[i]);
		}
		
		for (int j = 0; j < adjacencyMatrix.length; ++j){
			for (int k = 0; k < adjacencyMatrix[j].length; ++k){
				if (adjacencyMatrix[j][k]){
					addEdge( find(keys[j]), find(keys[k]) );
				}
			}
		}
		
	}
	
	
}
