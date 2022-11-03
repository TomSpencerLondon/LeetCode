package com.tomspencerlondon.leetcode2131;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void chooseTwoReturnsAllCombinationsOfTwo() {
//    // lccl
//// cllc
//// lcgg
//// gglc
//// clgg
//// ggcl
    Solution solution = new Solution();
    List<String> input = List.of("cl", "lc", "gg");
    assertThat(solution.chooseTwo(input))
        .containsExactlyInAnyOrder("lccl", "cllc", "lcgg", "gglc", "clgg", "ggcl");
  }

  @Test
  void chooseThreeReturnsAllCombinationsOfThree() {
    // lcclgg
// lcggcl
// cllcgg
// clgglc
// gglccl
// ggcllc
    Solution solution = new Solution();
    List<String> input = List.of("cl", "lc", "gg");

    assertThat(solution.chooseThree(input))
        .containsExactlyInAnyOrder("lcclgg", "clgglc", "lcggcl", "gglccl", "cllcgg", "ggcllc");
//    ["cllcgg", "clgglc", "lcclgg", "lcggcl", "ggcllc", "gglccl"]

//    "cllcgg",
//    "clgglc",
//    "lcclgg",
//    "lcggcl",
//    "ggcllc",
//    "gglccl"

  }

  @Test
  void chooseFourReturnsAllCombinationsOfFour() {
    // ddlcclgg
// ddlcggcl
// ddcllcgg
// ddclgglc
// ddgglccl
// ddggcllc
// lcclggdd
// lcggcldd
// cllcggdd
// clgglcdd
// gglccldd
// ggcllcdd
// lcddclgg
// lcddggcl
// clddlcgg
// clddgglc
// ggddlccl
// ggddcllc
// lcclddgg
// lcggddcl
// cllcddgg
// clggddlc
// gglcddcl
// ggclddlc

    Solution solution = new Solution();
    List<String> input = List.of("cl", "lc", "gg", "dd");

    assertThat(solution.chooseFour(input))
        .containsExactlyInAnyOrder(
            "ddlcggcl",
            "ddcllcgg",
            "ddclgglc",
            "ddgglccl",
            "ddggcllc",
            "lcclggdd",
            "lcggcldd",
            "cllcggdd",
            "clgglcdd",
            "gglccldd",
            "ggcllcdd",
            "lcddclgg",
            "lcddggcl",
            "clddlcgg",
            "clddgglc",
            "ggddlccl",
            "ggddcllc",
            "lcclddgg",
            "lcggddcl",
            "cllcddgg",
            "clggddlc",
            "gglcddcl",
            "ggclddlc",
            "ddlcclgg"
        );

  }
}


// Choose 1 [done]
// 3 options
// lc
// cl
// gg
// Choose 2: 6 options [done]
// lccl
// cllc
// lcgg
// gglc
// clgg
// ggcl
// permutations (formula - factorial)
// 3 choose 2 = 3 * 2
// Choose 3:
// lcclgg
// lcggcl
// cllcgg
// clgglc
// gglccl
// ggcllc

// Choose 4:
// Input: lc cl gg dd
// ddlcclgg
// ddlcggcl
// ddcllcgg
// ddclgglc
// ddgglccl
// ddggcllc
// lcclggdd
// lcggcldd
// cllcggdd
// clgglcdd
// gglccldd
// ggcllcdd
// lcddclgg
// lcddggcl
// clddlcgg
// clddgglc
// ggddlccl
// ggddcllc
// lcclddgg
// lcggddcl
// cllcddgg
// clggddlc
// gglcddcl
// ggclddlc





// 1. Select and concatenate
// 2. Finding if it is a palindrome

// Choose 1:
// for each element
// select the element

// Choose 2:
// Define result array
// for each element1 in list
//   for every element2 not the same as element1
//      add element1 combined with element2 to result

// Choose 3:
// Define result array
// for each element1 in list
//   for every element2 not the same element1
// for every element3 not the same as element2 and element1
// add element1 combined with element2 and element3 to result

//Example 1:
//
//Input: words = ["lc","cl","gg"]
//Output: 6
//Explanation: One longest palindrome is "lc" + "gg" + "cl" = "lcggcl", of length 6.
//Note that "clgglc" is another longest palindrome that can be created.
//Example 2:
//
//Input: words = ["ab","ty","yt","lc","cl","ab"]
//Output: 8
//Explanation: One longest palindrome is "ty" + "lc" + "cl" + "yt" = "tylcclyt", of length 8.
//Note that "lcyttycl" is another longest palindrome that can be created.
//Example 3:
//
//Input: words = ["cc","ll","xx"]
//Output: 2
//Explanation: One longest palindrome is "cc", of length 2.
//Note that "ll" is another longest palindrome that can be created, and so is "xx".
//
//
//Constraints:
//
//1 <= words.length <= 105
//words[i].length == 2
//words[i] consists of lowercase English letters.