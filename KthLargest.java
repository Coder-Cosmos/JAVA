import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class KthLargest {
    public static void main(String[] args) {

        int[] element = { 4,5,7,8,5,4,9,9,10,4,5,11};
        List<Integer> kthHighest = Arrays.stream(element)
        .filter(n->Collections.frequency(element,n)) 1
        .boxed()
        .limit(3) 
        .collect(Collectors.toList()); 
        System.out.println("Kth largest number: " + kthHighest);
    }
}
