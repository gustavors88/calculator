package org.example;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // protected so it can be easily accessed by subclasses
    // final so it can be instantiated once
    protected final List<Double> results;

    public Calculator() {
        results =  new ArrayList<>();
    }

    public void removeOldestResult() {
        results.removeFirst();
    }

    public void showResults() {
        System.out.print("Results: ");
        for (double res : results.subList(0, results.size() - 1)) {
            System.out.print(res + ", ");
        }
        System.out.println(results.getLast());
    }

    public List<Double> getResults() {
        return results;
    }

    public boolean setResult(int result) {
        return results.add((double)result);
    }

}
