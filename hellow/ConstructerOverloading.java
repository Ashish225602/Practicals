package hellow;

class Employees1 {
    int empid;
    long contactNo;
    String empName;
    String empAdd;

    public Employees1(int empid, long contactNo) {
        this.empid = empid;
        this.contactNo = contactNo;
    }

    public Employees1(int empid, long contactNo, String empName) {
        this.empid = empid;
        this.contactNo = contactNo;
        this.empName = empName;
    }

    public Employees1(int empid, long contactNo, String empName, String empAdd) {
        this.empid = empid;
        this.contactNo = contactNo;
        this.empName = empName;
        this.empAdd = empAdd;
    }

    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("Employee (id = ").append(empid)
         .append(", contact = ").append(contactNo)
         .append(", Name = ").append(empName)
         .append(", Address = ").append(empAdd)
         .append(")");
        return b.toString();
    }
}

public class ConstructerOverloading {
    public static void main(String[] args) {
    	Employees1 e = new Employees1(1, 8329209323L);
    	Employees1 e1 = new Employees1(2, 8329209323L, "Ashish");
    	Employees1 e2 = new Employees1(3, 8329209323L, "Ashish", "Boisar");

        System.out.println(e);
        System.out.println(e1);
        System.out.println(e2);
    }
}
