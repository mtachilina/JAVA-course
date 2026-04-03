public class AllOperatorsExample {
    
    public static void main(String[] args) {
        
        System.out.println(" Арифметические операторы");
        
        int a = 10;
        int b = 3;
        
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        
        System.out.println("\n Операторы сравнения");
        
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        
  
        System.out.println("\n Логические операторы");
        
        boolean x = true;
        boolean y = false;
        
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        
        System.out.println("\n Побитовые операторы");
        
        int bitA = 5;   // 0101
        int bitB = 3;   // 0011
        
        System.out.println("bitA & bitB: " + (bitA & bitB));   // 1
        System.out.println("bitA | bitB: " + (bitA | bitB));   // 7
        System.out.println("bitA ^ bitB: " + (bitA ^ bitB));   // 6
        System.out.println("~bitA: " + (~bitA));
        
   
        System.out.println("\n Операторы сдвига");
        
        int shiftValue = 16;
        System.out.println("shiftValue >> 2: " + (shiftValue >> 2));
        System.out.println("shiftValue << 2: " + (shiftValue << 2));
        System.out.println("shiftValue >>> 2: " + (shiftValue >>> 2));
        
        System.out.println("\n Операторы присваивания");
        
        int value = 10;
        value += 5;
        System.out.println("value += 5: " + value);
        
        value -= 3;
        System.out.println("value -= 3: " + value);
        
        value *= 2;
        System.out.println("value *= 2: " + value);
        
        value /= 4;
        System.out.println("value /= 4: " + value);
        
        value %= 3;
        System.out.println("value %= 3: " + value);
        
        System.out.println("\n Инкремент И декремент");
        
        int counter = 5;
        
        System.out.println("counter++ (постфикс): " + (counter++));
        System.out.println("После counter++: " + counter);
        
        System.out.println("++counter (префикс): " + (++counter));
        
        System.out.println("counter-- (постфикс): " + (counter--));
        System.out.println("После counter--: " + counter);
        
        System.out.println("--counter (префикс): " + (--counter));
        
        System.out.println("\n Операторы со строками");
        
        String str1 = "Hello";
        String str2 = "World";
        
        System.out.println("str1 + str2: " + (str1 + str2));
        System.out.println("str1 + \" \" + str2: " + (str1 + " " + str2));
        
        int number = 42;
        System.out.println("str1 + number: " + (str1 + number));
        
        String message = "Start";
        message += " End";
        System.out.println("message += \" End\": " + message);
        
        System.out.println("\n Тернарный оператор ?:");
        
        int age = 18;
        String result = (age >= 18) ? "Взрослый" : "Ребенок";
        System.out.println("(age >= 18) ? \"Взрослый\" : \"Ребенок\" -> " + result);
    }
}