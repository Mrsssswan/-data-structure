package matrix;

/**
 * 邻接矩阵
 * @author wan
 *
 */
public class MatrixGraph {
	private char vertex;//顶点
	private int edge;//边
    private char[] vertxs;//顶点数组
    private int[][] edges;//边数组
    private int vertxtNums;//当前顶点数
    private int edgesNums;//当前边数
	public MatrixGraph() {
		super();
	}
	public MatrixGraph(char vertex, int edge, char[] vertxs, int[][] edges, int vertxtNums, int edgesNums) {
		super();
		this.vertex = vertex;
		this.edge = edge;
		this.vertxs = vertxs;
		this.edges = edges;
		this.vertxtNums = vertxtNums;
		this.edgesNums = edgesNums;
	}
	public char getVertex() {
		return vertex;
	}
	public void setVertex(char vertex) {
		this.vertex = vertex;
	}
	public int getEdge() {
		return edge;
	}
	public void setEdge(int edge) {
		this.edge = edge;
	}
	public char[] getVertxs() {
		return vertxs;
	}
	public void setVertxs(char[] vertxs) {
		this.vertxs = vertxs;
	}
	public int[][] getEdges() {
		return edges;
	}
	public void setEdges(int[][] edges) {
		this.edges = edges;
	}
	public int getVertxtNums() {
		return vertxtNums;
	}
	public void setVertxtNums(int vertxtNums) {
		this.vertxtNums = vertxtNums;
	}
	public int getEdgesNums() {
		return edgesNums;
	}
	public void setEdgesNums(int edgesNums) {
		this.edgesNums = edgesNums;
	}

    
}
