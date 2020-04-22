package com.company;
import java.util.*;
import java.util.regex.Pattern;

public class Task3 {
    public static int solution(String S) {
//        long spaceCount = S.chars().filter(Character::isWhitespace).count();
//
//        String[] split = S.split("[.?!]");
//
//        if(S.length()==1)
//            return 0;
//        else  return Arrays.stream(S.split("[.?!]"))
//                .map(String::trim)
//                .filter(s -> !s.isEmpty())
//                .filter(s->s.chars().filter(Character::isWhitespace).count() < s.split("\\s+").length)
//                .map(s -> s.split("\\s+").length)
//                //.filter(x -> spaceCount<=x)
//                .max(Integer::compareTo)
//                .orElse(0);
//        return Arrays.stream(S.split("\\s*+(?:[.!?]\\s*+)+"))
//                .mapToInt(s -> s.split("\\s+").length)
//                .max()
//                .orElse(0);

//        public int solution(String S) {
            Pattern pattern = Pattern.compile("[a-zA-Z]");
            return Arrays.stream(S.split("[.?!]"))
                    .map(String::trim)
                    .map(s -> s.split("\\s+"))
                    .map(strings -> (int) Arrays.stream(strings)
                            .filter(s ->pattern.matcher(s).find()).count())
                    .max(Integer::compareTo).orElse(0);



    } //We test coders. Give us a try

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        int res = solution(str);
        System.out.println(res);
    }
}
