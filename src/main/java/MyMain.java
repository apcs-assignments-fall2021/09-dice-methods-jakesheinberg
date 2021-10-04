public class MyMain {
    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int die = (int)(Math.random()*6) + 1;
        return die;
    }

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        // REPLACE WITH YOUR CODE HERE

        // Your code should roll 6 dice 10,000 times, so you should have a
        // for loop such as:
        double sixes = 0;
        double realsixes=0;
        for (int i = 0; i < 10000; i++) {
            sixes=0;
            for(int j=0; j<6&& sixes<1; j++){
                int die = (int)(Math.random()*6) + 1;
                if (die==6){
                    sixes=sixes+1;
                    realsixes=realsixes+1;
                }}}
               double percent = (realsixes/10000) *100;
            return percent;
        }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        double twoSixes=0;
        for (int i = 0; i < 10000; i++) {
            int x=0;
            for(int j=0; j<12 && x<2;j++){
            int die = (int)(Math.random()*6) + 1;
            if (die==6){
                x=x+1;
            }
            if(x==2){
                twoSixes+=1;
            }
        }}double percent = (twoSixes/10000) * 100;
        return percent;
    }

    // Calculate the probability of rolling at least three 6's when rolling
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        double threeSixes=0;
        for (int i = 0; i < 10000; i++) {
            int x=0;
            for(int j=0; j<18 &&x<3;j++){
                int die = (int)(Math.random()*6) + 1;
                if (die==6){
                    x=x+1;
                }
                if(x==3 ){
                    threeSixes+=1;
                }
            }}double percent = (threeSixes/10000) * 100;
        return percent;
    }

    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
