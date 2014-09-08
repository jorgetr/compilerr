
stage: parsing
60 CLOSE
59 }
58 statement:if(expr)block (else)*
58 }
56 statement:for var=exprm expr , block
56 }
55 statement:for var=exprm expr , block
55 }
52 statement:Continue;
49 statement:if(expr)block (else)*
49 }
48 block:{
46 }
46 statement:if(expr)block (else)*
46 }
45 block:{
42 }
41 block
41 }
40 statement:if(expr)block (else)*
40 }
38 statement: Break;
37 statement: Break;
36 statement: Break;
35 statement: Break;
34 statement: Break;
33 block:{
31 expr: expr binOp expr
31 expr:literal
31 expr:location
31 block:{
29 block:{
27 }
26 block:{
23 expr:!expr
23 expr: expr binOp expr
23 expr:literal
23 expr:location
23 return expr* ;
22 expr:literal
22 block:{
20 expr: expr binOp expr
20 expr:literal
20 expr:location
20 statement: Break;
19 statement:methot_call
18 method_call:method_name (expr,*)
18 expr:method_call
18 method_call:CALLOUT STRINGLITERAL (,callout_args,)*
18 expr: expr binOp expr
18 expr:location
18 expr:literal
18 expr:(exp)
18 expr: expr binOp expr
18 expr:location
18 expr:literal
18 expr: expr binOp expr
18 expr:location
18 expr:literal
18 method_name:VAR
18 block:{
16 expr: expr binOp expr
16 expr:literal
15 expr:location
15 location:VAR (exp)* 
15 expr:method_call
15 method_call:method_name (expr,*)
15 expr: expr binOp expr
15 expr:literal
15 expr:literal
15 method_name:VAR
15 expr:literal
15 return expr* ;
13 expr: expr binOp expr
13 expr:literal
13 expr: expr binOp expr
13 expr:literal
13 expr: expr binOp expr
13 expr:literal
13 expr:(exp)
13 expr:(exp)
13 expr: -expr
13 expr:(exp)
13 expr:(exp)
13 expr:literal
13 block:{
11 expr: expr binOp expr
11 expr:literal
10 expr:location
10 expr:literal
10 return expr* ;
7 expr:(exp)
7 expr: expr binOp expr
7 expr:method_call
7 method_call:method_name (expr,*)
7 expr: expr binOp expr
7 expr:literal
7 expr:location
7 method_name:VAR
7 expr:location
7 block:{
5 }
5 return expr* ;
4 expr:literal
4 block:{
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
