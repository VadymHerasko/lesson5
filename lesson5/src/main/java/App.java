public class App
{
    static public void main (String[] argv) {
        // Byte = 8 bit
        byte byteVar0 = 'a' ; // ASCII symbol table 256 values = 0000 0000 = 2^8
        byte byteVar1 = -128 ;
        Byte byteVar2 = 127 ;
        byte byteVar3 = 0x23; // HEX - #
        byte byteVar4 = 0b00000001; // HEX - #


        System.out.println((char) byteVar4);
        // Char or Short 2 byte = 16 bit - ~65k
        short shortVal = -32768;
        Short shortVal1 = 32767;

        // Int = 4 byte = 32 bit - 4GB of RAM memory
        int intVal1 = -2147483648;
        Integer intVal2 = 2147483647;

        // Long = 8 byte = 64 bit - 16TB of RAM memory
        long longVal1 = -9223372036854775808L;
        long longVal2 = 9223372036854775807L;

        // Float = 4 byte = 32 bit
        float floatVal1 = 5.054F;
        Float floatVal2 = -5.054F;

        // Double = 8 byte = 64bit
        double doubleVal1 = 5.0000234242;
        Double doubleVal2 = -5.0000234242;

        //Boolean = 1 bit
        boolean boolVal1 = true; // 1
        Boolean boolVal2 = false; // 0

        // Char = 2 byte = 15 bit
        char charVal1 = 'ї';
        Character charVal2 = 'ї';

        // String - immutable array of chars
        String strVal = "Привіт";

        System.out.println("Chars:");
        for(char ch: strVal.toCharArray()) {
            System.out.println(ch);
        }

        System.out.println("Bytes:");
        for(byte bt: strVal.getBytes()) {
            //System.out.println(bt);
        }
        String strVal2 = "Привіт";

        String strVal3; // NULL
        StringBuffer  strBuff = new StringBuffer("Привіт");
        strVal3 = strBuff.toString();

        System.out.println("strVal:  " + strVal);
        System.out.println("strVal2:  " + strVal2);
        System.out.println("strVal3:  " + strVal3);

        System.out.println("strVal = strVal2: " + (strVal ==strVal2));
        System.out.println("strVal = strVal3: " + (strVal ==strVal3));

        System.out.println("strVal equals strVal2: " + strVal.equals(strVal2));
        System.out.println("strVal equals strVal3: " + strVal.equals(strVal3));


        strVal3 = strVal;

        System.out.println("strVal:  " + strVal);
        System.out.println("strVal3:  " + strVal3);
        System.out.println("strVal = strVal3: " + (strVal ==strVal3));

        // Format
        int num = 10;
        float coefficient = 1.5F;
        String message = "My message";
        String formatted = String.format(" [%d] coefficient is %.2f message: %s %nNew line\n",num, coefficient, message);
        System.out.print(formatted + "\n" );
        System.out.println("Some liine");

        ClassExample  example = new ClassExample();
        System.out.println(example.getString());
        System.out.println(example.stringExample);







    }

}
