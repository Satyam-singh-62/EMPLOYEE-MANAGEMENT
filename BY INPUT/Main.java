import java.util.*;
public class Main {
    public static void main(String[] args) {
       List<Employee> list=new ArrayList<Employee>();
       Scanner sc=new Scanner(System.in);

       System.out.println("Enter 5 employe details ... :");
       
       for(int i=1;i<=5;i++){
        System.out.println("Enter Emp"+i+"details:");
        int id=sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        int Salary=sc.nextInt();
        Employee e=new Employee(id, name, Salary);
        list.add(e);
       }

       sc.close();

       System.out.println("Details are :");
       for(Employee e:list){
        System.out.println(e.id+","+e.name+","+e.Salary);
       }
    }
    
}
