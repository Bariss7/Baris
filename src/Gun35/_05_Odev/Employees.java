package Gun35._05_Odev;

public class Employees {
    private String name;
    private int salary;
    private String dof;

    public Employees(String name, int salary, String dof) {
        setName(name);
        setSalary(salary);
        setDof(dof);
    }
    public int ageCalculator(){
        String dogumtarihi=dof.substring(dof.length()-4);
        return 2022-Integer.parseInt(dogumtarihi);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDof() {
        return dof;
    }

    public void setDof(String dof) {
        this.dof = dof;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dof='" + dof + '\'' +
                '}';
    }
}

