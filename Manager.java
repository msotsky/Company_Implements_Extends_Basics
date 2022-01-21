public class Manager extends Employee{  //Manager is a child of employee
    
    private Employee[] group;

    public Manager(String name, Employee[] group){
        super(name); //exe employee constructor and does the work in it
        this.group = group;
    }

    public Employee[] getGroup(){
        return group;
    }

    public double getSalary(){
        return group.length * 300 + super.getSalary(); // super required since it would be recursive (same sig)
    }

    public String toString(){
        return "Name: " + this.getName() + "\tDI: " + this.getID();
    }
}
