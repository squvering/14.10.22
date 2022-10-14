import java.math.BigInteger;
public class Last_digit_of_a_large_number {
    public static int lastDigit(BigInteger n1, BigInteger n2) {
        if(n2 == BigInteger.ZERO)
            return 1;

        BigInteger hundred = new BigInteger("100");
        int n1_LastDigit = n1.remainder(BigInteger.TEN).intValue();
        int n2_LastDigit = n2.remainder(BigInteger.TEN).intValue();
        int n2_TwoLastDigits = n2.remainder(hundred).intValue();
        if(n1_LastDigit == 0)
            return 0;
        if(n1_LastDigit == 1)
            return 1;
        if(n1_LastDigit == 5)
            return 5;
        if(n1_LastDigit == 6)
            return 6;
        if(n1_LastDigit == 4) {
            if(n2_LastDigit % 2 == 0)
                return 6;
            else
                return 4;
        }
        if(n1_LastDigit == 9) {
            if(n2_LastDigit % 2 == 0)
                return 1;
            else
                return 9;
        }
        if(n1_LastDigit == 2) {
            if(n2_TwoLastDigits % 4 == 0)
                return 6;
            else if(n2_TwoLastDigits % 4 == 1)
                return 2;
            else if(n2_TwoLastDigits % 4 == 2)
                return 4;
            else
                return 8;
        }
        if(n1_LastDigit == 3) {
            if(n2_TwoLastDigits % 4 == 0)
                return 1;
            else if(n2_TwoLastDigits % 4 == 1)
                return 3;
            else if(n2_TwoLastDigits % 4 == 2)
                return 9;
            else
                return 7;
        }
        if(n1_LastDigit == 7) {
            if(n2_TwoLastDigits % 4 == 0)
                return 1;
            else if(n2_TwoLastDigits % 4 == 1)
                return 7;
            else if(n2_TwoLastDigits % 4 == 2)
                return 9;
            else
                return 3;
        }
        if(n1_LastDigit == 8) {
            if(n2_TwoLastDigits % 4 == 0)
                return 6;
            else if(n2_TwoLastDigits % 4 == 1)
                return 8;
            else if(n2_TwoLastDigits % 4 == 2)
                return 4;
            else
                return 2;
        }
        return 0;
    }
}
