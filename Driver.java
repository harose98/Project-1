public class Driver {
    public static void main(String[] args){
        MyString obj1 = new MyString("HarryPotter");
        MyString obj2 = new MyString("TheBoyWhoLived");
        MyString obj3 = new MyString("AvadaKADABRA");

        System.out.println("obj1.toString() : " + obj1.toString());
        System.out.println("obj2.toString() : " + obj2.toString());
        System.out.println("obj3.toString() : " + obj3.toString());
        System.out.println("obj1.length() : " + obj1.length());
        System.out.println("obj1.concat(obj2) : " + obj1.concat(obj2).toString());
        System.out.println("obj1.equals(obj2) : " + obj1.equals(obj2));
        System.out.println("obj1.compareTo(obj2) : " + obj1.compareTo(obj2));
        System.out.println("obj1.get(3) : " + obj1.get(3));
        System.out.println("obj1.toUpper() : " + obj1.toUpper().toString());
        System.out.println("obj1.toLower() : " + obj1.toLower().toString());
        System.out.println("obj1.substring(2) : " + obj1.substring(2).toString());
        System.out.println("obj1.substring(1, 3) : " + obj1.substring(1, 3).toString());
        System.out.println("obj1.indexOf(obj3) : " + obj1.indexOf(obj3));
        System.out.println("obj1.LastIndexOf(obj3): " + obj1.lastIndexOf(obj3));
    }
}
