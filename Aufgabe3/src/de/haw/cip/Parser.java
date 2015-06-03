package de.haw.cip;

import output.DSLWalker;
import output.DSLLexer;
import output.DSLParser;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

class Parser {
	
	 private static final int DEBUGGER_PORT = 48000; 
	
	public static void main(String args[]) throws Exception {
		// /Users/aau759/Desktop/CIP33/Aufgabe3/ANTL/test.txt
		// /Users/KamikazeOnRoad/GitHub/CIP-03/Aufgabe3/ANTL/test.txt
		DSLLexer lex = new DSLLexer(new ANTLRFileStream("/Users/KamikazeOnRoad/GitHub/CIP-03/Aufgabe3/ANTL/test.txt", "UTF8"));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		
		//default
		DSLParser parser = new DSLParser(tokens);
		
		//run at port DEBUGGER_PORT
		//DSLParser parser = new DSLParser(tokens, DEBUGGER_PORT,new RecognizerSharedState()); 
		
		DSLParser.riddle_return r = parser.riddle();
		
		CommonTree walkerTree = (CommonTree) r.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(walkerTree);
		DSLWalker walker = new DSLWalker(nodes);
		walker.riddle();
		
	
	}
}