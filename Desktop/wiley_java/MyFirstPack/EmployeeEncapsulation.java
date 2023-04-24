package MyFirstPack;
class Employee{
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
class EmployeeImp1{
    public void show(Employee emp){
        System.out.println("calling show methd");
        System.out.println("Name:"+emp.getName()+" age:"+emp.getAge());

    }
}
public class EmployeeEncapsulation {
    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.setName("wiley");
        emp.setAge(12);
        EmployeeImp1 eimp1=new EmployeeImp1();
        eimp1.show(emp);
    }
}
