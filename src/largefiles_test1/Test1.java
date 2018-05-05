package largefiles_test1;

import java.math.BigInteger;

public class Test1 {
    
    static BigInteger count(int N) {
        BigInteger memSum;
        BigInteger prev = BigInteger.ZERO;
        BigInteger sum = BigInteger.ONE;
        
        for (int i=1; i<N; i++) {
            memSum = sum;
            sum = sum.add(prev);
            prev = memSum;
        }
        
        return sum.multiply(BigInteger.valueOf(2L));
    }
    
    public static void main(String[] args) {
        try {           
            int amountOfChairs = Integer.parseInt(args[0]);
            if (amountOfChairs<1)
                throw new NumberFormatException();
            BigInteger res = count(amountOfChairs);
            System.out.println(res.toString());
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Error. Amount of chairs argument is necessary.");
        }
        catch (NumberFormatException ex) {
            System.out.println("Error. Argument must be positive integer.");
        }
    }
      
    
}
