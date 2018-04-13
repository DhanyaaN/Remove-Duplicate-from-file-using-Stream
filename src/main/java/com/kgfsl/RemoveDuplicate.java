package com.kgfsl;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class RemoveDuplicate{
    public static void main(String[] args) {
        String txtfile="E:/Dhanyaa/Giveup.csv";
        List<String> list=new ArrayList<>();
        // reading csv file into stream, try-with-resources
        try(Stream<String> emp=Files.lines(Paths.get(txtfile)))
        {
            list=emp.collect(Collectors.toList());
        Set<String> distinct=list.stream().distinct().collect(Collectors.toSet());
        System.out.println("Distinct Elements");
        distinct.forEach(System.out::println);
        long unique=list.stream().distinct().count();
        System.out.println("BEFORE REMOVING DUPLICATE:  "+list.stream().count());
        System.out.println("AFTER REMOVING DUPLICATE:   "+unique);
    }catch (IOException ioe) {
        ioe.printStackTrace();
    }
}}
