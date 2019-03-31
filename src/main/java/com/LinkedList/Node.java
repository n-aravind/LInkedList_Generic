package com.LinkedList;

public class Node<T> {
    private T value;
    private Node reference;

    public Node(T value) {
        this.value = value;
        this.reference = null;
    }

    public Node getReference() {
        return reference;
    }

    public void setReference(Node reference) {
        this.reference = reference;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value='" + value + '\'' +
                ", reference=" + reference +
                '}';
    }
}
