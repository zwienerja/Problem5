public class Problem5 {

    public static void main(String[] args) {
        boolean divisible = false;
        double number = 0;
        while(!divisible){
            number++;
            if (number % 1 == 0 && number % 2 == 0){
                if (number % 3 == 0 && number % 4 == 0){
                    if (number % 5 == 0 && number % 6 == 0){
                        if (number % 7 == 0 && number % 8 == 0){
                            if (number % 9 == 0 && number % 10 == 0){
                                if (number % 11 == 0 && number % 12 == 0){
                                    if (number % 13 == 0 && number % 14 == 0){
                                        if (number % 15 == 0 && number % 16 == 0){
                                            if (number % 17 == 0 && number % 18 == 0){
                                                if (number % 19 == 0 && number % 20 == 0){
                                                    divisible = true;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(number);
    }
}
