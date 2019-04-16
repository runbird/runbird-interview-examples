package com.scy.reflaction.demo2;

/**
 * 类名： Individual <br>
 * 描述：TODO <br>
 * 创建日期： 2019/4/16 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class Individual implements Comparable<Individual> {
    private static long counter = 0;
    private final long id = counter++;
    private String name;

    public Individual(String name) {
        this.name = name;
    }

    public Individual() {
    }

    public long id() {
        return id;
    }

    @Override
    public int compareTo(Individual obj) {
        String first = getClass().getSimpleName();
        String argFirst = obj.getClass().getSimpleName();
        int firstCompare = first.compareTo(argFirst);
        if (firstCompare != 0) {
            return firstCompare;
        }
        if (name != null & obj.name != null) {
            int secendCompare = name.compareTo(obj.name);
            if (secendCompare != 0) {
                return secendCompare;
            }
        }
        return (Long.compare(obj.id, id));
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Individual && id == ((Individual) obj).id;
    }

    @Override
    public int hashCode() {
        int result = 17;
        if (name != null) {
            result = 37 * result + name.hashCode();
        }
        result = 37 * result + (int) id;
        return result;
    }
}
