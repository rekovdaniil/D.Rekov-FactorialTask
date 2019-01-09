import javax.swing.*;
import java.math.BigInteger;

/**
 * Created by Daniil on 08.01.2019.
 */
public class FactorialCalculator {
    String InputFactorialResult;

    FactorialCalculator(String factorialResult) {
        InputFactorialResult = factorialResult;
        if (this.CheckInput()) {
            FindFactorialInitialNumber();
        } else {
            JOptionPane.showMessageDialog(null, "The iserted N! value has not satisfy following criteria \n 1<=N<=2000 && Numeric");
        }
    }

    public boolean CheckInput() {
       //MUST BE: NUMERIC // LESS DIGITS THAN 2000! // GREATER THAN 0
        try
        {
            BigInteger Check = new BigInteger(InputFactorialResult);
            if (InputFactorialResult.length()<=5736 && Check.compareTo(BigInteger.valueOf(1))>=0) //n! (n=2000) length
            {
                return true;
            }
            else{return false;}
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
    }

    public void FindFactorialInitialNumber() {
        BigInteger Input = new BigInteger(InputFactorialResult);
        BigInteger Factorial = new BigInteger("1");

        int i = 1, result = 1;
        System.out.println(Factorial.compareTo(Input));

        while (i <= 2000 && Factorial.compareTo(Input) < 0) {
            Factorial = Factorial.multiply(BigInteger.valueOf(i));
            result = i;
            i++;
        }
        //If found value of the possible nearest n! equals to inputted data ==> Return N
        if(Factorial.compareTo(Input)==0)
        {
            JOptionPane.showMessageDialog(null, "The given input is an N! value of\n N=" + result);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The given input is NOT an Factorial! \n (i.e. given N! HAS NO integer N-value)");
        }
    }
}
