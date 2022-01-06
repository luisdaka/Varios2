package com.company;

import java.util.*;
import java.util.stream.Collectors;
import java.lang.reflect.*;

public class Main {


    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Test test = new Test();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        LinkedList<Integer> list12 = new LinkedList<>();
        list12.add(3);
        list12.add(4);
        list12.add(1);
        list12.add(2);
        list12.add(3);
        list12.add(4);

        System.out.println(1/0);

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(8);
        Set<Integer> set = new HashSet<Integer>();

        set.stream().collect(Collectors.toList());

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(3);

        System.out.println("/////////////////////////////");
        System.out.println(test.findTwoTimes(list2));


        System.out.println(test.findValue(list,2));
        System.out.println(test.countValue(list2,1));
        System.out.println(test.countValueArray(list,list2));
        System.out.println(test.plusOne(list));
        System.out.println(test.lucas(1));
        test.solution1(14);
        //System.out.println(test.sumDigits(14));
        //System.out.println(test.impartes(list));

        Persona persona = new Persona();
        Field fld[] =  persona.getClass().getDeclaredFields();
        List<Field> fields =  Arrays.asList(fld);
        Class<?> myType = String.class;
        Class<?> myType2 = Integer.class;

        for (int i =0;i<fld.length;i++){
            Field f = persona.getClass().getDeclaredField(fld[i].getName());
            f.setAccessible(true);

            if (f.getType().isAssignableFrom(myType)){
                f.set(persona,"LUIS");
            }else if ( f.getType().isAssignableFrom(myType2)){
                f.set(persona,1);
            }

        }System.out.println(persona.toString());

        //System.out.println(test.getCic("FIES09041884"));

        System.out.println(test.getCic2("000046286018","46286018"));


        System.out.println(test.getCic2("000046286018","46286018"));

        System.out.println("/////////////////////////////");

        String javaVersion = System.getProperty("java.version");
        System.out.println(javaVersion);


        List lista = Arrays.asList("Bob", "Bill", "Ben");
        final String message = "Welcome";
        lista.forEach( name -> System.out.println(message + " " + name) );
        //message = "Goodbye";


    }
}
