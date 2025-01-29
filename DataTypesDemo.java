public class DataTypesDemo {
    public static void main(String[] args) {
        // Integer types
        byte byteVar = 127; // Range: -128 to 127
        short shortVar = 32000; // Range: -32,768 to 32,767
        int intVar = 2147483647; // Range: -2^31 to 2^31-1
        long longVar = 9223372036854775807L; // Range: -2^63 to 2^63-1

        // Floating-point types
        float floatVar = 3.14f; // 32-bit precision
        double doubleVar = 3.141592653589793; // 64-bit precision

        // Character type
        char charVar = 'A';

        // Boolean type
        boolean boolVar = true;

        // Displaying the values
        System.out.println("Byte value: " + byteVar);
        System.out.println("Short value: " + shortVar);
        System.out.println("Integer value: " + intVar);
        System.out.println("Long value: " + longVar);
        System.out.println("Float value: " + floatVar);
        System.out.println("Double value: " + doubleVar);
        System.out.println("Character value: " + charVar);
        System.out.println("Boolean value: " + boolVar);
    }
}

