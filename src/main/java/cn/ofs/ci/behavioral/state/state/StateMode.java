package cn.ofs.ci.behavioral.state.state;

public enum StateMode {

    EDIT_MODE(0, "编辑模式"), PREVIEW_MODE(1, "预览模式");

    private int value;
    private String desc;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    StateMode(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }
}
