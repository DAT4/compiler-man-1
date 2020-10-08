grammar impl;

start   
    :  cs+=command* EOF 
    ;

program 
    : c=command             # singleCommand
	| '{' cs+=command* '}'  # multipleCommands
	;
	
command 
    : e=expr ';'                                            # expression
    | x=ID '['e1=expr']' '=' e2=expr ';'                    # arrayAssignment
    | x=ID '=' e=expr ';'                                   # assignment
    | x=ID op=(INC|DEC) ';'                                 # inc
    | IF  '(' c=condition ')' p=program cs+=ifElse*         # ifBlock
    | WHILE '(' c=condition ')' p=program                   # whileLoop
    | FOR '(' x=ID '=' e1=expr '..' e2=expr ')' p=program   # forloop
    | OUTPUT e=expr ';'                                     # return
	;

ifElse  
    : ELIF  '(' c=condition ')' p=program   # elifStat
    | ELSE  p=program                       # elseStat
    ;

expr    
    : '{' e=expr (',' es+=expr)* '}'    # array
    | x=expr '[' e=expr ']'             # arrayIndex
    | MINUS e=expr                      # unaryMinus
    | e1=expr op=(MULT | DIV) e2=expr   # multiplication
	| e1=expr op=(PLUS | MINUS) e2=expr # addition
	| e=FLOAT     	                    # constant
	| x=ID		                        # variable
	| '(' e=expr ')'                    # parenthesis
	;


condition 
    : NOT c=condition                           # notCondition
    | c1=condition op=(OR|AND) c2=condition     # logicalCondition
    | e1=expr op=(EQ | NEQ) e2=expr             # equalityCondition
	| e1=expr op=(LEQ | GEQ | LT | GT ) e2=expr # relationalCondition
	;  

INC         : '++'                      ;
DEC         : '--'                      ;
IF          : 'if'                      ;
ELIF        : 'elif'                    ;
ELSE        : 'else'                    ;
WHILE       : 'while'                   ;
FOR         : 'for'                     ;
PLUS        : '+'                       ;
MINUS       : '-'                       ;
MULT        : '*'                       ;
DIV         : '/'                       ;
AND         : '&&'                      ;
OR          : '||'                      ;
NEQ         : '!='                      ;
EQ          : '=='                      ;
LEQ         : '<='                      ;
GEQ         : '>='                      ;
GT          : '>'                       ;
LT          : '<'                       ;
NOT         : '!'                       ;
TRUE        : 'true'                    ;
FALSE       : 'false'                   ;
OUTPUT      : 'output'                  ;
ID          : ALPHA (ALPHA|NUM)*        ;
FLOAT       : NUM+ ('.' NUM+)?     ;
ALPHA       : [a-zA-Z_ÆØÅæøå]           ;
NUM         : [0-9]                     ;
WHITESPACE  : [ \n\t\r]+         -> skip;
COMMENT     : '//'.*? '\r'? '\n' -> skip;
COMMENT2    : '/*' .*? '*/'      -> skip;
