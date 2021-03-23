package com.tundra.test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GenerateWordsTest {
    @Test
    public void testABC(){
        Set<String> expected = new HashSet<>();
        expected.addAll(Arrays.asList("ACB","BCA","ABC","CBA","BAC","CAB"));
        Assert.assertEquals(expected, GenerateWords.generatePerm("ABC"));
    }
}