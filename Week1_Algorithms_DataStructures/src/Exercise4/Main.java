package Exercise4;

public class Main {

    public static void main(String[] args) {

        EmployeeManagement em=new EmployeeManagement();

        em.add(new Employee(1,"Anushka","Developer",50000));
        em.add(new Employee(2,"Rahul","Tester",45000));

        em.display();

        em.search(2);

        em.delete(1);

        em.display();

    }

}