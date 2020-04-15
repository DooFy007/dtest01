package com.cd.collections.singleLinkedList;

import java.util.function.Predicate;

/**
 * @ClassName
 * @Description:实现一个单向链表。
 *          链表的特点：当前节点不仅存放数据，还存储下一个节点的指针。Java实现：Node(Data,NextNode)
 *          如果是最后一个节点，则指向null.即Node(Data,Null)
 * @Author DooFy
 * @Date 2020/4/13
 * @Version
 **/
public class LinkedList<T> {
    private Node<T> head;//头节点
    private Node<T> tail;//尾节点
    private int size;//链表大小

    public boolean check(Integer index,Predicate<Integer> predicate){
        return predicate.test(index);
    }
    public boolean isEmpty(){
        return size==0;
    }
    public Node<T> getNodeByIndex(int index){
        if(check(index,i->i>=0&&i<=size-1?true:false)){

        }
        return null;
    }
}
