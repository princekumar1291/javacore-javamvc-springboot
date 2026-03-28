public class oops {
  public static void main(String[] args) {
    Person person = new Person();
    person.setName("John");
    person.setAge(20);
    person.setAddress("123 Main St, Anytown, USA");
    System.out.println(person.getName());
    System.out.println(person.getAge());
    System.out.println(person.getAddress());

    Employee employee = new Employee();
    employee.setName("Jane");
    employee.setAge(25);
    employee.setAddress("456 Main St, Anytown, USA");
    employee.setSalary(50000);
    employee.setDepartment("HR");
    System.out.println(employee.getName());
    System.out.println(employee.getAge());
    System.out.println(employee.getAddress());
    System.out.println(employee.getSalary());
    System.out.println(employee.getDepartment());
  }
}

class Person {
  // attributes of the class
  String name;
  int age;
  String address;

  // methods of the class
  public void setName(String name) {
    this.name = name;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public String getAddress() {
    return address;
  }
}

class Employee extends Person {  // this is the inheritance of the Person class
  int salary;
  String department;

  public void setSalary(int salary) {
    this.salary = salary;
  }
  public void setDepartment(String department) {
    this.department = department;
  }
  public int getSalary() {
    return salary;
  }
  public String getDepartment() {
    return department;
  }
}

class Manager extends Employee {
  String managerName;
  String managerAddress;

  public void setManagerName(String managerName) {
    this.managerName = managerName;
  }
  public void setManagerAddress(String managerAddress) {
    this.managerAddress = managerAddress;
  }
  public String getManagerName() {
    return managerName;
  }
  public String getManagerAddress() {
    return managerAddress;
  }
}