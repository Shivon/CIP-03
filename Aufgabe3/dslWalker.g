tree grammar dslWalker;

options { 
  tokenVocab=dsl;
  ASTLabelType=CommonTree;
  output=AST;
}


riddle		:	exercise exercise exercise exercise exercise exercise;

exercise	: 	^(EQUAL ^(ADD block block) block)
			| ^(EQUAL ^(SUB bl1=block bl2=block) bl3=block) -> ^(EQUAL ^(ADD["+"] $bl3 $bl2) $bl1)
			;

block		: 	^(BLOCK SYMBOL*);