public static int sumOfDigits(int number) {
        
        int sum;
        for (sum = 0; number > 0; sum += number % 10, number /= 10);
        return  sum;
    
}
