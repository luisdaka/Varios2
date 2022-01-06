package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.*;
import java.util.stream.*;
import java.util.function.Function;
public class Test {

    public boolean findValue(ArrayList<Integer> list, int i) {

        return list.contains(i);
    }

    public static String isBalanced2(String expr) {

        StringBuilder str = new StringBuilder(expr);
        StringBuilder reverseStr = str.reverse();
        return str == reverseStr?  "YES" :  "NO";
    }


    public boolean findValueMap(ArrayList<Integer> list, int i) {
        HashMap<String, Integer> map = new HashMap<>();
        Integer counter = 0;

        for (Integer number : list) {
            map.put(Integer.toString(list.indexOf(number)), number);
            if (map.containsValue(i)) {
                counter = i++;
                return true;
            }
        }
        return false;
    }

    public Integer countValue(ArrayList<Integer> numbers, int i) {
        Integer counter = 0;
        for (Integer number : numbers) {
            if (number == i) {
                counter++;
            }
        }
        return counter;
    }

    public String countValueArray(ArrayList<Integer> numbers, ArrayList<Integer> numbers2) {
        ArrayList<Integer> repeatNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            for (Integer number2 : numbers2) {
                if (number == number2) {
                    repeatNumbers.add(number);
                }
            }
            ;
        }
        return "los valores que se repiten son " + repeatNumbers;
    }


    public int findTwoTimes(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            for (Integer number2 : numbers) {
                int counter = 0;
                if (number == number2) {
                    counter++;
                    if (counter == 2)
                        return number;
                }
            }
        }
        return 0;
    }

    public List<Integer> plusOne(ArrayList<Integer> numbers) {
        return (numbers.stream().map(x -> x + 1).collect(Collectors.toList()));
    }

    public List<Integer> filterNumber(ArrayList<Integer> numbers, Integer i) {
        return (numbers.stream().filter(number -> number.equals(i)).collect(Collectors.toList()));
    }

    public int solution(int[] A) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = Arrays.stream(A).boxed().collect(Collectors.toList());
        Integer i = Collections.max(list);
        return i;
    }

    public Float lucas(float i) {
        Float solution = 1 / (i + (1 / i + (1 / (i + 1 / i))));
        return solution;
    }

    public int solution3(char[] S) {
        var counter = new int[26];
        for (int i = 0; i < S.length; i++)
            counter[S[i] - 'a']++;

        var numRemove = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] % 2 == 1)
                numRemove++;
        }

        return numRemove;
    }

    public int[] solution2(String[] carS) {
        BitSet[] featureCars = new BitSet[carS.length];
        for (int i = 0; i < carS.length; i++) { // O(n * m)
            featureCars[i] = convertToBitSet(carS[i]);
        }
        int[] similarCars = new int[featureCars.length];
        for (int i = 0; i < similarCars.length - 1; i++) { // O(n^2)
            for (int j = i + 1; j < similarCars.length; j++) {
                BitSet aux = (BitSet) featureCars[i].clone();
                aux.xor(featureCars[j]);
                if (aux.cardinality() <= 1) {
                    similarCars[i]++;
                    similarCars[j]++;
                }
            }
        }
        return similarCars;
    }

    public static BitSet convertToBitSet(String s) {
        BitSet bs = new BitSet(s.length());
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                bs.set(i);
            }
        }
        return bs;
    }

    public Integer solution1(Integer N) {
        Integer counter = 0;
        Integer suma = 2 * sumDigits(N);
        for (int i = 0; i < 501; i++) {
            if ((sumDigits(i) == suma) && (i > N)) {
                counter = i;
                break;
            }
        }
        return counter;
    }

    public int sumDigits(int no) {
        return no == 0 ? 0 : no % 10 + sumDigits(no / 10);
    }

    public List<Integer> impartes(ArrayList<Integer> numbers) {
        return numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }

    public String getCic(String cic) {
        if (cic != null) {
            String cicFormated = cic.trim();
            if (cicFormated.length() == 8) {
                return "0000".concat(cicFormated);
            } else {
                if (cic.contains("CLIA") || cic.contains("FIES") || cic.contains("LMIG")) {
                    return "FIES" + cic.substring(4);
                }
                return cic;
            }
        }
        return "";
    }

    public static String isBalanced(String expr) {

        StringBuilder str = new StringBuilder(expr);
        StringBuilder reverseStr = str.reverse();
          return str == reverseStr? "YES" :  "NO";
    }

    public String getCic2(String cic, String idc) {


        String pruebaidc = idc;
        String pruebacic = cic;
        if (cic.contains("FIES") && cic.contains(pruebaidc)) {
            pruebacic = "CLIA" + cic.substring(4);
        }
        return pruebacic;
    }

    public String runLengthEncoding(String input) {

        int n = input.length();
        for (int i = 0; i < n; i++) {

            // Count occurrences of current character
            int count = 1;
            while (i < n - 1 &&
                    input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }

            if (count == 1) {
                return input.charAt(i) + "1";
            }
            else {
                return String.valueOf(input.charAt(i));
            }
        }
        return input;
    }
}