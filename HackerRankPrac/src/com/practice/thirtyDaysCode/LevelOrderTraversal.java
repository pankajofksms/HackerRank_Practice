package com.practice.thirtyDaysCode;

import java.util.LinkedList;
import java.util.Scanner;

public class LevelOrderTraversal {

	static LinkedList<Node> queue = new LinkedList<>();

	public static void enqueue(Node n) {
		queue.add(n);
	}

	public static Node dequeue() {
		return queue.removeFirst();
	}

	public static void display(Node n) {
		System.out.print(n.data + " ");
	}

	static void levelOrder(Node root) {
		// Write your code here
		if (root == null)
			return;
		enqueue(root);
		while (!queue.isEmpty()) {
			Node current = dequeue();
			display(current);
			if (current.left != null)
				enqueue(current.left);
			if (current.right != null)
				enqueue(current.right);
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}

}
