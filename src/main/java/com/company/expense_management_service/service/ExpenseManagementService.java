package com.company.expense_management_service.service;

import com.company.expense_management_service.entity.ExpenseRecord;
import com.company.expense_management_service.repository.ExpenseRecordRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExpenseManagementService {
    private final ExpenseRecordRepository
        expenseRecordRepository;

    public ExpenseManagementService(
            ExpenseRecordRepository expenseRecordRepository){

        this.expenseRecordRepository = expenseRecordRepository;
    }

    public ExpenseRecord createExpenseRecord(
            ExpenseRecord expenseRecord){

        return expenseRecordRepository.saveExpenseRecord(expenseRecord);
    }

    public List<ExpenseRecord> fetchAllExpenses(){
         return expenseRecordRepository
                 .fetchAllExpenses();
    }

    public ExpenseRecord fetchExpenseById(
            Long expenseId){

        return  expenseRecordRepository
                .fetchExpenseById(expenseId);
    }

    public ExpenseRecord updateExpenseRecord(
            ExpenseRecord expenseRecord){
        return expenseRecordRepository
                .updateExpenseRecord(expenseRecord);
    }

    public void removeExpenseRecord(Long expenseId){
        expenseRecordRepository.removeExpenseRecord(expenseId);
    }

    public List<ExpenseRecord> fetchExpensesByCategory(String expenseCategory){
        return expenseRecordRepository.fetchExpenseByCategory(expenseCategory);
    }
}
