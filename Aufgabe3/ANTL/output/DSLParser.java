// $ANTLR 3.4 C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g 2015-05-20 20:14:06
package output;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class DSLParser extends DebugParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ADD", "BLOCK", "EQUAL", "RESULT", "SUB", "SYMBOL", "WS"
    };

    public static final int EOF=-1;
    public static final int ADD=4;
    public static final int BLOCK=5;
    public static final int EQUAL=6;
    public static final int RESULT=7;
    public static final int SUB=8;
    public static final int SYMBOL=9;
    public static final int WS=10;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "riddle", "block", "op"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public DSLParser(TokenStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public DSLParser(TokenStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,adaptor);
        setDebugListener(proxy);
        setTokenStream(new DebugTokenStream(input,proxy));
        try {
            proxy.handshake();
        }
        catch (IOException ioe) {
            reportError(ioe);
        }
        TreeAdaptor adap = new CommonTreeAdaptor();
        setTreeAdaptor(adap);
        proxy.setTreeAdaptor(adap);
    }

public DSLParser(TokenStream input, DebugEventListener dbg) {
    super(input, dbg);
     
    TreeAdaptor adap = new CommonTreeAdaptor();
    setTreeAdaptor(adap);


}

protected boolean evalPredicate(boolean result, String predicate) {
    dbg.semanticPredicate(result, predicate);
    return result;
}

