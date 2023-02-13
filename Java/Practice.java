

    import java.util.Scanner;
public class Practice {
    private string name;
    private int age;
    private int Id;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.insert();
        s1.display();
    }
    public void insert()
    {
        name = input.nextLine();
        age = input.nextInt();
        Id = input.nextInt();
    }
    public void display()
    {
        System.out.println("NAME:"+name+"AGE:"+age+"ID:"+Id);
    }
    
}

