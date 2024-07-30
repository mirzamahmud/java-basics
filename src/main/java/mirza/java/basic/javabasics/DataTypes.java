package mirza.java.basic.javabasics;

// Data types: It specify the different sizes and values that can be stored in the variable.
// there are two types of data types in Java -> Primitive and Non-Primitive.
public class DataTypes {
    // this method is used to define primitive data types.
    // There are 8 types of primitive data types.
    public static void exampleOfPrimitiveDataType(){
        // 1. Boolean Data Type --------- 1 bit
        Boolean bool = false;
        System.out.println("Boolean: " + bool);
        
        // 2. Byte Data Type ---------- 8 bits / 1 byte (Range: -128 to 127)
        byte byteVar = 125;
        System.out.println("Byte: " + byteVar);
        
        // 3. Short Data Type --------- 16 bits / 2 bytes (Range: -32,768 to 32,767)
        short shortVar = 32760;
        System.out.println("Short: " + shortVar);
        
        // 4. Int Data Type --------- 32 bits / 4 bytes (Range: -2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1))
        int intVar = 32760;
        System.out.println("Int: " + intVar);
        
        // 5. Long Data Type --------- 64 bits / 8 bytes (Range: -9,223,372,036,854,775,808(-2^63) to 9,223,372,036,854,775,807(2^63 -1))
        long longVar = 2589996632255555556L;
        System.out.println("Long: " + longVar);
        
        // 6. Float Data Type --------- 32 bits / 4 bytes (Range: unlimited)
        float floatVar = 2589.8565444445556662222222228996635f;
        System.out.println("Float: " + floatVar);
        
        // 7. Double Data Type --------- 64 bits / 8 bytes (Range: unlimited)
        double doubleVar = 2589.8565444445556662222222228996635d;
        System.out.println("Double: " + doubleVar);
        
        // 8. Char Data Type --------- 16 bits / 2 bytes (Range: '\u0000' (or 0) to '\uffff' (or 65,535 inclusive))
        char charVar = '\u5500';
        System.out.println("Char: " + charVar);
    }
    
    // this method is used to define non-primitive data types.
    public static void exampleOfNonPrimitiveDataType(){
        
    }
}
