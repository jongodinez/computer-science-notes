import java.util.Random;

class randomNumbers {
    public static void main(String[] args) {
    // what is our range?
    int max = 100;
    int min = 1;
  // create instance of Random class
    Random randomNum = new Random();
    int showMe = min + randomNum.nextInt(max);
    System.out.println(showMe);
  }
}