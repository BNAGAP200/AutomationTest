/*class  Emp {

    public void empId() {

        System.out.println("showing the empid when emp login");
    }

}

class Emp1 extends Emp {
    public void empId() {

        System.out.println("emp1 id : 001");
    }
}
class Emp2 extends Emp {

    public void empId() {
        System.out.println("emp2 id : 002");
    }
}
class Emp3 extends Emp{
    public void empId(){
        System.out.println("emp3 id : 003");
    }
}
public class Employeeidoverride {

    public static void main(String[] args) {

        Emp e = new Emp();
        e.empId();
        Emp1 e1 = new Emp1();
        e1.empId();
        Emp2 e2 = new Emp2();
        e2.empId();
        Emp3 e3 = new Emp3();
        e3.empId();
    }
}

*/

class Emp {
    protected String empId;

    public Emp(String empId) {
        this.empId = empId;
    }

    public void empId() {
        System.out.println("Showing the empid when emp login: " + empId);
    }
}

class Emp1 extends Emp {
    public Emp1() {
        super("001");
    }
}

class Emp2 extends Emp {
    public Emp2() {
        super("002");
    }
}

class Emp3 extends Emp {
    public Emp3() {
        super("003");
    }
}

public class Employeeidoverride {
    public static void main(String[] args) {
        Emp e = new Emp("Generic Emp");
        e.empId();
        Emp1 e1 = new Emp1();
        e1.empId();
        Emp2 e2 = new Emp2();
        e2.empId();
        Emp3 e3 = new Emp3();
        e3.empId();
    }
}
