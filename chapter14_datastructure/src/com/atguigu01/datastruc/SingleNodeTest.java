package com.atguigu01.datastruc;

/**
 * ClassName: SingleNode
 * Package: com.atguigu01.datastruc
 * Description:
 *
 * @Author gyq
 * @Create 2023/7/2 15:49
 * @Version 1.0
 */
class SingleNode{
    Object data;
    SingleNode next;

    public SingleNode(Object data){
        this.data = data;
    }
    public void printLinkedList(SingleNode head) {
        if (head == null) {
            return;
        }
        System.out.print(head.data + " ");
        printLinkedList(head.next);
    }
}
public class SingleNodeTest {
    public static void main(String[] args) {
        SingleNode s1 = new SingleNode("AA");
        SingleNode s2 = new SingleNode("BB");
        s1.next = s2;
        s1.printLinkedList(s1);
    }
}
