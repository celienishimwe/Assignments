package GenericAssignment1;

public class Main {
    public static void main(String[] args) {

        Generic <String,String>  test1= new Generic<>("Name","Celie");
        Generic <String,Integer> test2 = new Generic<>("Age",23);

        System.out.println("this is test one:" +test1);
        System.out.println("this is test two:" +test2);
    }
}
