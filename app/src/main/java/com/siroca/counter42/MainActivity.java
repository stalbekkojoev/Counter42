package com.siroca.counter42;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.siroca.counter42.databinding.ActivityMainBinding;
import com.siroca.counter42.model.CounterModel;
import com.siroca.counter42.presenter.CounterPresenter;
import com.siroca.counter42.view.CounterContracts;

public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView {
    ActivityMainBinding binding;
    CounterPresenter presenter;
    CounterModel model = new CounterModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.getCounter();
        presenter.attachCounterView(this);
        initClickers();
    }

    private void initClickers() {
        binding.decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrement();
            }
        });
        binding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();
            }
        });
    }

    @Override
    public void seeToast() {
        Toast.makeText(this, "Поздравляю", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void color() {
        binding.counterTv.setTextColor(Color.GREEN);
    }

    @Override
    public void updateText(int count) {
        binding.counterTv.setText(String.valueOf(count));
    }
}