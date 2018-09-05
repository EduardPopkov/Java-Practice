import java.io.IOException;

public class StrBufferAndBuilder {
    public static void main(String[] args) {
        //StringBuffer - синхронизир. и потокобезоп.
            //удобнее исп. в многопоточных приложениях.
        //StringBuilder - не потокобезоп., но работает быстрее
            //в однопоточных приложениях.

        //конструкторы
            //StringBuffer/Builder() //по умолч capacity - 16
            //StringBuffer/Builder(int capacity)
            //StringBuffer/Builder(String str) // принимает строку + доп 16 символов
            //StringBuffer/Builder(CharSequence chars) //принимает набор символов + доп 16 символов

        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();
        System.out.println(stringBuilder.capacity()); //16
        System.out.println(stringBuffer.capacity()); //16

        stringBuffer = new StringBuffer(32);
        System.out.println(stringBuffer.capacity()); //32

        stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder.capacity()); //5 + 16 = 21

        //можно изменить минимальную ёмкость буфера символов
        stringBuilder.ensureCapacity(32);
        System.out.println(stringBuilder.capacity());

        System.out.println(stringBuilder.toString());

        //charAt(), setCharAt() and getChars()

        stringBuffer = new StringBuffer("Java");
        char c = stringBuffer.charAt(2);
        System.out.println(c);

        stringBuffer.setCharAt(2, 'V');
        System.out.println(stringBuffer.toString());

        stringBuffer = new StringBuffer("hello world");
        int start = 1;
        int end = 8;
        char[] buffer = new char[end - start];
        stringBuffer.getChars(start, end, buffer, 0);
        for(char i : buffer){
            System.out.print(i + "-");
        }
        System.out.println();

        //append() and insert()

        stringBuffer.append(" Edik");
        System.out.println(stringBuffer);

        stringBuffer.insert(3, "qwe");
        System.out.println(stringBuffer);

        //delete
        stringBuffer.delete(3, 6);
        System.out.println(stringBuffer);

        stringBuffer.deleteCharAt(2);
        System.out.println(stringBuffer);

        //substring()
        System.out.println(stringBuffer.substring(5));
        System.out.println(stringBuffer.substring(2, 4));

        //setLength()
        stringBuffer = new StringBuffer("hello");
        stringBuffer.setLength(10);
        System.out.println(stringBuffer.toString() + " " + stringBuffer.length());

        stringBuffer.setLength(4);
        System.out.println(stringBuffer.toString() + " " + stringBuffer.length());

        //replace()
        stringBuffer = new StringBuffer("hello world");
        stringBuffer.replace(6, 9, "qw");
        System.out.println(stringBuffer);

        //reverse()
        System.out.println(stringBuffer.reverse());

        /////////////////////////////////////////////////
        String domain = ".ru";
        StringBuffer site = new StringBuffer("mail");

        site.append(domain);
        System.out.println(site);

        site.delete(site.length() - domain.length(), site.length());
        System.out.println(site);

        site.insert(site.length(), domain);
        System.out.println(site);

        /////////////////////////////////////////////////
        //определяем скорость
        try {
            test(new StringBuffer());
            test(new StringBuilder());
        } catch (IOException e) {
            e.printStackTrace();
        }

        /////////////////////////////////////////////////
        String str = "";

        long before = System.currentTimeMillis();
        for(int i = 0; i++ < 1e9; ){
            str += "";
        }

        long after = System.currentTimeMillis();

        System.out.println("String: " + (after - before));
    }

    public static void test(Appendable obj) throws IOException {
        long before = System.currentTimeMillis();
        for(int i = 0; i++ < 1e9; ){
            obj.append("");
        }

        long after = System.currentTimeMillis();
        System.out.println(obj.getClass().getSimpleName() + ": " + (after - before));
    }
}
