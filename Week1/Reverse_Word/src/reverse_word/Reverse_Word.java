// program to read char array using Word = ip.next().toCharArray()
// finding it size using size = Word.length -1;
// then printing it in reverse order via index value.

// read the String name
// char [] arr = name.toCharArray()

//sout + tab for print function
// int [] size = new int[5]


package reverse_word;
import java.util.Scanner;

/**
 * This class +++ insert class description here +++
 *
 * @author Ankit Kukreti
 */
public class Reverse_Word 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        /*
        char [] Word;
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the word: ");
        Word = ip.next().toCharArray();
        
        int size = Word.length -1;
               
        for(int i = size; i >=0; i--)
            System.out.print(Word[i]);
               
        System.out.println();
        */
        
        System.out.print("Enter her name: ");
        Scanner ip = new Scanner(System.in);
        String name = ip.nextLine();
        char []reverse = name.toCharArray();
        
        int size1 = name.length() -1;
        
        for(int i= size1; i>=0; i--)
            System.out.print(reverse[i]);
        
        System.out.println();
        
       
        
    }

}
