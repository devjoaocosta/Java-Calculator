public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("Welcome to the program Calculadora 2000!");
    int selectedOperation = 0;
    while (selectedOperation != 5) {
      System.out.println("Select the operation you want to perform:");
      System.out.println("1 - Addition");
      System.out.println("2 - Subtraction");
      System.out.println("3 - Multiplication");
      System.out.println("4 - Division");
      System.out.println("5 - Exit");
      selectedOperation = Integer.parseInt(System.console().readLine());
      if (selectedOperation == 5) {
        System.out.println("Exiting the program...");
        break;
      } else if (selectedOperation < 1 || selectedOperation > 5) {
        System.out.println("Invalid option!");
      }
      int firstNumber = Integer.parseInt(
        System.console().readLine("Enter the first number: ")
      );
      int secondNumber = Integer.parseInt(
        System.console().readLine("Enter the second number: ")
      );
      int result = 0;
      if (selectedOperation == 1) {
        result = firstNumber + secondNumber;
        System.out.println("The result of the addition is: " + result);
      } else if (selectedOperation == 2) {
        result = firstNumber - secondNumber;
        System.out.println("The result of the subtraction is: " + result);
      } else if (selectedOperation == 3) {
        result = firstNumber * secondNumber;
        System.out.println("The result of the multiplication is: " + result);
      } else if (selectedOperation == 4) {
        result = firstNumber / secondNumber;
        System.out.println("The result of the division is: " + result);
      }
    }
  }
}
