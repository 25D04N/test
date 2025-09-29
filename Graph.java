package TH1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
// anh minh cu hehehe
public abstract class Graph {
	protected int numVexs;
	protected int[][] matrix;
	protected static String path="src/bt.txt";
	public Graph() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Graph(int numVexs, int[][] matrix) {
		super();
		this.numVexs = numVexs;
		this.matrix = matrix;
	}
	public boolean loadGraph(String pathFile) throws IOException {
		File input=new File(pathFile);
		 if (!input.exists()) {  // Kiểm tra xem file có tồn tại không
		        System.out.println("File không tồn tại!");
		        return false;
		    }
		BufferedReader reader=new BufferedReader(new FileReader(input));
		String lineFirst=reader.readLine();
		this.numVexs=Integer.parseInt(lineFirst);
		this.matrix=new int[numVexs][numVexs];
		String lines="";
		int intLens=0;
		while((lines=reader.readLine())!=null ) {
			String[] s=lines.split(" ");
			for(int i=0;i<numVexs;i++) {
				this.matrix[intLens][i]=Integer.parseInt(s[i]);
			}
			intLens++;
		}
		reader.close();
		return true;
	}
	public void printMatrix() {
		for(int i=0;i<this.matrix.length;i++) {
			for(int j=0;j<this.matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"");
			}
			System.out.println();
		}
	}
	public abstract boolean checkValid(int[][] m);
	public abstract void addEdge (int[][] matrix, int v1, int v2);
	public abstract void removeEdge (int[][] matrix, int v1, int v2);
	public abstract int deg(int v);
	public abstract int sumDeg (int v);
}
