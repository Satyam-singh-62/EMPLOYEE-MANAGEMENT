import java.util.*;
public class Details {
    public static void main(String[] args) {
        List<Employee>list=new ArrayList<Employee>();
        Employee e1=new Employee(101,"satyam",100000,"patna");
        Employee e2=new Employee(102,"golu",200000,"bengeluru");
        Employee e3=new Employee(103,"prem",1500000,"delhi");
        list.add(e1);
        list.add(e2);
        list.add(e3);
        System.out.println("details are :");
        for(Employee e:list){
            System.out.println(e.id +","+e.name +","+e.salary+","+e.place);

        }

    }
}
