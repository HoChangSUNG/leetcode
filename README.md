# LeetCode 문제 풀이

- LeetCode 코딩 테스트 문제를 풀고 저장하는 리포지토리

## 목표

- 코딩 테스트 문제 풀이를 습관화하기
- 꾸준함을 키우기 것이 목표

## 공부 방식

- 매일 3문제씩 문제당 제한 시간을 정해 LeetCode 문제 풀기(문제 수는 그날 상황에 따라 변동 가능)
- 문제 풀이 후 어려웠던 점이나 다음에 풀 때 개선할 사항을 코멘트로 작성
- 문제를 100문제 단위로 3번 반복하여 3회독, 반복하면서 시간을 줄이고 더 좋은 방식 있는지 고민
- 3회독 후 다음 100문제 풀고 3회독 반복하는 방식

## 문제 풀이 현황 및 문제에 대한 코멘트
### 2023.7.4 ~ 2023.9.27
<details>
<summary>1회독 시간 및 문제 풀이 코멘트(100문제)</summary>
<br>

| 문제	                                                    | 난이도  | 걸린시간  | 제한시간	 |     날짜     | 코멘트                                                                             |
|:-------------------------------------------------------|:----:|:-----:|:-----:|:----------:|:--------------------------------------------------------------------------------|
| 1. Two Sum                                             | easy |  17   |  25   | 2023/07/04 |                                                                                 |
| 9. Palindrome Number                                   | easy |  17   |  25   | 2023/07/04 |                                                                                 |
| 13. Roman to Integer                                   | easy | 시간초과  |  25   | 2023/07/04 |                                                                                 |
| 14. Longest Common Prefix                              | easy |  10   |  25   | 2023/07/04 |                                                                                 |
| 20. Valid Parentheses                                  | easy |  11   |  25   | 2023/07/04 |                                                                                 |
| 21. Merge Two Sorted Lists                             | easy | 시간초과  |  25   | 2023/07/04 |                                                                                 |
| 26. Remove Duplicates from Sorted Array                | easy |  17   |  25   | 2023/07/05 |                                                                                 |
| 27. Remove Element                                     | easy |   7   |  25   | 2023/07/05 |                                                                                 |
| 28. Find the Index of the First Occurrence in a String | easy |  16   |  25   | 2023/07/05 |                                                                                 |
| 35. Search Insert Position                             | easy |  13   |  25   | 2023/07/05 | 이분 탐색 다시 보기                                                                     |
| 58. Length of Last Word                                | easy |  16   |  25   | 2023/07/05 |                                                                                 |
| 66. Plus One                                           | easy | 시간초과  |  25   | 2023/07/06 | 큰 숫자에서 틀림                                                                       |
| 67. Add Binary                                         | easy |  10   |  25   | 2023/07/06 |                                                                                 |
| 69. Sqrt(x)                                            | easy | 시간초과  |  25   | 2023/07/06 | 큰 숫자에서 overflow                                                                 |
| 70. Climbing Stairs                                    | easy |   5   |  25   | 2023/07/06 |                                                                                 |
| 83. Remove Duplicates from Sorted List                 | easy |   8   |  25   | 2023/07/06 |                                                                                 |
| 88. Merge Sorted Array                                 | easy |  10   |  25   | 2023/07/07 |                                                                                 |
| 94. Binary Tree Inorder Traversal                      | easy |  12   |  25   | 2023/07/07 | 재귀가 아닌 반복으로 해보기                                                                 |
| 100. Same Tree                                         | easy |  11   |  25   | 2023/07/07 |                                                                                 |
| 101. Symmetric Tree                                    | easy |  10   |  25   | 2023/07/07 |                                                                                 |
| 104. Maximum Depth of Binary Tree                      | easy |   4   |  25   | 2023/07/07 |                                                                                 |
| 108. Convert Sorted Array to Binary Search Tree        | easy | 시간초과  |  25   | 2023/07/08 | 해결 방법도 안떠오름, divide and conquer                                                 |
| 118. Pascal's Triangle                                 | easy |   4   |  25   | 2023/07/08 |                                                                                 |
| 119. Pascal's Triangle II                              | easy |   4   |  25   | 2023/07/08 |                                                                                 |
| 121. Best Time to Buy and Sell Stock                   | easy | 시간초과  |  25   | 2023/07/08 | 해결 방법도 안떠오름                                                                     |
| 136. Single Number                                     | easy |  12   |  25   | 2023/07/08 | xor로 풀어보기                                                                       |
| 163. Missing Ranges                                    | easy |  22   |  25   | 2023/07/09 | 코드가 너무 긴 거 같음                                                                   |
| 169. Majority Element                                  | easy |   8   |  25   | 2023/07/09 | hashmap 말고 다른거로 O(1)처리해보기                                                       |
| 170. Two Sum III - Data structure design               | easy |  14   |  25   | 2023/07/09 | 조금 더 좋은 방법이 있을 거 같음 arrayList 쓰는거보다                                             |
| 217. Contains Duplicate                                | easy |   8   |  25   | 2023/07/09 |                                                                                 |
| 219. Contains Duplicate II                             | easy |  17   |  25   | 2023/07/09 |                                                                                 |
| 228. Summary Ranges                                    | easy |  23   |  25   | 2023/07/10 |                                                                                 |
| 243. Shortest Word Distance                            | easy |  13   |  25   | 2023/07/10 |                                                                                 |
| 252. Meeting Rooms                                     | easy | 시간초과  |  25   | 2023/07/10 | 어떻게 풀지 감은 왔는데 시간 복잡도 때매 못함                                                      |
| 268. Missing Number                                    | easy |   9   |  25   | 2023/07/11 |                                                                                 |
| 283. Move Zeroes                                       | easy |  17   |  25   | 2023/07/11 | 시간 줄이는 거 있는데 잘 모르겠음                                                             |
| 303.Range Sum Query - Immutable                        | easy |   4   |  25   | 2023/07/11 | 좀 더 시간 줄일 수 있음                                                                  |
| 346. Moving Average from Data Stream                   | easy | 시간초과  |  25   | 2023/07/11 | 문제 방법 다 생각했는데 시간 부족했음                                                           |
| 349. Intersection of Two Arrays                        | easy |   9   |  25   | 2023/07/12 |                                                                                 |
| 350. Intersection of Two Arrays II                     | easy |   9   |  25   | 2023/07/12 | follow up 적용해서 해보기                                                              |
| 414. Third Maximum Number                              | easy |   9   |  25   | 2023/07/12 |                                                                                 |
| 422. Valid Word Square                                 | easy | 시간초과  |  25   | 2023/07/12 | 문제 푸는 법은 알겠는게 손이 안써짐, 시간 다 지난 다음에 풀긴했는데 너무 어렵게 생각함                              |
| 448. Find All Numbers Disappeared in an Array          | easy |  13   |  25   | 2023/07/13 | 문제 자체는 쉬워서 풀었는데 folow up 생각하고 풀어보기                                              |
| 455. Assign Cookies                                    | easy |   9   |  25   | 2023/07/13 |                                                                                 |
| 463. Island Perimeter                                  | easy |  20   |  25   | 2023/07/13 | 쉬운 문제를 bfs로 풀어버림…                                                               |
| 485. Max Consecutive Ones                              | easy | 시간초과  |  25   | 2023/07/13 | 쉬운 건데 어렵게 생각함                                                                   |
| 496. Next Greater Element I                            | easy |  22   |  25   | 2023/07/14 | follow up 못함                                                                    |
| 500. Keyboard Row                                      | easy |  18   |  25   | 2023/07/14 |                                                                                 |
| 506. Relative Ranks                                    | easy |  24   |  25   | 2023/07/14 | 처음에 푼건 코드가 너무 더러움                                                               |
| 561. Array Partition                                   | easy |   6   |  25   | 2023/07/15 |                                                                                 |
| 566. Reshape the Matrix                                | easy |   9   |  25   | 2023/07/15 |                                                                                 |
| 575. Distribute Candies                                | easy |   8   |  25   | 2023/07/15 | 캔티 종류 개수 카운팅하는거에서 시간과 메모리 많이 잡아 먹는듯                                             |
| 594. Longest Harmonious Subsequence                    | easy | 시간초과  |  25   | 2023/07/16 | 순서가 생각보다 중요하지 않음                                                                |
| 598. Range Addition II                                 | easy |   8   |  25   | 2023/07/16 |                                                                                 |
| 599. Minimum Index Sum of Two Lists                    | easy |  17   |  25   | 2023/07/16 | Map 이용해서 풀었는데 뭔가 마음에 안듦                                                         |
| 604. Design Compressed String Iterator                 | easy | 시간초과  |  25   | 2023/07/17 | 연산자 하나 잘못 써서 시간 내에 못푼거였음…                                                       |
| 605. Can Place Flowers                                 | easy |  23   |  25   | 2023/07/17 | 코드 진짜 더럽게 짬, 제출시 테스트도 많이 틀림                                                     |
| 628. Maximum Product of Three Numbers                  | easy | 시간초과  |  25   | 2023/07/17 | 쉬운 문제인데 너무 어렵게 풀려고 해서 시간초과                                                      |
| 643. Maximum Average Subarray I                        | easy |  19   |  25   | 2023/07/18 |                                                                                 |
| 645. Set Mismatch                                      | easy |  11   |  25   | 2023/07/18 |                                                                                 |
| 661. Image Smoother                                    | easy | 시간초과  |  25   | 2023/07/18 | 시간 초과 이후에 풀음                                                                    |
| 674. Longest Continuous Increasing Subsequence         | easy | 08:50 | 25:00 | 2023/07/19 |                                                                                 |
| 682. Baseball Game                                     | easy | 12:41 | 25:00 | 2023/07/19 |                                                                                 |
| 697. Degree of an Array                                | easy | 시간초과  | 25:00 | 2023/07/19 | 코드 짜다 시간 다감, 코드 짜도 틀렸을 듯                                                        |
| 717. 1-bit and 2-bit Characters                        | easy | 시간초과  | 25:00 | 2023/07/20 | 문제 이해를 잘못해서 30분동안 뭔소리인지 이해를 못함, 이해하고 나서 3분만에 풀음…                                |
| 724. Find Pivot Index                                  | easy | 11:00 | 25:00 | 2023/07/20 |                                                                                 |
| 733. Flood Fill                                        | easy | 13:00 | 25:00 | 2023/07/20 |                                                                                 |
| 734. Sentence Similarity                               | easy | 시간초과  | 25:00 | 2023/07/21 | 제출하면 테스트 코드 계속 막힘                                                               |
| 744. Find Smallest Letter Greater Than Target          | easy | 05:29 | 25:00 | 2023/07/21 | O(N)으로 말고 더 줄여보기                                                                |
| 746. Min Cost Climbing Stairs                          | easy | 09:53 | 25:00 | 2023/07/21 |                                                                                 |
| 747. Largest Number At Least Twice of Others           | easy | 13:58 | 25:00 | 2023/07/22 |                                                                                 |
| 748. Shortest Completing Word                          | easy | 24:26 | 25:00 | 2023/07/22 | 코드가 좀 더럽다, 테스트 케이스를 좀 잘 보자                                                      |
| 760. Find Anagram Mappings                             | easy | 08:06 | 25:00 | 2023/07/22 |                                                                                 |
| 766. Toeplitz Matrix                                   | easy | 19:37 | 25:00 | 2023/07/23 | 다 풀고 코드 작성할 때 순서 헷갈림, 코드 길이를 더 줄일 수 있으니 다음 번에는 좀 더 코드를 줄여보기                     |
| 704. Binary Search                                     | easy | 03:05 | 25:00 | 2023/07/23 |                                                                                 |
| 705. Design HashSet                                    | easy | 11:28 | 25:00 | 2023/07/23 | 그냥 Map 가져다가 쓰면 끝나는데, Map을 간단하게 구현해도 괜찮을듯                                        |
| 706. Design HashMap                                    | easy | 04:48 | 25:00 | 2023/07/24 | 그냥 Object 배열 만들지 않고 Node 배열로 만드는 방식도 괜찮을듯, 아니면 진짜로 해시 충돌시 체이닝까지 구현하는 것도 좋을 거 같음 |
| 804. Unique Morse Code Words                           | easy | 10:05 | 25:00 | 2023/07/24 |                                                                                 |
| 806. Number of Lines To Write String                   | easy | 09:32 | 25:00 | 2023/07/24 | 문제는 쉬움, 코드 길이를 줄일 수 있을 듯?                                                       |
| 812. Largest Triangle Area                             | easy | 시간초과  | 25:00 | 2023/07/25 | 어떤 유형의 문제인지는 알았는데 풀이 과정 생각하다가 시간이 다 지나감, 수학 공식 이용해야 함                           |
| 821. Shortest Distance to a Character                  | easy | 19:59 | 25:00 | 2023/07/25 | 방법이 생각 안나서 bfs로 풀음, 더 쉬운 방법이 존재하니 다음에 풀 때는 좀 더 생각해보기                            |
| 832. Flipping an Image                                 | easy | 13:13 | 25:00 | 2023/07/25 |                                                                                 |
| 860. Lemonade Change                                   | easy | 24:35 | 25:00 | 2023/07/26 | 쉽게 풀 수 있는데 풀이가 막상 생각이 안남. 너무 어렵게 풀었고 시간도 좀 안좋게 나옴                               |
| 867. Transpose Matrix                                  | easy | 05:09 | 25:00 | 2023/07/26 |                                                                                 |
| 883. Projection Area of 3D Shapes                      | easy | 19:47 | 25:00 | 2023/07/26 | 문제 이해하는데 시간이 오래 걸림, 문제 푸는 시간은 거의 안걸림                                            |
| 888. Fair Candy Swap                                   | easy | 시간초과  | 25:00 | 2023/07/27 | o(n^2)을 해서 시간초과 뜸, O(n)으로 끝내야 하는 풀이 사용해야 함                                      |
| 892. Surface Area of 3D Shapes                         | easy | 시간초과  | 25:00 | 2023/07/27 | 문제 이해를 못함, 문제 이해하면 풀 수 있는 문제였음                                                  |
| 896. Monotonic Array                                   | easy | 14:15 | 25:00 | 2023/07/27 | 시간복잡도는 똑같은데 코드를 좀 더 줄일 수 있을 듯                                                   |
| 905. Sort Array By Parity                              | easy | 07:51 | 25:00 | 2023/07/28 | 시간 복잡도를 O(N^2)에서 O(N)으로 줄여야 함, 내가 푼 풀이는 삽입정렬로 풀어서 O(N^2)으로 풀어서 너무 오래 걸림         |
| 908. Smallest Range I                                  | easy | 20:37 | 25:00 | 2023/07/28 | 쉬운 문제인데 글을 잘못 이해하고 코드 짜서 오래걸림, 글을 제대로 이해하면 코드 짜는데 3분도 안걸리는 문제임… 글좀 제대로 읽자……     |
| 914. X of a Kind in a Deck of Cards                    | easy | 시간초과  | 25:00 | 2023/07/28 | 문제 설명이 너무 부실함. GCD로 풀라는데 이해가 안가서 Editorial 보고 Brute Force 방식으로 풀어봄              |
| 922. Sort Array By Parity II                           | easy | 15:30 | 25:00 | 2023/07/29 | 해결은 했으나 O(N^2)으로 해결함 다음에는 O(N)으로 해결해보자                                          |
| 929. Unique Email Addresses                            | easy | 시간초과  | 25:00 | 2023/07/29 | 문제 해석을 잘못했음,split 정규 표현식으로 푸는건 생각을 안해봄. String을 처리하는 문제에 내가 약한듯                 |
| 941. Valid Mountain Array                              | easy | 09:52 | 25:00 | 2023/07/29 |                                                                                 |
| 942. DI String Match                                   | easy | 시간초과  | 25:00 | 2023/07/30 | 재귀 이용해서 brute force했는데 시간 초과 뜸, o(n)으로 풀수 있음                                    |
| 944. Delete Columns to Make Sorted                     | easy | 07:55 | 25:00 | 2023/07/30 |                                                                                 |
| 953. Verifying an Alien Dictionary                     | easy | 21:12 | 25:00 | 2023/07/30 | 문제는 어렵지 않았고, 코드 작성한 부분에서 실수 있어서 실수 찾는데 시간이 좀 걸림                                 |
| 961. N-Repeated Element in Size 2N Array               | easy | 06:20 | 25:00 | 2023/07/31 |                                                                                 |
| 976. Largest Perimeter Triangle                        | easy | 15:42 | 25:00 | 2023/07/31 | 삼각형 결정 조건 a+b>c를 이용해야 함, 정렬까지 하면 쉽게 문제 해결 가능                                    |
| 977. Squares of a Sorted Array                         | easy | 17:12 | 25:00 | 2023/07/31 |                                                                                 |

