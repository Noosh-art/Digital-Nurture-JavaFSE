package Exercise5;

public class Main {

    public static void main(String[] args) {

        TaskLinkedList list=new TaskLinkedList();

        list.add(new Task(1,"Coding","Pending"));
        list.add(new Task(2,"Testing","Completed"));

        list.display();

        list.search(2);

    }

}