package com.company.expense_management_service.repository;

import com.company.expense_management_service.entity.ExpenseRecord;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
@Transactional
public class ExpenseRecordRepositoryImpl
    implements ExpenseRecordRepository{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ExpenseRecord saveExpenseRecord(
        ExpenseRecord expenseRecord){

        entityManager.persist(expenseRecord);

        return expenseRecord;
    }

    @Override
    public List<ExpenseRecord> fetchAllExpenses(){
        return entityManager.createQuery(
                "FROM ExpenseRecord",
                ExpenseRecord.class
        ).getResultList();
    }

    @Override
    public ExpenseRecord fetchExpenseById(Long expenseId){
        return entityManager.find(
                ExpenseRecord.class,
                expenseId
        );
    }

    @Override
    public ExpenseRecord updateExpenseRecord(
            ExpenseRecord expenseRecord){
        return entityManager.merge(expenseRecord);
    }

    @Override
    public void removeExpenseRecord(Long expenseId){

        ExpenseRecord expenseRecord = entityManager.find(
                ExpenseRecord.class,
                expenseId
        );
        if(expenseRecord != null){
            entityManager.remove(expenseRecord);
        }
    }

    @Override
    public List<ExpenseRecord> fetchExpenseByCategory(
            String expenseCategory){
        return entityManager.createQuery(
                "FROM ExpenseRecord" +
                        "WHERE expenseCategory = :category",
                ExpenseRecord.class
        )
                .setParameter("category", expenseCategory)
                .getResultList();
    }

}
