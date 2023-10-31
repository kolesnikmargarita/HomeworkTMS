package Homework20.AdditionalTask;

public class Student {
    private int id;
    private String name;
    private String programmingLanguage;
    private String groupNumber;

    public Student(String setName, String setProgrammingLanguage, String setGroupNumber) {
        name = setName;
        programmingLanguage = setProgrammingLanguage;
        groupNumber = setGroupNumber;
    }

    public String getSQLAddCommand() {
        StringBuilder result = new StringBuilder("INSERT INTO students (name, programmingLanguage, groupNumber) value ('");
        result.append(name).append("', '").append(programmingLanguage).append("', '").append(groupNumber).append("')");
        return result.toString();
    }
}
