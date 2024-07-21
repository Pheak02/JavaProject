// means hiding sth, show only what should be should & hide the very details to user
//abstract class can't be instantiated, but can be subclass
//abstract class must has at least 1 abtract method

public class AbstractionDemo {
    public static void main(String[] args) {
        GraphicObject circle = new Circle(); //obstract vs concret ?
        circle.draw();
        circle.resize();

        GraphicObject retangle = new Retangle();
        retangle.draw();
        retangle.resize();
    }
}