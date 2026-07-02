public class Main1 {
    static abstract class TeamMember{
        protected String name;
        
        public TeamMember(String name){
            this.name = name;
        }
        public void work(){
            System.out.println(name+ "is working");
        }
    }interface BonusEligible{
        void calculateBonus();
    } 
    static class Employee extends TeamMember implements BonusEligible{
        public Employee(String name){
            super(name);
        } public void calculateBonus(){
                System.out.println("Calculating standard employee bonus");
        }
    }
    static class Contractor extends TeamMember{
        public Contractor(String name){
            super(name);
        }
        public void submitInvoice(){
            System.out.println(name+"submitted invoice");
        }
    }public static void main(String[] args) {
        TeamMember employee = new Employee ("Alice");
        TeamMember contractor = new Contractor ("Bob");
        employee.work();
        contractor.work();
        
        BonusEligible bonusEmployee = (BonusEligible) employee;
        bonusEmployee.calculateBonus();
    }
}
