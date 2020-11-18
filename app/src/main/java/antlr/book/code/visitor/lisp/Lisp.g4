grammar Lisp;
prog:	expr;
expr : let_expr
    | add_expr
    | mult_expr
    | VAR
    | INT
    ;
var_expr_list : VAR expr var_expr_list
    | VAR expr
    ;

let_expr : '(' 'let' var_expr_list expr ')';
add_expr : '(' 'add' expr expr ')';
mult_expr : '(' 'mult' expr expr ')';

VAR : [a-zA-Z0-9]+ ;
INT : [0-9]+ ;
WS : [ \t\n\r]+ -> skip ;