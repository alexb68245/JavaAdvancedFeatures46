package collections.excercises;

import java.util.*;

public class Task3 {

    List<Integer> numbers = new ArrayList<>();

    public void populate() {
        for (int i = 0; i < 100; i++) {
            numbers.add((int) Math.floor(Math.random() * 50));
        }
        System.out.println(numbers);
    }

    public Set<Integer> convertListToSet() {
        Set<Integer> setOfNumbers = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            setOfNumbers.add(numbers.get(i));
        }
        return setOfNumbers;
    }


    public Set<Integer> repeatedNumbersWithCounter(){
        int[] cnt=new int[50];
        Set<Integer> duplicateNumbers = new HashSet<>();

        for(Integer num: numbers){
            if(convertListToSet().contains(num)) {
                cnt[num]++;
            }
        }

        for(int i = 0; i < 50; i++){
            if(cnt[i] > 1) {
                duplicateNumbers.add(i);
            }
        }
        return duplicateNumbers;
    }



}
