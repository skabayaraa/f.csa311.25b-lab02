package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Square;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Square(2);
        Shape s2 = new Rectangle(2, 3);


        Renderer r1 = new Renderer(s1);
        Renderer r2 = new Renderer(s2);

        r1.draw();
        r2.draw();
    }
}
