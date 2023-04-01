package week3;
import java.util.Arrays;
public class ArraysAndMethods_hw {

    public static void main(String[] args){
        //1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
            //a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
            //b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
            //c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
        prompt(1, "Array ages");
        int[] ages = {3, 9, 23, 64, 2, 8, 28,93} ;

        int diff = ages[ages.length -1] - ages[0];
        System.out.println("The difference between the last element and the first element is: " + diff);

        int avgAge = 0;
        int totalAge = 0;
        for(int i = 0; i <= ages.length-1; i++){

            totalAge += ages[i];
            avgAge = (totalAge/ages.length);
            //System.out.println("totalAge = " + totalAge); - prints running total

        }
        //System.out.println("totalAge = " + totalAge); - prints final total
        System.out.println("avgAge = " + avgAge);
        line();


        //2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
            //a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
            //b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
        prompt(2, "String Array names[] - average letters and concatenate.");
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int nameLen = 0;
        int totalLen = 0;
        double avgLen = 0;
        for(int i=0; i<= names.length-1; i++){
            nameLen = names[i].length();
            totalLen += nameLen;
            avgLen = (double)totalLen/ (double)names.length;
        }
        System.out.println("The average number of letters per name is " + avgLen + " letters");
        String addName = "";
        for(String name :
            names){
           addName = addName + " " + name;
        }
        System.out.println("All names in the names[] array:" + addName);
        line();

        //3. How do you access the last element of any array?
        prompt(3, "How to Access the last element of an Array");
        System.out.println("The last element an array is accessed like this --> names[names.length-1] = " + names[names.length-1]);
        line();
        //4. How do you access the first element of any array?
        prompt(4, "How to Access the first element of an Array");
        System.out.println("The first element an array is accessed like this --> names[0] = " + names[0]);
        line();
        //5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
        prompt(5, "nameLengths Array");
        int[] nameLengths = new int[6];
        for(int i=0; i<= names.length-1; i++){
            nameLen = names[i].length();
            nameLengths[i] = nameLen;
            System.out.println(names[i] + " = " + nameLengths[i] + " letters.");
        }
        line();
        //6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
        prompt(6, "Sum of all elements in nameLengths[] array");
        int nameLength = 0;
        int totalLength = 0;
        for(int i=0; i<= nameLengths.length-1; i++){
            nameLength = nameLengths[i];
            totalLength += nameLength;
        }
        System.out.println("The total number of letters for all names is: " + totalLength);
        line();

        prompt(7, "Multiply String");
        String myWord = "space";
        int num = 4;
        System.out.println(stringAdd(myWord, num));
        line();

        prompt(8, "Full Name");
        String firstName = "Darrell";
        String lastName = "Terry";
        System.out.println(fullName(firstName, lastName));
        line();

        prompt(9, "Sum of int Array greater than 100?");
        //check how many elements of the Fibonacci sequence add up to less than 100.
        int[] numArray = {1, 1, 2, 3, 5, 8, 13, 21, 34};
        int[] newNumArray = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        boolean check100;
        check100 = sumArray(numArray);
        System.out.println("Is the sum of numArray > 100? " + check100);
        check100 = sumArray(newNumArray);
        System.out.println("Is the sum of newNumArray > 100? " + check100);
        line();

        prompt(10, "Average of a double Array");
        double[] dubNum = {1.2, 2.3, 3.4, 4.5, 5.6};
        double dubNumAvg = avgDouble(dubNum);
        System.out.println("The average of the Array dubNum is: " + dubNumAvg);
        line();

        prompt(11, "Average of one double Array > Average of another double Array?");
        double[] dubArray1 = {0.25, 0.35, 0.45, 0.55, 0.65};
        double[] dubArray2 = {1.25, 1.35, 1.45, 1.55, 1.65};
        boolean compArray = compareDubArray(dubArray1, dubArray2);
        System.out.println("dubArray1 is > dubArray2? " + compArray);
        //pass Arrays into the method in reverse order. dubArray2 should obviously be > dubArray1
        compArray = compareDubArray(dubArray2, dubArray1);
        System.out.println("dubArray2 is > dubArray1? " + compArray);
        line();

        prompt(12, "Decide whether to buy a drink.");
        int temp = 90;
        double funds = 20.00;
        boolean hot = false;
        if(temp >= 80){
            hot = true;
        }
        System.out.println("Should I buy a drink today? " + willBuyDrink(hot, funds));
        line();

        prompt(13, "Create a method of your own to solve a problem.");
        System.out.println("I wrote two methods.\nOne method prints the prompt number and describes the problem to be solved.\nThe other one prints a separation line between each problem.");
        line();
        }
        //7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
            public static  String stringAdd(String word, int n ){
                String phrase = "";
                for(int i=0;i<n;i++ ){
                   phrase += word;
                }
                return phrase;
            }
        //8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
            public static String fullName(String fName, String lName){
                String name = (fName + " " + lName);
                return name;
            }
        //9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
            public static boolean sumArray(int[] nums){
                int sum = 0;
                boolean check;
                for(int num : nums){
                    sum += num;
                }
                if(sum>100){
                    check = true;
                }else
                    check = false;
                return check;
            }
        //10. Write a method that takes an array of double and returns the average of all the elements in the array.
            public static double avgDouble(double[] nums){
                double sum = 0;
                double avg = 0;
                int i;
                for(i = 0; i <= nums.length-1; i++){
                 sum  += nums[i];
                }
                avg = sum/nums.length;
                return avg;
            }
        //11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
            public static boolean compareDubArray(double[] dubNum1, double[] dubNum2){
            //this method will call the previously written method avgDouble to perform the calculation.
            double sum1 = 0;
            double sum2 = 0;
            double avg1 = 0;
            double avg2 = 0;
            boolean comp;
            avg1 = avgDouble(dubNum1);
            avg2 = avgDouble(dubNum2);
            if(avg1 > avg2){
               comp = true;
            }else
                comp = false;
            return comp;
            }
        //12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
            public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket){
            boolean buyDrink;
            if(isHotOutside == true && moneyInPocket>10.50) {
               return buyDrink = true;
            }else
               return buyDrink = false;

            }
        //13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
        public static void prompt(int num, String promptString){
        //method to print the prompt number in order to better explain the output of each exercise.
        System.out.println("Prompt "+ num + ". " + promptString);
        }

        public static void line(){
        //method to print separation lines between homework prompts
        System.out.println("__________________________________________________________________________________________");
        System.out.println();//print an emptly line
    }
}
