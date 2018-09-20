package eratosthene;

public class Eratosthene {

    public static void main(String[] args) {
        boolean numbers[] = new boolean[1000];	//boolean array representing the numbers
        int i;
        int nextPrime;							//next available prime number

        //Assume all of the numbers in the array are prime
        //Set all elements in the array to true;
        for (i = 0; i < 1000; i++) {
            numbers[i] = true;
        }

        //set the first prime # to 2
        nextPrime = 2;
        while (nextPrime <= Math.sqrt(1000)) {
            //set all multiples of nextPrime in the array to false
            for (i = nextPrime * 2; i < 1000; i += nextPrime) {
                numbers[i] = false;
            }

            //find the next prime number in the array
            do {
                nextPrime++;
            } while (numbers[nextPrime] != true);
        }

        //display the prime numbers
        int numCounter = 0;
        System.out.println("The prime numbers from 1 - 1000 are:");
        for (i = 2; i < 1000; i++) {

            if (numbers[i] == true) {
                numCounter++;   //used for formatting
                System.out.print(i + " ");
                //add a \n after every 10 numbers
                if (numCounter == 10) {
                    System.out.print("\n");
                    numCounter = 0;
                }
            }
        }
    }
}
