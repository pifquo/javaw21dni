import java.util.ArrayList;
import java.util.Iterator;

public class CodeKeeper
{
    ArrayList list;
    String [] codes = {"alfa", "lamda","gamma", "delta","zeta"};

    public CodeKeeper(String[] userCodes)
        {
            list = new ArrayList();

            //wczytanie wbudowanych kodów

            for (int i=0; i<codes.length;i++)
                {
                    addCode(codes[i]);
                }
            //wczytanie kodów użytkownika

            for (int j=0; j<userCodes.length;j++)
                {
                    addCode(userCodes[j]);
                }
            // wyświetlenie wszystkich kodów

            for (Iterator ite = list.iterator();ite.hasNext();)
                {
                    String output = (String) ite.next();
                    System.out.println(output);
                }
        }

    private void addCode(String code)
        {
            if (!list.contains(code))
                {
                    list.add(code);
                }
        }

    public static void main(String[] args)
        {
            CodeKeeper keeper = new CodeKeeper(args);
        }
}
