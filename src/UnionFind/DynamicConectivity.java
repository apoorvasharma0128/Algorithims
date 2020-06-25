package UnionFind;

import java.util.Scanner;

public class DynamicConectivity {

    static Scanner scan;
    static QuickFind quickFind;
    static int nodes=0;


    public static void main(String args[]){
        DynamicConectivity dc = new DynamicConectivity();
        dc.inputData();
        scan = new Scanner(System.in);
        System.out.print("Do you want to perform operation(Yes/NO)?:");
        String op=scan.nextLine();
        while(op.equalsIgnoreCase("Yes")) {
            System.out.println("Select the operation to implement:");
            System.out.println("1:Quick-Find - Find Connected Components");
            System.out.println("2:Quick-Find - Perform Union of Nodes");
            System.out.println("3:Quick-Find - Check if nodes are connected");
            int choice = scan.nextInt();
            int x, y;
            switch (choice) {
                case 1:
                    break;
                case 2:
                    System.out.println("Enter the node1 and node2");
                    x = scan.nextInt();
                    y = scan.nextInt();
                    quickFind.union(x, y);
                    break;
                case 3:
                    System.out.println("Enter the node1 and node2");
                    x = scan.nextInt();
                    y = scan.nextInt();
                    boolean isConnected =quickFind.isConnected(x, y);
                    System.out.println(x+" and "+y+" are connected:"+isConnected);
                    break;
                default:
                    break;
            }
        }
    }

    private void inputData(){
        scan = new Scanner(System.in);
        System.out.println("Enter the number of nodes:");
        nodes=scan.nextInt();
        quickFind =new QuickFind(nodes);


    }
}
