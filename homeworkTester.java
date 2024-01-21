import java.io.*;
import java.util.*;

public class homeworkTester
{

public static void main(String [] args) throws IOException
{
private <T extends Comparable<? super T>>
  int findSmallestIndex(T[] a, int first, int last){
    T smallest = a[first];
    int smallestIndex = first;
    for(int i=first+1; i<=last; i++){
      if(a[i].compareTo(smallest)<0){
        smallest=a[i];
        smallestIndex=i;
      }
    }
    return smallestIndex;
  }
}

}
