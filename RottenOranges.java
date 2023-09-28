import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges {

    public static void main(String [] args) {
        int data[][] = {
                {2,1,1},
                {1,1,1},
                {1,1,2}};
        int visited[][] = new int[3][3];
        int time = 0;
        Queue<Node> queue = new LinkedList<>();
        bfs(data, visited, queue, time);
    }

    public static void bfs(int[][] data, int[][] visited, Queue<Node> queue, int time) {
        for(int i=0; i<data[0].length; i++){
            for(int j=0; j<data[0].length; j++){
                if(data[i][j] == 2 && visited[i][j]!=2){
                    visited[i][j]=2;
                    queue.add(new Node(i,j,time));
                }
            }
        }
        while(!queue.isEmpty()) {
//            time++;
            Node n = queue.poll();
            int i = n.getI();
            int j = n.getJ();
            time = n.getTime();
            if(i>0 && visited[i-1][j]!=2 && data[i-1][j]!=0) {
                visited[i-1][j] = 2;
                queue.add(new Node(i-1,j,time+1));
            }
            if(i<data[0].length-1 && visited[i+1][j]!=2 && data[i+1][j]!=0) {
                visited[i+1][j] = 2;
                queue.add(new Node(i+1,j,time+1));
            }
            if(j>0 && visited[i][j-1]!=2 && data[i][j-1]!=0) {
                visited[i][j-1] = 2;
                queue.add(new Node(i,j-1,time+1));

            }
            if(j<data[0].length-1 && visited[i][j+1]!=2 && data[i][j+1]!=0) {
                visited[i][j+1] = 2;
                queue.add(new Node(i,j+1,time+1));

            }
        }

        System.out.println("Time: "+time);
    }
}

class Node {
    int i;
    int j;
    int time;

    public Node(int i, int j, int time) {
        this.i = i;
        this.j = j;
        this.time = time;
    }
    public int getI() {
        return i;
    }
    public int getJ(){
        return j;
    }

    public int getTime() {
        return time;
    }
}
