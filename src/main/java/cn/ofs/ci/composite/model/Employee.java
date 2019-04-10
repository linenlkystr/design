package cn.ofs.ci.composite.model;

public class Employee extends AbstractStaff {


    public Employee(String no, String name, String position, float salary) {
        super(no, name, position, salary);
    }

    @Override
    public void add(AbstractStaff abstractStaff) {

    }

    @Override
    public AbstractStaff remove(String no) {
        return null;
    }

    @Override
    public void printEmployeesInfo(int layer) {

    }
}
