package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void longestCommonPrefixTest() {
        Solution solution = new Solution();
        Assert.assertEquals("fl", solution.longestCommonPrefix(
                                    new String[]{"flower","flow","flight"}));
        Assert.assertEquals("", solution.longestCommonPrefix(
                                    new String[]{"dog","racecar","car"}));
    }

}