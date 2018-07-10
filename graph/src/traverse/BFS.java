package traverse;

import matrix.MatrixGraph;
import matrix.MatrixGraphOperator;

/**
 * 广度遍历
 * @author wan
 *
 */
public class BFS {
	
	public static void main(String[] args) {
		MatrixGraph graph = new MatrixGraph();
		//创建一个邻接矩阵
		MatrixGraphOperator.createMGraph(graph);
		BFS(graph);
	}
	
	/**
	 * 对邻接矩阵的广度遍历
	 * @param graph
	 */
	public static void BFS(MatrixGraph graph) {
		
		
	}

}
