abstract class Ashape {
    // Abstract class can have constructor
    Ashape() {
        System.out.println("Abstract Shape Created");
    }

    // Also it can have methods which can be abstract or non abstract
    abstract void drawShape(); // Abstract method

    public void shapePlusPlus()// non abstract method
    {
        System.out.println("Ploygon");
    }

}

class AbstractShape extends Ashape {
    void drawShape() {
        System.out.println("Square,Circle,Rectangle");
    }
}