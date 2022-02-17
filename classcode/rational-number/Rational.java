/*
example:

// declare the class
public class Time {

    // instance variables
    // every object gets a copy of each variable
    private int hour;
    private int minute;
    private double second;

    // constructor
    public Time() {
      this.hour = 0;
      this.minute = 0;
      this.second = 0.0;
    }

    public Time(int hour, int minute, double second) {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
    }
}
*/

public class Rational {
  private int numerator;
  private int denominator;

  public Rational() {
    this.numerator= 0;
    this.denominator= 1;
  }

  public Rational(int n, int d) {
    this.numerator= n;
    this.denominator= d;
  }

  public void printRational() {
    System.out.println(this.numerator + "/" + this.denominator);
  }

  public String toString() {
    return this.numerator + "/" + this.denominator;
  }

}
