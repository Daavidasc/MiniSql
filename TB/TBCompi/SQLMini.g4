grammar SQLMini;

//parser
program: query+;

query
    : create  
    | insert
    | select;
    
create: CREATE TABLE ID IPARE 
tipoDato ID  (COM tipoDato ID)* 
DPARE PYC;

insert: INSERT INTO ID VALUES 
IPARE dato (COM dato)* DPARE
(COM IPARE dato (COM dato)* DPARE)*
PYC;

select: SELECT (ESTRELLA | 
ID (COM ID)* ) FROM ID PYC;

tipoDato
    : INT
    | DECIMAL IPARE VINT COM VINT DPARE
    | VARCHAR IPARE VINT DPARE
    | BOOLEAN;

dato
    : VINT
    | STRING
    | VINT PTO VINT
    | bool ;
    
bool
    : TRUE
    | FALSE;

//lexer

CREATE : 'CREATE';
TABLE : 'TABLE';
INSERT : 'INSERT';
INTO : 'INTO';
SELECT : 'SELECT';
VALUES : 'VALUES';
ESTRELLA : '*';
FROM : 'FROM';

INT : 'int';
VINT : [0-9]+;
DECIMAL : 'decimal';
VARCHAR : 'varchar';
BOOLEAN : 'boolean';
TRUE : 'true';
FALSE : 'false';

DPARE : ')';
IPARE : '(';
PYC : ';';
COM : ',';
PTO : '.';
ID : [a-zA-Z_][a-zA-Z_0-9]* ;  //entidad - Id
STRING : '\'' ( ~'\'' )* '\'';
WS : [ \t\r\n]+ -> skip;