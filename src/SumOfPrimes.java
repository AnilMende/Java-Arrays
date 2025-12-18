public class SumOfPrimes {

    public static void main(String[] args) {
        int[] input1 = {10, 41, 18, 50, 43, 31, 29, 25, 59, 96, 67};
        int input2 = 11;

        int result = findSumExcludingLargestPrime(input1, input2);
        System.out.println(result); // Expected output is 203
    }

    public static int findSumExcludingLargestPrime(int[] arr, int n) {
        int largestPrime = Integer.MIN_VALUE;
        int sumOfPrimes = 0;
        boolean hasPrime = false;

        // Function to check if a number is prime
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                hasPrime = true;
                sumOfPrimes += arr[i];
                if (arr[i] > largestPrime) {
                    largestPrime = arr[i];
                }
            }
        }

        // If there are no primes, sum all numbers except the largest
        if (!hasPrime) {
            int largest = Integer.MIN_VALUE;
            int totalSum = 0;
            for (int i = 0; i < n; i++) {
                totalSum += arr[i];
                if (arr[i] > largest) {
                    largest = arr[i];
                }
            }
            return totalSum - largest;
        }

        // Subtract the largest prime from the sum of primes
        return sumOfPrimes - largestPrime;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