</details>

<details>
<summary>2회독 시간 및 문제 풀이 코멘트(100문제)</summary>
<br>

| 문제	                                                    | 난이도  | 1회독 걸린시간 | 2회독 걸린시간 | 제한시간	 |     날짜     | 코멘트                                                                            |
|:-------------------------------------------------------|:----:|:--------:|:--------:|:-----:|:----------:|:-------------------------------------------------------------------------------|
| 1. Two Sum                                             | easy |    17    |  10:02   |   25  | 2023/08/01 | follow-up 해결함, 시간 전보다 줄음                                                       |
| 9. Palindrome Number                                   | easy |    17    |  19:32   |   25  | 2023/08/01 | 이번에는 follow-up 해결함, 대신 시간이 전보다 오래 걸림, 좀 더 쉽게 풀 수 있는 방법이 있으니 다음에는 더 쉽게 코드 바꾸어보기 |
| 13. Roman to Integer                                   | easy |   시간초과   |  13:31   |   25  | 2023/08/01 | 저번에는 시간 초과 떴음,다음에는 solution에 있는 풀이들로 해결해보기                                     |
| 14. Longest Common Prefix                              | easy |    10    |  10:06   |   25  | 2023/08/02 | 다음에는 solution에 있는 방법이 더 좋으니 그걸로 해보기                                            |
| 20. Valid Parentheses                                  | easy |    11    |  07:21   |   25  | 2023/08/02 | 저번보다 시간은 줄었음                                                                   |
| 21. Merge Two Sorted Lists                             | easy |   시간초과   |  08:42   |   25  | 2023/08/02 | 시간은 줄었는데 이전 코드가 차라리 나은듯, 하나의 while문 안에 넣는 것보다 분리하는게 차라리 코드가 깔끔한듯               |
| 26. Remove Duplicates from Sorted Array                | easy |    17    |  09:28   |   25  | 2023/08/03 | 저번에는 새로운 배열 만들어서 풀었는데 이번에는 기존 배열로 풀고 시간도 더 빠름                                  |
| 27. Remove Element                                     | easy |    7     |  03:29   |   25  | 2023/08/03 | 위 문제랑 사실상 동일한 문제, 저번보다 코드 더 간단하게  풀음                                           |
| 28. Find the Index of the First Occurrence in a String | easy |    16    |  09:45   |   25  | 2023/08/03 | 코드 자체는 깔끔함. 시간 복잡도는 저번이랑 같은데 다음에는 좀 더 개선시켜야 함                                  |
| 35. Search Insert Position                             | easy |    13    |  02:54   |   25  | 2023/08/04 | 이분 탐색 기초라서 빨리 풀음                                                               |
| 58. Length of Last Word                                | easy |    16    |  07:05   |   25  | 2023/08/04 | 저번보다 코드는 짧음, 시간 복잡도 자체는 동일, editorial의 approach 2가 루프 하나로 제일 깔끔하게 푼듯           |
| 66. Plus One                                           | easy |   시간초과   |  12:49   |   25  | 2023/08/04 | 저번보다 깔끔하게 풀지는 않음, 다음번에는 코드 좀 더 다듬는 방식으로 풀어보기                                   |
| 67. Add Binary                                         | easy |    10    |  18:34   |   25  | 2023/08/05 | 답지 안본 최초 코드보다는 나음, 근데 코드에서 실수해서 실수 찾는데 오래 걸림                                   |
| 69. Sqrt(x)                                            | easy |   시간초과   |  15:50   |   25  | 2023/08/05 | 저번에 오버플로우 발생해서 계속 틀렸었는데, 이번에는 해결함                                              |
| 70. Climbing Stairs                                    | easy |    5     |  03:28   |   25  | 2023/08/05 |                                                                                |
| 83. Remove Duplicates from Sorted List                 | easy |    8     |  08:43   |   25  | 2023/08/06 | 새로운 노드를 만들었는데 새로 만들지 말고 기존 링크드 리스트를 재사용하는 방식으로 풀어보자 다음에는                       |
| 88. Merge Sorted Array                                 | easy |    10    |  13:17   |   25  | 2023/08/06 | 전보다 시간은 좀 더 걸렸지만, 좀 더 깔끔하게 follow up 해결함                                       |
| 94. Binary Tree Inorder Traversal                      | easy |    12    |   시간초과   |   25  | 2023/08/06 | follow up 해결하려 스택으로 해보려고 했는데, 로직을 잘못 작성해서 계속 실패함.                              |
| 100. Same Tree                                         | easy |    11    |  07:09   |   25  | 2023/08/07 |                                                                                |
| 101. Symmetric Tree                                    | easy |    10    |  06:39   |   25  | 2023/08/07 |                                                                                |
| 104. Maximum Depth of Binary Tree                      | easy |    4     |  01:54   |   25  | 2023/08/07 |                                                                                |
| 108. Convert Sorted Array to Binary Search Tree        | easy |   시간초과   |  18:31   |   25  | 2023/08/08 | 처음에 봤을때는 기억 안나서 좀 생각하는데 시간이 오래 걸림                                              |
| 118. Pascal's Triangle                                 | easy |    4     |  14:00   |   25  | 2023/08/08 | 코드를 작성하고, 변수를 잘못 할당해서 계속 실패했음                                                  |
| 119. Pascal's Triangle II                              | easy |    4     |  12:43   |   25  | 2023/08/08 | follow up 해결해서 시간이 저번보다 오래 걸림                                                  |
| 121. Best Time to Buy and Sell Stock                   | easy |   시간초과   |  14:18   |   25  | 2023/08/09 |                                                                                |
| 136. Single Number                                     | easy |    12    |  01:34   |   25  | 2023/08/09 |                                                                                |
| 163. Missing Ranges                                    | easy |    22    |  14:50   |   25  | 2023/08/09 |                                                                                |
| 169. Majority Element                                  | easy |    8     |  05:27   |   25  | 2023/08/09 | hashmap 말고 다른걸로 folllow up 해결해보기                                               |
| 170. Two Sum III - Data structure design               | easy |    14    |  08:52   |   25  | 2023/08/10 | 걸린 시간은 줄었는데 시간은 전에 푼거보다 오래 걸림, Map 써서 풀어보자                                     |
| 217. Contains Duplicate                                | easy |    8     |  06:46   |   25  | 2023/08/10 |                                                                                |
| 219. Contains Duplicate II                             | easy |    17    |  10:36   |   25  | 2023/08/10 |                                                                                |
| 228. Summary Ranges                                    | easy |    23    |  10:06   |   25  | 2023/08/11 |                                                                                |
| 243. Shortest Word Distance                            | easy |    13    |  09:41   |   25  | 2023/08/11 |                                                                                |
| 252. Meeting Rooms                                     | easy |   시간초과   |  10:10   |   25  | 2023/08/11 |                                                                                |
| 268. Missing Number                                    | easy |    9     |  01:19   |   25  | 2023/08/11 |                                                                                |
| 283. Move Zeroes                                       | easy |    17    |  08:08   |   25  | 2023/08/12 |                                                                                |
| 303.Range Sum Query - Immutable                        | easy |    4     |  04:31   |   25  | 2023/08/12 |                                                                                |
| 346. Moving Average from Data Stream                   | easy |   시간초과   |  13:34   |   25  | 2023/08/12 |                                                                                |
| 349. Intersection of Two Arrays                        | easy |    9     |  03:21   |   25  | 2023/07/12 |                                                                                |
| 350. Intersection of Two Arrays II                     | easy |    9     |  09:38   |   25  | 2023/07/12 |                                                                                |
| 414. Third Maximum Number                              | easy |    9     |   시간초과   |   25  | 2023/07/12 | follow up 해결해보려 했는데 시간 초과 뜸, 시간 초과 뜬 다음에 follow up 만족해서 해결함                    |
| 422. Valid Word Square                                 | easy |   시간초과   |  16:01   |   25  | 2023/08/14 |                                                                                |
| 448. Find All Numbers Disappeared in an Array          | easy |    13    |  24:54   |   25  | 2023/08/14 | follow up 처리하느냐 늦음, -1을 곱하는게 더 깔끔할듯 100001 더하는 것보다                             |
| 455. Assign Cookies                                    | easy |    9     |  10:43   |   25  | 2023/08/14 |                                                                                |
| 463. Island Perimeter                                  | easy |    20    |  11:18   |   25  | 2023/07/13 |                                                                                |
| 485. Max Consecutive Ones                              | easy |   시간초과   |  21:49   |   25  | 2023/07/13 | 문제를 잘못 해석해서 오래 걸림                                                              |
| 496. Next Greater Element I                            | easy |    22    |   시간초과   |   25  | 2023/07/14 | follow up 해결하려 시도했는데 시간 초과 됨, follow up해결 안하고 문제 풀면 시간 내에 가능하긴 함               |
| 500. Keyboard Row                                      | easy |    18    |  12:26   |   25  | 2023/08/16 |                                                                                |
| 506. Relative Ranks                                    | easy |    24    |  16:17   |   25  | 2023/08/16 |                                                                                |
| 561. Array Partition                                   | easy |    6     |   6:20   |   25  | 2023/08/16 |                                                                                |
| 566. Reshape the Matrix                                | easy |    9     |  08:16   |   25  | 2023/08/17 |                                                                                |
| 575. Distribute Candies                                | easy |    8     |  06:18   |   25  | 2023/08/17 | 배열에 저장하는게 시간 더 적게 걸리긴 하는데, Set에 저장해서 시간이 좀 걸리긴 하는데 이정도는 상관 없을듯                 |
| 594. Longest Harmonious Subsequence                    | easy |   시간초과   |  12:32   |   25  | 2023/08/17 |                                                                                |
| 598. Range Addition II                                 | easy |    8     |  03:37   |   25  | 2023/08/17 |                                                                                |
| 599. Minimum Index Sum of Two Lists                    | easy |    17    |  12:16   |   25  | 2023/08/18 |                                                                                |
| 604. Design Compressed String Iterator                 | easy |   시간초과   |   시간초과   |   25  | 2023/08/18 | Editorial 보고 풀음, 저번이랑 동일한 방식으로 풀려고 하는데 안되서 답지 봄                                |
| 605. Can Place Flowers                                 | easy |    23    |  12:37   |   25  | 2023/08/18 | 전에 답지 보고 푼것 보다는 코드가 조금 더럽지만 시간 초과 안뜸, 다음에는 코드 길이를 답지만큼 줄이기                     |
| 628. Maximum Product of Three Numbers                  | easy |   시간초과   |  04:09   |   25  | 2023/08/19 | 정렬 라이브러리 함수 써서 O(nlogn)인데 다음에는 정렬 함수 안써서 O(n)으로 처리해보기                          |
| 643. Maximum Average Subarray I                        | easy |    19    |  18:33   |   25  | 2023/08/19 | sliding window로 풀었는데 답지가 sliding window로 더 깔끔하게 풀었음                            |
| 645. Set Mismatch                                      | easy |    11    |  09:30   |   25  | 2023/08/19 | 저번이랑 다른 방법으로 풀었고, 이번에는 xor 사용해서 풀었는데 둘 다 O(n)으로 풀음                             |
| 661. Image Smoother                                    | easy |   시간초과   |   시간초과   |   25  | 2023/08/20 | 자꾸 어렵게 풀려고 해서 주어진 시간 안에 못품, 변수를 하나 잘못 설정해서 제출시 시간초과 뜸                          |
| 674. Longest Continuous Increasing Subsequence         | easy |  08:50   |  04:20   | 25:00 | 2023/08/20 |                                                                                |
| 682. Baseball Game                                     | easy |  12:41   |  11:07   | 25:00 | 2023/08/20 | 문제 리턴되는 값을 잘못봐서 오래 걸림                                                          |
| 697. Degree of an Array                                | easy |   시간초과   |  14:52   | 25:00 | 2023/08/21 |                                                                                |
| 717. 1-bit and 2-bit Characters                        | easy |   시간초과   |  09:34   | 25:00 | 2023/08/21 |                                                                                |
| 724. Find Pivot Index                                  | easy |  11:00   |  23:52   | 25:00 | 2023/08/21 |                                                                                |
| 733. Flood Fill                                        | easy |  13:00   |  17:19   | 25:00 | 2023/08/22 | 이번에는 bfs 말고 dfs로 풀음                                                            |
| 734. Sentence Similarity                               | easy |   시간초과   |   시간초과   | 25:00 | 2023/08/22 | 다음에는 putIfAbsent 이용해서 해보기                                                      |
| 744. Find Smallest Letter Greater Than Target          | easy |  05:29   |  15:01   | 25:00 | 2023/08/22 | 시간은 더 소요되었지만, O(N) → O(logN)으로 시간 줄임                                           |
| 746. Min Cost Climbing Stairs                          | easy |  09:53   |  07:05   | 25:00 | 2023/08/23 |                                                                                |
| 747. Largest Number At Least Twice of Others           | easy |  13:58   |  18:48   | 25:00 | 2023/08/23 | 시간복잡도는 저번이랑 동일하게 o(n)인데 이번에는 for문을 두번 써버림                                      |
| 748. Shortest Completing Word                          | easy |  24:26   |  23:49   | 25:00 | 2023/08/23 | 코드 풀긴 하는데 너무 더러움                                                               |
| 760. Find Anagram Mappings                             | easy |  08:06   |  09:24   | 25:00 | 2023/08/24 |                                                                                |
| 766. Toeplitz Matrix                                   | easy |  19:37   |  07:56   | 25:00 | 2023/08/24 |                                                                                |
| 704. Binary Search                                     | easy |  03:05   |  01:58   | 25:00 | 2023/08/24 |                                                                                |
| 705. Design HashSet                                    | easy |  11:28   |  12:30   | 25:00 | 2023/08/25 |                                                                                |
| 706. Design HashMap                                    | easy |  04:48   |  05:27   | 25:00 | 2023/08/25 | 다음에는 해시테이블 크기 제한하고, 체이닝으로 만들기                                                  |
| 804. Unique Morse Code Words                           | easy |  10:05   |  03:44   | 25:00 | 2023/08/25 |                                                                                |
| 806. Number of Lines To Write String                   | easy |  09:32   |  11:49   | 25:00 | 2023/08/26 |                                                                                |
| 812. Largest Triangle Area                             | easy |   시간초과   |  19:53   |  25:00   | 2023/08/26 |                                                                                |
| 821. Shortest Distance to a Character                  | easy |  19:59   |   시간초과   |  25:00   | 2023/08/26 | bfs 말고 다른 걸로 풀려고 했는데 안풀려서 시간 초과 뜸, 다른 사람꺼 참고함                                  |
| 832. Flipping an Image                                 | easy |  13:13   |  07:38   |  25:00   | 2023/08/26 |                                                                                |
| 860. Lemonade Change                                   | easy |  24:35   |  11:58   | 25:00 | 2023/08/27 | 시간은 줄였는데 코드가 너무 더러움                                                            |
| 867. Transpose Matrix                                  | easy |  05:09   |  03:20   |  25:00   | 2023/08/27 |                                                                                |
| 883. Projection Area of 3D Shapes                      | easy |  19:47   |  07:17   |  25:00   | 2023/08/27 |                                                                                |
| 888. Fair Candy Swap                                   | easy |   시간초과   |   시간초과   | 25:00 | 2023/08/28 | 풀이 방법 자체는 맞는데 코드 작성에서 헤맸음                                                      |
| 892. Surface Area of 3D Shapes                         | easy |   시간초과   |  15:20   |  25:00   | 2023/08/28 |                                                                                |
| 896. Monotonic Array                                   | easy |  14:15   |  06:32   |  25:00   | 2023/08/28 |                                                                                |
| 905. Sort Array By Parity                              | easy |  07:51   |  03:51   | 25:00 | 2023/08/29 |                                                                                |
| 908. Smallest Range I                                  | easy |  20:37   |  09:55   | 25:00 | 2023/08/29 |                                                                                |
| 914. X of a Kind in a Deck of Cards                    | easy |   시간초과   |   시간초과   | 25:00 | 2023/08/29 | 이번에도 brute force로 풀음, 근데 또 시간 초과임 문제 해결 방법을 자꾸 잊어버려서 그런듯                       |
| 922. Sort Array By Parity II                           | easy |  15:30   |   시간초과   | 25:00 | 2023/08/30 | follow up 해결하려 했는데 실패                                                          |
| 929. Unique Email Addresses                            | easy |   시간초과   |  10:15   | 25:00 | 2023/08/30 |                                                                                |
| 941. Valid Mountain Array                              | easy |  09:52   |  04:37   | 25:00 | 2023/08/30 |                                                                                |
| 942. DI String Match                                   | easy |  시간초과 | 08:21 | 25:00 | 2023/08/31 | o(n)으로 처리함 |
| 944. Delete Columns to Make Sorted                     | easy |  07:55 | 10:10 |  25:00   | 2023/08/31 | 코드 잘못 작성한 부분 찾는데 좀 걸림                                                          |
| 953. Verifying an Alien Dictionary                     | easy |  21:12 | 16:38 |  25:00   | 2023/08/31 |    |
| 961. N-Repeated Element in Size 2N Array               | easy | 06:20 | 04:29 | 25:00 | 2023/09/01 |      |
| 976. Largest Perimeter Triangle                        | easy | 15:42 | 12:04 | 25:00 | 2023/09/01 |       |
| 977. Squares of a Sorted Array                         | easy | 17:12 | 13:02 | 25:00 | 2023/09/01 |     |

