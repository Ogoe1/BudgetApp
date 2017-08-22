package com.example.android.budgetapp2;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Expense> expenseList = new ArrayList<>();

    private RecyclerView mRecyclerView;
   // private LinearLayoutManager mLinearLayoutManager;
    private BudgetListAdapter mAdapter;

    private EditText itemNameField;
    private EditText maxAmountField;

    private String budgetItem;
    private double budgetAmount;
    private double moneySpent;
    private double remainder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new BudgetListAdapter(expenseList);
        mRecyclerView = (RecyclerView) findViewById(R.id.list);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);

        itemNameField = (EditText) findViewById(R.id.itemNameField);
        maxAmountField = (EditText) findViewById(R.id.maxAmountField);

        moneySpent = 0;

        prepareExpenseData();

    }

    private void getData(){
        budgetItem = itemNameField.getText().toString();
        budgetAmount = Double.parseDouble(maxAmountField.getText().toString());
    }

    private double calculateRemainder(){
        remainder = budgetAmount - moneySpent;
        return remainder;
    }

    private void prepareExpenseData(){
        /*Expense expense = new Expense(budgetItem, budgetAmount, moneySpent, remainder);
        expenseList.add(expense);

        mAdapter.notifyDataSetChanged();*/

        Expense expense = new Expense("Food", 200, 100);
        expenseList.add(expense);

        expense = new Expense("Chop Money", 600, 240);
        expenseList.add(expense);

        expense = new Expense("Transport", 10, 240);
        expenseList.add(expense);

    }




}
