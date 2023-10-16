package lt.codeacademy.lv2.git;

public class StudentDto {

    private final String name;
    private final String surname;

    public StudentDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
