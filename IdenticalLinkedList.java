import java.util.*;
public class IdenticalLinkedlist
{
     public boolean isIdentical (Node head1, Node head2)
     {
        while(head1!=null && head2!=null){
            if(hhead1.data!=head2.data){
                return false;
            }
            head1=head1.next;
            head2=head2.next;
        }
        if(head1!=null || head2!=null){
            return false;
        }
        return true;
     }
}