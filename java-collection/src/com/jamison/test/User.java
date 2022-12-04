package com.jamison.test;

public class User implements Cloneable{
    private String name;
    private int age;
    private int[] arr1;
    private Test test;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int[] getArr1() {
        return arr1;
    }

    public void setArr1(int[] arr1) {
        this.arr1 = arr1;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    /**
     * 实现深拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        User user1 = (User) super.clone();
        user1.setTest((Test)test.clone());
        user1.setArr1(arr1.clone());
        return user1;
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
