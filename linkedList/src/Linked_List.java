public class Linked_List {
    static class node{
        int data;
        node next;
        node(int value){
            data = value;
            next = null;
        }
    }

    static node head;

    //display the list
    static void printList() {
        node p = head;
        System.out.print("\n[");

        //start from the beginning
        while (p != null) {
            System.out.println(" " + p.data + " ");
            p = p.next;
            if (p != null) {
                System.out.print("  ");// two spaces between numbers
            }
        }
        System.out.print(" ]");
    }

    //insertion at beginning
    static void insertatbegin(int data){

        //create a link
        node lk = new node(data);;

        //point it to old first node
        lk.next = head;

        //point first to new first node
        head = lk;

    }


    public static void main(String args[]) {
        int k = 0;
        insertatbegin(12);
        insertatbegin(13);
        insertatbegin(14);
        insertatbegin(15);
        insertatbegin(16);
        insertatbegin(17);
        System.out.println("Linked List : ");

        printList();
    }


}
