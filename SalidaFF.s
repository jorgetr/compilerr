stage: scanning
1 CLASS class
1 PROGRAM Program
1 OPENBRACE {
2 INT int
2 VAR factorial
2 OPENAREN (
2 CLOSEPAREN )
2 OPENBRACE {
3 IF if
3 OPENAREN (
3 VAR n
3 EQUAL ==
3 INTLITERAL 1
3 OR ||
3 VAR n
3 EQUAL ==
3 INTLITERAL 0
3 CLOSEPAREN )
4 OPENBRACE {
5 RETURN return
5 INTLITERAL 1
5 SEMICOLON ;
6 CLOSEBRACE }
6 ELSE else
7 OPENBRACE {
8 FOR for
8 VAR a
8 ASSIGN =
8 INTLITERAL 1
8 COMA ,
8 VAR c
8 ADD +
8 INTLITERAL 2
9 OPENBRACE {
10 RETURN return
10 OPENAREN (
10 OPENAREN (
10 SUB -
10 OPENAREN (
10 OPENAREN (
10 INTLITERAL 1
10 CLOSEPAREN )
10 CLOSEPAREN )
10 CLOSEPAREN )
10 CLOSEPAREN )
10 ADD +
10 INTLITERAL 1
10 MULT *
10 INTLITERAL 3
10 SUB -
10 INTLITERAL 6
10 SEMICOLON ;
11 FOR for
11 VAR a
11 ASSIGN =
11 INTLITERAL 1
11 COMA ,
11 VAR c
11 OPENBRACKET [
11 VAR foo
11 OPENAREN (
11 INTLITERAL 0
11 ADD +
11 INTLITERAL 1
11 CLOSEPAREN )
11 CLOSEBRACKET ]
11 ADD +
11 INTLITERAL 2
12 OPENBRACE {
13 VAR foo
13 OPENAREN (
13 CALLOUT callout
13 OPENAREN (
13 STRINGLITERAL "hola"
13 COMA ,
13 INTLITERAL 3
13 ADD +
13 VAR a
13 COMA ,
13 OPENAREN (
13 INTLITERAL 2
13 MULT *
13 VAR b
13 CLOSEPAREN )
13 COMA ,
13 INTLITERAL 4
13 MULT *
13 VAR c
13 CLOSEPAREN )
13 CLOSEPAREN )
13 SEMICOLON ;
14 BREAK break
14 SEMICOLON ;
15 IF if
15 OPENAREN (
15 VAR n
15 EQUAL ==
15 INTLITERAL 2
15 CLOSEPAREN )
16 OPENBRACE {
17 RETURN return
17 HEXLIT 0x5
17 SEMICOLON ;
18 IF if
18 OPENAREN (
18 NOT !
18 VAR n
18 EQUAL ==
18 INTLITERAL 5
18 CLOSEPAREN )
19 OPENBRACE {
21 CLOSEBRACE }
22 ELSE else
23 OPENBRACE {
24 OPENBRACE {
26 CLOSEBRACE }
27 CLOSEBRACE }
28 ELSE else
29 OPENBRACE {
31 CLOSEBRACE }
32 CLOSEBRACE }
34 CLOSEBRACE }
36 CLOSEBRACE }
37 RETURN return
37 OPENAREN (
37 VAR n
37 MULT *
37 VAR factorial
37 OPENAREN (
37 VAR n
37 SUB -
37 INTLITERAL 1
37 CLOSEPAREN )
37 CLOSEPAREN )
37 SEMICOLON ;
38 CLOSEBRACE }
40 CLOSEBRACE }
41 CLOSEBRACE }

