package com.tikalk.starWarsSequence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        if (args.length == 1) 
        {
            try 
            {
                String starWarsSequence = args[0];
                String MovieName = "";
                switch (starWarsSequence) 
                {
                     case "1":
                        MovieName = "The Phantom Menace";
                        break;
                     case "2":
                        MovieName = "Attack of the Clones";
                        break;
                     case "3":
                        MovieName = "Revenge of the Sith";
                        break;
                     case "3.1":
                        MovieName = "Rogue One";
                        break;
                    case "3.2":
                        MovieName = "Solo";
                        break;
                     case "4":
                        MovieName = "A New Hope";
                        break;
                     case "5":
                        MovieName = "The Empire Strikes Back";
                        break;
                     case "6":
                        MovieName = "Return of the Jedi";
                        break;
                     case "7":
                        MovieName = "The Force Awakens";
                        break;
                     case "8":
                        MovieName = "The Last Jedi";
                        break;
                }
                if( MovieName == "" )
                {
                    System.err.println("There is still no Star Wars movie with sequence #" + starWarsSequence);
                    System.exit(3);
                }
                else
                {
                    System.out.println("Star Wars movie #" + starWarsSequence + " name is:");
                    System.out.println("\t\t\t" + MovieName);
                }
            }
            catch (Exception e)
            {
                System.exit(2);
            }
        }
        else
        {
            System.err.println("There must be exactly 1 argument.");
            System.exit(1);
        }
    }
}
