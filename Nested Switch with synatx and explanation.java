/*

- By Krish Jani (KrishJani)
Source: Geeks For Geeks (https://www.geeksforgeeks.org/nested-switch-case/)

Switch-case statements:

These are a substitute for long if statements that compare a variable to several 
integral values

The switch statement is a multiway branch statement. It provides an easy way to 
dispatch execution to different parts of code based on the value of the expression.
Switch is a control statement that allows a value to change control of execution.


Points to remember while using Switch Case

- The expression used in a switch statement must have an integral or character type, 
or be of a class type in which the class has a single conversion function to an 
integral or character type.

- There can be any number of case statements within a switch. Each case is followed 
by the value to be compared to and after that a colon.

- When the variable being switched on is equal to a case, the statements following 
that case will execute until a break statement is reached.When a break statement 
is reached, the switch terminates, and the flow of control jumps to the next line 
following the switch statement.

- Not every case needs to contain a break. If no break appears, the flow of control 
will fall through to subsequent cases until a break is reached i.e. all the case 
statements will get executed as soon as compiler finds a comparison to be true.

- A switch statement can have an optional default case, which must appear at the 
end of the switch. The default case can be used for performing a task when none 
of the cases is true. No break is needed in the default case.



----------Syntax----------

switch(n)
{
  // code to be executed if n = 1;
  case 1: 
    
  // Nested switch
  switch(num) 
  {
    // code to be executed if num = 10
    case 10: 
      statement 1;
      break;
      
    // code to be executed if num = 20
    case 20: 
      statement 2;
      break;
      
    // code to be executed if num = 30
    case 30: 
      statement 3;
      break;
      
      // code to be executed if num 
      // doesn't match any cases
      default: 
  }
  
  
  break;
    
  // code to be executed if n = 2;
  case 2:
    statement 2;
    break;
  
  // code to be executed if n = 3;
  case 3: 
    statement 3;
    break;
  
   // code to be executed if n doesn't match any cases
   default: 
}
*/


#include <stdio.h>
  
int main()
{
    int x = 1, y = 2;
  
    // Outer Switch
    switch (x) {
  
    // If x == 1
    case 1:
  
        // Nested Switch
  
        switch (y) {
  
        // If y == 2
        case 2:
            printf( "Choice is 2");
            break;
  
        // If y == 3
        case 3:
            printf( "Choice is 3");
            break;
        }
        break;
  
    // If x == 4
    case 4:
        printf( "Choice is 4");
        break;
  
    // If x == 5
    case 5:
        printf( "Choice is 5");
        break;
  
    default:
        printf( "Choice is other than 1, 2 3, 4, or 5");
        break;
    }
    return 0;
}