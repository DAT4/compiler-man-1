# Compiler mandatory
#### Martin Mårtenssen & Daniel Styrbæk-Petersen s.143861
#### October 9, 2020


## Task 1
### Grammar
We added the following constants to our grammar file
```java
PLUS  : '+'
MINUS : '-'
MULT  : '*'
DIV   : '/'
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
As seen in the changes to the grammar file, we made it so each operand can be identified by the __op__ variable. This made implementing
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
### Grammar
  
  #### Conditional branching
  
  
  
  
  ## Task 3
  ### Grammar
  
  
  ## Task 4
  ### Grammar
