public class DataStringBufferAppend {
public static void main(String[] args)  {
        StringBuffer sb = new StringBuffer();

        /* Create Object class using 'new' option
         * Collect letters using, .append() method into buffer temporarily
         * print buffers using, .toString() method (flushing)
         */

        sb.append("1.Use StringBuffer = ");
        sb.append("hello ");
        sb.append("Java, ");
        sb.append("the real world~!");
        sb.insert(21, "INSERT? ");
        System.out.println(sb.toString());  // .toSting() = buffer flushing

        System.out.print("  ");
        System.out.println(sb.substring(21, 29)); // substring = buffer flushing

        /* System.out.println(sb.substring(-1, -8)); // substring = buffer flushing
         *
         * Exception in thread "main" java.lang.StringIndexOutOfBoundsException: start -1, end -8, length 57
         * at java.base/java.lang.AbstractStringBuilder.checkRangeSIOOBE(Unknown Source)
         * at java.base/java.lang.AbstractStringBuilder.substring(Unknown Source)
         * at java.base/java.lang.StringBuffer.substring(Unknown Source)
         * at StringBufferAppend.main(StringBufferAppend.java:17)
         */

        String temp = "";
        temp += "2.String Operand = ";
        temp += "HELLO ";
        temp += "JAVA, ";
        temp += "THE REAL WORLD~!!!!";
        System.out.println(temp);



}
}
