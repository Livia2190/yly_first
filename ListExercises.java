import java.util.ArrayList;
import java.util.List;

public class ListExercises{
    public static int sum(List<Integer> L){
        if(L.size() == 0){return 0;}
        int add=0;
        for(int i=0; i<L.size(); i++){
            add = add + L.get(i);
        }
        return add;
    }

    public static List evens(List<Integer> L){
        List<Integer> newlist = new ArrayList<Integer>();
        for (int  elem : L){
            if(elem % 2 == 0){
                newlist.add(elem);
            }
        }
        return newlist;
    }

    public static List common(List<Integer> L1, List<Integer> L2){
        List<Integer> newlist2 = new ArrayList<Integer>();
        for(int i = 0; i<L1.size(); i++){
            for(int elem : L2){
                if(elem == L1.get(i)){
                    newlist2.add(L1.get(i));
                }
            }
        }
        return newlist2;
    }

    public static int countOccurrencesOfC(List<String> words, char c){
        int cnt = 0;
        for(int i = 0; i <words.size(); i++){
            if(words.get(i).contains(String.valueOf(c))){
                cnt = cnt + words.get(i).length() - words.get(i).replaceAll(String.valueOf(c),"").length();
            }
        }
        return cnt;

    }

    public static void main(String[] args){
        List<Integer> L = new ArrayList<Integer>();
        L.add(1);
        L.add(3);
        System.out.println(sum(L));
        System.out.println(evens(L));

        List<Integer> L1 = new ArrayList<Integer>();
        List<Integer> L2 = new ArrayList<Integer>(); 
        L1.add(3);
        L1.add(7);
        L1.add(8);
        L2.add(2);
        L2.add(8);
        L2.add(3);
        System.out.println(common(L1,L2));

        List<String> words = new ArrayList<String>();
        words.add("hello");
        words.add("list");
        words.add("remain");
        words.add("eeeee");
        char c = 'e';
        System.out.println(countOccurrencesOfC(words,c));
    }
}