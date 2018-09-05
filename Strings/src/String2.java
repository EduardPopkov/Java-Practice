public class String2 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "hello";
        String str3 = str1 + " " + str2;
        System.out.println(str3);

        str3 = "Year " + 2018;
        System.out.println(str3);

        //concat
        str3 = str1.concat(str2);
        System.out.println(str3);

        //join - static method
        str3 = String.join("-", str1, str2);
        System.out.println(str3);

        //charAt(int index)
        char c = str3.charAt(2);
        System.out.println(c); //v

        //getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        int start = 2;
        int end = 7;
        char[] dst = new char[end - start];
        str3.getChars(start, end, dst, 0);
        System.out.println(dst);

        //equals and equalsIgnorCase
        str1 = "hello";
        str2 = "Hello";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1 == str2);

        //compareTo
        str1 = "hello";
        str2 = "world";
        str3 = "hell";
        System.out.println(str1.compareTo(str2)); //-15 h < w
        System.out.println(str1.compareTo(str3)); //1

        //indexOf()
        str1 = "Hello world";
        int index1 = str1.indexOf('l'); //2
        int index2 = str1.lastIndexOf('l'); //9
        int index3 = str1.indexOf("wo"); //6
        System.out.println(index1 + " " + index2 + " " + index3);

        //startsWith() and endsWith()
        str1 = "lepel@mail.ru";
        System.out.println(str1.startsWith("lepel"));
        System.out.println(str1.endsWith("ru"));

        //replace
        String repStr1 = str1.replace('l', 'm');
        String repStr2 = str1.replace("lepel", "hello");
        System.out.println(repStr1);
        System.out.println(repStr2);

        //trim
        str1 = "  hello  ";
        System.out.println(str1);

        str1 = str1.trim();
        System.out.println(str1);

        //substring
        str1 = "Hello World";
        System.out.println(str1.substring(6)); //world
        System.out.println(str1.substring(2, 6)); //llo_

        //toLowerCase and toUpperCase
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        String text = "I know English but I want better results";
        String[] arrStr = text.split(" ");

        for(String s : arrStr){
            System.out.print(s + "-");
        }
        System.out.println();

        ////////////////////////////////////////////
        String str = "1 000 000";
        char[] arrChars = str.toCharArray();

        for(int i = 0; i < arrChars.length; i++){
            if(arrChars[i] == ' '){
                arrChars[i] = '.';
            }
            System.out.print(arrChars[i]);
        }
        System.out.println();

        ////////////////////////////////////////////
        str = "www.mysite.ru";
        str = str.substring(4, str.length() - 3);
        System.out.println(str);

        ////////////////////////////////////////////
        str = "www.mysite.ru";
        boolean isContains = str.contains("mysite");
        System.out.println(isContains);

        ////////////////////////////////////////////
        System.out.println("маша".compareTo("Миша"));
    }
}
