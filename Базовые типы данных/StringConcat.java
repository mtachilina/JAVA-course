public class StringConcat {
    public static void main(String[] args) {
        String baseMessage = "Result: ";
        
        int currentNumber = 100;
        double currentPrice = 49.99;
        boolean isValidStatus = true;
        char gradeSymbol = 'A';
        long totalCount = 5000L;
        float piValue = 3.14f;
        
        String finalResult = baseMessage + currentNumber + ", " + currentPrice + ", " + isValidStatus + ", " + gradeSymbol + ", " + totalCount + ", " + piValue;
        
        System.out.println(finalResult);
    }
}