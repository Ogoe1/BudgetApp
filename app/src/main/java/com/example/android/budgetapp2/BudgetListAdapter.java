package com.example.android.budgetapp2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Ekow Bentsi-Enchill on 8/22/2017.
 */
public class BudgetListAdapter extends RecyclerView.Adapter<BudgetListAdapter.ExpenseViewHolder>{

    private List<Expense> expenseList;

    public class ExpenseViewHolder extends RecyclerView.ViewHolder{
        public TextView itemName, moneySpent, maxAmount, remainder;

        public ExpenseViewHolder(View view){
            super(view);
            itemName = (TextView) view.findViewById(R.id.itemName);
            moneySpent = (TextView) view.findViewById(R.id.moneySpent);
            maxAmount = (TextView) view.findViewById(R.id.maxAmount);
            remainder = (TextView) view.findViewById(R.id.remainder);
        }
    }

    public BudgetListAdapter(List<Expense> expenses){
        this.expenseList = expenses;
    }

    @Override
    public ExpenseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.expense_item_row, parent, false);

        return new ExpenseViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ExpenseViewHolder holder, int position) {
        Expense expense = expenseList.get(position);
        holder.itemName.setText(expense.getItemName());
        holder.moneySpent.setText(String.valueOf(expense.getMoneySpent()));
        holder.maxAmount.setText(String.valueOf(expense.getMaxAmount()));
        holder.remainder.setText(String.valueOf(expense.getCashRemaining()));
    }


    @Override
    public int getItemCount() {
        return expenseList.size();
    }
}
