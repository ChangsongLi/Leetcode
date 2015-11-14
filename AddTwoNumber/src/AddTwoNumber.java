/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class AddTwoNumber {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp  = l1;
        ListNode tmpBefore = tmp;
        ListNode tmp2  = l2;
        int addOn = 0;
        while(tmp != null && tmp2 != null){
            tmp.val = tmp.val + tmp2.val + addOn;
            if(tmp.val > 9){
                tmp.val = tmp.val -10;
                addOn = 1;
            }else{
                 addOn = 0;
            }
            tmpBefore = tmp;
            tmp = tmp.next;
            tmp2 = tmp2.next;
        }
        
        while(tmp != null){
            if(addOn == 1){
                tmp.val = tmp.val + addOn;
                 if(tmp.val > 9){
                     tmp.val = tmp.val -10;
                     addOn = 1;
                 }else{
                     addOn = 0;
                 }
                 tmpBefore = tmp;
                 tmp = tmp.next;
            }else{
                
                return l1;
            }
        }
        tmpBefore.next = tmp2;
        while(tmp2 != null){
            if(addOn == 1){
                tmp2.val = tmp2.val + addOn;
                 if(tmp2.val > 9){
                     tmp2.val = tmp2.val -10;
                     addOn = 1;
                 }else{
                     addOn = 0;
                 }
                 tmp2 = tmp2.next;
            }else{
                return l1;
            }
        }
        
        if(addOn == 1){
            tmp = l1;
            while(tmp.next != null){
                tmp = tmp.next;
            }
            tmp.next = new ListNode(1);
        }
        return l1; 
        
    }
}
