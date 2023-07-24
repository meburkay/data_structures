import java.util.ArrayList;

public class TestForReferenceType {

    public static void main(String[] args) {

        int[] array=new int[10];

        System.out.println("array = " + array); //[I@6acbcfc0 (The starting point of the array's address.)

        Car car = new Car("BMW");
        System.out.println("car = " + car); //Car@6f496d9f

        System.out.println("new Car(\"Audi\") = " + new Car("Audi")); //Car@723279cf

        ArrayList<Integer> arrayList = new ArrayList<>(); //We can not see here but its default capacity is 10. We can see it in the source code.

        System.out.println("arrayList.size() = " + arrayList.size());

        System.out.println(arrayList);



    }
}
