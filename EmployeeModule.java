// method overloading



/*public class EmployeeModule {
    String firstName;
    String lastName;
    String dept;
    int Id;
    char gender;
    String Qualification;

    public void m1() {
        firstName = "Balaji";
        lastName = "Nagappan";
        dept = "Testing";
        Id = 1874;
        gender = 'M';
        Qualification = "relevant experience";

        System.out.println(firstName+" "+lastName);
    }
    public  void  m2(){
        this.Qualification = "Msc";
        System.out.println("Can be eligible");
    }

    public static void main(String[] args) {
        EmployeeModule Module1 = new EmployeeModule();
        System.out.println(Module1.firstName+"" +Module1.lastName);
        EmployeeModule module2 = new EmployeeModule();
        module2.m2();



    }



}*/
public class EmployeeModule {
    private String firstName;
    private String lastName;
    private String department;
    private int id;
    private char gender;
    private String qualification;

    public EmployeeModule(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public EmployeeModule setDepartment(String department) {
        this.department = department;
        return this;
    }

    public EmployeeModule setId(int id) {
        this.id = id;
        return this;
    }

    public EmployeeModule setGender(char gender) {
        this.gender = gender;
        return this;
    }

    public EmployeeModule setQualification(String qualification) {
        this.qualification = qualification;
        return this;
    }

    public void displayFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public void displayEligibility() {
        System.out.println("Can be eligible");
    }

    public static void main(String[] args) {
        EmployeeModule employee = new EmployeeModule("Balaji", "Nagappan")
                .setDepartment("Testing")
                .setId(1874)
                .setGender('M')
                .setQualification("relevant experience");

        employee.displayFullName();

        EmployeeModule anotherEmployee = new EmployeeModule("John", "Doe");
        anotherEmployee.displayFullName();
        anotherEmployee.displayEligibility();
    }
}


