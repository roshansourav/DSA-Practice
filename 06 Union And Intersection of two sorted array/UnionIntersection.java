import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.*;

// 06 Union And Intersection of two sorted array;
public class UnionIntersection {


    public void unionArray(int[] a, int n, int[] b, int m){
        Set<Integer> s = new HashSet<Integer>();

        for(int i=0; i<n; i++){
            s.add(a[i]);
        }
        for(int i=0; i<m; i++){
            s.add(b[i]);
        }

        System.out.println("\nSize of Union = "+s.size());

    }

    public void intersectionArray(int[] a, int n, int[] b, int m){

        Set<Integer> s1 = new HashSet<Integer>();
        for(Integer t:a){
            s1.add(t);
        }

        Set<Integer> s2 = new HashSet<Integer>();
        for(Integer t:b){
            s2.add(t);
        }
        s1.retainAll(s2);
        System.out.println("Intersection = "+s1);

    }



    public static void main(String[] ar){

        int[] a = {1, 2, 3, 4, 5} ;
        int n = a.length;
        int[] b = {1, 2, 3, 4, 5, 6};
        int m = b.length;


        UnionIntersection obj = new UnionIntersection();

        obj.unionArray(a, n, b, m);//calling union of array
        obj.intersectionArray(a, n, b, m);//calling intersection of array


    }
    
}
