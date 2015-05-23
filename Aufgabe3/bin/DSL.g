grammar DSL;



options { 
  output=AST;
  ASTLabelType=CommonTree;
}



tokens{
  RESULT; 
  BLOCK;
}

@header {package output;}
@lexer::header {package output;}



riddle	:	b11=block op1=op b12=block EQUAL b13=block
                op21=op    op22=op   op23= op
               	b31= block op3=op b32= block EQUAL b33=block
                EQUAL	EQUAL	EQUAL	
               	b51= block op5=op b52=block EQUAL b53=block
                ->
                  ^(EQUAL ^($op1 $b11 $b12) $b13  )
                   ^(EQUAL ^($op3  $b31  $b32 ) $b33  )
                    ^(EQUAL ^($op5  $b51  $b52 )  $b53  )
                     ^(EQUAL ^($op21  $b11  $b31 ) $b51  )
                      ^(EQUAL ^($op22  $b12 $b32 ) $b52 )
                       ^(EQUAL ^($op23  $b13 $b33 )$b53  )     
                ; 


block	: 	SYMBOL+  -> ^(BLOCK SYMBOL*);
op	:	ADD | SUB;

SYMBOL	:	('A'..'Z');
ADD	:	'+';
SUB	:	'-';
EQUAL	: 	'=';


WS      :	(' '|'\t'|'\f'|'\n'|'\r')+{ $channel=HIDDEN; };