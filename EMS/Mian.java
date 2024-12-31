import java.util.*;
public class Mian {
    public static void main(String[] args) {

        int[] id={101,102,103,104,105,106,107};
        String[] name={"pawan","perm","golu","satyam","ritesh","krish","anmol"};
        String[] dep={"ca","employee","owner","cs","data","salary","ceo"};
        double[] salary={101.0,1210.0,15654.0,646.0,3265.3,1545.0,999.0};
        String[] location={"delhi","patna","vadodra","pune","mumbai","ahemdabad","newyork"};

        List<Employee> list=new ArrayList<Employee>();

        for(int i=0;i<=id.length-1;i++){
            Employee e=new Employee();
            e.setid(id[i]);
            e.setname(name[i]);
            e.setsalary(salary[i]);
            e.setdep(dep[i]);
            e.setlocation(location[i]);
            list.add(e);
        }

        System.out.println("Details are....  :");
        for(Employee e:list){
            System.out.println(e.getid()+","+e.getname()+","+e.getlocation()+","+e.getsalary()+","+e.getdep());
        }
    }
    
}
