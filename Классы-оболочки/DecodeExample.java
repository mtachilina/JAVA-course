public class DecodeExample {
    public static void main(String[] args) {
        // Десятичная система
        Integer dec1 = Integer.decode("100");
        System.out.println("decode(\"100\") = " + dec1);
        
        // Шестнадцатеричная
        Integer hex1 = Integer.decode("0x64");
        Integer hex2 = Integer.decode("0X64");
        System.out.println("decode(\"0x64\") = " + hex1);
        
        // Восьмеричная
        Integer oct1 = Integer.decode("0144");
        System.out.println("decode(\"0144\") = " + oct1);
        
        // С отрицательным знаком
        Integer negative = Integer.decode("-100");
        System.out.println("decode(\"-100\") = " + negative);
        
        // С плюсом
        Integer positive = Integer.decode("+100");
        System.out.println("decode(\"+100\") = " + positive);
        
        // Для других типов
        Long longVal = Long.decode("0xFF");
        System.out.println("Long.decode(\"0xFF\") = " + longVal);
        
        Byte byteVal = Byte.decode("0x7F");
        System.out.println("Byte.decode(\"0x7F\") = " + byteVal);
        
        Short shortVal = Short.decode("010");
        System.out.println("Short.decode(\"010\") = " + shortVal);
    }
}