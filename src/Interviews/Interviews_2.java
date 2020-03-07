package Interviews;

import java.util.LinkedList;

public class Interviews_2 {

    public static void main(String[] args) {
        Interviews_2 interviews_2 = new Interviews_2();
        MaxQueue queue = interviews_2.new MaxQueue();
        queue.max_value();
        queue.pop_front();
        queue.pop_front();
        queue.pop_front();
        queue.push_back(94);
        queue.push_back(16);
        queue.push_back(89);
        queue.pop_front();
        queue.push_back(22);
        queue.pop_front();
    }

    class MaxQueue {

        private Node max;
        private Node root;
        private Node tail;
        class Node{
            int val;
            Node next=null;
            public Node(int val){this.val=val;}
        }

        public MaxQueue() {
            this.root=new Node(-1);
            root.next=null;
            this.max=root;
            this.tail=root;
        }

        public int max_value() {
            if(root==tail)return -1;
            return max.val;

        }

        public void push_back(int value) {
            Node tmp = new Node(value);
            tail.next = tmp;
            tail = tmp;

            if(max == root || max.val <= value) max = tmp;
        }

        public int pop_front() {
            if(tail == root)return -1;

            root = root.next;//root并不代表实际节点
            if(root == max){//最大值要出去了
                Node head = root.next;//head-tail才代表实际的队列
                max = head;
                while(head != null){
                    max = max.val <= head.val ? head:max;
                    head = head.next;
                }
            }
            max = (max == null) ? root : max;

            return root.val;
        }
    }
}
