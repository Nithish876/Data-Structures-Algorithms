class CycleDetector<T> {

    public static class ListNode<T> {
        T val;
        ListNode<T> next;

        ListNode(T data) {
            this.val = data;
        }
    }

    public static <T> boolean hasCycle(ListNode<T> head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode<T> slow = head;
        ListNode<T> fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;             // move by 1 step
            fast = fast.next.next;        // move by 2 steps
            if (slow == fast) {
                return true;              // cycle detected
            }
        }

        return false;                     // no cycle
    }
}

public class DetectCycle {
    public static void main(String[] args) {
        CycleDetector.ListNode<Integer> node1 = new CycleDetector.ListNode<>(1);
        CycleDetector.ListNode<Integer> node2 = new CycleDetector.ListNode<>(2);
        CycleDetector.ListNode<Integer> node3 = new CycleDetector.ListNode<>(3);
        CycleDetector.ListNode<Integer> node4 = new CycleDetector.ListNode<>(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // cycle here!

        boolean hasCycle = CycleDetector.hasCycle(node1);
        System.out.println("Cycle detected? " + hasCycle); // Output: true
    }
}
