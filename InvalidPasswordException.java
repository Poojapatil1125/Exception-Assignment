package com.Question8;
public class  InvalidPasswordException extends Exception { 
  int passwordConditionViolated = 0;
  public InvalidPasswordException(int conditionViolated)
  {
      super("Invalid Password: ");
      passwordConditionViolated = conditionViolated;
  }
  public String printMessage()
  {
      // Call constructor of parent Exception
      // according to the condition violated
      switch (passwordConditionViolated) {
      // Password length should be
      // between 8 to 14 characters
      case 1:
          return ("Password length should be"
                  + " between 8 to 14 characters");
      // Password should not contain any space
      case 2:
          return ("Password should not"
                  + " contain any space");
      // Password should contain// at least one digit(0-9)
      case 3:
          return ("Password should contain"
                  + " at least one digit(0-9)");
      // Password should contain at least
      // one special character ( @, #, %, &, !, $ )
      case 4:
          return ("Password should contain at "
                  + "two special character");
      // Password should contain at least
      // one uppercase letter(A-Z)
      case 5:
          return ("Password should contain at"
                  + " two uppercase letter(A-Z)");
      // Password should contain at least
      // one lowercase letter(a-z)
      case 6:
          return ("Password should contain at"
                  + " two lowercase letter(a-z)");
      }
      return ("");
  }
}
