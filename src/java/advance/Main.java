package java.advance;
public class Main {
    public static void main(String[] args) {
        Color c1 = Color.RED;

        System.out.println("Red Enum name: " + c1.name());
        System.out.println("Red Enum value: " + c1.getValue());

        for (Color color: Color.values()) {
            System.out.println("Enum name/key:" + color.getValue());
            System.out.println("Enum Value:" + color.getValue());
        }
    }
}