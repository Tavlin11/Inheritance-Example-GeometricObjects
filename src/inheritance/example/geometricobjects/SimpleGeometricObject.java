package inheritance.example.geometricobjects;

/**
 * Inheritance Example
 * Simple Geometric Object class as  superclass
 * Author: Textbook Chapter 11
 */
public class SimpleGeometricObject {

    // instance variables
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
  
    /** Construct a default geometric object */
    public SimpleGeometricObject() {
        this.dateCreated = new java.util.Date();
    }

  /** Construct a geometric object with the specified color 
    *  and filled value */
  public SimpleGeometricObject(String color, boolean filled) {
    this.dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }

  /** Return color */
  public String getColor() {
    return this.color;
  }

  /** Set a new color */
  public void setColor(String color) {
    this.color = color;
  }

  /** Return filled. Since filled is boolean, 
     its get method is named isFilled */
  public boolean isFilled() {
    return this.filled;
  }

  /** Set a new filled */
  public void setFilled(boolean filled) {
    this.filled = filled;
  }
  
  /** Get dateCreated */
  public java.util.Date getDateCreated() {
    return this.dateCreated;
  }
  
  /** Return a string representation of this object */
  public String toString() {
    return "created on " + this.dateCreated + "\ncolor: " 
            + this.color + " and filled: " + this.filled;
  }
}
