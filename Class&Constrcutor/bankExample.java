// package Class & Constrcutor;

class Bank { // RBI
    static String mission = "To digitilazie India"; // class variable
    int interest = 6;
    int noOfEmployees = 50;
    int salary = 20000; // instance variable
    int simpleInt = 1;
    int npa;

    Bank(int interest, int noOfEmployees, int salary) {
//        i e s are local variable
        this.interest = interest;
        this.noOfEmployees = noOfEmployees;
        this.salary = salary;
        this.simpleInt = this.simpleInterest(12, 12);
    }

    Bank(int simpleInt) {
        this.simpleInt = simpleInt;
    }

    Bank() {
        this(1);
    }

    public int totalCostToCompany( ) {
//        return BankMath.totalCostTOCompanyHelper(this);
        return this.salary * this.noOfEmployees;
    }

//    Its usefull use is in Multiple classes ....
   public int totalCostTOCompanyHelper (Bank obj) {
       int nOfEmp = obj.noOfEmployees;
       int salary = obj.salary;
       return salary * nOfEmp;
   }    

    static int amount = 1000;
    public int simpleInterest(int a, int b) {
        return a*b;
    }

    public static int compoundInterest(int a, int b) {
        int c =  a* b / 100;
        return 10;
    }


}

/*
    THis main points
    1. DIfferentiating between the local variable and instance variables ...
    2. to access the INSTANCE variables and INSTANCE methods ..
    3. constructor calling....
    4. we can pass #this as an ARGUMENT..
 */

class BankMath { // DRDO
    public static int totalCostTOCompanyHelper (Bank obj) {


        int nOfEmp = obj.noOfEmployees;
        int salary = obj.salary;

        if(obj.npa > 0) {
            return salary * nOfEmp + obj.npa;
        }

        return salary * nOfEmp;
    }
}


public class bankExample {
    public static void main(String[] args) {
        Bank abc = new Bank(5, 10, 15000);
        System.out.println(abc.interest);
        System.out.println(abc.noOfEmployees);
        System.out.println(abc.salary);
        System.out.println(abc.simpleInt);
        System.out.println(abc.totalCostToCompany());

        System.out.println("-------------------------");

        Bank tata = new Bank(90);
        System.out.println(tata.interest);
        System.out.println(tata.noOfEmployees + " employee");
        System.out.println(tata.salary + " salary");
        System.out.println(tata.simpleInt);
        System.out.println(tata.totalCostToCompany());

        System.out.println("-------------------------");

        Bank cde = new Bank();
        System.out.println(cde.interest);
        System.out.println(cde.noOfEmployees);
        System.out.println(cde.salary);
        System.out.println(cde.simpleInt);
    }
}
