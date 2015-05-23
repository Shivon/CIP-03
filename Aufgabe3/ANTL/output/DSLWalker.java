// $ANTLR 3.4 C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g 2015-05-23 17:59:38
package output;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class DSLWalker extends DebugTreeParser {
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
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


public static final String[] ruleNames = new String[] {
    "invalidRule", "block", "riddle", "exercise"
};

public static final boolean[] decisionCanBacktrack = new boolean[] {
    false, // invalid decision
    false, false
};

 
    public int ruleLevel = 0;
    public int getRuleLevel() { return ruleLevel; }
    public void incRuleLevel() { ruleLevel++; }
    public void decRuleLevel() { ruleLevel--; }
    public DSLWalker(TreeNodeStream input) {
        this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
    }
    public DSLWalker(TreeNodeStream input, int port, RecognizerSharedState state) {
        super(input, state);
        DebugEventSocketProxy proxy =
            new DebugEventSocketProxy(this,port,input.getTreeAdaptor());
        setDebugListener(proxy);
        setTreeNodeStream(new DebugTreeNodeStream(input,proxy));
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

public DSLWalker(TreeNodeStream input, DebugEventListener dbg) {
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

    public String[] getTokenNames() { return DSLWalker.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g"; }


    public static class riddle_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "riddle"
    // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:13:1: riddle : exercise exercise exercise exercise exercise exercise ;
    public final DSLWalker.riddle_return riddle() throws RecognitionException {
        DSLWalker.riddle_return retval = new DSLWalker.riddle_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        DSLWalker.exercise_return exercise1 =null;

        DSLWalker.exercise_return exercise2 =null;

        DSLWalker.exercise_return exercise3 =null;

        DSLWalker.exercise_return exercise4 =null;

        DSLWalker.exercise_return exercise5 =null;

        DSLWalker.exercise_return exercise6 =null;



        try { dbg.enterRule(getGrammarFileName(), "riddle");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(13, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:13:9: ( exercise exercise exercise exercise exercise exercise )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:13:11: exercise exercise exercise exercise exercise exercise
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(13,11);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exercise_in_riddle48);
            exercise1=exercise();

            state._fsp--;

            adaptor.addChild(root_0, exercise1.getTree());

            dbg.location(13,20);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exercise_in_riddle50);
            exercise2=exercise();

            state._fsp--;

            adaptor.addChild(root_0, exercise2.getTree());

            dbg.location(13,29);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exercise_in_riddle52);
            exercise3=exercise();

            state._fsp--;

            adaptor.addChild(root_0, exercise3.getTree());

            dbg.location(13,38);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exercise_in_riddle54);
            exercise4=exercise();

            state._fsp--;

            adaptor.addChild(root_0, exercise4.getTree());

            dbg.location(13,47);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exercise_in_riddle56);
            exercise5=exercise();

            state._fsp--;

            adaptor.addChild(root_0, exercise5.getTree());

            dbg.location(13,56);
            _last = (CommonTree)input.LT(1);
            pushFollow(FOLLOW_exercise_in_riddle58);
            exercise6=exercise();

            state._fsp--;

            adaptor.addChild(root_0, exercise6.getTree());


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(13, 63);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "riddle");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "riddle"


    public static class exercise_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "exercise"
    // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:15:1: exercise : ( ^( EQUAL ^( ADD block block ) block ) | ^( EQUAL ^( SUB bl1= block bl2= block ) bl3= block ) -> ^( EQUAL ^( ADD[\"+\"] $bl3 $bl2) $bl1) );
    public final DSLWalker.exercise_return exercise() throws RecognitionException {
        DSLWalker.exercise_return retval = new DSLWalker.exercise_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree EQUAL7=null;
        CommonTree ADD8=null;
        CommonTree EQUAL12=null;
        CommonTree SUB13=null;
        DSLWalker.block_return bl1 =null;

        DSLWalker.block_return bl2 =null;

        DSLWalker.block_return bl3 =null;

        DSLWalker.block_return block9 =null;

        DSLWalker.block_return block10 =null;

        DSLWalker.block_return block11 =null;


        CommonTree EQUAL7_tree=null;
        CommonTree ADD8_tree=null;
        CommonTree EQUAL12_tree=null;
        CommonTree SUB13_tree=null;
        RewriteRuleNodeStream stream_SUB=new RewriteRuleNodeStream(adaptor,"token SUB");
        RewriteRuleNodeStream stream_EQUAL=new RewriteRuleNodeStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try { dbg.enterRule(getGrammarFileName(), "exercise");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(15, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:15:10: ( ^( EQUAL ^( ADD block block ) block ) | ^( EQUAL ^( SUB bl1= block bl2= block ) bl3= block ) -> ^( EQUAL ^( ADD[\"+\"] $bl3 $bl2) $bl1) )
            int alt1=2;
            try { dbg.enterDecision(1, decisionCanBacktrack[1]);

            int LA1_0 = input.LA(1);

            if ( (LA1_0==EQUAL) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==DOWN) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==ADD) ) {
                        alt1=1;
                    }
                    else if ( (LA1_2==SUB) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        dbg.recognitionException(nvae);
                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    dbg.recognitionException(nvae);
                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                dbg.recognitionException(nvae);
                throw nvae;

            }
            } finally {dbg.exitDecision(1);}

            switch (alt1) {
                case 1 :
                    dbg.enterAlt(1);

                    // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:15:13: ^( EQUAL ^( ADD block block ) block )
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    dbg.location(15,13);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(15,15);
                    _last = (CommonTree)input.LT(1);
                    EQUAL7=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_exercise68); 
                    EQUAL7_tree = (CommonTree)adaptor.dupNode(EQUAL7);


                    root_1 = (CommonTree)adaptor.becomeRoot(EQUAL7_tree, root_1);


                    match(input, Token.DOWN, null); 
                    dbg.location(15,21);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(15,23);
                    _last = (CommonTree)input.LT(1);
                    ADD8=(CommonTree)match(input,ADD,FOLLOW_ADD_in_exercise71); 
                    ADD8_tree = (CommonTree)adaptor.dupNode(ADD8);


                    root_2 = (CommonTree)adaptor.becomeRoot(ADD8_tree, root_2);


                    match(input, Token.DOWN, null); 
                    dbg.location(15,27);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_exercise73);
                    block9=block();

                    state._fsp--;

                    adaptor.addChild(root_2, block9.getTree());

                    dbg.location(15,33);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_exercise75);
                    block10=block();

                    state._fsp--;

                    adaptor.addChild(root_2, block10.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }

                    dbg.location(15,40);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_exercise78);
                    block11=block();

                    state._fsp--;

                    adaptor.addChild(root_1, block11.getTree());


                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    }
                    break;
                case 2 :
                    dbg.enterAlt(2);

                    // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:16:6: ^( EQUAL ^( SUB bl1= block bl2= block ) bl3= block )
                    {
                    dbg.location(16,6);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_1 = _last;
                    CommonTree _first_1 = null;
                    CommonTree root_1 = (CommonTree)adaptor.nil();
                    dbg.location(16,8);
                    _last = (CommonTree)input.LT(1);
                    EQUAL12=(CommonTree)match(input,EQUAL,FOLLOW_EQUAL_in_exercise87);  
                    stream_EQUAL.add(EQUAL12);


                    match(input, Token.DOWN, null); 
                    dbg.location(16,14);
                    _last = (CommonTree)input.LT(1);
                    {
                    CommonTree _save_last_2 = _last;
                    CommonTree _first_2 = null;
                    CommonTree root_2 = (CommonTree)adaptor.nil();
                    dbg.location(16,16);
                    _last = (CommonTree)input.LT(1);
                    SUB13=(CommonTree)match(input,SUB,FOLLOW_SUB_in_exercise90);  
                    stream_SUB.add(SUB13);


                    match(input, Token.DOWN, null); 
                    dbg.location(16,23);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_exercise94);
                    bl1=block();

                    state._fsp--;

                    stream_block.add(bl1.getTree());
                    dbg.location(16,33);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_exercise98);
                    bl2=block();

                    state._fsp--;

                    stream_block.add(bl2.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_1, root_2);
                    _last = _save_last_2;
                    }

                    dbg.location(16,44);
                    _last = (CommonTree)input.LT(1);
                    pushFollow(FOLLOW_block_in_exercise103);
                    bl3=block();

                    state._fsp--;

                    stream_block.add(bl3.getTree());

                    match(input, Token.UP, null); 
                    adaptor.addChild(root_0, root_1);
                    _last = _save_last_1;
                    }


                    // AST REWRITE
                    // elements: EQUAL, bl2, bl1, bl3
                    // token labels: 
                    // rule labels: bl1, bl3, bl2, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_bl1=new RewriteRuleSubtreeStream(adaptor,"rule bl1",bl1!=null?bl1.tree:null);
                    RewriteRuleSubtreeStream stream_bl3=new RewriteRuleSubtreeStream(adaptor,"rule bl3",bl3!=null?bl3.tree:null);
                    RewriteRuleSubtreeStream stream_bl2=new RewriteRuleSubtreeStream(adaptor,"rule bl2",bl2!=null?bl2.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 16:52: -> ^( EQUAL ^( ADD[\"+\"] $bl3 $bl2) $bl1)
                    {
                        dbg.location(16,55);
                        // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:16:55: ^( EQUAL ^( ADD[\"+\"] $bl3 $bl2) $bl1)
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        dbg.location(16,57);
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_EQUAL.nextNode()
                        , root_1);

                        dbg.location(16,63);
                        // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:16:63: ^( ADD[\"+\"] $bl3 $bl2)
                        {
                        CommonTree root_2 = (CommonTree)adaptor.nil();
                        dbg.location(16,65);
                        root_2 = (CommonTree)adaptor.becomeRoot(
                        (CommonTree)adaptor.create(ADD, "+")
                        , root_2);

                        dbg.location(16,75);
                        adaptor.addChild(root_2, stream_bl3.nextTree());
                        dbg.location(16,80);
                        adaptor.addChild(root_2, stream_bl2.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }
                        dbg.location(16,86);
                        adaptor.addChild(root_1, stream_bl1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(17, 3);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "exercise");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "exercise"


    public static class block_return extends TreeRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:19:1: block : ^( BLOCK ( SYMBOL )+ ) ;
    public final DSLWalker.block_return block() throws RecognitionException {
        DSLWalker.block_return retval = new DSLWalker.block_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        CommonTree _first_0 = null;
        CommonTree _last = null;

        CommonTree BLOCK14=null;
        CommonTree SYMBOL15=null;

        CommonTree BLOCK14_tree=null;
        CommonTree SYMBOL15_tree=null;

        try { dbg.enterRule(getGrammarFileName(), "block");
        if ( getRuleLevel()==0 ) {dbg.commence();}
        incRuleLevel();
        dbg.location(19, 0);

        try {
            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:19:8: ( ^( BLOCK ( SYMBOL )+ ) )
            dbg.enterAlt(1);

            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:19:11: ^( BLOCK ( SYMBOL )+ )
            {
            root_0 = (CommonTree)adaptor.nil();


            dbg.location(19,11);
            _last = (CommonTree)input.LT(1);
            {
            CommonTree _save_last_1 = _last;
            CommonTree _first_1 = null;
            CommonTree root_1 = (CommonTree)adaptor.nil();
            dbg.location(19,13);
            _last = (CommonTree)input.LT(1);
            BLOCK14=(CommonTree)match(input,BLOCK,FOLLOW_BLOCK_in_block139); 
            BLOCK14_tree = (CommonTree)adaptor.dupNode(BLOCK14);


            root_1 = (CommonTree)adaptor.becomeRoot(BLOCK14_tree, root_1);


            match(input, Token.DOWN, null); 
            dbg.location(19,19);
            // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:19:19: ( SYMBOL )+
            int cnt2=0;
            try { dbg.enterSubRule(2);

            loop2:
            do {
                int alt2=2;
                try { dbg.enterDecision(2, decisionCanBacktrack[2]);

                int LA2_0 = input.LA(1);

                if ( (LA2_0==SYMBOL) ) {
                    alt2=1;
                }


                } finally {dbg.exitDecision(2);}

                switch (alt2) {
            	case 1 :
            	    dbg.enterAlt(1);

            	    // C:\\Users\\Timo\\Desktop\\CIP3\\Aufgabe3\\ANTL\\DSLWalker.g:19:19: SYMBOL
            	    {
            	    dbg.location(19,19);
            	    _last = (CommonTree)input.LT(1);
            	    SYMBOL15=(CommonTree)match(input,SYMBOL,FOLLOW_SYMBOL_in_block141); 
            	    SYMBOL15_tree = (CommonTree)adaptor.dupNode(SYMBOL15);


            	    adaptor.addChild(root_1, SYMBOL15_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        dbg.recognitionException(eee);

                        throw eee;
                }
                cnt2++;
            } while (true);
            } finally {dbg.exitSubRule(2);}


            match(input, Token.UP, null); 
            adaptor.addChild(root_0, root_1);
            _last = _save_last_1;
            }


            }

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        dbg.location(19, 26);

        }
        finally {
            dbg.exitRule(getGrammarFileName(), "block");
            decRuleLevel();
            if ( getRuleLevel()==0 ) {dbg.terminate();}
        }

        return retval;
    }
    // $ANTLR end "block"

    // Delegated rules


 

    public static final BitSet FOLLOW_exercise_in_riddle48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_exercise_in_riddle50 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_exercise_in_riddle52 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_exercise_in_riddle54 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_exercise_in_riddle56 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_exercise_in_riddle58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_exercise68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ADD_in_exercise71 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_exercise73 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_exercise75 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_exercise78 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EQUAL_in_exercise87 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SUB_in_exercise90 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_block_in_exercise94 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_block_in_exercise98 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_block_in_exercise103 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BLOCK_in_block139 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SYMBOL_in_block141 = new BitSet(new long[]{0x0000000000000208L});

}