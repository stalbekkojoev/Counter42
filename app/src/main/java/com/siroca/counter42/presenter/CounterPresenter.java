package com.siroca.counter42.presenter;

import com.siroca.counter42.model.CounterModel;
import com.siroca.counter42.view.CounterContracts;

public class CounterPresenter implements CounterContracts.CounterPresenter {
    CounterModel counterModel = new CounterModel();
    CounterContracts.CounterView counterView;

    @Override
    public void increment() {
        counterModel.increment();
        if (counterModel.getCount()==counterModel.getColorNumber()){
            counterView.color();
        }
        if (counterModel.getCount()==counterModel.getToastNumber()){
            counterView.seeToast();
        }
        counterView.updateText(counterModel.getCount());
    }

    @Override
    public void decrement() {
     counterModel.decrement();
        if (counterModel.getCount()==counterModel.getColorNumber()){
            counterView.color();
        }
        if (counterModel.getCount()==counterModel.getToastNumber()){
            counterView.seeToast();
        }
     counterView.updateText(counterModel.getCount());
    }

    @Override
    public void attachCounterView(CounterContracts.CounterView view) {
        counterView = view;
    }
}
