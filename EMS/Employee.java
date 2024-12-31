public class Employee{
    private int id;
    private String name;
    private double salary;
    private String dep;
    private String location;

    public int getid(){
        return id;
    }
    public void setid(int id){
        this.id=id;
    }
    public String  getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public double getsalary(){
        return salary;
    }
    public void setsalary(double salary){
        this.salary=salary;
    }
    public String getdep(){
        return dep;
    }
    public void setdep(String dep){
        this.dep=dep;
    }
    public String getlocation(){
        return location;
    }
    public void setlocation(String location){
        this.location=location;
    }
}