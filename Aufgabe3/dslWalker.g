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
//			| ^(EQUAL ^(SUB xy1=block xy2=block) xy3=block) -> ^((EQUAL ^(ADD["+"] $xy3 $xy2) $xy1)
			;

block		: 	^(BLOCK SYMBOL*);