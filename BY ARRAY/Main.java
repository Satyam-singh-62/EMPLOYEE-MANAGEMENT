import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] id={101,102,103,104,105};
        String[] name={"pawan","prem","golu","satyam","ritesh"};
        int[] Salary={100000,200000,205000,50000,100000};
        List<Employee> list=new ArrayList<Employee>();
        for(int i=0;i<=id.length-1;i++){
            Employee e=new Employee(id[i],name[i],Salary[i]);
            list.add(e);
        }
        System.out.println("DETAILS ARE :");
        for(Employee e:list){
            System.out.println(e.id+","+e.name+","+e.Salary);
        }


    }
}