</details>

<details>
<summary>3회독 시간 및 문제 풀이 코멘트(100문제)</summary>
<br>

| 문제	                                                    | 난이도  | 1회독 걸린시간 | 2회독 걸린시간 | 3회독 걸린시간 |   제한시간	    |     날짜     | 코멘트                                                                          |
|:-------------------------------------------------------|:----:|:--------:|:--------:|:--------:|:----------:|:----------:|:-----------------------------------------------------------------------------|
| 1. Two Sum                                             | easy |    17    |  10:02   |  11:18   |     25     | 2023/09/02 |                                                                              |
| 9. Palindrome Number                                   | easy |    17    |  19:32   |  05:23   |     25     | 2023/09/02 |                                                                              |
| 13. Roman to Integer                                   | easy |   시간초과   |  13:31   |  14:32   |     25     | 2023/09/02 |                                                                              |
| 14. Longest Common Prefix                              | easy |    10    |  10:06   |  06:22   |     25     | 2023/09/02 |                                                                              |
| 20. Valid Parentheses                                  | easy |    11    |  07:21   |  06:21   |     25     | 2023/09/03 |                                                                              |
| 21. Merge Two Sorted Lists                             | easy |   시간초과   |  08:42   |  12:42   |     25     | 2023/09/03 |                                                                              |
| 26. Remove Duplicates from Sorted Array                | easy |    17    |  09:28   |  08:53   |     25     | 2023/09/03 |                                                                              |
| 27. Remove Element                                     | easy |    7     |  03:29   |  03:13   |     25     | 2023/09/03 |                                                                              |
| 28. Find the Index of the First Occurrence in a String | easy |    16    |  09:45   |  04:42   |     25     | 2023/09/04 |                                                                              |
| 35. Search Insert Position                             | easy |    13    |  02:54   |  01:35   |     25     | 2023/09/04 |                                                                              |
| 58. Length of Last Word                                | easy |    16    |  07:05   |  07:47   |     25     | 2023/09/04 |                                                                              |
| 66. Plus One                                           | easy |   시간초과   |  12:49   |  06:44   |     25     | 2023/09/04 |                                                                              |
| 67. Add Binary                                         | easy |    10    |  18:34   |  10:43   |     25     | 2023/09/05 |                                                                              |
| 69. Sqrt(x)                                            | easy |   시간초과   |  15:50   |  07:56   |     25     | 2023/09/05 |                                                                              |
| 70. Climbing Stairs                                    | easy |    5     |  03:28   |  03:30   |     25     | 2023/09/05 |                                                                              |
| 83. Remove Duplicates from Sorted List                 | easy |    8     |  08:43   |  22:00   |     25     | 2023/09/05 | 기존 링크드 리스트를 재사용하는 방식으로 풀다가 안되서 걍 노드 새로 만듦                                    |
| 88. Merge Sorted Array                                 | easy |    10    |  13:17   |  06:21   |     25     | 2023/09/06 |                                                                              |
| 94. Binary Tree Inorder Traversal                      | easy |    12    |   시간초과   |   시간초과   |     25     | 2023/09/06 | follow up 해결하려 스택으로 해보려고 했는데, 로직을 잘못 작성해서 계속 실패함.                            |
| 100. Same Tree                                         | easy |    11    |  07:09   |  05:25   |     25     | 2023/09/06 |                                                                              |
| 101. Symmetric Tree                                    | easy |    10    |  06:39   |  03:12   |     25     | 2023/09/06 |                                                                              |
| 104. Maximum Depth of Binary Tree                      | easy |    4     |  01:54   |  00:58   |     25     | 2023/09/07 |                                                                              |
| 108. Convert Sorted Array to Binary Search Tree        | easy |   시간초과   |  18:31   |  16:45   |     25     | 2023/09/07 | 코드에서 변수 잘못 쓴 거 못찾아서 오래 걸림                                                    |
| 118. Pascal's Triangle                                 | easy |    4     |  14:00   |  05:46   |     25     | 2023/09/07 |                                                                              |
| 119. Pascal's Triangle II                              | easy |    4     |  12:43   |  17:22   |     25     | 2023/09/07 | 코드 잘못 봐서 오래 걸림                                                               |
| 121. Best Time to Buy and Sell Stock                   | easy |   시간초과   |  14:18   |  09:49   |     25     | 2023/09/08 |                                                                              |
| 136. Single Number                                     | easy |    12    |  01:34   |  00:33   |     25     | 2023/09/08 |                                                                              |
| 163. Missing Ranges                                    | easy |    22    |  14:50   |  10:38   |     25     | 2023/09/08 |                                                                              |
| 169. Majority Element                                  | easy |    8     |  05:27   |   시간초과   |     25     | 2023/09/08 | follow up 해결 못해서 답지 봄, 답지가 진짜 쉽게 follow up 해결함                               |
| 170. Two Sum III - Data structure design               | easy |    14    |  08:52   |  15:44   |     25     | 2023/09/09 | 코드 잘못봐서 다 풀고 시간 오래 걸림                                                        |
| 217. Contains Duplicate                                | easy |    8     |  06:46   |  01:30   |     25     | 2023/09/09 |                                                                              |
| 219. Contains Duplicate II                             | easy |    17    |  10:36   |  05:04   |     25     | 2023/09/09 |                                                                              |
| 228. Summary Ranges                                    | easy |    23    |  10:06   |  10:49   |     25     | 2023/09/09 |                                                                              |
| 243. Shortest Word Distance                            | easy |    13    |  09:41   |  07:22   |     25     | 2023/09/10 |                                                                              |
| 252. Meeting Rooms                                     | easy |   시간초과   |  10:10   |  08:38   |     25     | 2023/09/10 |                                                                              |
| 268. Missing Number                                    | easy |    9     |  01:19   |  01:08   |     25     | 2023/09/10 |                                                                              |
| 283. Move Zeroes                                       | easy |    17    |  08:08   |  03:04   |     25     | 2023/09/10 |                                                                              |
| 303.Range Sum Query - Immutable                        | easy |    4     |  04:31   |  02:56   |     25     | 2023/09/11 |                                                                              |
| 346. Moving Average from Data Stream                   | easy |   시간초과   |  13:34   |  06:28   |     25     | 2023/09/11 |                                                                              |
| 349. Intersection of Two Arrays                        | easy |    9     |  03:21   |  04:37   |     25     | 2023/09/11 |                                                                              |
| 350. Intersection of Two Arrays II                     | easy |    9     |  09:38   |  10:22   |     25     | 2023/09/11 |                                                                              |
| 414. Third Maximum Number                              | easy |    9     |   시간초과   |  14:44   |     25     | 2023/09/12 |                                                                              |
| 422. Valid Word Square                                 | easy |   시간초과   |  16:01   |  10:50   |     25     | 2023/09/12 |                                                                              |
| 448. Find All Numbers Disappeared in an Array          | easy |    13    |  24:54   |  12:05   |     25     | 2023/09/12 |                                                                              |
| 455. Assign Cookies                                    | easy |    9     |  10:43   |  04:22   |     25     | 2023/09/13 |                                                                              |
| 463. Island Perimeter                                  | easy |    20    |  11:18   |  08:23   |     25     | 2023/09/13 |                                                                              |
| 485. Max Consecutive Ones                              | easy |   시간초과   |  21:49   |  07:13   |     25     | 2023/09/13 |                                                                              |
| 496. Next Greater Element I                            | easy |    22    |   시간초과   |   시간초과   |     25     | 2023/09/14 |                                                                              |
| 500. Keyboard Row                                      | easy |    18    |  12:26   |  16:23   |     25     | 2023/09/14 | 대문자를 소문자로 안바꿔서 시간 오래 걸림                                                      |
| 506. Relative Ranks                                    | easy |    24    |  16:17   |  13:05   |     25     | 2023/09/14 |                                                                              |
| 561. Array Partition                                   | easy |    6     |   6:20   |  03:34   |     25     | 2023/09/15 |                                                                              |
| 566. Reshape the Matrix                                | easy |    9     |  08:16   |  05:43   |     25     | 2023/09/15 |                                                                              |
| 575. Distribute Candies                                | easy |    8     |  06:18   |  03:02   |     25     | 2023/09/15 |                                                                              |
| 594. Longest Harmonious Subsequence                    | easy |   시간초과   |  12:32   |  11:30   |     25     | 2023/09/15 |                                                                              |
| 598. Range Addition II                                 | easy |    8     |  03:37   |  01:28   |     25     | 2023/09/16 |                                                                              |
| 599. Minimum Index Sum of Two Lists                    | easy |    17    |  12:16   |  10:04   |     25     | 2023/09/16 |                                                                              |
| 604. Design Compressed String Iterator                 | easy |   시간초과   |   시간초과   |   시간초과   |     25     | 2023/09/16 |                                                                              |
| 605. Can Place Flowers                                 | easy |    23    |  12:37   |  08:26   |     25     | 2023/09/16 |                                                                              |
| 628. Maximum Product of Three Numbers                  | easy |   시간초과   |  04:09   |  05:22   |     25     | 2023/09/17 |                                                                              |
| 643. Maximum Average Subarray I                        | easy |    19    |  18:33   |  09:00   |     25     | 2023/09/17 |                                                                              |
| 645. Set Mismatch                                      | easy |    11    |  09:30   |  11:14   |     25     | 2023/09/17 |                                                                              |
| 661. Image Smoother                                    | easy |   시간초과   |   시간초과   |  10:02   |     25     | 2023/09/17 |                                                                              |
| 674. Longest Continuous Increasing Subsequence         | easy |  08:50   |  04:20   |  25:00   |   02:30    | 2023/09/18 |                                                                              |
| 682. Baseball Game                                     | easy |  12:41   |  11:07   |  25:00   |   06:55    | 2023/09/18 |                                                                              |
| 697. Degree of an Array                                | easy |   시간초과   |  14:52   |  23:55   |   25:00    | 2023/09/18 |                                                                              |
| 717. 1-bit and 2-bit Characters                        | easy |   시간초과   |  09:34   |  03:26   |   25:00    | 2023/09/18 |                                                                              |
| 724. Find Pivot Index                                  | easy |  11:00   |  23:52   |  10:36   |   25:00    | 2023/09/19 |                                                                              |
| 733. Flood Fill                                        | easy |  13:00   |  17:19   |  08:45   |   25:00    | 2023/09/19 |                                                                              |
| 734. Sentence Similarity                               | easy |   시간초과   |   시간초과   |   시간초과   |   25:00    | 2023/09/19 |                                                                              |
| 744. Find Smallest Letter Greater Than Target          | easy |  05:29   |  15:01   |  04:47   |   25:00    | 2023/09/19 |                                                                              |
| 746. Min Cost Climbing Stairs                          | easy |  09:53   |  07:05   |  08:44   |   25:00    | 2023/09/20 |                                                                              |
| 747. Largest Number At Least Twice of Others           | easy |  13:58   |  18:48   |  07:49   |   25:00    | 2023/09/20 |                                                                              |
| 748. Shortest Completing Word                          | easy |  24:26   |  23:49   |  15:19   |   25:00    | 2023/09/20 |                                                                              |
| 760. Find Anagram Mappings                             | easy |  08:06   |  09:24   |  12:04   |   25:00    | 2023/09/21 |                                                                              |
| 766. Toeplitz Matrix                                   | easy |  19:37   |  07:56   |  04:19   |   25:00    | 2023/09/21 |                                                                              |
| 704. Binary Search                                     | easy |  03:05   |  01:58   |  04:02   |   25:00    | 2023/09/21 |                                                                              |
| 705. Design HashSet                                    | easy |  11:28   |  12:30   |  10:08   |   25:00    | 2023/09/21 | 해시 충돌시 체이닝으로 해결함                                                             |
| 706. Design HashMap                                    | easy |  04:48   |  05:27   |  15:02   |   25:00    | 2023/09/22 | 해시테이블 크기 제한하고, 체이닝으로 만들어서 시간 오래 걸림                                           |
| 804. Unique Morse Code Words                           | easy |  10:05   |  03:44   |  02:55   |   25:00    | 2023/09/22 |                                                                              |
| 806. Number of Lines To Write String                   | easy |  09:32   |  11:49   |  03:49   |   25:00    | 2023/09/22 |                                                                              |
| 812. Largest Triangle Area                             | easy |   시간초과   |  19:53   |  12:24   |   25:00    | 2023/09/22 |                                                                              |
| 821. Shortest Distance to a Character                  | easy |  19:59   |   시간초과   |  13:03   |   25:00    | 2023/09/23 |                                                                              |
| 832. Flipping an Image                                 | easy |  13:13   |  07:38   |  11:20   |   25:00    | 2023/09/23 |                                                                              |
| 860. Lemonade Change                                   | easy |  24:35   |  11:58   |  07:29   |   25:00    | 2023/09/23 |                                                                              |
| 867. Transpose Matrix                                  | easy |  05:09   |  03:20   |  02:37   |   25:00    | 2023/09/23 |                                                                              |
| 883. Projection Area of 3D Shapes                      | easy |  19:47   |  07:17   |  04:33   |   25:00    | 2023/09/24 |                                                                              |
| 888. Fair Candy Swap                                   | easy |   시간초과   |   시간초과   |  16:52   |   25:00    | 2023/09/24 |                                                                              |
| 892. Surface Area of 3D Shapes                         | easy |   시간초과   |  15:20   |  12:02   |   25:00    | 2023/09/24 |                                                                              |
| 896. Monotonic Array                                   | easy |  14:15   |  06:32   |  12:40   |   25:00    | 2023/09/24 | 문제 잘못 봄                                                                      |
| 905. Sort Array By Parity                              | easy |  07:51   |  03:51   |  02:54   |   25:00    | 2023/09/25 |                                                                              |
| 908. Smallest Range I                                  | easy |  20:37   |  09:55   |  05:57   |   25:00    | 2023/09/25 |                                                                              |
| 914. X of a Kind in a Deck of Cards                    | easy |   시간초과   |   시간초과   |  05:59   |   25:00    | 2023/09/25 |                                                                              |
| 922. Sort Array By Parity II                           | easy |  15:30   |   시간초과   |  06:21   |   25:00    | 2023/09/25 |                                                                              |
| 929. Unique Email Addresses                            | easy |   시간초과   |  10:15   |  06:32   |   25:00    | 2023/09/26 |                                                                              |
| 941. Valid Mountain Array                              | easy |  09:52   |  04:37   |  03:34   |   25:00    | 2023/09/26 |                                                                              |
| 942. DI String Match                                   | easy |  시간초과 |  08:21   |  05:43   |   25:00    | 2023/09/26 |                                                                              |
| 944. Delete Columns to Make Sorted                     | easy |  07:55 |  10:10   |  05:43   |   25:00    | 2023/09/26 |                                                                              |
| 953. Verifying an Alien Dictionary                     | easy |  21:12 |  16:38 | 11:50 |  25:00   | 2023/09/27 |    |
| 961. N-Repeated Element in Size 2N Array               | easy | 06:20 | 04:29 | 07:03 | 25:00 | 2023/09/27 |      |
| 976. Largest Perimeter Triangle                        | easy | 15:42 |  12:04 | 04:07 |  25:00   | 2023/09/27 |       |
| 977. Squares of a Sorted Array                         | easy | 17:12 |  13:02 | 07:34 |  25:00   | 2023/09/27 |     |

