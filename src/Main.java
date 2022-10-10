import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String playerA = "";
        String playerB = "";
        String trash = "";
        boolean done = false;
        Scanner in = new Scanner(System.in);
        String again = "";

        do {
            System.out.print("Player A, enter your move: ");

            if (in.hasNextLine()) {
                playerA = in.nextLine();

                System.out.print("Player B, enter your move: ");
                playerB = in.nextLine();

                if (playerA.equalsIgnoreCase("R")) {
                    if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("Rock vs Rock, it's a tie!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        again = in.nextLine();
                        if (again.equalsIgnoreCase("N")) {
                            done = true;
                        }
                    } else if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("Paper covers Rock, Player B wins!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        again = in.nextLine();
                        if (again.equalsIgnoreCase("N")) {
                            done = true;
                        }
                    } else if (playerB.equalsIgnoreCase("S")) {
                        System.out.println("Rock breaks Scissors, Player A wins!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        again = in.nextLine();
                        if (again.equalsIgnoreCase("N")) {
                            done = true;
                        }
                    } else {
                        trash = in.nextLine();
                        System.out.println("You entered an invalid input");
                    }
                } else if (playerA.equalsIgnoreCase("P")) {
                    if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("Paper covers Rock, Player A wins!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        again = in.nextLine();
                        if (again.equalsIgnoreCase("N")) {
                            done = true;
                        }
                    } else if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("Paper vs Paper, it's a tie!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        again = in.nextLine();
                        if (again.equalsIgnoreCase("N")) {
                            done = true;
                        }
                    } else if (playerB.equalsIgnoreCase("S")) {
                        System.out.println("Scissor cuts Paper, Player B wins!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        again = in.nextLine();
                        if (again.equalsIgnoreCase("N")) {
                            done = true;
                        }
                    } else {
                        trash = in.nextLine();
                        System.out.println("You entered an invalid input");
                    }
                } else if (playerA.equalsIgnoreCase("S")) {
                    if (playerB.equalsIgnoreCase("R")) {
                        System.out.println("Rock breaks Scissor, Player B wins!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        again = in.nextLine();
                        if (again.equalsIgnoreCase("N")) {
                            done = true;
                        }
                    } else if (playerB.equalsIgnoreCase("P")) {
                        System.out.println("Scissor cuts Paper, Player A wins!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        again = in.nextLine();
                        if (again.equalsIgnoreCase("N")) {
                            done = true;
                        }
                    } else if (playerB.equalsIgnoreCase("S")) {
                        System.out.println("Scissors vs Scissors, it's a tie!");

                        System.out.print("Do you want to play again? [Y/N]: ");
                        again = in.nextLine();
                        if (again.equalsIgnoreCase("N")) {
                            done = true;
                        }
                    } else {
                        trash = in.nextLine();
                        System.out.println("You entered an invalid input");
                    }
                } else {
                    trash = in.nextLine();
                    System.out.println("You entered an invalid input");
                }
            }
        }while (!done) ;
    }
}
