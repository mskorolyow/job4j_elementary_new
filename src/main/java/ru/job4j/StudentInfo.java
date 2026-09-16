package ru.job4j;

public class StudentInfo {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    private String birthday;

    public StudentInfo(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;
    }

}
