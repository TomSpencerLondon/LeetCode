### Longest Common Subsequence
abc - a, b, c, ab, bc, ac, abc
- maintains the order in the string = subsequence
- powerset / recursion for all subsequences

#### Working
s1 = "adcbc" length 5 => 32 subsequences
s2 = "dcadb" (32 subsequences)
adb is common for both strings. The longest is "adb" -> length is 3

#### Brute force
Generate all subsequences for each
Linearly compare
Brute force is exponential

Other option: generate all subsequences and compare on way

acd <-> ced
Some recurrence to find the answer on the way
1. Express indexes (index1, index2)
2. Explore possibility on that order
3. Take the best among them

acd
  ^ pointer
f(2) string till index 2
ced
  ^ pointer
f(2) string till index 2

Express by two indexes
index1 and index2

acd
  ^ index1
ced
  ^ index2

Do comparisons characterise?
Shrink the string - if s1(index1) == s2(index2)
Reduce index1 and index2
if both matching
if match on indexes:
1 + f(index1 - 1, index2 - 1) 
If don't match:
ac
 ^ index1
ce
 ^ index2

If move back miss out on comparison of c
Can also miss on comparison of e if the earlier one in string1 was e
Move the index1 only and keep index2

### If not match
answer:
0 + Max(f(index1 - 1, index2), f(index1, index2 - 1))
Base case: if number is negative reached end of string
```bash
f(index1, index2)
{
 if (index1 < 0 || index2 < 0) {
   return 0;
 }
 
 if (s1[index1] ==
 } s2[index2]) {
    return 1 + f(index1 - 1, index2 - 1);
 }
 
  return Max(f(index1 - 1, index2), f(index1, index2 - 1))

}
```
}