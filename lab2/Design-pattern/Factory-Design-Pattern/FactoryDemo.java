class FactoryDemo {
    public static void main(String args[]) {
        ShapeFactory sf1 = new ShapeFactory();
        Shape s1 = sf1.getShape("Rectangle");
        Shape s2 = sf1.getShape("Square");
        Shape s3 = sf1.getShape("Circle");
        s1.draw();
        s2.draw();
        s3.draw();
    }
}