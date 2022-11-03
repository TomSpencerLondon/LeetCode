package com.tomspencerlondon.leetcode2131;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  public int longestPalindrome(String[] words) {
    List<String> result = chooseTwo(Arrays.asList(words));
    return 1;
  }



  public List<String> chooseTwo(List<String> words) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i < words.size(); i++) {
      for (int j = 0; j < words.size(); j++) {
        if (i != j) {
          result.add(words.get(i) + words.get(j));
        }
      }
    }

    return result;
  }

  public List<String> chooseThree(List<String> words) {
    List<String> allCombinations = new ArrayList<>();
    for (int i = 0; i < words.size(); i++) {
      List<String> reducedList = deleteOneWord(words, i);
      List<String> twoCombination = prepend(reducedList, words.get(i));
      allCombinations.addAll(twoCombination);
    }
    return allCombinations;
  }

  private List<String> prepend(List<String> reducedList, String word) {
    return chooseTwo(reducedList)
        .stream()
        .map(s -> word + s)
        .collect(Collectors.toList());
  }

  private List<String> deleteOneWord(List<String> words, int index) {
    List<String> result = new ArrayList<>(words);
    result.remove(index);
    return result;
  }


}
