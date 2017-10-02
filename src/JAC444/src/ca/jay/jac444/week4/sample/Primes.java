package ca.jay.jac444.week4.sample;

/************************************************************************
 *  Compilation:  javac Primes.java
 *  Execution:    java Primes
 *
 *  The Primes program finds the primes up to a limit
 *
 * From:
 * http://web.mit.edu/ternus/Public/Public_old/6.005/procedural_java/Primes.java
 ************************************************************************/
public class Primes {

    /**
     * Find all prime numbers up to a limit.
     *
     * @param n           Largest number to search
     * @param printPrimes If true, print the primes found to output.
     * @return number of primes <= n
     * @effects If printPrimes is true, prints all primes <= n to output.
     */
    private static void findPrimes(int nValues, boolean printPrimes) {
        boolean isPrime = true;

        for (int i = 2; i <= nValues; i++) {
            isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (printPrimes && isPrime) {
                System.out.println(i);
            }
        }
    }

    // Try to find an implementation that runs faster that the first one
    // HINT: use labeled continue
    private static void findPrimesFaster(int nValues, boolean printPrimes) {

        System.out.println("The method findPrimesFaster has not been implemented");
    }

    public static void main(String ... args) {

        // Find and print all primes between 0 and 50.
        System.out.println("Running method findPrimes:");
        findPrimes(50, true);

        System.out.println("\nRunning method findPrimesFaster:");
        findPrimesFaster(50, true);

        // Time how long it takes to find primes.
        long startTime = 0;
        long endTime = 0;

        System.out.print("\n\nTiming method findPrimes:");
        startTime = System.currentTimeMillis();
        findPrimes(20000, false);
        endTime = System.currentTimeMillis();
        System.out.println("  " + (endTime - startTime) + " milliseconds");

        System.out.print("\nTiming method findPrimesFaster:");
        startTime = System.currentTimeMillis();
        findPrimesFaster(20000, false);
        endTime = System.currentTimeMillis();
        System.out.println("  " + (endTime - startTime) + " milliseconds");

        System.out.print("\n\nTiming method findPrimes:");
        startTime = System.currentTimeMillis();
        findPrimes(50000, false);
        endTime = System.currentTimeMillis();
        System.out.println("  " + (endTime - startTime) + " milliseconds");

        System.out.print("\nTiming method findPrimesFaster:");
        startTime = System.currentTimeMillis();
        findPrimesFaster(50000, false);
        endTime = System.currentTimeMillis();
        System.out.println("  " + (endTime - startTime) + " milliseconds");
    }
}
