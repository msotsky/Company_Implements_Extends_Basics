public class Employee implements Company  { //required methods in company
    
    private String name;
    private int id;
    private static int curID = 1000;
    private final double salary;

    public Employee(String name){
        this.name = name;
        id = curID++;
        salary = 70000;
    }

    public String getName(){
        return this.name;
    }

    public int getID(){
        return this.id;
    }

    public double getSalary(){
        return this.salary;
    }
}
