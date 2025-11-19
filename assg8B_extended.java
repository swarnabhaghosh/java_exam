abstract class Number_ex{
    abstract void displayNum(float n);
}

class hex_ex extends Number_ex{
    void displayNum(float n){
        int int_part = (int) n;
        float fraction_part = n - int_part;

        String hexDigits = "0123456789ABCDEF";
        String IntegerHex = ""; // to store hex of integer part only
        String FractionHex = ""; // to store hex of fraction part only

        // integer part calculation -> divide by 16
        int r; // to store the remainder after division
        int temp_int = int_part;
        if(temp_int == 0) IntegerHex = "0";
        while(temp_int > 0){
            r = temp_int % 16; // storing the remainder after division
            IntegerHex = hexDigits.charAt(r) + IntegerHex;
            temp_int = temp_int / 16;
        }

        // fraction part calculation -> multiply with 16
        int digit; // to store the integer part after multipying
        float temp_frac = fraction_part;
        while(temp_frac > 0){
            temp_frac *= 16; //multiplying with 16
            digit = (int)temp_frac; // storing the integer part after multipying
            FractionHex += hexDigits.charAt(digit);
            temp_frac -= digit;
        }
        System.out.println("result = " + IntegerHex + "." + FractionHex);
    }
}

class octa_ex extends Number_ex{
    void displayNum(float n){
        int int_part = (int) n;
        float fraction_part = n - int_part;

        String octaDigits = "01234567";
        String IntegerOcta = ""; // to store octal of integer part only
        String FractionOcta = ""; // to store octal of fraction part only

        // integer part calculation -> divide by 8
        int r; // to store the remainder after division
        int temp_int = int_part;
        if(temp_int == 0) IntegerOcta = "0";
        while(temp_int > 0){
            r = temp_int % 8; // storing the remainder after division
            IntegerOcta = octaDigits.charAt(r) + IntegerOcta;
            temp_int = temp_int / 8;
        }

        // fraction part calculation -> multiply with 8
        int digit; // to store the integer part after multipying
        float temp_frac = fraction_part;
        while(temp_frac > 0){
            temp_frac *= 8; //multiplying with 8
            digit = (int)temp_frac; // storing the integer part after multipying
            FractionOcta += octaDigits.charAt(digit);
            temp_frac -= digit;
        }
        System.out.println("result = " + IntegerOcta + "." + FractionOcta);
    }
}

public class assg8B_extended {
    public static void main(String[] args) {
        hex_ex hex = new hex_ex();
        hex.displayNum(97.01f);
        hex.displayNum(47.25f);
        hex.displayNum(255.9375f);

        octa_ex oct = new octa_ex();
        oct.displayNum(10.5f);
        oct.displayNum(47.25f);
        oct.displayNum(255.9375f);
    }
}
