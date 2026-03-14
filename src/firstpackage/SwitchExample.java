package firstpackage;

public class SwitchExample
{
    public static void main(String[] args)
    {
        int number=20;
        switch(number)
        {
            case 10: System.out.println("Ten"); break;
            case 20: System.out.println("Twenty"); break;
            case 30: System.out.println("Thirty"); break;
            default: System.out.println("Not in 10, 20 or 30");
        }
    }
}

