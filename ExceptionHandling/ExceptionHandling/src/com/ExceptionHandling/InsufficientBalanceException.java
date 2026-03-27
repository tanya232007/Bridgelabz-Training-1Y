package com.ExceptionHandling;


    class InsufficientBalanceException extends Exception
    {
        public InsufficientBalanceException(String message)
        {
            super(message);
        }
    }

    class BankAccount
    {
        private double balance;

        public BankAccount(double initialBalance)
        {
            this.balance = initialBalance;
        }

        public void withdraw(double amount) throws InsufficientBalanceException, IllegalArgumentException {
            if (amount < 0)
            {
                throw new IllegalArgumentException("Invalid amount!");
            }
            if (amount > balance)
            {
                throw new InsufficientBalanceException("Insufficient balance!");
            }
            balance -= amount;
            System.out.println("Withdrawal successful, new balance: " + balance);
        }
    }
    class BankTransactionSystem {
        public static void main(String[] args) {
            BankAccount account = new BankAccount(5000); // Initial balance

            try
            {

                account.withdraw(2000);

                account.withdraw(4000);

                account.withdraw(-500);

            }
            catch (InsufficientBalanceException e)
            {
                System.out.println(e.getMessage());
            }
            catch (IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }

