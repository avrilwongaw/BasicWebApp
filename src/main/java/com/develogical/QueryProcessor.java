package com.develogical;

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

        if (query.toLowerCase().contains("imperial")) {
            return "Imperial College is a university in London";
        }
        return "";
    }
}
