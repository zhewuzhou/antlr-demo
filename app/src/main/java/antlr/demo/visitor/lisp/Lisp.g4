grammar Lisp;
prog:	expr;
expr : letExpr
    | addExpr
    | multExpr
    | VAR
    | INT
    ;

varExprList : VAR expr varExprList
    | VAR expr
    ;

letExpr : '(' 'let' varExprList expr ')';
addExpr : '(' 'add' expr expr ')';
multExpr : '(' 'mult' expr expr ')';

VAR : [a-zA-Z0-9]+ ;
INT : [0-9]+ ;
WS : [ \t\n\r]+ -> skip ;
