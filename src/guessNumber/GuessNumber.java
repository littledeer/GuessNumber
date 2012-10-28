package guessNumber;

public class GuessNumber {

    private String randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String validate(String userInput) {
        int aNumber=0;
        int bNumber=0;
        for(int i=0;i<userInput.length();i++){
            if(userInput.charAt(i)==randomNumber.charAt(i))
                aNumber++;
            else if(randomNumber.indexOf(userInput.charAt(i))>0)
                bNumber++;
        }
        return aNumber+"a"+bNumber+"b";
    }
}
