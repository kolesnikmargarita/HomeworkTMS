package Homework20.AdditionalTask;

public class StudentBuilder {
    private int id;
    private String name;
    private String programmingLanguage;
    private String groupNumber;

    public StudentBuilder setName(String setName) {
        name = setName;
        return this;
    }

    public StudentBuilder setProgrammingLanguage(String setProgrammingLanguage) {
        programmingLanguage = setProgrammingLanguage;
        return this;
    }
    public StudentBuilder setGroupNumber(String setGroupNumber) {
        groupNumber = setGroupNumber;
        return this;
    }

    public Student build() {
        return new Student(name, programmingLanguage, groupNumber);
    }
}
