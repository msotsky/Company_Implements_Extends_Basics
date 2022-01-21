public class Investor implements Company {
    
    private String name;
    private double investment;

    public Investor(String name, double investment){
        this.name = name;
        this.investment = investment;
    }

    public String getName(){
        return this.name;
    }

    public double getInvestment(){
        return this.investment;
    }

    public double getSalary(){
        return this.investment * 0.9;
    }

}
