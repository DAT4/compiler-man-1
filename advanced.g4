grammar impl;

start   
    :  cs+=command* EOF 
    ;

program 
    : c=command                     # singleCommand
	| '{' cs+=command* OUTPUT? '}'  # multipleCommands
	;
	
command 
    : x=ID '=' e=expr ';'	                                # assignment
    | 'func' x=ID '(' r=paramList ')' p=program             # functionCreate
    | x=ID '(' e=exprList ')' ';'                           # functionCall
	| OUTPUT e=expr ';'                                     # output
    | IF    '(' c=condition ')' p=program i+=ifElse*        # ifBlock
    | WHILE '(' c=condition ')' p=program                   # whileLoop
    | 'for' '(' x=ID '=' e1=expr '..' e2=expr ')' p=program # forloop
	;

paramList
    : i=ID paramList?   # firstParam
    | ',' paramList     # nextParam
    ;
	
ifElse  
    : ELIF  '(' c=condition ')' p=program i=ifElse? # elifStat
    | ELSE  p=program                               # elseStat
    ;

expr    
    : '{' exprList? '}'                 # list
    | expr '[' e=expr ']'               # arrayIndex
    | MINUS e=expr                      # unaryMinus
    | NOT e=expr                        # notExpr
    | e1=expr op=(MULT | DIV) e2=expr   # multiplication
	| e1=expr op=(PLUS | MINUS) e2=expr # addition
    | 'sqrt(' e=expr ')'                # sqrt
    | s=STRING                          # string
	| c=FLOAT     	                    # constant
	| x=ID		                        # variable
	| '(' e=expr ')'                    # parenthesis
    | e=ID '++'                         # inc
    | e=ID '--'                         # inc
	;

condition 
    : e1=expr op=(EQ | NEQ) e2=expr             # equalityCondition
	| e1=expr op=(LEQ | GEQ | LT | GT ) e2=expr # relationalCondition
	;  

exprList 
    : expr (',' expr)* 
    ;

//Conditions
IF      : 'if'      ;
ELIF    : 'elif'    ;
ELSE    : 'else'    ;
WHILE   : 'while'   ;

//Operators         ;
PLUS    : '+'       ;
MINUS   : '-'       ;
MULT    : '*'       ;
DIV     : '/'       ;

//Logik         
AND     : '&&'      ;
OR      : '||'      ;
NEQ     : '!='      ;
EQ      : '=='      ;
LEQ     : '<='      ;
GEQ     : '>='      ;
GT      : '>'       ;
LT      : '<'       ;
NOT     : '!'       ;
TRUE    : 'true'    ;
FALSE   : 'false'   ;

OUTPUT  : 'return'  ;

ID    : ALPHA (ALPHA|NUM)*              ;
FLOAT : '-'? NUM+ ('.' NUM+)?           ;
STRING: '"' .*? '"'                     ;
ALPHA : [a-zA-Z_ÆØÅæøå]                 ;
NUM   : [0-9] ;

WHITESPACE : [ \n\t\r]+         -> skip ;
COMMENT    : '//'.*? '\r'? '\n' -> skip ;
COMMENT2   : '/*' .*? '*/'      -> skip ;
