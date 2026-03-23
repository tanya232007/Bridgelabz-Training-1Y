package com.abstraction;

    import java.util.function.Function;

    class StringLengthChecker {
        private int limit;
        private Function<String, Integer> lengthFunction;

        public StringLengthChecker(int limit) {
            this.limit = limit;
            this.lengthFunction = str -> str.length();
        }

        public void checkMessage(String message) {
            int length = lengthFunction.apply(message);
            if (length > limit) {
                System.out.println("⚠ ALERT: Message exceeds limit! Length = " + length);
            } else {
                System.out.println("✅ Safe: Message length = " + length);
            }
        }
    }


