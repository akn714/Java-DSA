import java.util.List;
import java.util.ArrayList;

public class Tree {
    private Node root;

    public Tree(int data){
        root = new Node();
        root.data = data;
        root.children = new ArrayList<>();
    }

    public static class Node {
        int data;
        List<Node> children;
        
        
        public void addChild(int data){
            Node newNode = new Node();
            newNode.data = data;
            this.children.add(newNode);
        }
    }
}



// import java.util.List;
// import java.util.ArrayList;

// public class S1L47 {
//     public static void main(String[] args) {
//         int arr[] = {1 ,3 ,7 ,0 ,2 ,2 ,8 ,1};
//         int count = 0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==0){
//                 System.out.println(-1);
//                 break;
//             };
//             // System.out.print("i: ");
//             // System.out.print(i);
//             // System.out.print(' ');
//             // System.out.println(arr[i]);
//             i += arr[i] - 1;
//             count++;
//             if(i>=arr.length - 2) break;
//             // System.out.print("i: ");
//             // System.out.print(i);
//             // System.out.print(' ');
//             // System.out.println(arr[i]);
//         }
//         System.out.println(count);
//     }
// }

// class Tree {
//     private Node root;

//     public Tree(int data){
//         root = new Node();
//         root.data = data;
//         root.children = new ArrayList<>();
//     }

//     public static class Node {
//         int data;
//         List<Node> children;
        
        
//         public void addChild(int data){
//             Node newNode = new Node();
//             newNode.data = data;
//             this.children.add(newNode);
//         }
//     }
// }
