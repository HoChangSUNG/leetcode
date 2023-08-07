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
<details>
<summary>1회독(현재 100문제)</summary>
<br>

| 문제	                                                    | 난이도 | 걸린시간  | 제한시간	|     날짜     | 코멘트                                                                            |
|:-------------------------------------------------------| :---: |:-----:| :---: |:----------:|:-------------------------------------------------------------------------------|
| 1. Two Sum                                             | easy |  17   | 25 | 2023/07/04 |                                                                                |
| 9. Palindrome Number                                   | easy |  17   | 25 | 2023/07/04 |                                                                                |
| 13. Roman to Integer                                   | easy | 시간초과  | 25 | 2023/07/04 |                                                                                |
| 14. Longest Common Prefix                              | easy |  10   | 25 | 2023/07/04 |                                                                                |
| 20. Valid Parentheses                                  | easy |  11   | 25 | 2023/07/04 |                                                                                |
| 21. Merge Two Sorted Lists                             | easy | 시간초과  | 25 | 2023/07/04 |                                                                                |
| 26. Remove Duplicates from Sorted Array                | easy |  17   | 25 | 2023/07/05 |                                                                                |
| 27. Remove Element                                     | easy |   7   | 25 | 2023/07/05 |                                                                                |
| 28. Find the Index of the First Occurrence in a String | easy |  16   | 25 | 2023/07/05 |                                                                                |
| 35. Search Insert Position                             | easy |  13   | 25 | 2023/07/05 | 이분 탐색 다시 보기                                                                    |
| 58. Length of Last Word                                | easy |  16   | 25 | 2023/07/05 |                                                                                |
| 66. Plus One                                           | easy | 시간초과  | 25 | 2023/07/06 | 큰 숫자에서 틀림                                                                      |
| 67. Add Binary                                         | easy |  10   | 25 | 2023/07/06 |                                                                                |
| 69. Sqrt(x)                                            | easy | 시간초과  | 25 | 2023/07/06 | 큰 숫자에서 overflow                                                                |
| 70. Climbing Stairs                                    | easy |   5   | 25 | 2023/07/06 |                                                                                |
| 83. Remove Duplicates from Sorted List                 | easy |   8   | 25 | 2023/07/06 |                                                                                |
| 88. Merge Sorted Array                                 | easy |  10   | 25 | 2023/07/07 |                                                                                |
| 94. Binary Tree Inorder Traversal                      | easy |  12   | 25 | 2023/07/07 | 재귀가 아닌 반복으로 해보기                                                                |
| 100. Same Tree                                         | easy |  11   | 25 | 2023/07/07 |                                                                                |
| 101. Symmetric Tree                                    | easy |  10   | 25 | 2023/07/07 |                                                                                |
| 104. Maximum Depth of Binary Tree                      | easy |   4   | 25 | 2023/07/07 |                                                                                |
| 108. Convert Sorted Array to Binary Search Tree        | easy | 시간초과  | 25 | 2023/07/08 | 해결 방법도 안떠오름, divide and conquer                                                |
| 118. Pascal's Triangle                                 | easy |   4   | 25 | 2023/07/08 |                                                                                |
| 119. Pascal's Triangle II                              | easy |   4   | 25 | 2023/07/08 |                                                                                |
| 121. Best Time to Buy and Sell Stock                   | easy | 시간초과  | 25 | 2023/07/08 | 해결 방법도 안떠오름                                                                    |
| 136. Single Number                                     | easy |  12   | 25 | 2023/07/08 | xor로 풀어보기                                                                      |
| 163. Missing Ranges                                    | easy |  22   | 25 | 2023/07/09 | 코드가 너무 긴 거 같음                                                                  |
| 169. Majority Element                                  | easy |   8   | 25 | 2023/07/09 | hashmap 말고 다른거로 O(1)처리해보기                                                      |
| 170. Two Sum III - Data structure design               | easy |  14   | 25 | 2023/07/09 | 조금 더 좋은 방법이 있을 거 같음 arrayList 쓰는거보다                                            |
| 217. Contains Duplicate                                | easy |   8   | 25 | 2023/07/09 |                                                                                |
| 219. Contains Duplicate II                             | easy |  17   | 25 | 2023/07/09 |                                                                                |
| 228. Summary Ranges                                    | easy |  23   | 25 | 2023/07/10 |                                                                                |
| 243. Shortest Word Distance                            | easy |  13   | 25 | 2023/07/10 |                                                                                |
| 252. Meeting Rooms                                     | easy | 시간초과  | 25 | 2023/07/10 | 어떻게 풀지 감은 왔는데 시간 복잡도 때매 못함                                                     |
| 268. Missing Number                                    | easy |   9   | 25 | 2023/07/11 |                                                                                |
| 283. Move Zeroes                                       | easy |  17   | 25 | 2023/07/11 | 시간 줄이는 거 있는데 잘 모르겠음                                                            |
| 303.Range Sum Query - Immutable                        | easy |   4   | 25 | 2023/07/11 | 좀 더 시간 줄일 수 있음                                                                 |
| 346. Moving Average from Data Stream                   | easy | 시간초과  | 25 | 2023/07/11 | 문제 방법 다 생각했는데 시간 부족했음                                                          |
| 349. Intersection of Two Arrays                        | easy |   9   | 25 | 2023/07/12 |                                                                                |
| 350. Intersection of Two Arrays II                     | easy |   9   | 25 | 2023/07/12 | follow up 적용해서 해보기                                                             |
| 414. Third Maximum Number                              | easy |   9   | 25 | 2023/07/12 |                                                                                |
| 422. Valid Word Square                                 | easy | 시간초과  | 25 | 2023/07/12 | 문제 푸는 법은 알겠는게 손이 안써짐, 시간 다 지난 다음에 풀긴했는데 너무 어렵게 생각함                             |
| 448. Find All Numbers Disappeared in an Array          | easy |  13   | 25 | 2023/07/13 | 문제 자체는 쉬워서 풀었는데 folow up 생각하고 풀어보기                                             |
| 455. Assign Cookies                                    | easy |   9   | 25 | 2023/07/13 |                                                                                |
| 463. Island Perimeter                                  | easy |  20   | 25 | 2023/07/13 | 쉬운 문제를 bfs로 풀어버림…                                                              |
| 485. Max Consecutive Ones                              | easy | 시간초과  | 25 | 2023/07/13 | 쉬운 건데 어렵게 생각함                                                                  |
| 496. Next Greater Element I                            | easy |  22   | 25 | 2023/07/14 | follow up 못함                                                                   |
| 500. Keyboard Row                                      | easy |  18   | 25 | 2023/07/14 |                                                                                |
| 506. Relative Ranks                                    | easy |  24   | 25 | 2023/07/14 | 처음에 푼건 코드가 너무 더러움                                                              |
| 561. Array Partition                                   | easy |   6   | 25 | 2023/07/15 |                                                                                |
| 566. Reshape the Matrix                                | easy |   9   | 25 | 2023/07/15 |                                                                                |
| 575. Distribute Candies                                | easy |   8   | 25 | 2023/07/15 | 캔티 종류 개수 카운팅하는거에서 시간과 메모리 많이 잡아 먹는듯                                            |
| 594. Longest Harmonious Subsequence                    | easy | 시간초과  | 25 | 2023/07/16 | 순서가 생각보다 중요하지 않음                                                               |
| 598. Range Addition II                                 | easy |   8   | 25 | 2023/07/16 |                                                                                |
| 599. Minimum Index Sum of Two Lists                    | easy |  17   | 25 | 2023/07/16 | Map 이용해서 풀었는데 뭔가 마음에 안듦                                                        |
| 604. Design Compressed String Iterator                 | easy | 시간초과  | 25 | 2023/07/17 | 연산자 하나 잘못 써서 시간 내에 못푼거였음…                                                      |
| 605. Can Place Flowers                                 | easy |  23   | 25 | 2023/07/17 | 코드 진짜 더럽게 짬, 제출시 테스트도 많이 틀림                                                    |
| 628. Maximum Product of Three Numbers                  | easy | 시간초과  | 25 | 2023/07/17 | 쉬운 문제인데 너무 어렵게 풀려고 해서 시간초과                                                     |
| 643. Maximum Average Subarray I                        | easy |  19   | 25 | 2023/07/18 |                                                                                |
| 645. Set Mismatch                                      | easy |  11   | 25 | 2023/07/18 |                                                                                |
| 661. Image Smoother                                    | easy | 시간초과  | 25 | 2023/07/18 | 시간 초과 이후에 풀음                                                                   |
| 674. Longest Continuous Increasing Subsequence         | easy | 08:50 | 25:00| 2023/07/19 |                                                                                |
| 682. Baseball Game                                     | easy | 12:41 | 25:00 | 2023/07/19 |                                                                                |
| 697. Degree of an Array                                | easy | 시간초과  | 25:00 | 2023/07/19 | 코드 짜다 시간 다감, 코드 짜도 틀렸을 듯                                                       |
| 717. 1-bit and 2-bit Characters                        | easy | 시간초과  | 25:00 | 2023/07/20 | 문제 이해를 잘못해서 30분동안 뭔소리인지 이해를 못함, 이해하고 나서 3분만에 풀음…                               |
| 724. Find Pivot Index                                  | easy | 11:00 | 25:00 | 2023/07/20 |                                                                                |
| 733. Flood Fill                                        | easy | 13:00 | 25:00 | 2023/07/20 |                                                                                |
| 734. Sentence Similarity                               | easy | 시간초과  | 25:00 | 2023/07/21 | 제출하면 테스트 코드 계속 막힘                                                              |
| 744. Find Smallest Letter Greater Than Target          | easy | 05:29 | 25:00 | 2023/07/21 | O(N)으로 말고 더 줄여보기                                                               |
| 746. Min Cost Climbing Stairs                          | easy | 09:53 | 25:00 | 2023/07/21 |                                                                                |
| 747. Largest Number At Least Twice of Others           | easy | 13:58 | 25:00 | 2023/07/22 |                                                                                |
| 748. Shortest Completing Word                          | easy | 24:26 | 25:00 | 2023/07/22 | 코드가 좀 더럽다, 테스트 케이스를 좀 잘 보자                                                     |
| 760. Find Anagram Mappings                             | easy | 08:06 | 25:00 | 2023/07/22 |                                                                                |
| 766. Toeplitz Matrix                                   | easy | 19:37 | 25:00 | 2023/07/23 | 다 풀고 코드 작성할 때 순서 헷갈림, 코드 길이를 더 줄일 수 있으니 다음 번에는 좀 더 코드를 줄여보기                    |
| 704. Binary Search                                     | easy | 03:05 | 25:00 | 2023/07/23 |                                                                                |
| 705. Design HashSet                                    | easy | 11:28 | 25:00 | 2023/07/23 | 그냥 Map 가져다가 쓰면 끝나는데, Map을 간단하게 구현해도 괜찮을듯                                       |
| 706. Design HashMap                                    | easy | 04:48 | 25:00 | 2023/07/24 | 그냥 Object 배열 만들지 않고 Node 배열로 만드는 방식도 괜찮을듯, 아니면 진짜로 해시 충돌시 체이닝까지 구현하는 것도 좋을 거 같음 |
| 804. Unique Morse Code Words                           | easy | 10:05 | 25:00 | 2023/07/24 |                                                                                |
| 806. Number of Lines To Write String                   | easy | 09:32 | 25:00 | 2023/07/24 | 문제는 쉬움, 코드 길이를 줄일 수 있을 듯?                                                      |
| 812. Largest Triangle Area                             | easy | 시간초과 | 25:00 | 2023/07/25 | 어떤 유형의 문제인지는 알았는데 풀이 과정 생각하다가 시간이 다 지나감, 수학 공식 이용해야 함                          |
| 821. Shortest Distance to a Character                  | easy | 19:59 | 25:00 | 2023/07/25 | 방법이 생각 안나서 bfs로 풀음, 더 쉬운 방법이 존재하니 다음에 풀 때는 좀 더 생각해보기                           |
| 832. Flipping an Image                                 | easy | 13:13 | 25:00 | 2023/07/25 |                                                                                |
| 860. Lemonade Change                                   | easy | 24:35 | 25:00 | 2023/07/26 | 쉽게 풀 수 있는데 풀이가 막상 생각이 안남. 너무 어렵게 풀었고 시간도 좀 안좋게 나옴                              |
| 867. Transpose Matrix                                  | easy | 05:09 | 25:00 | 2023/07/26 |                                                                                |
| 883. Projection Area of 3D Shapes                      | easy | 19:47 | 25:00 | 2023/07/26 | 문제 이해하는데 시간이 오래 걸림, 문제 푸는 시간은 거의 안걸림                                           |
| 888. Fair Candy Swap                                   | easy | 시간초과 | 25:00 | 2023/07/27 | o(n^2)을 해서 시간초과 뜸, O(n)으로 끝내야 하는 풀이 사용해야 함                                     |
| 892. Surface Area of 3D Shapes                         | easy | 시간초과 | 25:00 | 2023/07/27 | 문제 이해를 못함, 문제 이해하면 풀 수 있는 문제였음                                                 |
| 896. Monotonic Array                                   | easy | 14:15 | 25:00 | 2023/07/27 | 시간복잡도는 똑같은데 코드를 좀 더 줄일 수 있을 듯                                                  |
| 905. Sort Array By Parity                              | easy | 07:51 | 25:00 | 2023/07/28 | 시간 복잡도를 O(N^2)에서 O(N)으로 줄여야 함, 내가 푼 풀이는 삽입정렬로 풀어서 O(N^2)으로 풀어서 너무 오래 걸림        |
| 908. Smallest Range I                                  | easy | 20:37 | 25:00 | 2023/07/28 | 쉬운 문제인데 글을 잘못 이해하고 코드 짜서 오래걸림, 글을 제대로 이해하면 코드 짜는데 3분도 안걸리는 문제임… 글좀 제대로 읽자……    |
| 914. X of a Kind in a Deck of Cards                    | easy | 시간초과 | 25:00 | 2023/07/28 | 문제 설명이 너무 부실함. GCD로 풀라는데 이해가 안가서 Editorial 보고 Brute Force 방식으로 풀어봄             |
| 922. Sort Array By Parity II                           | easy | 15:30 | 25:00 | 2023/07/29 | 해결은 했으나 O(N^2)으로 해결함 다음에는 O(N)으로 해결해보자                                         |
| 929. Unique Email Addresses                            | easy | 시간초과 | 25:00 | 2023/07/29 | 문제 해석을 잘못했음,split 정규 표현식으로 푸는건 생각을 안해봄. String을 처리하는 문제에 내가 약한듯                |
| 941. Valid Mountain Array                              | easy | 09:52 | 25:00 | 2023/07/29 |                                                                                |
| 942. DI String Match                                   | easy | 시간초과 | 25:00 | 2023/07/30 | 재귀 이용해서 brute force했는데 시간 초과 뜸, o(n)으로 풀수 있음                                   |
| 944. Delete Columns to Make Sorted                     | easy | 07:55 | 25:00 | 2023/07/30 |  |
| 953. Verifying an Alien Dictionary                     | easy | 21:12 | 25:00 | 2023/07/30 | 문제는 어렵지 않았고, 코드 작성한 부분에서 실수 있어서 실수 찾는데 시간이 좀 걸림 |
| 961. N-Repeated Element in Size 2N Array               | easy | 06:20 | 25:00 | 2023/07/31 |  |
| 976. Largest Perimeter Triangle                        | easy | 15:42 | 25:00 | 2023/07/31 | 삼각형 결정 조건 a+b>c를 이용해야 함, 정렬까지 하면 쉽게 문제 해결 가능 |
| 977. Squares of a Sorted Array                         | easy | 17:12 | 25:00 | 2023/07/31 |  |

