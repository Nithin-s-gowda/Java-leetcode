/*add two numbers ex: Input ( 2-> 4-> 3) + (5 -> 6-> 4)
output 7 -> 0 -> 8
explination: 342 + 465 = 807
*/ 
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){this.val = val;}
    ListNode(int val, ListNode next){ this.val = val;
    this.next = next;  }
}

public class Prog2 {
    public ListNode addTwoNum (ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry>0) {
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum /10;
            int digit = sum % 10;

            current.next = new ListNode(digit);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        // Creating first linked list: [2, 4, 3] (represents 342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Creating second linked list: [5, 6, 4] (represents 465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Adding the two numbers
        Prog2 solution = new Prog2();
        ListNode result = solution.addTwoNum(l1, l2);

        // Printing the result linked list
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
    }
}
