package EasyTasks;

public abstract class Person {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void introduceYourself(){
        System.out.println("Hello, my name is " +getName()+ " I am " + getAge() + " old. And I am living in "+ getAddress()+ ".");

    }
}

