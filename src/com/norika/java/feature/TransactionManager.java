package com.norika.java.feature;

public class TransactionManager {
	private static final ThreadLocal<Transaction> currentTransaction = new ThreadLocal<Transaction>() {
		@Override
		protected Transaction initialValue() {
			return new Transaction();
		}
	};

	public Transaction currentTransaction() {
		Transaction current = currentTransaction.get();
		if (current == null) {
			current = new Transaction();
			currentTransaction.set(current);
		}
		return current;
	}
}