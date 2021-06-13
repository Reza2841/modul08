/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTree;

/**
 *
 * @author Acer
 */
public class BinaryTreeApp {
    public static void main(String[] args) {
        Binarytree tree=new Binarytree();
        
        Treenode node;
        
        node = new Treenode('D');
        tree.insert(node);
        
        node = new Treenode('B');
        tree.insert(node);
        
        node = new Treenode('A');
        tree.insert(node);
        
        node = new Treenode('C');
        tree.insert(node);
        
        node = new Treenode('F');
        tree.insert(node);
        
        node = new Treenode('E');
        tree.insert(node);
        
        node = new Treenode('G');
        tree.insert(node);
        
        System.out.print("Traversal dengan preorder :");
        tree.preOrder();
        System.out.print("\nTraversal dengan inorder :");
        tree.inOrder();
        System.out.print("\nTraversal dengan postorder :");
        tree.postOrder();
        System.out.println();
    }
}

