package EasyTasks;

public class Student extends Person {
    private String  studySubject;
    Person name;
    Person age;
    Person address;

    public Student(String studySubject, String name, int age, String address) {
        this.studySubject = studySubject;
        this.setName(name);
        this.setAge(age);
        this.setAddress(address);

    }
    public void study(){
        System.out.println(getName()+ " studiert " + studySubject);
    }
}
