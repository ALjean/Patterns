package com.jean.algorithms.structure.binarytree;

public class Tree {

    private Node root;

    public Node find(int key) {
        Node current = root;

        while (current.getKey() != key) {

            if (key < current.getKey()) {  /*left or write*/
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

    public boolean delete(int key) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while (key != current.getKey()) {
            parent = current;
            if (key < current.getKey()) {
                isLeftChild = true;
                current.getLeftNode();
            } else {
                isLeftChild = false;
                current.getRightNode();
            }

            if (current == null) {
                return false;
            }

            if (current.getLeftNode() == null && current.getRightNode() == null) {
                if (current == root) {
                    root = null;
                } else if (isLeftChild) {
                    parent.getLeftNode();
                } else {
                    parent.getRightNode();
                }
            } else if (current.getRightNode() == null) {
                if (current == root) {
                    root = current.getLeftNode();
                } else if (isLeftChild) {
                    parent.setLeftNode(current.getLeftNode());
                } else {
                    parent.setRightNode(current.getRightNode());
                }
            } else if(current.getLeftNode() == null){
                if(current == root){
                    root = current.getRightNode();
                }else if(isLeftChild){
                    parent.setLeftNode(current.getRightNode());
                }else{
                    parent.setRightNode(current.getRightNode());
                }
            } else {
                Node successor = getSuccessor(current);

                if(current == root){
                    root = successor;
                }else if(isLeftChild){
                    parent.setLeftNode(successor);
                }else {
                    parent.setRightNode(successor);
                }

                return true;
            }


        }
        return true;
    }


    private Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.getRightNode();

        while (current != null){
            successorParent = successor;
            successor = current;
            current = current.getLeftNode();

            if(successor != delNode.getRightNode()){
                successorParent.setLeftNode(successor.getRightNode());
                successor.setRightNode(delNode.getRightNode());
            }


        }

        return successor;
    }

    public void insert(int key, Person person) {
        Node newNode = new Node();
        newNode.setKey(key);
        newNode.setPerson(person);

        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (person.getId() < current.getKey()) {
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