protected DebugTreeAdaptor adaptor;
public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = new DebugTreeAdaptor(dbg,adaptor);


}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}

    public String[] getTokenNames() { return DSLParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g"; }


    public static class riddle_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "riddle"
    // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:22:1: riddle : b11= block op1= op b12= block EQUAL b13= block op21= op op22= op op23= op b31= block op3= op b32= block EQUAL b33= block EQUAL EQUAL EQUAL b51= block op5= op b52= block EQUAL b53= block -> ^( EQUAL ^( $op1 $b11 $b12) $b13) ^( EQUAL ^( $op3 $b31 $b32) $b33) ^( EQUAL ^( $op5 $b51 $b52) $b53) ^( EQUAL ^( $op21 $b11 $b31) $b51) ^( EQUAL ^( $op22 $b12 $b32) $b52) ^( EQUAL ^( $op23 $b13 $b33) $b53) ;
    public final DSLParser.riddle_return riddle() throws RecognitionException {
        DSLParser.riddle_return retval = new DSLParser.riddle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EQUAL1=null;
        Token EQUAL2=null;
        Token EQUAL3=null;
        Token EQUAL4=null;
        Token EQUAL5=null;
        Token EQUAL6=null;
        DSLParser.block_return b11 =null;

        DSLParser.op_return op1 =null;

        DSLParser.block_return b12 =null;

        DSLParser.block_return b13 =null;

        DSLParser.op_return op21 =null;

        DSLParser.op_return op22 =null;

        DSLParser.op_return op23 =null;

        DSLParser.block_return b31 =null;

        DSLParser.op_return op3 =null;

        DSLParser.block_return b32 =null;

        DSLParser.block_return b33 =null;

        DSLParser.block_return b51 =null;

        DSLParser.op_return op5 =null;

        DSLParser.block_return b52 =null;

        DSLParser.block_return b53 =null;


        CommonTree EQUAL1_tree=null;
        CommonTree EQUAL2_tree=null;
        CommonTree EQUAL3_tree=null;
        CommonTree EQUAL4_tree=null;
        CommonTree EQUAL5_tree=null;
        CommonTree EQUAL6_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try { dbg.enterRule(getGrammarFileName(), "riddle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(22, 0);

        try {
            // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:22:8: (b11= block op1= op b12= block EQUAL b13= block op21= op op22= op op23= op b31= block op3= op b32= block EQUAL b33= block EQUAL EQUAL EQUAL b51= block op5= op b52= block EQUAL b53= block -> ^( EQUAL ^( $op1 $b11 $b12) $b13) ^( EQUAL ^( $op3 $b31 $b32) $b33) ^( EQUAL ^( $op5 $b51 $b52) $b53) ^( EQUAL ^( $op21 $b11 $b31) $b51) ^( EQUAL ^( $op22 $b12 $b32) $b52) ^( EQUAL ^( $op23 $b13 $b33) $b53) )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:22:10: b11= block op1= op b12= block EQUAL b13= block op21= op op22= op op23= op b31= block op3= op b32= block EQUAL b33= block EQUAL EQUAL EQUAL b51= block op5= op b52= block EQUAL b53= block
            {
            dbg.location(22,13);
            pushFollow(FOLLOW_block_in_riddle68);
            b11=block();

            state._fsp--;

            stream_block.add(b11.getTree());
            dbg.location(22,23);
            pushFollow(FOLLOW_op_in_riddle72);
            op1=op();

            state._fsp--;

            stream_op.add(op1.getTree());
            dbg.location(22,30);
            pushFollow(FOLLOW_block_in_riddle76);
            b12=block();

            state._fsp--;

            stream_block.add(b12.getTree());
            dbg.location(22,37);
            EQUAL1=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle78);  
            stream_EQUAL.add(EQUAL1);

            dbg.location(22,46);
            pushFollow(FOLLOW_block_in_riddle82);
            b13=block();

            state._fsp--;

            stream_block.add(b13.getTree());
            dbg.location(23,21);
            pushFollow(FOLLOW_op_in_riddle102);
            op21=op();

            state._fsp--;

            stream_op.add(op21.getTree());
            dbg.location(23,32);
            pushFollow(FOLLOW_op_in_riddle109);
            op22=op();

            state._fsp--;

            stream_op.add(op22.getTree());
            dbg.location(23,42);
            pushFollow(FOLLOW_op_in_riddle116);
            op23=op();

            state._fsp--;

            stream_op.add(op23.getTree());
            dbg.location(24,20);
            pushFollow(FOLLOW_block_in_riddle137);
            b31=block();

            state._fsp--;

            stream_block.add(b31.getTree());
            dbg.location(24,31);
            pushFollow(FOLLOW_op_in_riddle141);
            op3=op();

            state._fsp--;

            stream_op.add(op3.getTree());
            dbg.location(24,38);
            pushFollow(FOLLOW_block_in_riddle146);
            b32=block();

            state._fsp--;

            stream_block.add(b32.getTree());
            dbg.location(24,46);
            EQUAL2=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle148);  
            stream_EQUAL.add(EQUAL2);

            dbg.location(24,55);
            pushFollow(FOLLOW_block_in_riddle152);
            b33=block();

            state._fsp--;

            stream_block.add(b33.getTree());
            dbg.location(25,17);
            EQUAL3=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle170);  
            stream_EQUAL.add(EQUAL3);

            dbg.location(25,23);
            EQUAL4=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle172);  
            stream_EQUAL.add(EQUAL4);

            dbg.location(25,29);
            EQUAL5=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle174);  
            stream_EQUAL.add(EQUAL5);

            dbg.location(26,20);
            pushFollow(FOLLOW_block_in_riddle196);
            b51=block();

            state._fsp--;

            stream_block.add(b51.getTree());
            dbg.location(26,31);
            pushFollow(FOLLOW_op_in_riddle200);
            op5=op();

            state._fsp--;

            stream_op.add(op5.getTree());
            dbg.location(26,38);
            pushFollow(FOLLOW_block_in_riddle204);
            b52=block();

            state._fsp--;

            stream_block.add(b52.getTree());
            dbg.location(26,45);
            EQUAL6=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle206);  
            stream_EQUAL.add(EQUAL6);

            dbg.location(26,54);
            pushFollow(FOLLOW_block_in_riddle210);
            b53=block();

            state._fsp--;

            stream_block.add(b53.getTree());

            // AST REWRITE
            // elements: EQUAL, op3, b52, EQUAL, op1, b32, b33, b31, b51, b12, b32, op22, EQUAL, b53, op23, op5, op21, EQUAL, b33, b31, b52, b13, b11, b11, EQUAL, b12, b13, b53, EQUAL, b51
            // token labels: 
            // rule labels: b32, b31, b53, b12, b33, b11, b13, retval, op1, op3, op21, op22, op5, op23, b52, b51
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_b32=new RewriteRuleSubtreeStream(adaptor,"rule b32",b32!=null?b32.tree:null);
            RewriteRuleSubtreeStream stream_b31=new RewriteRuleSubtreeStream(adaptor,"rule b31",b31!=null?b31.tree:null);
            RewriteRuleSubtreeStream stream_b53=new RewriteRuleSubtreeStream(adaptor,"rule b53",b53!=null?b53.tree:null);
            RewriteRuleSubtreeStream stream_b12=new RewriteRuleSubtreeStream(adaptor,"rule b12",b12!=null?b12.tree:null);
            RewriteRuleSubtreeStream stream_b33=new RewriteRuleSubtreeStream(adaptor,"rule b33",b33!=null?b33.tree:null);
            RewriteRuleSubtreeStream stream_b11=new RewriteRuleSubtreeStream(adaptor,"rule b11",b11!=null?b11.tree:null);
            RewriteRuleSubtreeStream stream_b13=new RewriteRuleSubtreeStream(adaptor,"rule b13",b13!=null?b13.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.tree:null);
            RewriteRuleSubtreeStream stream_op3=new RewriteRuleSubtreeStream(adaptor,"rule op3",op3!=null?op3.tree:null);
            RewriteRuleSubtreeStream stream_op21=new RewriteRuleSubtreeStream(adaptor,"rule op21",op21!=null?op21.tree:null);
            RewriteRuleSubtreeStream stream_op22=new RewriteRuleSubtreeStream(adaptor,"rule op22",op22!=null?op22.tree:null);
            RewriteRuleSubtreeStream stream_op5=new RewriteRuleSubtreeStream(adaptor,"rule op5",op5!=null?op5.tree:null);
            RewriteRuleSubtreeStream stream_op23=new RewriteRuleSubtreeStream(adaptor,"rule op23",op23!=null?op23.tree:null);
            RewriteRuleSubtreeStream stream_b52=new RewriteRuleSubtreeStream(adaptor,"rule b52",b52!=null?b52.tree:null);
            RewriteRuleSubtreeStream stream_b51=new RewriteRuleSubtreeStream(adaptor,"rule b51",b51!=null?b51.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 27:17: -> ^( EQUAL ^( $op1 $b11 $b12) $b13) ^( EQUAL ^( $op3 $b31 $b32) $b33) ^( EQUAL ^( $op5 $b51 $b52) $b53) ^( EQUAL ^( $op21 $b11 $b31) $b51) ^( EQUAL ^( $op22 $b12 $b32) $b52) ^( EQUAL ^( $op23 $b13 $b33) $b53)
            {
                dbg.location(28,19);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:28:19: ^( EQUAL ^( $op1 $b11 $b12) $b13)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(28,21);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                dbg.location(28,27);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:28:27: ^( $op1 $b11 $b12)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(28,30);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op1.nextNode(), root_2);

                dbg.location(28,35);
                adaptor.addChild(root_2, stream_b11.nextTree());
                dbg.location(28,40);
                adaptor.addChild(root_2, stream_b12.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(28,46);
                adaptor.addChild(root_1, stream_b13.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(29,20);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:29:20: ^( EQUAL ^( $op3 $b31 $b32) $b33)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(29,22);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                dbg.location(29,28);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:29:28: ^( $op3 $b31 $b32)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(29,31);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op3.nextNode(), root_2);

                dbg.location(29,37);
                adaptor.addChild(root_2, stream_b31.nextTree());
                dbg.location(29,43);
                adaptor.addChild(root_2, stream_b32.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(29,50);
                adaptor.addChild(root_1, stream_b33.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(30,21);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:30:21: ^( EQUAL ^( $op5 $b51 $b52) $b53)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(30,23);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                dbg.location(30,29);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:30:29: ^( $op5 $b51 $b52)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(30,32);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op5.nextNode(), root_2);

                dbg.location(30,38);
                adaptor.addChild(root_2, stream_b51.nextTree());
                dbg.location(30,44);
                adaptor.addChild(root_2, stream_b52.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(30,52);
                adaptor.addChild(root_1, stream_b53.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(31,22);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:31:22: ^( EQUAL ^( $op21 $b11 $b31) $b51)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(31,24);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                dbg.location(31,30);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:31:30: ^( $op21 $b11 $b31)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(31,33);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op21.nextNode(), root_2);

                dbg.location(31,40);
                adaptor.addChild(root_2, stream_b11.nextTree());
                dbg.location(31,46);
                adaptor.addChild(root_2, stream_b31.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(31,53);
                adaptor.addChild(root_1, stream_b51.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(32,23);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:32:23: ^( EQUAL ^( $op22 $b12 $b32) $b52)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(32,25);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                dbg.location(32,31);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:32:31: ^( $op22 $b12 $b32)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(32,34);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op22.nextNode(), root_2);

                dbg.location(32,41);
                adaptor.addChild(root_2, stream_b12.nextTree());
                dbg.location(32,46);
                adaptor.addChild(root_2, stream_b32.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(32,53);
                adaptor.addChild(root_1, stream_b52.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(33,24);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:33:24: ^( EQUAL ^( $op23 $b13 $b33) $b53)
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(33,26);
                root_1 = (CommonTree)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                dbg.location(33,32);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:33:32: ^( $op23 $b13 $b33)
                {
                CommonTree root_2 = (CommonTree)adaptor.nil();
                dbg.location(33,35);
                root_2 = (CommonTree)adaptor.becomeRoot(stream_op23.nextNode(), root_2);

                dbg.location(33,42);
                adaptor.addChild(root_2, stream_b13.nextTree());
                dbg.location(33,47);
                adaptor.addChild(root_2, stream_b33.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(33,53);
                adaptor.addChild(root_1, stream_b53.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(34, 16);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "riddle");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "riddle"


    public static class block_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:37:1: block : ( SYMBOL )+ -> ^( BLOCK ( SYMBOL )* ) ;
    public final DSLParser.block_return block() throws RecognitionException {
        DSLParser.block_return retval = new DSLParser.block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token SYMBOL7=null;

        CommonTree SYMBOL7_tree=null;
        RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");

        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:37:7: ( ( SYMBOL )+ -> ^( BLOCK ( SYMBOL )* ) )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:37:10: ( SYMBOL )+
            {
            dbg.location(37,10);
            // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:37:10: ( SYMBOL )+
            int cnt1=0;
            try { dbg.enterSubRule(1);

            loop1:
            do {
                int alt1=2;
                try { dbg.enterDecision(1, decisionCanBacktrack[1]);

                int LA1_0 = input.LA(1);

                if ( (LA1_0==SYMBOL) ) {
                    alt1=1;
                }


                } finally {dbg.exitDecision(1);}

                switch (alt1) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:37:10: SYMBOL
            	    {
            	    dbg.location(37,10);
            	    SYMBOL7=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_block516);  
            	    stream_SYMBOL.add(SYMBOL7);


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt1++;
            } while (true);
            } finally {dbg.exitSubRule(1);}


            // AST REWRITE
            // elements: SYMBOL
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (CommonTree)adaptor.nil();
            // 37:19: -> ^( BLOCK ( SYMBOL )* )
            {
                dbg.location(37,22);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:37:22: ^( BLOCK ( SYMBOL )* )
                {
                CommonTree root_1 = (CommonTree)adaptor.nil();
                dbg.location(37,24);
                root_1 = (CommonTree)adaptor.becomeRoot(
                (CommonTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                dbg.location(37,30);
                // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:37:30: ( SYMBOL )*
                while ( stream_SYMBOL.hasNext() ) {
                    dbg.location(37,30);
                    adaptor.addChild(root_1, 
                    stream_SYMBOL.nextNode()
                    );

                }
                stream_SYMBOL.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(37, 37);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "block"


    public static class op_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:38:1: op : ( ADD | SUB );
    public final DSLParser.op_return op() throws RecognitionException {
        DSLParser.op_return retval = new DSLParser.op_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token set8=null;

        CommonTree set8_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(38, 0);

        try {
            // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:38:4: ( ADD | SUB )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\workspace\\CIP-Aufgabe3\\ANTL\\DSL.g:
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(38,4);
            set8=(Token)input.LT(1);

            if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
                input.consume();
                adaptor.addChild(root_0, 
                (CommonTree)adaptor.create(set8)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                dbg.recognitionException(mse);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(38, 14);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "op");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "op"

    // Delegated rules


 

    public static final BitSet FOLLOW_block_in_riddle68 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_op_in_riddle72 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle76 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle78 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle82 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_op_in_riddle102 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_op_in_riddle109 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_op_in_riddle116 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle137 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_op_in_riddle141 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle146 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle148 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle152 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle170 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle172 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle174 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle196 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_op_in_riddle200 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle204 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle206 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_block516 = new BitSet(new long[]{0x0000000000000202L});

}