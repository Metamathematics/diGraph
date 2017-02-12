package diGraph;

public class Test {
	public static void main(String[] args){
		
		/*
		Integer[] keys = {2,5};
		boolean[][] adjacencyMatrix = {{true,false},{false,false}};
		*/
		//DiGraph testGraph = new DiGraph(keys, adjacencyMatrix);
		DiGraph testGraph = new DiGraph();
		
		DiGraphNode a = new DiGraphNode(4);
		DiGraphNode b = new DiGraphNode(7);
		
		testGraph.addNode(a);
		testGraph.addNode(b);
		testGraph.addEdge(a,b);
	}
}
