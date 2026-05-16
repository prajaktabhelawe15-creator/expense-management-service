package com.company.expense_management_service.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "expense_records")
public class ExpenseRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expenseId;

    private String expenseTitle;

    private Double expenseAmount;

    private String expenseCategory;

    private LocalDate expandDate;

    private String expenseDescription;

    public ExpenseRecord(){

    }

    public ExpenseRecord(Long expenseId,
                         String expenseTitle,
                         Double expenseAmount,
                         String expenseCategory,
                         LocalDate expenseDate,
                         String expenseDescription
    ) {
        this.expenseId = expenseId;
        this.expenseTitle = expenseTitle;
        this.expenseAmount = expenseAmount;
        this.expenseCategory = expenseCategory;
        this.expandDate = expenseDate;
        this.expenseDescription = expenseDescription;
    }

    public Long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public String getExpenseTitle() {
        return expenseTitle;
    }

    public void setExpenseTitle(String expenseTitle) {
        this.expenseTitle = expenseTitle;
    }

    public Double getExpenseAmount() {
        return expenseAmount;
    }

    public void setExpenseAmount(Double expenseAmount) {
        this.expenseAmount = expenseAmount;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public LocalDate getExpandDate() {
        return expandDate;
    }

    public void setExpandDate(LocalDate expandDate) {
        this.expandDate = expandDate;
    }

    public String getExpenseDescription() {
        return expenseDescription;
    }

    public void setExpenseDescription(String expenseDescription) {
        this.expenseDescription = expenseDescription;
    }
}


