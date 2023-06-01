
    public class Runner {
        public int changeNumber(int number){
            if (number > -10 && number <= 0) {
                return number;
            } else if (number % 2 == 0){
                return 2;
            } else {
                throw new IllegalStateException("bad number!");
            }
        }
    }
