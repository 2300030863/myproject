package com.expensetracker.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TransactionDto {
    private Long id;
    private BigDecimal amount;
    private String description;
    private String type;
    private LocalDate transactionDate;
    private String notes;
    private Long categoryId;
    private String categoryName;
    private String categoryColor;
    private Long accountId;
    private String accountName;

    public TransactionDto() {}

    public TransactionDto(Long id, BigDecimal amount, String description, String type, LocalDate transactionDate,
                          String notes, Long categoryId, String categoryName, String categoryColor,
                          Long accountId, String accountName) {
        this.id = id;
        this.amount = amount;
        this.description = description;
        this.type = type;
        this.transactionDate = transactionDate;
        this.notes = notes;
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryColor = categoryColor;
        this.accountId = accountId;
        this.accountName = accountName;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public BigDecimal getAmount() { return amount; }
    public void setAmount(BigDecimal amount) { this.amount = amount; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public LocalDate getTransactionDate() { return transactionDate; }
    public void setTransactionDate(LocalDate transactionDate) { this.transactionDate = transactionDate; }
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
    public Long getCategoryId() { return categoryId; }
    public void setCategoryId(Long categoryId) { this.categoryId = categoryId; }
    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }
    public String getCategoryColor() { return categoryColor; }
    public void setCategoryColor(String categoryColor) { this.categoryColor = categoryColor; }
    public Long getAccountId() { return accountId; }
    public void setAccountId(Long accountId) { this.accountId = accountId; }
    public String getAccountName() { return accountName; }
    public void setAccountName(String accountName) { this.accountName = accountName; }
}


