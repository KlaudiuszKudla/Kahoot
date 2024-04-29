package org.example.Tree;

import java.util.List;

public interface Tree {

    void insert(String word);
    List<String> wordWithPrefix(String prefix);
}
