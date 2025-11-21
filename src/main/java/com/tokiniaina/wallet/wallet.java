package com.tokiniaina.wallet;

public class Wallet {
  private String color;
  private int size;
  private double wallet_money;

  Wallet(String color, int size) {
    this.color = color;
    this.size = size;
  }

  public void addMoney(double amount) {
    this.wallet_money += amount;
    System.out.println("Money " + amount + " added to the wallet.");
  }

  public double getWallet() {
    return this.wallet_money;
  }

  public void open() {
    System.out.println("Wallet is now open.");
  }

  public void close() {
    System.out.println("Wallet is now closed.");
  }

  public boolean isLost() {
    // Placeholder implementation
    return false;
  }

  public void checkStatus() {
    System.out.println("Wallet color: " + this.color + ", size: " + this.size + ", money: " + this.wallet_money);
  }
}