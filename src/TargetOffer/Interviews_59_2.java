package TargetOffer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Interviews_59_2 {


    public static void main(String[] args) {
        MaxQueue q = new MaxQueue();
        System.out.println(q.max_value());
        q.push_back(1);
        q.push_back(2);
        System.out.println(q.max_value());
        System.out.println(q.pop_front());
        System.out.println(q.max_value());
    }

    static class MaxQueue {
        private Queue<Integer> queue;
        private Deque<Integer> maxValueQueue;

        public MaxQueue() {
            queue = new LinkedList<>();
            maxValueQueue = new LinkedList<>();
        }

        public int max_value() {
            if (maxValueQueue.size() == 0) {
                return -1;
            }
            return maxValueQueue.peek();
        }

        public void push_back(int value) {
            queue.offer(value);
            while (maxValueQueue.size() > 0 && value > maxValueQueue.peekLast()) {
                maxValueQueue.pollLast();
            }
            maxValueQueue.offer(value);
        }

        public int pop_front() {
            if (queue.size() == 0) {
                return -1;
            }
            int res = queue.poll();
            if (res == maxValueQueue.peek()) {
                maxValueQueue.poll();
            }

            return res;
        }
    }
}
