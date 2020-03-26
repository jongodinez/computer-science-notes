class RandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a Number: ");
        int myAnswer = Integer.parseInt(scanner.next());
            switch(myAnswer) {
                case 1:
                    System.out.println("You entered a 1!");
                    break;
                case 2:
                    System.out.println("You entered a 2!");
                    break;
                case 3:
                    System.out.println("You entered a 3!");
            default:
                System.out.println("Looks like that might not be a number!");
            }
    }
}