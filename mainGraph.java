package TH1;

import java.io.IOException;

public class mainGraph {
	public static void main(String[] args) throws IOException {
	Graph g=new UnderGraph();
		if(g.loadGraph(g.path)==true) {
			g.printMatrix();
		}
		System.out.println(g.checkValid(g.matrix));
		g.addEdge(g.matrix, 3,3);
		g.printMatrix();
		g.removeEdge(g.matrix, 2,3);
		
		g.printMatrix();
		System.out.println(g.deg(3));
		System.out.println(g.sumDeg(1));
	}
}
