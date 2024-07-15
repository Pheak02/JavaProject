package java.advance;

enum Color {
    RED("red"), GREEN("green"), BLUE("blue"); //to access it: Color.RED, Color.GREEN, Color.BLUE

    //if want to set value of enum, have to write extra code as below
    private String value;

    Color(String value) { //define constructor
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}