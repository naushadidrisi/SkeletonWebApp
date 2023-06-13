package com.develogical;

import java.util.Arrays;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
          + "English poet, playwright, and actor, widely regarded as the greatest "
          + "writer in the English language and the world's pre-eminent dramatist.";
    }

    if (query.toLowerCase().contains("is your name")) {
      return "Naushad Ahmed.";
    }

    if (query.toLowerCase().contains("Which of the following numbers is the largest")) {
      String s = query.split(":")[1];
      String s2 = s.substring(0, s.length()-1);
      String[] s3 = s2.split(",");
      int[] largestArr = {Integer.valueOf(s3[0]),Integer.valueOf(s3[1]),Integer.valueOf(s3[2])};
      Arrays.sort(largestArr);
      
      return largestArr[2]+"";
    }

    if (query.toLowerCase().contains("plus")) {
      String s1 = query.substring(0, query.length() -1 );
      String[] s = s1.split(" ");
      int sum = 0;
      for(String st: s) {
        if(st.matches("-?\\d+(\\.\\d+)?")) {
          sum = sum + Integer.valueOf(st);
        }
      }
      
      return sum+"";
    }

    return "";
  }
}
