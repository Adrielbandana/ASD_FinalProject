import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
public class main{
    // public static void printStack(ArrayList<String> ss){
        
    // ArrayList<String> sg = (ArrayList<String>) ss.clone();
    
    //     while (!sg.isEmpty()){
    //         System.out.print(" " + sg.pop());
    //     }
    //     System.out.println();
        
    // }
    
    public static void printQueue(Queue<String> queue){
        for (String num : queue){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter Total Patients: ");
    int total = input.nextInt();
    input.nextLine();
    String name, priority = null;
    PriorityQueue<String> pq = new PriorityQueue<>();
    ArrayList<String> newst = new ArrayList<>();
    for (int i = 0; i < total; i++) {
        System.out.println("Enter Patient Name: ");
        name = input.nextLine();
        newst.add(name);

        System.out.println("Is This Patient a Priority? (Y/N)");
        char status = input.next().charAt(0);
        input.nextLine();
        if (status == 'y' || status == 'Y'){
            pq.add(name);
        }
        
    }
    System.out.println("The List of Patients Treated: ");
    System.err.println(newst);

    Queue<String> newQueue = new LinkedList<>();
    //enqueue
    for (String patient : newst) {
        newQueue.offer(patient);
    }
    System.out.print("The queue of patient: ");
    printQueue(newQueue);
    

    //Dequeue
    //newQueue.poll();
    //System.out.print("The queue after enqueue: ");
    //printQueue(newQueue);

    //Peek front queue
    System.out.println("The front is: " + newQueue.peek());
    System.out.println("The Priorities are: ");
    printQueue(pq);
    }
}