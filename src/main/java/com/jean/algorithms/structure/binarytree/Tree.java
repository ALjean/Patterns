package com.jean.algorithms.structure.binarytree;

public class Tree {

    private Node root;

    public Node find(int key) {
        Node current = root;

        while (current.getPerson().getId() != key) {

            if (key < current.getPerson().getId()) {  /*left or write*/
                current = current.getLeftNode();
            } else {
                current = current.getRightNode();
            }

            if (current == null) {
                return null;
            }

        }

        return current;
    }

    public boolean delete(int key){
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (key != current.getPerson().getId()){
            parent = current;
            if(key < current.getPerson().getId()){
                isLeftChild = true;
                current.getLeftNode();
            }else {
                isLeftChild = false;
                current.getRightNode();
            }

            if(current == null){
                return false;
            }

        }
        return true;
    }

    public void insert(Person person) {
        Node newNode = new Node();
        newNode.setPerson(person);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (person.getId() < current.getPerson().getId()) {
                    current = current.getLeftNode();
                    if (current == null) {
                        parent.setLeftNode(newNode);
                        return;
                    }
                } else {
                    current = current.getRightNode();
                    if (current == null) {
                        parent.setRightNode(newNode);
                        return;
                    }
                }
            }
        }

    }

    public void delete(String key) {

    }
}
