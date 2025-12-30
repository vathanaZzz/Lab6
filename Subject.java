/**
 * Project: AIECS Lab 06
 * Class: ISE
 * Description: Represents courses in the Year 2 program.
 * Name: Heng_Vathana
 * Date: 30-12-2025
 */
public class subject {

    private String subjectName;
    private String subjectCode;

    private static final double CREDIT_PRICE = 9.9;

    public Subject(String subjectName, String subjectCode) {
        this.subjectName = subjectName;
        this.subjectCode = subjectCode;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.subjectName = name;
    }
    public static double getCreditPrice() {
        return CREDIT_PRICE;
    }
}