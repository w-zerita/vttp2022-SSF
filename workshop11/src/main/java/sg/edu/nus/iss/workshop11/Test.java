package sg.edu.nus.iss.workshop11;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
    
        System.out.println("How many numbers do you wish to generate?");
        // limit input value to >= 1 and <= 30
        int inputSize = 15;
        int min = 1;
        int max = 30;
        int multipliedValue = max - min + 1;
        int randomNum;
        
        ArrayList<Integer> generatedNums = new ArrayList<Integer>();
        List<String> generatedImgs = new ArrayList<String>();
    
        if (inputSize >= 1 && inputSize <= 30){
            System.out.println("Your list of " + inputSize + " random numbers are:");
            for (int i = 0; i < inputSize; i++) {
                randomNum = (int)(Math.random() * multipliedValue) + min;
                // num = rand.nextInt(31);
                if (generatedNums.size() == 0 || generatedNums.indexOf(randomNum) == -1) {
                    generatedNums.add(randomNum);
                } else {
                    i--;
                }
            }
            System.out.println(generatedNums);
            for (int n: generatedNums) {
                generatedImgs.add("/images/" + n + ".jpg");
            }
            System.out.println(generatedImgs);

        } else {
            System.out.println("Out of range! Please enter a value from 1 to 30.");
        }
    }
}
