package com.cd.collections.singleLinkedList;

import lombok.Data;

/**
 * @ClassName
 * @Description:节点。包含数据和下一个节点.
 * @Author DooFy
 * @Date 2020/4/13
 * @Version
 **/
@Data
public class Node<T> {
    private T data;
    private Node<T> nextNode;

}
