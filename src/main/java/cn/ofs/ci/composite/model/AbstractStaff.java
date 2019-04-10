package cn.ofs.ci.composite.model;

public abstract class AbstractStaff {

    protected String no;

    protected String name;

    protected String position;

    protected float salary;

    private int length = 20;

    public AbstractStaff(String no, String name, String position, float salary) {

        this.no = no;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void printUserBaseInfo() {
        System.out.println("|" + this.no + " " + this.name + " " + this.position + " " + this.salary);
    }

    public abstract void add(AbstractStaff abstractStaff);

    public abstract AbstractStaff remove(String no);

    public abstract void printEmployeesInfo(int layer);

    protected void printChar(int layer) {

        for (int i = 0; i < layer + 2; i++) {
            System.out.print("-");
        }
    }

    protected void printLine() {

        System.out.print("+");
        for (int i = 0; i < this.length + 4; i++) {
            System.out.print("-");
        }
        System.out.println("-");
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
