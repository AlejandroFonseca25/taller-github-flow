package model;

import java.util.List;

// Based on Simple Array Sum problem of HackerRank
class Result {
 // Complete the 'simpleArraySum' function below.
 // The function is expected to return an INTEGER.
 public static int simpleArraySum(List<Integer> ar) {
	 return ar.stream().mapToInt(Integer::intValue).sum();
 }
}