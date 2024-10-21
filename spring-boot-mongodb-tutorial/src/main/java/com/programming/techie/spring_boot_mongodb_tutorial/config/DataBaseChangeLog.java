package com.programming.techie.spring_boot_mongodb_tutorial.config;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.programming.techie.spring_boot_mongodb_tutorial.model.Expense;
import com.programming.techie.spring_boot_mongodb_tutorial.model.ExpenseCategory;
import com.programming.techie.spring_boot_mongodb_tutorial.repository.ExpenseRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static com.programming.techie.spring_boot_mongodb_tutorial.model.ExpenseCategory.*;

@ChangeLog
public class DataBaseChangeLog {

    @ChangeSet(order = "001", id = "seeDataBase", author = "Sai")
    public void seeDataBase(ExpenseRepository expenseRepository){
        List<Expense> expenseList = new ArrayList<>();
        expenseList.add(createNewExpense("Movie Tickets", ENTERTAINMENT, BigDecimal.valueOf(10)));
        expenseList.add(createNewExpense("Dinner", RESTAURANT, BigDecimal.valueOf(60)));
        expenseList.add(createNewExpense("Netflix", ENTERTAINMENT, BigDecimal.valueOf(10)));
        expenseList.add(createNewExpense("GYM", MISC, BigDecimal.valueOf(20)));
        expenseList.add(createNewExpense("Internet", UTILITIES, BigDecimal.valueOf(30)));
    }

    private Expense createNewExpense(String expenseName, ExpenseCategory expenseCategory, BigDecimal expenseAmount) {
        Expense expense = new Expense();
        expense.setExpenseName(expenseName);
        expense.setExpenseAmount(expenseAmount);
        expense.setExpenseCategory(expenseCategory);
        return expense;
    }
}
