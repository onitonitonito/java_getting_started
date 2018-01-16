public class StartVariableTest {

  public void compareNumber(int a, int b) {
    boolean isBig = a > b;   // true or false
    if (isBig) {
      System.out.println(a+ " > " +b+ ",  a is bigger");
    } else if (a == b) {
      System.out.println(a+ " = " +b+ ",  a and b is even");
    } else {
      System.out.println(a+ " < " +b+ ",  b is bigger");
    }
  }

  public void implicitExplicit() {
    System.out.println("--- Implicit & Explicit assign ---");
    // explicit declaire : Large into Small
    long veryLong = 50000;
    int moderateSize = (int) veryLong;
    System.out.println("moderateSize(int) = " +moderateSize);

    // implicit declaire : small into Large
    int soSmall = 50000;
    long tooBig = soSmall;
    System.out.println("tooBig(long)= " +tooBig+ "\n");
  }

  public void calculteOperand() {
    int a = 5;
    System.out.println(a+ ", " +(++a-5));   // (5),     6-5=(1)
    System.out.println((a++ - 5)+ ", " +a+"\n"); // 6-5=(1), 6+1=(7)

    int b = 10;
    int c = 20;
    b++;
    c++;
    System.out.println(b+ ", " +c);         // 10+1=(11), 20+1=(21)
    System.out.println(b++ + ", " + c++);   // (11)-> b=12, (21)-> c=22
    System.out.println(b+ ", " +c);         // 11+1=(12),   21+1=(22)
  }

  public static void main(String[] args)  {
    StartVariableTest myTest = new StartVariableTest();
    myTest.calculteOperand();
    myTest.implicitExplicit();
    myTest.compareNumber(10, 20);

  }
}
