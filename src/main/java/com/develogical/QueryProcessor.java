package com.develogical;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.toLowerCase().contains("granada holmes")) {
          return "\"I would've thought I was as trustworthy as your brother.\"" +
                  "\"Of course you are, Watson!" +
                  "......But you have a kinder heart.\"";
        }

        if (query.toLowerCase().contains("your name")) {
          return "Rigel";
        }

        if (query.toLowerCase().contains("largest")) {
          query = query.toLowerCase();
          String[] colons = query.split(":", 3);
          String[] numbers = colons[colons.length - 1].split(",");
          List<Integer> nums = Arrays.stream(numbers).map(String::strip).map(Integer::parseInt).collect(Collectors.toList());
          return Collections.max(nums).toString();
        }

      if (query.toLowerCase().contains("plus")) {
        query = query.toLowerCase();
        String[] tokens = query.split(" ");
        for (int i = 0; i < tokens.length; i++) {
          if (tokens[i].equals("plus")) {
            int num1 = Integer.parseInt(tokens[i - 1]);
            int num2 = Integer.parseInt(tokens[i + 1]);
            return String.valueOf(num1 + num2);
          }
        }
        return "0";
      }

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }
        return "";
    }
}
