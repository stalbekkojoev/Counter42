package com.siroca.counter42;

import com.siroca.counter42.presenter.CounterPresenter;

public class Injector {

    public static CounterPresenter getCounter() {
        return new CounterPresenter();
    }

}
