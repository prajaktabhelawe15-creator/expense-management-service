package com.company.expense_management_service.controller;

import com.company.expense_management_service.entity.ExpenseRecord;
import com.company.expense_management_service.service.ExpenseManagementService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/expenses")
public class ExpenseManagementController {
    private final ExpenseManagementService expenseManagementService;

    public ExpenseManagementController(
            ExpenseManagementService expenseManagementService){

        this.expenseManagementService = expenseManagementService;
    }

    @PostMapping
    public ExpenseRecord createExpenseRecord(
            @RequestBody ExpenseRecord expenseRecord){

        return expenseManagementService.createExpenseRecord(expenseRecord);
    }

    @GetMapping
    public List<ExpenseRecord> fetchAllExpenses(){
        return expenseManagementService.fetchAllExpenses();
    }

    @GetMapping("/{expenseId}")
    public ExpenseRecord fetchExpenseById(
            @PathVariable Long expenseId){
        return expenseManagementService.fetchExpenseById(expenseId);
    }

    @PutMapping
    public ExpenseRecord updateExpenseRecord(
            @RequestBody ExpenseRecord expenseRecord){
        return expenseManagementService.updateExpenseRecord(expenseRecord);
    }

    @DeleteMapping("/{expenseId}")
    public void removeExpenseRecord(
        @PathVariable Long expenseId){

        expenseManagementService.removeExpenseRecord(expenseId);
    }

    @GetMapping("/category/{expenseCategory}")
    public List<ExpenseRecord> fetchExpensesByCategory(
            @PathVariable String expenseCategory){
        return expenseManagementService.fetchExpensesByCategory(expenseCategory);
    }

}
