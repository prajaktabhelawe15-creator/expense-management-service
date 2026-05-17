package com.company.expense_management_service.repository;

import com.company.expense_management_service.entity.ExpenseRecord;
import java.util.List;
public interface ExpenseRecordRepository {
    ExpenseRecord saveExpenseRecord(
            ExpenseRecord expenseRecord);

    List<ExpenseRecord> fetchAllExpenses();

    ExpenseRecord fetchExpenseById(Long expenseId);

    ExpenseRecord updateExpenseRecord(
            ExpenseRecord expenseRecord);

    void removeExpenseRecord(Long expenseId);

    List<ExpenseRecord> fetchExpenseByCategory(
            String expenseCategory);
}
