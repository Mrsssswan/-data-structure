package adjacent;

/**
 * 邻接表 
 * @author wan
 *
 */
public class AdjacentGraph {
	private AdjacentVertexNode[] vertexs; //顶点表
	private int vertexsNum; //当前顶点
	private int edgesNum; //当前边数
	public AdjacentGraph() {
		super();
	}
	public AdjacentGraph(AdjacentVertexNode[] vertexs, int vertexsNum, int edgesNum) {
		super();
		this.vertexs = vertexs;
		this.vertexsNum = vertexsNum;
		this.edgesNum = edgesNum;
	}
	public AdjacentVertexNode[] getVertexs() {
		return vertexs;
	}
	public void setVertexs(AdjacentVertexNode[] vertexs) {
		this.vertexs = vertexs;
	}
	public int getVertexsNum() {
		return vertexsNum;
	}
	public void setVertexsNum(int vertexsNum) {
		this.vertexsNum = vertexsNum;
	}
	public int getEdgesNum() {
		return edgesNum;
	}
	public void setEdgesNum(int edgesNum) {
		this.edgesNum = edgesNum;
	}
	
	
}
