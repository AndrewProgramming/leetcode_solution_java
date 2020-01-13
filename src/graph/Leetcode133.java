package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 视频学习：https://www.youtube.com/watch?v=vma9tCQUXk8&list=PLiQ766zSC5jMEpcGL0nSkfDM3paBP5FOE
 * 代码：https://github.com/bephrem1/backtobackswe/blob/master/Graphs/CloneAGraph/CloneAGraph.java
 */
public class Leetcode133 {
  /*
  // Definition for a Node.
  class Node {
      public int val;
      public List<Node> neighbors;

      public Node() {}

      public Node(int _val,List<Node> _neighbors) {
          val = _val;
          neighbors = _neighbors;
      }
  };
  */

  public Node cloneGraph(Node start) {
    // If the start node is null then we cannot do any cloning
    if (start == null) {
      return null;
    }

  /*
    vertexMap: Map the original node reference to its clone
    queue: Our queue for Breadth First Search
  */
    Map<Node, Node> vertexMap = new HashMap<>();
    Queue<Node> queue = new LinkedList<>();

    // Add the start node to the queue. Give the start node a clone in the vertexMap
    queue.offer(start);
    vertexMap.put(start, createNode(start.val));

  /*
    The breadth first search continues until we have processed all vertices
    in the original graph. We know this is done when the queue is empty
  */
    while (!queue.isEmpty()) {
      // We grab a node. We will express all of the edges coming off of this node.
      Node currVertex = queue.poll();

      // Iterate over all neighbors.
      for (Node neighbor : currVertex.neighbors) {
        // Has this neighbor been given a clone?
        if (!vertexMap.containsKey(neighbor)) {
        /*
          No? Give it a mapping and add the original neighbor to the
          search queue so we can express ITS edges later
        */
          vertexMap.put(neighbor, createNode(neighbor.val));
          queue.offer(neighbor);
        }

      /*
        Draw the edge from currVertex's clone to neighbor's clone.
        Do you see how our hashtable makes this quick access possible?
      */
        vertexMap.get(currVertex).neighbors.add(vertexMap.get(neighbor));
      }
    }

    // Return the clone of the start. This is the entry point for the cloned graph section.
    return vertexMap.get(start);
  }

  // Can't modify Leetcode's constructor so abstracting here
  private Node createNode(int value) {
    Node newNode = new Node(value);
    newNode.neighbors = new ArrayList<>();

    return newNode;
  }
}

/**
 * 执行用时 : 3 ms , 在所有 Java 提交中击败了 40.57% 的用户
 * 内存消耗 : 34.2 MB , 在所有 Java 提交中击败了 57.44% 的用户
 */
