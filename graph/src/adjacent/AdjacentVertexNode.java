package adjacent;

/**
 * 邻接顶点表结点
 * @author wan
 *
 */
public class AdjacentVertexNode {
	private char vertex ; //顶点表结点
	private AdjacentEdgeNode EdgeNode;//下一个边表
	
	public AdjacentVertexNode() {
		super();
	}

	public AdjacentVertexNode(char vertex, AdjacentEdgeNode edgeNode) {
		super();
		this.vertex = vertex;
		EdgeNode = edgeNode;
	}

	public char getVertex() {
		return vertex;
	}

	public void setVertex(char vertex) {
		this.vertex = vertex;
	}

	public AdjacentEdgeNode getEdgeNode() {
		return EdgeNode;
	}

	public void setEdgeNode(AdjacentEdgeNode edgeNode) {
		EdgeNode = edgeNode;
	}
	

}
