package cn.ofs.ci.structural.composite.model;

import java.util.ArrayList;

public class Manager extends AbstractStaff {

    private final ArrayList<AbstractStaff> arrayList = new ArrayList<>();

    public Manager(String no, String name, String position, float salary) {
        super(no, name, position, salary);
    }

    @Override
    public void add(AbstractStaff abstractStaff) {
        this.arrayList.add(abstractStaff);
    }

    @Override
    public AbstractStaff remove(String no) {
        AbstractStaff staff = null;

        if (no != null && !"".equals(no.trim())) {
            for (int i = 0; i < this.arrayList.size(); i++) {
                if (this.arrayList.get(i) == null) {
                    continue;
                }

                if (no.equals(this.arrayList.get(i).getNo())) {
                    staff = this.arrayList.remove(i);
                    break;
                }
            }
        }

        return staff;
    }

    @Override
    public void printEmployeesInfo(int layer) {

        int tmpLayer = ++layer;

        for (AbstractStaff anArrayList : this.arrayList) {
            
            if (anArrayList == null) {
                continue;
            }

            printChar(tmpLayer);
            anArrayList.printUserBaseInfo();
            anArrayList.printEmployeesInfo(tmpLayer);
        }
    }
}
