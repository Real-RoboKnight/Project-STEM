public class Person {
  
  private String firstName;
  private String lastName;
  private int age;
  private String SSN;
  
  public int getAge () {
    return age;
  }
  
  public String getFirstName () {
    return firstName;
  }
  
  public String getLastName () {
    return lastName;
  }
  
  public String getSSN () {
    return SSN;
  }
  
  public void setAge (int age) {
    this.age = age;
  }
  
  public void setFirstName (String firstName) {
    this.firstName = firstName;
  }
  
  public void setLastName (String lastName) {
    this.lastName = lastName;
  }
  
  public void setSSN (String SSN) {
    this.SSN = SSN;
  }
  
  
  public boolean equals (Person person) {
    return lastName.equals(person.lastName) && firstName.equals(person.firstName) && age == person.age && SSN.equals(person.SSN);
  }
  
  public String toString () {
    return "SSN: " + SSN + "\n\tName: " + firstName + " " + lastName + "\n\tAge: " + age;
  }
  
  
  public Person(String firstName, String lastName, int age, String ssn) {
    setFirstName(firstName);
    setLastName(lastName);
    setAge(age);
    setSSN(ssn);
  }
  
  
}
