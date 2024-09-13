public class Tree_old{
    public static void main(String args[]){

    }
}

class MyTree{
    public static Node<Integer> init(){
        Node<Integer> Root = new Node<Integer>();
        Root.child_one = new Node<Integer>();

        return Root;
    }
}

class Node<T>{
    T data;
    Node child_one=null, child_two=null, child_three=null, child_four=null;
}



