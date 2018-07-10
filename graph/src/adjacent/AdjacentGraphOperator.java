package adjacent;

import java.util.Scanner;

/**
 * 邻接表操作
 * @author wan
 *
 */
public class AdjacentGraphOperator {
	private final static int MAX = 10;
	public static void main(String[] args) {
		AdjacentGraph graph = new AdjacentGraph();
		createAGraph(graph);
		//输出顶点
		AdjacentVertexNode[] vertexs = graph.getVertexs();
        for(int i=0; i<graph.getVertexsNum(); i++) {
        	System.out.print(vertexs[i].getVertex()+": ");
        	//输出边
            	System.out.print(vertexs[i].getEdgeNode().getAdjvex()+"----->");
            	 System.out.println();
            }
           
        }
        
        
	

	/**
	 * 创建邻接表结构
	 * @param graph
	 */
	public static void createAGraph(AdjacentGraph graph) {
		Scanner read = new Scanner(System.in);
		System.out.println("请输入所有顶点：");
		String nodes = read.nextLine(); 
		graph.setVertexsNum(nodes.length());
		//读入顶点信息，建立顶点表
		AdjacentVertexNode[] vertexs = new AdjacentVertexNode[MAX];
		for(int i=0; i<graph.getVertexsNum(); i++) {
			vertexs[i] = new AdjacentVertexNode();
			vertexs[i].setVertex(nodes.charAt(i));
		}
		graph.setVertexs(vertexs);
		//建立边表
		System.out.println("请输入边数：");
		graph.setEdgesNum(read.nextInt());
		AdjacentEdgeNode edge = null;
		for(int k=0; k<graph.getEdgesNum();   k++) {
			System.out.println("请输入边的序号");
			int i = read.nextInt();
			int j = read.nextInt();
			edge = new AdjacentEdgeNode();
			edge.setAdjvex(j);
			graph.getVertexs()[i].setEdgeNode(edge);
			edge.setEdgeNode(graph.getVertexs()[i].getEdgeNode());
			
			edge = new AdjacentEdgeNode();
			edge.setAdjvex(i);
			graph.getVertexs()[j].setEdgeNode(edge);
			edge.setEdgeNode(graph.getVertexs()[j].getEdgeNode());
		}
		
	}
      
	
}
