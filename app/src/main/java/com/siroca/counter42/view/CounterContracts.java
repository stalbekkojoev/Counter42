package com.siroca.counter42.view;

public class CounterContracts {

    public interface CounterView {
        void seeToast();
        void color();
        void updateText(int count);
    }

    public interface CounterPresenter {
        void increment();
        void decrement();
        void attachCounterView(CounterView view);
    }
}
