
/**
 * This is the Person class for my hello world project
 *
 * @author Judy
 */
public class Person extends Hello_Judy
{
    public String language;
    //constrctor
    
    public String name;
    public int age;
    public char sex;
    public Person(String language, String name, char n)
    {
        this.language=language;
        this.name=name;
        this.age=0;
        this.sex=n;
    }
    public void change(String language)
    {
        this.language=language;
    }
    public String getLanguage()
    {
        return this.language;
    }
    public String sayHello()
    {
        System.out.print(name+" says: ");
        if (age<3)
            return "Hulalallalalal.";
        else
        {
            if (this.language.equals("English"))
                return "Hello. I am "+age+" years old.";
            else if(this.language.equals("Chinese"))
                return "你好。我"+this.age+"岁了。";
            else if (this.language.equals("French"))
                return "Bonjour. J'ai "+this.age+" ans.";
            else if (this.language.equals("Japanese"))
                return "こんにちは。私は"+this.age+"歳になりました。";
            else if (this.language.equals("Spanish"))
                return "Hola";
            else if (this.language.equals("German"))
                return "Hallo. Ich "+this.age+" Jahr alt";
            else 
                return "HUAUAUAUAUAU INVASION!!!!!!";
        }
    }

    public void setAge(int n)
    {
        this.age=n;
    }
    public void grow(int a)
    {
        this.age+=a;
    }
    public int getAge()
    {
        return this.age;
    }
    public void sayGoodbye()
    {
        System.out.println("Goodbye");
    }

    public String Gender()
    {
        if (this.sex=='f')
        return name+": ♀";
        else
        return name+": ♂";
    }
}
