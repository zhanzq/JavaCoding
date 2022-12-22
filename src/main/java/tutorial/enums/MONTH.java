package tutorial.enums;

/**
 * @author zhanzq
 */
public enum MONTH {
    /** 月份*/
    Jan("January", "一月", 1),
    Feb("February", "二月", 2);

    private final String name;
    private final int index;
    private final String desc;

    MONTH(final String name, final String desc, final int index) {
        this.name = name;
        this.desc = desc;
        this.index = index;
    }

    public String getName() {
        return this.name;

    }

    public int getIndex() {
        return this.index;

    }

    public String getDesc() {
        return this.desc;

    }

    @Override
    public String toString() {
        return this.name;
    }

    public static void main(String[] args) {
        System.out.println(MONTH.Jan.getName() + ": " + MONTH.Jan.getDesc());
        System.out.println(MONTH.Feb.getIndex());
        System.out.println("February".equals(MONTH.Feb.getName()));

    }
}


