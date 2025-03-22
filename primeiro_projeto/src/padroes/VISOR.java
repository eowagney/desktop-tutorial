package padroes;

interface Visitor {
    void visitDot(Dot dot);
    void visitCircle(Circle circle);
    void visitRectangle(Rectangle rectangle);
    void visitCompoundShape(CompoundShape compoundShape);
}

class XMLExportVisitor implements Visitor {
    @Override
    public void visitDot(Dot dot) {
        System.out.println("Exportando Dot para XML: " + dot);
    }

    @Override
    public void visitCircle(Circle circle) {
        System.out.println("Exportando Circle para XML: " + circle);
    }

    @Override
    public void visitRectangle(Rectangle rectangle) {
        System.out.println("Exportando Rectangle para XML: " + rectangle);
    }

    @Override
    public void visitCompoundShape(CompoundShape compoundShape) {
        System.out.println("Exportando CompoundShape para XML: " + compoundShape);
    }
}

interface Shape {
    void move(int x, int y);
    void draw();
    void accept(Visitor visitor);
}

class Dot implements Shape {
    @Override
    public void move(int x, int y) {
        System.out.println("Movendo Dot para (" + x + ", " + y + ")");
    }

    @Override
    public void draw() {
        System.out.println("Desenhando Dot");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDot(this);
    }
}

class Circle implements Shape {
    @Override
    public void move(int x, int y) {
        System.out.println("Movendo Circle para (" + x + ", " + y + ")");
    }

    @Override
    public void draw() {
        System.out.println("Desenhando Circle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCircle(this);
    }
}

class Rectangle implements Shape {
    @Override
    public void move(int x, int y) {
        System.out.println("Movendo Rectangle para (" + x + ", " + y + ")");
    }

    @Override
    public void draw() {
        System.out.println("Desenhando Rectangle");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitRectangle(this);
    }
}

class CompoundShape implements Shape {
    @Override
    public void move(int x, int y) {
        System.out.println("Movendo CompoundShape para (" + x + ", " + y + ")");
    }

    @Override
    public void draw() {
        System.out.println("Desenhando CompoundShape");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitCompoundShape(this);
    }
}

public class VISOR {
    public static void main(String[] args) {
        Shape[] shapes = { new Dot(), new Circle(), new Rectangle(), new CompoundShape() };
        Visitor exportVisitor = new XMLExportVisitor();

        for (Shape shape : shapes) {
            shape.accept(exportVisitor);
        }
    }
}
