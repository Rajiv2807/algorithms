import java.lang.*;
import java.util.*;

public class Anagram
{
  private int size;
  public String[] anagram;

  public Anagram(String givenWord)
  {
    size = givenWord.length();
    anagram = new String[size];
    for (int i=0; i<size-1; i++)
    {
      this.anagram[i]=givenWord.substring(i,i+1);
    }
    anagram[size-1]=givenWord.substring(size-1);
  }

  public static void main(String[] args)
  {
    Anagram ana = new Anagram(args[0]);
    for (int i=0; i<ana.anagram.length; i++)
    {
      System.out.print(ana.anagram[i]);
    }
  }
}
