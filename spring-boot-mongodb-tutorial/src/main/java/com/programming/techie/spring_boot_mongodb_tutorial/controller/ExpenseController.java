package com.programming.techie.spring_boot_mongodb_tutorial.controller;

import com.programming.techie.spring_boot_mongodb_tutorial.model.Expense;
import com.programming.techie.spring_boot_mongodb_tutorial.service.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {

    private ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ResponseEntity addExpense(@RequestBody Expense expense){
        expenseService.addExpense(expense);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping
    public ResponseEntity updateExpense(@RequestBody Expense expense){
        expenseService.updateExpense(expense);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public ResponseEntity getAllExpense(){
        return ResponseEntity.ok(expenseService.getAllExpense());
    }

    @GetMapping("/{name}")
    public ResponseEntity<Expense> getdExpenseByName(@PathVariable String name){
        return ResponseEntity.ok(expenseService.getdExpenseByName(name));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteExpense(@PathVariable String id){
        expenseService.deleteExpense(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
