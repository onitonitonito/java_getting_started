package java_development;

public class ClassTestExamples {
  public static void main(String[] args)  {
    int count = 10;
    count = 20;
    System.out.print("1.count = ");
    System.out.print(count);
    System.out.println(" times");

    // count = 10.5;
    double average = 10.5;
    System.out.print("2.average = ");
    System.out.print(average);
    System.out.println(" points");

    String name = "Caramel Candy";
    double totalCount = count + average;
    System.out.print("3.Total average count = ");
    System.out.print(totalCount);
    System.out.println(" mm");
    System.out.println("");

    double diameter = 10;
    double circleArea;
    final double PI = 3.141562;
    circleArea = PI * diameter * diameter;
    System.out.print("circleArea =");
    System.out.println(circleArea);

    final double OIL_PRICE = 1390.5;  // OIL_PRICE = KRW
    System.out.print("Recent Oil price =");
    System.out.println(OIL_PRICE);
  }
}
