package com.revolut.interview.repos;

import com.revolut.interview.model.Transaction;

public class TransactionInsertAccessException extends DataAccessException {

    public TransactionInsertAccessException(Transaction transaction) {
        super("Could not insert transaction [" + transaction + "]");
    }
}
