public class CompanyDriver{

	public static void main(String[] args){
	
		Employee e1 = new Employee("Jason");
		Employee e2 = new Employee("Kate");
		Employee e3 = new Employee("Jake");
		Employee e4 = new Employee("Carly");
		Employee e5 = new Employee("Jessie");  
		
		Employee[] group1 = {e1, e2, e3};
		Employee[] group2 = {e4, e5};
		
		Manager e6 = new Manager("Lynn", group1);
		
		Company e7 = new Manager("Kyle", group2);
		
		Company e8 = new Investor("Jane", 50000);
		
		Company e9 = new Employee("Maggie");
		
		System.out.println(e6.getName() + "\tID: " + e6.getID());
		System.out.println(e9.getName() + "\tID: " + ((Employee) e9).getID());  
		
		//TODO: create an array that can hold all the people in the company 
		//		(employees (including managers) and investors) (e1-e9)
		
        Company[] list = {e1,e2,e3,e4,e5,e6,e7,e8,e9};
		
		//TODO: print out the name and salary of all the  
		//		(including managers) and investors using an enhanced for statement
		
        for(Company x : list){
            System.out.println("Name: " + x.getName() + "\tSalary: $" + x.getSalary());
        }
	}
}
		