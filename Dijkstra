package com.coding.challange.graph;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.lang.Integer;

public class Dijkstra {

    public static void main(String[] args) {

        int V = 3, E = 3, S = 2;
        ArrayList<Integer> node1 = new ArrayList<Integer>() {{
            add(1);
            add(1);
        }};
        ArrayList<Integer> node2 = new ArrayList<Integer>() {{
            add(2);
            add(6);
        }};
        ArrayList<Integer> node3 = new ArrayList<Integer>() {{
            add(2);
            add(3);
        }};
        ArrayList<Integer> node4 = new ArrayList<Integer>() {{
            add(0);
            add(1);
        }};
        ArrayList<Integer> node5 = new ArrayList<Integer>() {{
            add(1);
            add(3);
        }};
        ArrayList<Integer> node6 = new ArrayList<Integer>() {{
            add(0);
            add(6);
        }};

        ArrayList<ArrayList<Integer>> inter1 = new ArrayList<ArrayList<Integer>>() {
            {
                add(node1);
                add(node2);
            }
        };
        ArrayList<ArrayList<Integer>> inter2 = new ArrayList<ArrayList<Integer>>() {
            {
                add(node3);
                add(node4);
            }
        };
        ArrayList<ArrayList<Integer>> inter3 = new ArrayList<ArrayList<Integer>>() {
            {
                add(node5);
                add(node6);
            }
        };
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>() {
            {
                add(inter1);
                add(inter2);
                add(inter3);
            }
        };

        int[] dist = new int[V];

        for(int i =0 ;i<V; i++) dist[i] = (int)(1e9);

        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)->x.weight- y.weight);
        dist[S] = 0;
        pq.add(new Pair(dist[S], S));

        while(pq.size()!=0) {
            int dis = pq.peek().weight;
            int node = pq.peek().node;
            pq.remove();

            for(int i=0; i<adj.get(node).size(); i++) {
                int c_dis = adj.get(node).get(i).get(1);
                int c_node =adj.get(node).get(i).get(0);


                if(dis+c_dis < dist[c_node]) {
                    dist[c_node] = dis+c_dis;
                    pq.add(new Pair(dist[c_node], c_node));
                }
            }
        }
        for(int i =0 ;i<V; i++) System.out.print(dist[i] +" ");
    }

}
    class Pair {

        int node;
        int weight;

        public Pair(int weight, int node) {
            this.node = node;
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        public int getNode() {
            return node;
        }
    }
