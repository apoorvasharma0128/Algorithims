package UnionFind;

import java.util.ArrayList;

public class QuickFind {
    private int[] id;
    private ArrayList<String> connectedComponents = new ArrayList<String>();

    public QuickFind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++){
            id[i] = i;
        }
    }

    public QuickFind(int id[]) {
        id=this.id;
    }

    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++){
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    private void connectedComponents(){

    }
}
