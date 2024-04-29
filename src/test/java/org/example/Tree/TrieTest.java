package org.example.Tree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    public void testWordWithPrefix_CaseC() {
        Trie trie = prepareTrie();
        List<String> wordsWithPrefixC = trie.wordWithPrefix("c");
        assertEquals(2, wordsWithPrefixC.size());
        assertEquals("car", wordsWithPrefixC.get(0));
        assertEquals("carpet", wordsWithPrefixC.get(1));
    }

    @Test
    public void testWordWithPrefix_CaseCar() {
        Trie trie = prepareTrie();
        List<String> wordsWithPrefixCar = trie.wordWithPrefix("car");
        assertEquals(2, wordsWithPrefixCar.size());
        assertEquals("car", wordsWithPrefixCar.get(0));
        assertEquals("carpet", wordsWithPrefixCar.get(1));
    }

    @Test
    public void testWordWithPrefix_CaseCarp() {
        Trie trie = prepareTrie();
        List<String> wordsWithPrefixCarp = trie.wordWithPrefix("carp");
        assertEquals(1, wordsWithPrefixCarp.size());
        assertEquals("carpet", wordsWithPrefixCarp.get(0));
    }

    @Test
    public void testWordWithPrefix_CaseJav() {
        Trie trie = prepareTrie();
        List<String> wordsWithPrefixJav = trie.wordWithPrefix("jav");
        assertEquals(2, wordsWithPrefixJav.size());
        assertEquals("java", wordsWithPrefixJav.get(0));
        assertEquals("javascript", wordsWithPrefixJav.get(1));
    }

    @Test
    public void testWordWithPrefix_CaseIntern() {
        Trie trie = prepareTrie();
        List<String> wordsWithPrefixIntern = trie.wordWithPrefix("intern");
        assertEquals(1, wordsWithPrefixIntern.size());
        assertEquals("internet", wordsWithPrefixIntern.get(0));
    }

    @Test
    public void testWordWithPrefix_CaseFoo() {
        Trie trie = prepareTrie();
        List<String> wordsWithPrefixFoo = trie.wordWithPrefix("foo");
        assertEquals(0, wordsWithPrefixFoo.size());
    }

    private Trie prepareTrie() {
        Trie trie = new Trie();
        trie.insert("car");
        trie.insert("carpet");
        trie.insert("java");
        trie.insert("javascript");
        trie.insert("internet");
        return trie;
    }

}