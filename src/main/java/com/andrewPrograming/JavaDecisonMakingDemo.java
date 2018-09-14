package com.andrewPrograming;

public class JavaDecisonMakingDemo {

  public static void main(String[] args) {
    showIf();
    showIfElse();
    showNestedIf();
    showIfElseIf();
    showSwitch();
    showJumpBreak();
    showJumpContinue();
    showJumpReturn();
  }

  public static void showIf() {
    int a = 10;
    int b = 20;
    if (a < b) {
      System.out.println("a<b is true");
    }
  }

  public static void showIfElse() {
    int a = 100;
    int b = 20;
    if (a < b) {
      System.out.println("a<b is true");
    } else {
      System.out.println("a<b is false");
    }
  }

  public static void showNestedIf() {
    int a = 10;
    int b = 20;
    if (a == 10) {
      if (a < b) {
        System.out.println("a<b is true");
      } else {
        System.out.println("a<b is false");
      }
    }
  }

  public static void showIfElseIf() {
    int a = 10;
    if (a == 1) {
      System.out.println("a==1");
    } else if (a == 2) {
      System.out.println("a==2");
    } else if (a == 3) {
      System.out.println("a==3");
    } else {
      System.out.println("a==10");
    }
  }

  public static void showSwitch() {
    int a = 20;
    switch (a) {
      case 1:
        System.out.println("a==1");
        break;
      case 2:
        System.out.println("a==2");
        break;
      case 3:
        System.out.println("a==3");
        break;
      default:
        System.out.println("Switch demo a==20");
    }
  }

  public static void showJumpBreak() {
    int a = 10;
    for (int i = 0; i < 100; i++) {
      if (a == 10) {
        System.out.println("Since a==10 then break the loop");
        break;
      }
    }
  }

  public static void showJumpContinue() {
    int a = 10;
    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        continue;
      }
      // If number is odd, print it
      System.out.print(i + " ");
      System.out.println();

    }
  }

  public static void showJumpReturn() {
    boolean t = true;
    System.out.println("Before the return.");

    if (t) {
      return;
    }

    // Compiler will bypass every statement
    // after return
    System.out.println("This won't execute.");
  }

}
