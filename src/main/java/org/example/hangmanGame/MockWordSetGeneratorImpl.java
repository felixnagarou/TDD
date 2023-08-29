package org.example.hangmanGame;

import java.util.ArrayList;
import java.util.List;

public class MockWordSetGeneratorImpl implements WordSetGenerator {

    private List<String> mockWordList = new ArrayList<>();

    @Override
    public List<String> setWordList() {
        mockWordList.add("cat");
        return mockWordList;
    }

    @Override
    public List getWordList() {
        return mockWordList;
    }
}
