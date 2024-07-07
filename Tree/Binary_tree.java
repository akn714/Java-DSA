class Node<T>{
    T data;
    Node left=null, right=null;
}

class MyTree<T>{
    Node<T> Root;
    MyTree(T data){
        init(data);
    }
    public static Node<T> init(T data){
        Root = new Node<T>();
        Root.data = data;

        return this.Root;
    }

    public static Node<T> addLeftNode(T data){
        Node<T> newNode = new Node<T>();
        newNode.data = data;
        this.Root.left = newNode;

        return this.Root.left;
    }
    public static Node<T> addRihtNode(T data){
        Node<T> newNode = new Node<T>();
        newNode.data = data;
        this.Root.right = newNode;

        return this.Root.right;
    }
}

public class Binary_tree{
    public static void main(String args[]){
        MyTree<Integer> a = new MyTree<>(10);
        System.out.println(a.data);
    }
}



