import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        int randomValue = generator.nextInt(6);
        randomValue = randomValue + 1;
        System.out.println(randomValue);
    }
}