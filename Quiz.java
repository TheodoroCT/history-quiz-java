import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int score = 0;
    int lives = 3;
    String data;

    System.out.println("===== HISTORY QUIZ =====");
    System.out.println("You have 3 lives ");
    System.out.println("Answer with A, B, or C\n");

    // Question 1
    System.out.println("1) How did World War I begin?");
    System.out.println("A: Russian invasion of USA");
    System.out.println("B: Franz Ferdinand murder");
    System.out.println("C: British attack on France");

    data = input.next();

    if(data.equalsIgnoreCase("B")){
      System.out.println("Correct!");
      score++;
    } else {
      System.out.println("Wrong! Correct answer: B");
      lives--;
      System.out.println("Lives left: " + lives);
    }

    if(lives == 0){
      System.out.println("Game Over!");
      input.close();
      return;
    }

    // Question 2
    System.out.println("\n2) Who discovered America?");
    System.out.println("A: Christopher Columbus");
    System.out.println("B: Isaac Newton");
    System.out.println("C: Napoleon");

    data = input.next();

    if(data.equalsIgnoreCase("A")){
      System.out.println("Correct!");
      score++;
    } else {
      System.out.println("Wrong! Correct answer: A");
      lives--;
      System.out.println("Lives left: " + lives);
    }

    if(lives == 0){
      System.out.println("Game Over!");
      input.close();
      return;
    }

    // Question 3
    System.out.println("\n3) When did World War I start?");
    System.out.println("A: 1914");
    System.out.println("B: 1939");
    System.out.println("C: 1925");

    data = input.next();

    if(data.equalsIgnoreCase("A")){
      System.out.println("Correct!");
      score++;
    } else {
      System.out.println("Wrong! Correct answer: A");
      lives--;
      System.out.println("Lives left: " + lives);
    }

    if(lives == 0){
      System.out.println("Game Over!");
      input.close();
      return;
    }

    // Question 4
    System.out.println("\n4) Which treaty ended World War I?");
    System.out.println("A: Treaty of Versailles");
    System.out.println("B: Treaty of Paris");
    System.out.println("C: Treaty of Vienna");

    data = input.next();

    if(data.equalsIgnoreCase("A")){
      System.out.println("Correct!");
      score++;
    } else {
      System.out.println("Wrong! Correct answer: A");
      lives--;
      System.out.println("Lives left: " + lives);
    }

    if(lives == 0){
      System.out.println("Game Over!");
      input.close();
      return;
    }

    // Question 5
    System.out.println("\n5) Franz Ferdinand belonged to which empire?");
    System.out.println("A: Ottoman Empire");
    System.out.println("B: Austro-Hungarian Empire");
    System.out.println("C: Russian Empire");

    data = input.next();

    if(data.equalsIgnoreCase("B")){
      System.out.println("Correct!");
      score++;
    } else {
      System.out.println("Wrong! Correct answer: B");
      lives--;
      System.out.println("Lives left: " + lives);
    }

    // Final result
    System.out.println("\nFinal score: " + score + "/5");

    if(score == 5){
      System.out.println("Legendary historian!");
    } else if(score >= 3){
      System.out.println("Good job!");
    } else {
      System.out.println("Keep studying history!");
    }

    input.close();
  }
}
