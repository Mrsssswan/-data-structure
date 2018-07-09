package matrix;

import java.util.Scanner;

/**
 * 对邻接矩阵的操作
 * @author wan
 *
 */
public class GraphOperator {
	
	public static void main(String[] args) {
		MatrixGraph graph = new MatrixGraph();
		//创建并输出一个邻接矩阵
		createMGraph(graph);
		int[][] edges = graph.getEdges();
		char[] vertext = graph.getVertxs();
		System.out.print("      ");
		for(int i=0; i<vertext.length; i++) {
			System.out.print(vertext[i]+"     ");
		}
		System.out.println();
		for(int i=0; i<edges.length; i++) {
			System.out.print(vertext[i]+"    ");
			for(int j=0; j<edges[i].length; j++) {
				System.out.print(edges[i][j]+"      ");
			}
			System.out.println();
		}
	}

	/**
	 * 创建一个邻接矩阵
	 * @param graph
	 */
	private static void createMGraph(MatrixGraph graph) {
		Scanner read = new Scanner(System.in);
		System.out.println("请输入所有顶点:");
		String vertext = read.nextLine();
		//读入顶点信息，建立定点表
		graph.setVertxtNums(vertext.length());
		char[] vertexs = new char[graph.getVertxtNums()];
		for(int i=0; i<vertexs.length; i++) {
			vertexs[i] = vertext.charAt(i);
		}
		graph.setVertxs(vertexs);
		System.out.println("请输入边数:");
		graph.setEdgesNums(read.nextInt());
		//建立邻接矩阵
		int[][] edges = new int[graph.getVertxtNums()][graph.getVertxtNums()];
		for(int i=0; i<edges.length; i++) {
			for(int j=0; j<edges[i].length; j++) {
				//邻接矩阵初始化
				edges[i][j] = 0;
			}
		}
		//读入边数
		int i=0,j=0,w=0;
		for(int k=0; k<graph.getEdgesNums(); k++) {
			System.out.println("请输入你要读取的边的下标以及权重w");
			 i = read.nextInt();
			 j = read.nextInt();
			 w = read.nextInt();
			edges[i][j] = w;
			edges[j][i] = edges[i][j];
		}
		graph.setEdges(edges);
	}
}
