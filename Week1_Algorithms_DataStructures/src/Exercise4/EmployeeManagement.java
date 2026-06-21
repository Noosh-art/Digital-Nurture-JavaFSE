package Exercise4;

public class EmployeeManagement {

    Employee[] employees = new Employee[10];
    int count = 0;

    void add(Employee e) {
        employees[count++] = e;
    }

    void display() {
        for(int i=0;i<count;i++)
            employees[i].display();
    }

    void search(int id) {

        for(int i=0;i<count;i++) {

            if(employees[i].employeeId==id) {

                employees[i].display();
                return;

            }

        }

        System.out.println("Employee Not Found");

    }

    void delete(int id){

        for(int i=0;i<count;i++){

            if(employees[i].employeeId==id){

                for(int j=i;j<count-1;j++)
                    employees[j]=employees[j+1];

                count--;
                System.out.println("Deleted");
                return;

            }

        }

    }

}