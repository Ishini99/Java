import java.util.*;

public class Main {
    public static void main(String[] args) {


        //list
        List<Integer> list1 = new ArrayList();
        List <Integer>list2 = new LinkedList();
        List <Integer>list3 = new Vector();
        List <Integer>list4 = new Stack();

        //arrayList
        ArrayList<String> list = new ArrayList<String>();
        list.add("ArrayList-a");
        list.add("ArrayList-b");
        list.add("ArrayList-c");
        //Traversing list through Iterator
        Iterator itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //linkedList
        LinkedList<String> list5 = new LinkedList<String>();
        list5.add("LinkedList-d");
        list5.add("LinkedList-e");
        list5.add("LinkedList-f");
        Iterator<String> itr2 = list5.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }

        //        vector
        Vector<String> v =new Vector<String>();
        v.add("Vector-a");
        v.add("Vector-b");
        Iterator <String> itr3 = v.iterator();
        while (itr3.hasNext()){
            System.out.println(itr3.next());
        }

        //stack
        Stack<String> s =new Stack<String>();
        s.push("Stack-a");
        s.push("Stack-b");
        s.push("Stack-c");
        s.push("Stack-d");
        s.pop();
        Iterator<String>itr4 = s.iterator();
        while (itr4.hasNext()){
            System.out.println(itr4.next());
        }
//        Queue Interface
        Queue<String> q1 = new PriorityQueue();
        Queue<String> q2 = new ArrayDeque();

        //PriorityQueue
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("PriorityQueue -1 ");
        queue.add("PriorityQueue -2");
        queue.add("PriorityQueue -3");
        queue.add("PriorityQueue -4");
        System.out.println("head(first element): "+queue.element());
        System.out.println("head(first element): "+queue.peek());

        Iterator itr5=queue.iterator();
        while(itr5.hasNext()){
            System.out.println(itr5.next());
        }

        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr6=queue.iterator();
        while(itr6.hasNext()){
            System.out.println(itr6.next());
        }






    }
}