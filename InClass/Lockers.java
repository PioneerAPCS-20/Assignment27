
public class Lockers
{
    public static void main(String[] args)
    {
        int n = 1000;

        boolean[] lockers = new boolean[n];  // all false to start
        
        for(int s = 1; s <= n; s++)  // n students
        {

            for(int i = s - 1; i < lockers.length; i += s)  // open/close lockers
            {
                lockers[i] = !lockers[i];  // open if closed, close if opened
                
                // same as single line above
                /*if(lockers[i])
                {
                    lockers[i] = false;
                }
                else if(!lockers[i])
                {
                    lockers[i] = true;
                }*/
            }
        }

        for(int i = 0; i < lockers.length; i++)
        {
            if(lockers[i])
            {
                System.out.println("Locker #" + (i + 1) + ": " + lockers[i]);
            }
        }
    }
}

