import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueCode {
    static int top = -1;

    static void Qadd(Queue<Integer> q) {
        top++;
        Scanner value = new Scanner(System.in);
        System.out.println("Add Operation: ");

        int x = value.nextInt();
        q.add(x);

        System.out.println("Elements of queue "
                + q +"\n");

    }

    static void Qremove(Queue<Integer> q) {
        if (top < 0) {
            System.out.println("There's no any element to remove.");
        } else {
            int qremove = q.remove();
            System.out.println("Removed element- "
                    + qremove);

            System.out.println(q);
            top--;
        }

    }

    static void Qpeek(Queue<Integer> q) {
        int head = q.peek();
        System.out.println("Head of queue- "
                + head);
    }

    static void Qsize(Queue<Integer> q) {
        int size = q.size();
        System.out.println("Size of queue- "
                + size);
    }


    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> q
                = new LinkedList<>();


        Scanner input = new Scanner(System.in);
        System.out.println("1-) ADD    ");
        System.out.println("2-) REMOVE     ");
        System.out.println("3-) PEEK    ");
        System.out.println("4-) SIZE  ");
        System.out.println("5-) EXIT    \n");
        boolean control = true;

        while (control) {
            System.out.println("Choose your operation : ");

            int a = input.nextInt();
            switch (a) {
                case 1:
                    Qadd(q);
                    break;
                case 2:
                    Qremove(q);
                    break;
                case 3:
                    Qpeek(q);
                    break;
                case 4:
                    Qsize(q);
                    break;
                case 5:
                    System.out.println("Goodbye.. ");
                    Thread.sleep(2000);
                    control = false;
            }


        }
    }
}