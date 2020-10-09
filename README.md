# Compiler mandatory
#### Martin Mårtenssen & Daniel Styrbæk-Petersen s.143861
#### October 9, 2020


## Task 1
### Grammar
We added the following constants to our grammar file
```java
PLUS  : '+'   ;
MINUS : '-'   ;
MULT  : '*'   ;
DIV   : '/'   ;
```

And we extended the expr but adding the following expressions:

```java
expr
  : e1=expr op=(MULT | DIV) e2=expr       #multiplication
  | e1=expr op=(PLUS | MINUS) e2=expr     #addition
  ;
```

### Java implementation
To implement the changes made to the grammar, we altered the visitAddition() and visitMultiplication() functions in the main.java file
As seen in the changes to the grammar file, we made it so each operand can be identified by the ***op*** variable. This made implementing
subtraction and division, relatively simple by adding and if-statement to the methods in java, as seen in the alteration of the visitAddition method below:

```java
public Double visitAddition(implParser.AdditionContext ctx) {
if(ctx.op.getText() == "+")
  return visit(ctx.e1)+visit(ctx.e2);
else
  return visit(ctx.e1)-visit(ctx.e2);
}
```
  
## Task 2 
### Conditional branching
  
  #### Grammar
  We added the following constant to the grammar file
  ```java
AND   : '&&'   ;
OR    : '||'   ;
EQ    : '=='   ;
NEQ   : '!='   ;
LEQ   : '<='   ;
GEQ   : '>='   ;
GT    : '>'    ;
LT    : '<'    ;
NOT   : '!'    ;
```
 Then we extended the condition grammar to the following:
 
 ```java
 condition 
    : NOT c=condition                           # notCondition
    | c1=condition op=(OR|AND) c2=condition     # logicalCondition
    | e1=expr op=(EQ | NEQ) e2=expr             # equalityCondition
	| e1=expr op=(LEQ | GEQ | LT | GT ) e2=expr # relationalCondition
	; 
  ```
  Worth noting in the implementation of the *OR* and *AND* conditions, we made use of recursive grammar. So c1 and c2 could theoritcally include other conditions. This was done to allow for statements like:
  ```java
  if (x != y || n > 10) { ... }
  ```
  Or even potientially nested *OR* and *AND* statements.
#### Implementation
We extended the visitor class in the main.java file to accomodate these changes, the overall implementation strategy
  #### For-loops
  To implement this simplified for-loop, we add
  
  
  #### Simplified Arrays
  
  
  
  
  ## Task 3
  ### Grammar
  
  
  ## Task 4
  ### Grammar
