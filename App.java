public class App {

    public static void main(String[] args) throws Exception {

        RightTriangle ABC = new RightTriangle(name: "ABC", base: 3.0, height: 4.0);
        ABC.specificMethod();

        // The Type is Triangle, but behavior is RightTriangle
        Triangle BCD = new RightTriangle(name: "BCD", base: 3.0, height: 4.0);

        // cannot call BCD.specificMethod(); because specificMethod() inside RightTriangle BCD.hallo();
        // output: Hallo I'm RightTriangle, because for every method overridden by subclass, the subclass method will be called

        Triangle CDE = new Triangle(name: "CDE", side1: 3.0, side2: 4.0, side3: 5.0);
        CDE.hallo();
        // output: Hallo I'm Triangle

    }
}