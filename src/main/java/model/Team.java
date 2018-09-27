package model;

public class Team {

    private int id;
    private String name;
    private int yearEst;

    private static int NEXT_ID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearEst() {
        return yearEst;
    }

    public void setYearEst(int yearEst) {
        this.yearEst = yearEst;
    }

    public static int getNextId() {
        return NEXT_ID;
    }

    public static void setNextId(int nextId) {
        NEXT_ID = nextId;
    }

    public Team(String name, int yearEst) {
        this.id = NEXT_ID++;

        this.name = name;
        this.yearEst = yearEst;
    }

    static {
        NEXT_ID = 1;
    }

}