</details>

<details>
<summary>2회독(현재 21문제)</summary>
<br>

| 문제	                                                    | 난이도  | 1회독 걸린시간 | 2회독 걸린시간 | 제한시간	|     날짜     | 코멘트                                                                            |
|:-------------------------------------------------------|:----:|:--------:|:--------:|  :---: |:----------:|:-------------------------------------------------------------------------------|
| 1. Two Sum                                             | easy |    17    |  10:02   | 25 | 2023/08/01 | follow-up 해결함, 시간 전보다 줄음                                                       |
| 9. Palindrome Number                                   | easy |    17    |  19:32   | 25 | 2023/08/01 | 이번에는 follow-up 해결함, 대신 시간이 전보다 오래 걸림, 좀 더 쉽게 풀 수 있는 방법이 있으니 다음에는 더 쉽게 코드 바꾸어보기 |
| 13. Roman to Integer                                   | easy |   시간초과   |  13:31   | 25 | 2023/08/01 | 저번에는 시간 초과 떴음,다음에는 solution에 있는 풀이들로 해결해보기                                     |
| 14. Longest Common Prefix                              | easy |    10    |  10:06   | 25 | 2023/08/02 | 다음에는 solution에 있는 방법이 더 좋으니 그걸로 해보기                                            |
| 20. Valid Parentheses                                  | easy |    11    |  07:21   | 25 | 2023/08/02 | 저번보다 시간은 줄었음                                                                   |
| 21. Merge Two Sorted Lists                             | easy |   시간초과   |  08:42   |   25   | 2023/08/02 | 시간은 줄었는데 이전 코드가 차라리 나은듯, 하나의 while문 안에 넣는 것보다 분리하는게 차라리 코드가 깔끔한듯               |
| 26. Remove Duplicates from Sorted Array                | easy |   17 |  09:28   | 25 | 2023/08/03 | 저번에는 새로운 배열 만들어서 풀었는데 이번에는 기존 배열로 풀고 시간도 더 빠름                                  |
| 27. Remove Element                                     | easy |    7  |  03:29   |    25    | 2023/08/03 | 위 문제랑 사실상 동일한 문제, 저번보다 코드 더 간단하게  풀음                                           |
| 28. Find the Index of the First Occurrence in a String | easy |    16   |  09:45   |    25    | 2023/08/03 | 코드 자체는 깔끔함. 시간 복잡도는 저번이랑 같은데 다음에는 좀 더 개선시켜야 함                                  |
| 35. Search Insert Position                             | easy |  13  | 02:54 | 25 | 2023/08/04 | 이분 탐색 기초라서 빨리 풀음                                                               |
| 58. Length of Last Word                                | easy |  16 | 07:05 |    25    | 2023/08/04 | 저번보다 코드는 짧음, 시간 복잡도 자체는 동일, editorial의 approach 2가 루프 하나로 제일 깔끔하게 푼듯  |
| 66. Plus One                                           | easy | 시간초과 | 12:49 |    25    | 2023/08/04 | 저번보다 깔끔하게 풀지는 않음, 다음번에는 코드 좀 더 다듬는 방식으로 풀어보기 |
| 67. Add Binary | easy | 10 | 18:34 |    25    | 2023/08/05 | 답지 안본 최초 코드보다는 나음, 근데 코드에서 실수해서 실수 찾는데 오래 걸림 |
| 69. Sqrt(x) | easy | 시간초과 | 15:50 |    25    | 2023/08/05 | 저번에 오버플로우 발생해서 계속 틀렸었는데, 이번에는 해결함 |
| 70. Climbing Stairs | easy | 5 | 03:28 |    25    | 2023/08/05 |  |
| 83. Remove Duplicates from Sorted List | easy | 8 | 08:43 |    25    | 2023/08/06 | 새로운 노드를 만들었는데 새로 만들지 말고 기존 링크드 리스트를 재사용하는 방식으로 풀어보자 다음에는 |
| 88. Merge Sorted Array | easy | 10 | 13:17 |    25    | 2023/08/06 | 전보다 시간은 좀 더 걸렸지만, 좀 더 깔끔하게 follow up 해결함 |
| 94. Binary Tree Inorder Traversal | easy | 12 | 시간초과 |    25    | 2023/08/06 | follow up 해결하려 스택으로 해보려고 했는데, 로직을 잘못 작성해서 계속 실패함. |
| 100. Same Tree                                         | easy |  11  | 07:09 | 25 | 2023/08/07 |                                                                                |
| 101. Symmetric Tree                                    | easy |  10  | 06:39 | 25 | 2023/08/07 |                                                                                |
| 104. Maximum Depth of Binary Tree                      | easy |   4  | 01:54 | 25 | 2023/08/07 |                                                                                |
</details>
