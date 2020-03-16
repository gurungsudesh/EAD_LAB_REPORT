class SingletonPatternDemo{
    public static void main(String[] args){
        SingleObject obj = SingleObject.getInstance();
        SingleObject obj2 = SingleObject.getInstance();

        System.out.println(obj);
        System.out.println(obj2);
        obj.show();
        obj2.show();
    }

}