</details>

### 2023.9.28 ~ 
<details>
<summary>1회독 시간 및 문제 풀이 코멘트(23문제)</summary>
<br>

| 문제	                                                         |   난이도   | 걸린시간  | 제한시간	 |     날짜     | 코멘트                                              |
|:------------------------------------------------------------|:-------:|:-----:|:-----:|:----------:|:-------------------------------------------------|
| 11. Container With Most Water                               | medium  |  시간초과   |  30   | 2023/09/28 | 이중 for문으로  풀면 time limit 넘어감. 처음에 투 포인터 생각했었는데…. |
| 15. 3Sum                                                    | medium  |  29:30   |  30   | 2023/09/28 | 통과하긴 했는데 시간 복잡도가 너무 오래걸림 |
| 16. 3Sum Closest                                            | medium  | 시간초과  |  30   | 2023/09/28 | 방법 몰라서 답지 봄  |
| 18. 4Sum                                                    | medium  |  시간초과   |  30   | 2023/09/29 | 제한 시간 지나고 품. 범위를 벗어나는 값 때문에 계속 실패함. 다음에 풀때는 솔루션 참고해야 할듯 |
| 31. Next Permutation                                        | medium  |  시간초과   |  30   | 2023/09/29 | 감조차 못잡음. 그냥 brute force로는 어짜피 시간복잡도 초과해서 안됨 |
| 33. Search in Rotated Sorted Array                          | medium  | 시간초과  |  30   | 2023/09/29 |  방식은 답에 근접했음, 분할하는 구간을 잘못 잡음, editorial 에서 Approach 3: One Binary Search 답지 참고함 |
| 34. Find First and Last Position of Element in Sorted Array | medium  |  23:06   |  30   | 2023/09/30 | binary search를 두번만 하면 되는데 어렵게 해결함 |
| 36. Valid Sudoku                                            | medium  |  시간초과   |  30   | 2023/09/30 | 쉬운 문제인데 어렵게 생각함 |
| 39. Combination Sum                                         | medium  | 14:04  |  30   | 2023/09/30 |   |
| 40. Combination Sum II                                      | medium  |  시간초과   |  30   | 2023/10/01 | 위 문제와 방식 비슷한데 계속 시간 초과 뜸, 동일한 요소를 어떻게 하면 중복을 없앨지 고민해야 함 |
| 45. Jump Game II                                            | medium  |  05:41   |  30   | 2023/10/01 | o(n^2) 그리디로 풀음, o(n)으로 풀수 있음 |
| 346. Permutations                                           | medium  | 10:05  |  30   | 2023/10/01 | 코드 좀 더 깔끔하게 줄일 수 있음  |
| 47. Permutations II                                         | medium  |  15:44   |  30   | 2023/10/02 | 코드 좀 더 깔끔하게 줄일 수 있음 |
| 48. Rotate Image                                            | medium  |  28:03   |  30   | 2023/10/02 | 다 풀어놓고 코드 연산자 하나 잘못 써서 오래 걸림 |
| 49. Group Anagrams                                          | medium  | 17:45  |  30   | 2023/10/02 |   |
| 53. Maximum Subarray                                       | medium  |  07:16   |  30   | 2023/10/03 | follow up 해보기 |
| 54. Spiral Matrix                                            | medium  |  17:22   |  30   | 2023/10/03 |  |
| 55. Jump Game                                          | medium  | 18:43  |  30   | 2023/10/03 |   |
| 56. Merge Intervals                                       | medium  |  20:41   |  30   | 2023/10/04 |  |
| 57. Insert Interval                                         | medium  |  27:42   |  30   | 2023/10/04 | insert 하는 배열 합친 배열 만들고 거기서 다시 overlapping되는거 걸러서 해결함 , o(n)으로 해결해야 함 |
| 59. Spiral Matrix II                                         | medium  | 10:42  |  30   | 2023/10/04 |   |
| 63. Unique Paths II                                         | medium  |  18:23   |  30   | 2023/10/05 |  |
| 64. Minimum Path Sum                                         | medium  | 10:05  |  30   | 2023/10/05 |   |

</details>
