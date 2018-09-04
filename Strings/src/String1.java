public class String1 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("Java"); //empty string
        String str3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4); //3 - begin index, 4 - count letters

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        //String - immutable

        String str5 = "Java";

        System.out.println("str1: " + str1.hashCode());
        System.out.println("str5: " + str5.hashCode());

        System.out.println("str2: " + str2.hashCode());
        System.out.println("str3: " + str3.hashCode());
        System.out.println("str4: " + str4.hashCode());

        System.out.println("str1 length: " + str1.length());

        char[] helloArray = str3.toCharArray();
        for(char i : helloArray){
            System.out.print(i + " ");
        }
    }
}
