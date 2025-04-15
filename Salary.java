import java.util.Arrays;

public class Salary {
    public static void main(String[] args) {
        int[] salaries = {900, 900, 600, 100, 10000};
        
        int secondUniqueHighest = Arrays.stream(salaries)
            .distinct()                 
            .boxed()                    
            .sorted((a, b) -> b - a)    
            .skip(1)                  
            .findFirst()                
            .orElseThrow(() -> new RuntimeException("Not enough unique salaries"));
        
        System.out.println("Second unique highest salary: " + secondUniqueHighest);
    }
}
