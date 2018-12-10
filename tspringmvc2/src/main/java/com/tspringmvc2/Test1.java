package com.tspringmvc2;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class Test1 {
  public static void main(String[] args) throws IOException {
    //    BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\sipi7\\Desktop\\qwe.txt"));
    Stream<String> lines = Files.lines(new File("C:\\Users\\sipi7\\Desktop\\qwe.txt").toPath());
//    reader.lines()
//    ArrayList<String> strings = new ArrayList<>();
//    while (reader.read() != -1) {
//      strings.add(reader.readLine());
//    }
//    strings.forEach(System.out::println);
    new Test1().met(lines);
  }

  public void met(Stream<String> strings) {
    strings.parallel();
//        .flatMap(Pattern.compile("[^0-9]")::splitAsStream)
//        .forEach(System.out::println);
//        .filter(s -> s.matches("[0-9]+"))
//        .map(Integer::valueOf)
//        .max(String::compareTo)
//        .map(Integer::valueOf)
//        .max(Integer::compareTo);
//        .collect(Collectors.summarizingInt(Integer::intValue)).getMax();
//    System.out.println(max);
//        .filter()
//        .forEach(System.out::println)
//        .map(Integer::valueOf)
//        .collect(Collectors.toList());
  }
}
