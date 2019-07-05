package cn.ofs.ci.structural.composite;

import cn.ofs.ci.structural.composite.model.AbstractStaff;
import cn.ofs.ci.structural.composite.model.Employee;
import cn.ofs.ci.structural.composite.model.Manager;

public class CompositeDemo {

    public static void main(String[] args) {

        AbstractStaff boss = new Manager("1", "manager", "CEO", 10000);
        AbstractStaff financeManager = new Manager("2", "finance", "CFO", 9000);
        AbstractStaff technicalManager = new Manager("3", "technical", "CTO", 9000);

        AbstractStaff deptAssistant = new Manager("122", "wang", "dept assistant", 5000);
        AbstractStaff techAssistant = new Manager("133", "li", "tech assistant", 5500);

        AbstractStaff employee1 = new Employee("166", "employee1", "staff1", 3000);
        AbstractStaff employee2 = new Employee("199", "employee2", "staff2", 3100);
        AbstractStaff employee3 = new Employee("266", "employee2", "staff3", 3500);

        techAssistant.add(employee1);
        techAssistant.add(employee2);
        techAssistant.add(employee3);

        technicalManager.add(techAssistant);
        financeManager.add(deptAssistant);

        boss.add(financeManager);
        boss.add(technicalManager);

        boss.printUserBaseInfo();
        boss.printEmployeesInfo(1);
    }
}
