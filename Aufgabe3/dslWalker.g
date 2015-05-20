tree grammar dslWalker;

options { 
  tokenVocab=dsl;
  ASTLabelType=CommonTree;
  output=AST;
}

//@header {package output;}


riddle		:	exercise exercise exercise exercise exercise exercise;

exercise	: 	^(EQUAL ^(ADD block block) block)
			//^(EQUAL ^(ADD bl1=block bl2=block) bl3=block) -> ^(EQUAL ^(ADD $bl1 $bl2) $bl3)
			| ^(EQUAL ^(SUB d=block e=block) f=block) -> ^((EQUAL ^(ADD["+"] $d $e) $f)
			;

block		: 	^(BLOCK SYMBOL*);