//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int findRatio(int[] numbers) {

         //initialize 2 smallest and 2 largest
        int largest1 = Integer.MIN_VALUE;
        int largest2 = Integer.MIN_VALUE;
        int smallest1 = Integer.MAX_VALUE;
        int smallest2 = Integer.MAX_VALUE;

        for (int num : numbers) { // find largest
            if (num > largest1) {
                largest2 = largest1;
                largest1 = num;
            } else if (num > largest2) {
                largest2 = num;
            }

            if (num < smallest1) { //find amallest
                smallest2 = smallest1;
                smallest1 = num;
            } else if (num < smallest2) {
                smallest2 = num;
            }
        }

        //calculate the ratio by adding the largest and dividing by the sum of the smallest
        int ratio = (largest1 + largest2) / (smallest1 + smallest2);
        return ratio;
    }

    public static void main(String[] args) {
        int[] A = {3, 5, 12, 450, 1, 1, 5, 6, 23, 6, 8, 9, 321, 2, 3}; //create array with numbers
        int ratio = findRatio(A); // called the method
        System.out.println("The ratio is : " + ratio); // print

    }
}
//time complexity of this code is linear O(n) 