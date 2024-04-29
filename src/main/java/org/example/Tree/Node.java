package org.example.Tree;

import java.util.HashMap;
import java.util.Map;

public class Node {
        private final char character;
        private final Map<Character, Node> children = new HashMap<>();
        private boolean isEndOfWord;

        public Node(char character) {
                this.character = character;
        }
        public char getCharacter() {
                return character;
        }
        public Map<Character, Node> getChildren() {
                return children;
        }
        public boolean isEndOfWord() {
                return isEndOfWord;
        }
        public void setEndOfWord(boolean endOfWord) {
                isEndOfWord = endOfWord;
        }
}