stage: parsing
42 CLOSE
41 }
40 statement:if(expr)block (else)*
40 }
38 return expr* ;
37 expr:(exp)
37 expr: expr binOp expr
37 expr:method_call
37 method_call:method_name (expr,*)
37 expr: expr binOp expr
37 expr:literal
37 expr:location
37 method_name:VAR
37 expr:location
37 statement:for var=exprm expr , block
37 }
36 statement:for var=exprm expr , block
36 }
34 }
32 statement:if(expr)block (else)*
32 }
31 block:{
28 }
27 block
27 }
26 block:{
24 block:{
22 }
21 block:{
18 expr:!expr
18 expr: expr binOp expr
18 expr:literal
18 expr:location
17 block:{
15 expr: expr binOp expr
15 expr:literal
15 expr:location
15 statement: Break;
14 statement:methot_call
13 method_call:CALLOUT STRINGLITERAL (,callout_args,)*
13 expr: expr binOp expr
13 expr:location
13 expr:literal
13 expr:(exp)
13 expr: expr binOp expr
13 expr:location
13 expr:literal
13 expr: expr binOp expr
13 expr:location
13 expr:literal
13 statement:methot_call
13 method_name:VAR
13 block:{
12 expr: expr binOp expr
12 expr:literal
11 expr:location
11 location:VAR (exp)* 
11 expr:method_call
11 method_call:method_name (expr,*)
11 expr: expr binOp expr
11 expr:literal
11 expr:literal
11 method_name:VAR
11 expr:literal
11 return expr* ;
10 expr: expr binOp expr
10 expr:literal
10 expr: expr binOp expr
10 expr:literal
10 expr: expr binOp expr
10 expr:literal
10 expr:(exp)
10 expr:(exp)
10 expr: -expr
10 expr:(exp)
10 expr:(exp)
10 expr:literal
10 block:{
9 expr: expr binOp expr
9 expr:literal
8 expr:location
8 expr:literal
8 block:{
6 }
6 return expr* ;
5 expr:literal
5 block:{
3 expr: expr binOp expr
3 expr:literal
3 expr: expr binOp expr
3 expr:location
3 bin_op: artih /  real/ cond 
3 cond_op: & | 
3 expr: expr binOp expr
3 expr:literal
3 expr:location
3 block:{
2 )method_call
2 type var,*
2 method_decli type/void id (
2 type boolean/int
2 program: ClASS PROGRAM
stage: scanning
1 CLASS class
1 PROGRAM Program
1 OPENBRACE {
2 INT int
2 VAR factorial
2 OPENAREN (
2 CLOSEPAREN )
2 OPENBRACE {
3 IF if
3 OPENAREN (
3 VAR n
3 EQUAL ==
3 INTLITERAL 1
3 OR ||
3 VAR n
3 EQUAL ==
3 INTLITERAL 0
3 CLOSEPAREN )
4 OPENBRACE {
5 RETURN return
5 INTLITERAL 1
5 SEMICOLON ;
6 CLOSEBRACE }
6 ELSE else
7 OPENBRACE {
8 FOR for
8 VAR a
8 ASSIGN =
8 INTLITERAL 1
8 COMA ,
8 VAR c
8 ADD +
8 INTLITERAL 2
9 OPENBRACE {
10 RETURN return
10 OPENAREN (
10 OPENAREN (
10 SUB -
10 OPENAREN (
10 OPENAREN (
10 INTLITERAL 1
10 CLOSEPAREN )
10 CLOSEPAREN )
10 CLOSEPAREN )
10 CLOSEPAREN )
10 ADD +
10 INTLITERAL 1
10 MULT *
10 INTLITERAL 3
10 SUB -
10 INTLITERAL 6
10 SEMICOLON ;
11 FOR for
11 VAR a
11 ASSIGN =
11 INTLITERAL 1
11 COMA ,
11 VAR c
11 OPENBRACKET [
11 VAR foo
11 OPENAREN (
11 INTLITERAL 0
11 ADD +
11 INTLITERAL 1
11 CLOSEPAREN )
11 CLOSEBRACKET ]
11 ADD +
11 INTLITERAL 2
12 OPENBRACE {
13 VAR foo
13 OPENAREN (
13 CALLOUT callout
13 OPENAREN (
13 STRINGLITERAL "hola"
13 COMA ,
13 INTLITERAL 3
13 ADD +
13 VAR a
13 COMA ,
13 OPENAREN (
13 INTLITERAL 2
13 MULT *
13 VAR b
13 CLOSEPAREN )
13 COMA ,
13 INTLITERAL 4
13 MULT *
13 VAR c
13 CLOSEPAREN )
13 CLOSEPAREN )
13 SEMICOLON ;
14 BREAK break
14 SEMICOLON ;
15 IF if
15 OPENAREN (
15 VAR n
15 EQUAL ==
15 INTLITERAL 2
15 CLOSEPAREN )
16 OPENBRACE {
17 RETURN return
17 HEXLIT 0x5
17 SEMICOLON ;
18 IF if
18 OPENAREN (
18 NOT !
18 VAR n
18 EQUAL ==
18 INTLITERAL 5
18 CLOSEPAREN )
19 OPENBRACE {
21 CLOSEBRACE }
22 ELSE else
23 OPENBRACE {
24 OPENBRACE {
26 CLOSEBRACE }
27 CLOSEBRACE }
28 ELSE else
29 OPENBRACE {
31 CLOSEBRACE }
32 CLOSEBRACE }
34 CLOSEBRACE }
36 CLOSEBRACE }
37 RETURN return
37 OPENAREN (
37 VAR n
37 MULT *
37 VAR factorial
37 OPENAREN (
37 VAR n
37 SUB -
37 INTLITERAL 1
37 CLOSEPAREN )
37 CLOSEPAREN )
37 SEMICOLON ;
38 CLOSEBRACE }
40 CLOSEBRACE }
41 CLOSEBRACE }

stage: parsing
42 CLOSE
41 }
40 statement:if(expr)block (else)*
40 }
38 return expr* ;
37 expr:(exp)
37 expr: expr binOp expr
37 expr:method_call
37 method_call:method_name (expr,*)
37 expr: expr binOp expr
37 expr:literal
37 expr:location
37 method_name:VAR
37 expr:location
37 statement:for var=exprm expr , block
37 }
36 statement:for var=exprm expr , block
36 }
34 }
32 statement:if(expr)block (else)*
32 }
31 block:{
28 }
27 block
27 }
26 block:{
24 block:{
22 }
21 block:{
18 expr:!expr
18 expr: expr binOp expr
18 expr:literal
18 expr:location
17 block:{
15 expr: expr binOp expr
15 expr:literal
15 expr:location
15 statement: Break;
14 statement:methot_call
13 method_call:CALLOUT STRINGLITERAL (,callout_args,)*
13 expr: expr binOp expr
13 expr:location
13 expr:literal
13 expr:(exp)
13 expr: expr binOp expr
13 expr:location
13 expr:literal
13 expr: expr binOp expr
13 expr:location
13 expr:literal
13 statement:methot_call
13 method_name:VAR
13 block:{
12 expr: expr binOp expr
12 expr:literal
11 expr:location
11 location:VAR (exp)* 
11 expr:method_call
11 method_call:method_name (expr,*)
11 expr: expr binOp expr
11 expr:literal
11 expr:literal
11 method_name:VAR
11 expr:literal
11 return expr* ;
10 expr: expr binOp expr
10 expr:literal
10 expr: expr binOp expr
10 expr:literal
10 expr: expr binOp expr
10 expr:literal
10 expr:(exp)
10 expr:(exp)
10 expr: -expr
10 expr:(exp)
10 expr:(exp)
10 expr:literal
10 block:{
9 expr: expr binOp expr
9 expr:literal
8 expr:location
8 expr:literal
8 block:{
6 }
6 return expr* ;
5 expr:literal
5 block:{
3 expr: expr binOp expr
3 expr:literal
3 expr: expr binOp expr
3 expr:location
3 bin_op: artih /  real/ cond 
3 cond_op: & | 
3 expr: expr binOp expr
3 expr:literal
3 expr:location
3 block:{
2 )method_call
2 type var,*
2 method_decli type/void id (
2 type boolean/int
2 program: ClASS PROGRAM
