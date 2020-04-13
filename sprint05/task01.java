// Create the abstract base class Employee with protected string variable employeelD and public getFullInfo() method without an implementation. Create public constructor with one string parameter for this class.
// Create two classes SalariedEmployee and ContractEmployee, which are inherited from the Employee class.

// •Describe protected string field socialSecurityNumber in the class SalariedEmployee.
// •Include a description of string protected federalTaxIDMember field in the class of ContractEmployee.
// •Describe constructors with two parameters for ContractEmployee class and for SalariedEmployee class for initializing corresponding fields.
// •getFullInfo should return String containing:
//      • employeelD and socialSecurityNumber for SalariedEmployee
//      • employeelD and federalTaxIDMember for ContractEmployee

// Write your code here

abstract class  Employee{
    protected String employeeID;

    abstract String getFullInfo();

    public Employee(String employeeID) {
        this.employeeID = employeeID;
    }
}

class SalariedEmployee extends Employee{

    protected String socialSecurityNumber;

    public SalariedEmployee(String employeeID, String socialSecurityNumber) {
        super(employeeID);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    String getFullInfo() {
        return employeeID + " " + socialSecurityNumber;
    }
}

class ContractEmployee extends Employee{

    protected String federalTaxIDMember;

    public ContractEmployee(String employeeID, String federalTaxIDMember) {
        super(employeeID);
        this.federalTaxIDMember = federalTaxIDMember;
    }

    @Override
    String getFullInfo() {
        return employeeID + " " + federalTaxIDMember;
    }
}
