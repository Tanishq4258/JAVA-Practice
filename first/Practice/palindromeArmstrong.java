public static boolean armstrong(int num){
    int original = num;  // keep original number
    int temp = num, sum = 0, count = 0;

    // count digits
    while(temp != 0){
        count++;
        temp /= 10;
    }

    temp = num;
    // calculate sum of digits^count
    while(temp != 0){
        int digit = temp % 10;
        int power = 1;

        // manual power calculation without Math.pow
        for(int i = 0; i < count; i++){
            power *= digit;
        }

        sum += power;
        temp /= 10;
    }

    return sum == original;
}
