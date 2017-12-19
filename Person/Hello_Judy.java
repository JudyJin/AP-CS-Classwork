
/**
 * This is the main class for my HelloWorld program.
 *
 * @Author: Judy
 * @Dec.7, 2017
 */
public class Hello_Judy
{
    //object oriented programming
    public static void main()
    {
        Person Judy=new Person("Chinese","Judy",'f');
        Judy.grow(2);
        Judy.grow(2);
        System.out.println(Judy.sayHello());
        System.out.println(Judy.Gender());
        Person JHUHU=new Person("French","JHUHU",'m');
        JHUHU.setAge(10);
        System.out.println(JHUHU.sayHello());
        Person Momoma=new Person("Japanese","Momoma",'f');
        Momoma.grow(4);
        System.out.println(Momoma.sayHello());
        Person Maggie=new Person("German","Maggie",'f');
        System.out.println(Maggie.sayHello());
        System.out.println(Maggie.Gender());
        Maggie.change("English");
        Maggie.grow(10);
        System.out.println(Maggie.sayHello());
        
        Person STT=new Person("wula","STT",'m');
        STT.grow(10);
        System.out.println(STT.sayHello());
        
        Judy.sayGoodbye();
        System.out.println();
    }
}