package com.abstraction;


    class StringLengthSystem {
        public static void main(String[] args) {
            StringLengthChecker checker = new StringLengthChecker(20);
            checker.checkMessage("Hello Tanya!");
            checker.checkMessage("This message is definitely too long for the limit.");
            checker.checkMessage("Java rocks!");
        }
    }

