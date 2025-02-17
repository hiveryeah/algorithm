# 第四周学习笔记
####1. Trie树
Trie树的特点是:
- 根节点不包含字符，除根节点外每一个节点都只包含一个字符。
- 从根节点到某一节点，路径上经过的字符连接起来，为该节点对应的字符串。
- 每个节点的所有子节点包含的字符都不相同。

####2. 贪心算法
贪心算法的特点是：
是寻找最优解问题的常用方法，这种方法模式一般将求解过程分成若干个步骤，但每个步骤都应用贪心原则，选取当前状态下最好/最优的选择（局部最有利的选择），并以此希望最后堆叠出的结果也是最好/最优的解。

- Step1：从某个初始解出发；
- Step2：采用迭代的过程，当可以向目标前进一步时，就根据局部最优策略，得到一部分解，缩小问题规模；
- Step3：将所有解综合起来。

####3. 动态规划
动态规划与贪心算法不同：
在动态规划中，每个步骤都要进行一次选择，但是选择通常依赖于子问题的解。在贪心算法中，我们直接作出在当前问题中看来最优的选择，而不必考虑子问题的解。



