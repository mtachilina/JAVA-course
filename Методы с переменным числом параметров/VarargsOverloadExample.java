public class VarargsOverloadExample {
    
    public void print(int... numbers) {
        System.out.print("int...: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public void print(String... strings) {
        System.out.print("String...: ");
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    
    public void printIntAndString(int first, String... rest) {
        System.out.print("int + String...: " + first + " -> ");
        for (String str : rest) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
    
    public void printDoubleAndInt(double first, int... rest) {
        System.out.print("double + int...: " + first + " -> ");
        for (int num : rest) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        VarargsOverloadExample obj = new VarargsOverloadExample();
        
        obj.print(1, 2, 3, 4);
        obj.print("A", "B", "C");
        obj.printIntAndString(10, "Hello", "World");
        obj.printDoubleAndInt(3.14, 5, 6, 7);
    }
}