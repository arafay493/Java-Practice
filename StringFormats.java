public class StringFormats {
    public static void main(String[] args) {
        // String name = "Sandeep";
        // int age = 45;
        // int marks = 45678;
        // System.out.println("Hello, " + name + " Your age is " + age);
        // System.out.printf("Hello, %s Your age is %d" , name , age);
        // System.out.println();
        // System.out.printf("Hello, %15s Your age is %d" , name , age);
        // System.out.println();
        // System.out.printf("Hello, %15S Your age is %d" , name , age);
        // System.out.println();
        // System.out.printf("Hello, %-15s Your age is %d" , name , age);
        // System.out.println();
        // System.out.printf("Hello, %-15S Your age is %d" , name , age);
        // System.out.println();
        // System.out.printf("Hello, %S Your age is %5d" , name , age);
        // System.out.println();
        // System.out.printf("Hello, %S Your age is %05d" , name , age);
        // System.out.println();
        // System.out.printf("Hello, %S Your marks are %010d" , name , marks);
        // System.out.println();
        // System.out.printf("Hello, %S Your marks are %0,10d" , name , marks);
        // System.out.println();
        // System.out.printf("Hello, %S Your marks are %,10d" , name , marks);
        // System.out.println();
        // System.out.printf("Hello, %S Your marks are %+10d" , name , marks);

        StringBuffer sb1 = new StringBuffer("Shayaan");
        StringBuilder sb = new StringBuilder("Sohaib");
        sb.append(" tatti");
        sb1.append(" tatti");
        System.out.println(sb1.toString());
        System.out.println(sb.toString());
    }    
}
