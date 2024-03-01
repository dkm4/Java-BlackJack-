import java.util.Scanner;

public class practiceTest {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int priority;
        int tasks;

        priority = scnr.nextInt();
        tasks = scnr.nextInt();

        System.out.println(findNumPeople(priority, tasks));
    }

    public static int findNumPeople(int numPriority, int numTask) {

        int people;

        if (numPriority == 1) {
            if (numTask >= 100) {
                people = 85;
            } else if (numTask >= 30) {
                people = 80;
            } else {
                people = 60;
            }
        } else if (numPriority == 20) {
            if (numTask >= 100) {
                people = 55;
            } else if (numTask >= 30) {
                people = 50;
            } else {
                people = 45;
            }
        } else if (numPriority == 3) {
            if (numTask >= 100) {
                people = 35;
            } else if (numTask >= 30) {
                people = 30;
            } else {
                people = 25;
            }
        } else {
            people = 1;
        }
        return people;


    }
}