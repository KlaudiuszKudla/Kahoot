package org.example.Tree;

import java.util.ArrayList;
import java.util.List;

public class Trie implements Tree {
    private Node root;
    Trie() {
        root = new Node(' ');
    }
    @Override
    public void insert(String word) {
        Node current = root;
        for (char character : word.toCharArray()) {
            current = current.getChildren().computeIfAbsent(character, Node::new);
        }
        current.setEndOfWord(true);
    }
    @Override
    public List<String> wordWithPrefix(String prefix) {
        List<String> words = new ArrayList<>();
        Node prefixNode = search(prefix);
        if (prefixNode != null) {
            addWords(prefixNode, prefix, words);
        }
        return words;
    }
    private Node search(String word) {
        Node current = root;
        for (char character : word.toCharArray()) {
            Node node = current.getChildren().get(character);
            if (node == null) {
                return null;
            }
            current = node;
        }
        return current;
    }
    private void addWords(Node node, String prefix, List<String> words) {
        if (node.isEndOfWord()) {
            words.add(prefix);
        }
        node.getChildren().values().forEach(child -> {
            String character = String.valueOf(child.getCharacter());
            addWords(child,prefix.concat(character), words);
        });
    }
}

