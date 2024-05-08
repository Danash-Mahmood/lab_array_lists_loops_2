import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Tiree");
        scottishIslands.add("Jura");
        scottishIslands.add("Islay");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list

//        3. Add "Islay" after "Jura" and before "Mull"
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(scottishIslands.indexOf("Arran"));
//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop
        for (String islands:scottishIslands){
            System.out.println(islands);
        }



//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        for (int nums: numbers){
            if (nums%2 == 0){
                System.out.println(nums);
            }
        }
//        2. Print the difference between the largest and smallest value
        int maxNum = Collections.max(numbers);
        int minNum = Collections.min(numbers);
        System.out.println(maxNum-minNum);
//        3. Print True if the list contains a 1 next to a 1 somewhere.
        for (int i = 1; i<numbers.size();i++)
            if(numbers.get(i-1)== 1 && numbers.get(i)==1){
                System.out.println(true);
            }
//        4. Print the sum of the numbers,
        int sum = 0;
        int unluckySum = 0;
        for (int nums :numbers){
            sum += nums;
        }
        System.out.println(sum);
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//
//           ...and numbers that come immediately after a 13 also do not count.
        for (int nums:numbers){
            if (nums == 13){
                break;
            }
            unluckySum += nums;
        }
        System.out.println(unluckySum);
//
//          So [2, 7, 13, 2] would have sum of 9.

    }

}
