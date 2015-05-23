// $ANTLR 3.4 C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g 2015-05-23 17:36:37
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
    "invalidRule", "block", "riddle", "op"
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
    public String getGrammarFileName() { return "C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g"; }


    public static class riddle_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "riddle"
    // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:19:1: riddle : opr00= block op1= op opr01= block '=' opr02= block op2= op op3= op op4= op opr10= block op5= op opr11= block '=' opr12= block EQUAL EQUAL EQUAL opr20= block op6= op opr21= block '=' opr22= block EOF -> ^( EQUAL ^( $op1 $opr00 $opr01) $opr02) ^( EQUAL ^( $op5 $opr10 $opr11) $opr12) ^( EQUAL ^( $op6 $opr20 $opr21) $opr22) ^( EQUAL ^( $op2 $opr00 $opr10) $opr20) ^( EQUAL ^( $op3 $opr01 $opr11) $opr21) ^( EQUAL ^( $op4 $opr02 $opr12) $opr22) ;
    public final DSLParser.riddle_return riddle() throws RecognitionException {
        DSLParser.riddle_return retval = new DSLParser.riddle_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal1=null;
        Token char_literal2=null;
        Token EQUAL3=null;
        Token EQUAL4=null;
        Token EQUAL5=null;
        Token char_literal6=null;
        Token EOF7=null;
        DSLParser.block_return opr00 =null;

        DSLParser.op_return op1 =null;

        DSLParser.block_return opr01 =null;

        DSLParser.block_return opr02 =null;

        DSLParser.op_return op2 =null;

        DSLParser.op_return op3 =null;

        DSLParser.op_return op4 =null;

        DSLParser.block_return opr10 =null;

        DSLParser.op_return op5 =null;

        DSLParser.block_return opr11 =null;

        DSLParser.block_return opr12 =null;

        DSLParser.block_return opr20 =null;

        DSLParser.op_return op6 =null;

        DSLParser.block_return opr21 =null;

        DSLParser.block_return opr22 =null;


        Object char_literal1_tree=null;
        Object char_literal2_tree=null;
        Object EQUAL3_tree=null;
        Object EQUAL4_tree=null;
        Object EQUAL5_tree=null;
        Object char_literal6_tree=null;
        Object EOF7_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_op=new RewriteRuleSubtreeStream(adaptor,"rule op");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try { dbg.enterRule(getGrammarFileName(), "riddle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:19:8: (opr00= block op1= op opr01= block '=' opr02= block op2= op op3= op op4= op opr10= block op5= op opr11= block '=' opr12= block EQUAL EQUAL EQUAL opr20= block op6= op opr21= block '=' opr22= block EOF -> ^( EQUAL ^( $op1 $opr00 $opr01) $opr02) ^( EQUAL ^( $op5 $opr10 $opr11) $opr12) ^( EQUAL ^( $op6 $opr20 $opr21) $opr22) ^( EQUAL ^( $op2 $opr00 $opr10) $opr20) ^( EQUAL ^( $op3 $opr01 $opr11) $opr21) ^( EQUAL ^( $op4 $opr02 $opr12) $opr22) )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:19:10: opr00= block op1= op opr01= block '=' opr02= block op2= op op3= op op4= op opr10= block op5= op opr11= block '=' opr12= block EQUAL EQUAL EQUAL opr20= block op6= op opr21= block '=' opr22= block EOF
            {
            dbg.location(19,15);
            pushFollow(FOLLOW_block_in_riddle59);
            opr00=block();

            state._fsp--;

            stream_block.add(opr00.getTree());
            dbg.location(19,26);
            pushFollow(FOLLOW_op_in_riddle64);
            op1=op();

            state._fsp--;

            stream_op.add(op1.getTree());
            dbg.location(19,35);
            pushFollow(FOLLOW_block_in_riddle68);
            opr01=block();

            state._fsp--;

            stream_block.add(opr01.getTree());
            dbg.location(19,42);
            char_literal1=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle70);  
            stream_EQUAL.add(char_literal1);

            dbg.location(19,51);
            pushFollow(FOLLOW_block_in_riddle74);
            opr02=block();

            state._fsp--;

            stream_block.add(opr02.getTree());
            dbg.location(20,6);
            pushFollow(FOLLOW_op_in_riddle81);
            op2=op();

            state._fsp--;

            stream_op.add(op2.getTree());
            dbg.location(20,13);
            pushFollow(FOLLOW_op_in_riddle85);
            op3=op();

            state._fsp--;

            stream_op.add(op3.getTree());
            dbg.location(20,22);
            pushFollow(FOLLOW_op_in_riddle91);
            op4=op();

            state._fsp--;

            stream_op.add(op4.getTree());
            dbg.location(21,8);
            pushFollow(FOLLOW_block_in_riddle98);
            opr10=block();

            state._fsp--;

            stream_block.add(opr10.getTree());
            dbg.location(21,19);
            pushFollow(FOLLOW_op_in_riddle103);
            op5=op();

            state._fsp--;

            stream_op.add(op5.getTree());
            dbg.location(21,28);
            pushFollow(FOLLOW_block_in_riddle107);
            opr11=block();

            state._fsp--;

            stream_block.add(opr11.getTree());
            dbg.location(21,35);
            char_literal2=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle109);  
            stream_EQUAL.add(char_literal2);

            dbg.location(21,44);
            pushFollow(FOLLOW_block_in_riddle113);
            opr12=block();

            state._fsp--;

            stream_block.add(opr12.getTree());
            dbg.location(22,4);
            EQUAL3=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle119);  
            stream_EQUAL.add(EQUAL3);

            dbg.location(22,17);
            EQUAL4=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle128);  
            stream_EQUAL.add(EQUAL4);

            dbg.location(22,31);
            EQUAL5=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle138);  
            stream_EQUAL.add(EQUAL5);

            dbg.location(23,8);
            pushFollow(FOLLOW_block_in_riddle144);
            opr20=block();

            state._fsp--;

            stream_block.add(opr20.getTree());
            dbg.location(23,19);
            pushFollow(FOLLOW_op_in_riddle149);
            op6=op();

            state._fsp--;

            stream_op.add(op6.getTree());
            dbg.location(23,28);
            pushFollow(FOLLOW_block_in_riddle153);
            opr21=block();

            state._fsp--;

            stream_block.add(opr21.getTree());
            dbg.location(23,35);
            char_literal6=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_riddle155);  
            stream_EQUAL.add(char_literal6);

            dbg.location(23,44);
            pushFollow(FOLLOW_block_in_riddle159);
            opr22=block();

            state._fsp--;

            stream_block.add(opr22.getTree());
            dbg.location(24,3);
            EOF7=(Token)match(input,EOF,FOLLOW_EOF_in_riddle164);  
            stream_EOF.add(EOF7);


            // AST REWRITE
            // elements: opr11, opr20, EQUAL, opr00, opr20, op3, opr02, EQUAL, opr21, op6, opr22, EQUAL, opr10, op5, op2, opr21, opr12, opr11, op4, EQUAL, EQUAL, opr22, opr01, opr02, opr00, EQUAL, op1, opr10, opr12, opr01
            // token labels: 
            // rule labels: opr21, opr10, opr11, opr00, opr22, opr12, opr01, opr02, retval, op2, op1, op4, op3, op6, op5, opr20
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_opr21=new RewriteRuleSubtreeStream(adaptor,"rule opr21",opr21!=null?opr21.tree:null);
            RewriteRuleSubtreeStream stream_opr10=new RewriteRuleSubtreeStream(adaptor,"rule opr10",opr10!=null?opr10.tree:null);
            RewriteRuleSubtreeStream stream_opr11=new RewriteRuleSubtreeStream(adaptor,"rule opr11",opr11!=null?opr11.tree:null);
            RewriteRuleSubtreeStream stream_opr00=new RewriteRuleSubtreeStream(adaptor,"rule opr00",opr00!=null?opr00.tree:null);
            RewriteRuleSubtreeStream stream_opr22=new RewriteRuleSubtreeStream(adaptor,"rule opr22",opr22!=null?opr22.tree:null);
            RewriteRuleSubtreeStream stream_opr12=new RewriteRuleSubtreeStream(adaptor,"rule opr12",opr12!=null?opr12.tree:null);
            RewriteRuleSubtreeStream stream_opr01=new RewriteRuleSubtreeStream(adaptor,"rule opr01",opr01!=null?opr01.tree:null);
            RewriteRuleSubtreeStream stream_opr02=new RewriteRuleSubtreeStream(adaptor,"rule opr02",opr02!=null?opr02.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_op2=new RewriteRuleSubtreeStream(adaptor,"rule op2",op2!=null?op2.tree:null);
            RewriteRuleSubtreeStream stream_op1=new RewriteRuleSubtreeStream(adaptor,"rule op1",op1!=null?op1.tree:null);
            RewriteRuleSubtreeStream stream_op4=new RewriteRuleSubtreeStream(adaptor,"rule op4",op4!=null?op4.tree:null);
            RewriteRuleSubtreeStream stream_op3=new RewriteRuleSubtreeStream(adaptor,"rule op3",op3!=null?op3.tree:null);
            RewriteRuleSubtreeStream stream_op6=new RewriteRuleSubtreeStream(adaptor,"rule op6",op6!=null?op6.tree:null);
            RewriteRuleSubtreeStream stream_op5=new RewriteRuleSubtreeStream(adaptor,"rule op5",op5!=null?op5.tree:null);
            RewriteRuleSubtreeStream stream_opr20=new RewriteRuleSubtreeStream(adaptor,"rule opr20",opr20!=null?opr20.tree:null);

            root_0 = (Object)adaptor.nil();
            // 26:3: -> ^( EQUAL ^( $op1 $opr00 $opr01) $opr02) ^( EQUAL ^( $op5 $opr10 $opr11) $opr12) ^( EQUAL ^( $op6 $opr20 $opr21) $opr22) ^( EQUAL ^( $op2 $opr00 $opr10) $opr20) ^( EQUAL ^( $op3 $opr01 $opr11) $opr21) ^( EQUAL ^( $op4 $opr02 $opr12) $opr22)
            {
                dbg.location(27,4);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:27:4: ^( EQUAL ^( $op1 $opr00 $opr01) $opr02)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(27,6);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                dbg.location(27,12);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:27:12: ^( $op1 $opr00 $opr01)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(27,15);
                root_2 = (Object)adaptor.becomeRoot(stream_op1.nextNode(), root_2);

                dbg.location(27,20);
                adaptor.addChild(root_2, stream_opr00.nextTree());
                dbg.location(27,27);
                adaptor.addChild(root_2, stream_opr01.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(27,35);
                adaptor.addChild(root_1, stream_opr02.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(28,4);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:28:4: ^( EQUAL ^( $op5 $opr10 $opr11) $opr12)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(28,6);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                dbg.location(28,12);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:28:12: ^( $op5 $opr10 $opr11)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(28,15);
                root_2 = (Object)adaptor.becomeRoot(stream_op5.nextNode(), root_2);

                dbg.location(28,20);
                adaptor.addChild(root_2, stream_opr10.nextTree());
                dbg.location(28,27);
                adaptor.addChild(root_2, stream_opr11.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(28,35);
                adaptor.addChild(root_1, stream_opr12.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(29,4);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:29:4: ^( EQUAL ^( $op6 $opr20 $opr21) $opr22)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(29,6);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                dbg.location(29,12);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:29:12: ^( $op6 $opr20 $opr21)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(29,15);
                root_2 = (Object)adaptor.becomeRoot(stream_op6.nextNode(), root_2);

                dbg.location(29,20);
                adaptor.addChild(root_2, stream_opr20.nextTree());
                dbg.location(29,27);
                adaptor.addChild(root_2, stream_opr21.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(29,35);
                adaptor.addChild(root_1, stream_opr22.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(30,4);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:30:4: ^( EQUAL ^( $op2 $opr00 $opr10) $opr20)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(30,6);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                dbg.location(30,12);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:30:12: ^( $op2 $opr00 $opr10)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(30,15);
                root_2 = (Object)adaptor.becomeRoot(stream_op2.nextNode(), root_2);

                dbg.location(30,20);
                adaptor.addChild(root_2, stream_opr00.nextTree());
                dbg.location(30,27);
                adaptor.addChild(root_2, stream_opr10.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(30,35);
                adaptor.addChild(root_1, stream_opr20.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(31,4);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:31:4: ^( EQUAL ^( $op3 $opr01 $opr11) $opr21)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(31,6);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                dbg.location(31,12);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:31:12: ^( $op3 $opr01 $opr11)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(31,15);
                root_2 = (Object)adaptor.becomeRoot(stream_op3.nextNode(), root_2);

                dbg.location(31,20);
                adaptor.addChild(root_2, stream_opr01.nextTree());
                dbg.location(31,27);
                adaptor.addChild(root_2, stream_opr11.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(31,35);
                adaptor.addChild(root_1, stream_opr21.nextTree());

                adaptor.addChild(root_0, root_1);
                }
                dbg.location(32,4);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:32:4: ^( EQUAL ^( $op4 $opr02 $opr12) $opr22)
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(32,6);
                root_1 = (Object)adaptor.becomeRoot(
                stream_EQUAL.nextNode()
                , root_1);

                dbg.location(32,12);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:32:12: ^( $op4 $opr02 $opr12)
                {
                Object root_2 = (Object)adaptor.nil();
                dbg.location(32,15);
                root_2 = (Object)adaptor.becomeRoot(stream_op4.nextNode(), root_2);

                dbg.location(32,20);
                adaptor.addChild(root_2, stream_opr02.nextTree());
                dbg.location(32,27);
                adaptor.addChild(root_2, stream_opr12.nextTree());

                adaptor.addChild(root_1, root_2);
                }
                dbg.location(32,35);
                adaptor.addChild(root_1, stream_opr22.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(33, 1);

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
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:36:1: block : ( SYMBOL )+ -> ^( BLOCK ( SYMBOL )+ ) ;
    public final DSLParser.block_return block() throws RecognitionException {
        DSLParser.block_return retval = new DSLParser.block_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SYMBOL8=null;

        Object SYMBOL8_tree=null;
        RewriteRuleTokenStream stream_SYMBOL=new RewriteRuleTokenStream(adaptor,"token SYMBOL");

        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(36, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:36:7: ( ( SYMBOL )+ -> ^( BLOCK ( SYMBOL )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:36:10: ( SYMBOL )+
            {
            dbg.location(36,10);
            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:36:10: ( SYMBOL )+
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

            	    // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:36:10: SYMBOL
            	    {
            	    dbg.location(36,10);
            	    SYMBOL8=(Token)match(input,SYMBOL,FOLLOW_SYMBOL_in_block308);  
            	    stream_SYMBOL.add(SYMBOL8);


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

            root_0 = (Object)adaptor.nil();
            // 36:19: -> ^( BLOCK ( SYMBOL )+ )
            {
                dbg.location(36,22);
                // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:36:22: ^( BLOCK ( SYMBOL )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                dbg.location(36,24);
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                dbg.location(36,30);
                if ( !(stream_SYMBOL.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_SYMBOL.hasNext() ) {
                    dbg.location(36,30);
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


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(36, 37);

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
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "op"
    // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:37:1: op : ( ADD | SUB );
    public final DSLParser.op_return op() throws RecognitionException {
        DSLParser.op_return retval = new DSLParser.op_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set9=null;

        Object set9_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "op");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(37, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:37:4: ( ADD | SUB )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSL.g:
            {
            root_0 = (Object)adaptor.nil();


            dbg.location(37,4);
            set9=(Token)input.LT(1);

            if ( input.LA(1)==ADD||input.LA(1)==SUB ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set9)
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


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(37, 14);

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


 

    public static final BitSet FOLLOW_block_in_riddle59 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_op_in_riddle64 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle68 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle70 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle74 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_op_in_riddle81 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_op_in_riddle85 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_op_in_riddle91 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle98 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_op_in_riddle103 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle107 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle109 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle113 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle119 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle128 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle138 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle144 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_op_in_riddle149 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle153 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_EQUAL_in_riddle155 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_riddle159 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_riddle164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SYMBOL_in_block308 = new BitSet(new long[]{0x0000000000000202L});

}