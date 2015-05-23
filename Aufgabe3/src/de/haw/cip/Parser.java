package de.haw.cip;

import output.DSLWalker;
import output.DSLLexer;
import output.DSLParser;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;

class Parser {
	public static void main(String args[]) throws Exception {
		DSLLexer lex = new DSLLexer(new ANTLRFileStream("/Users/Timo/workspace/CIP-Aufgabe3/ANTL/test.txt", "UTF8"));
		CommonTokenStream tokens = new CommonTokenStream(lex);
		
		DSLParser parser = new DSLParser(tokens);
		DSLParser.riddle_return r = parser.riddle();
		
		CommonTree walkerTree = (CommonTree) r.getTree();
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(walkerTree);
		DSLWalker walker = new DSLWalker(nodes);
		walker.riddle();
		
		
		/*
		CommonTreeNodeStream nodes = new CommonTreeNodeStream(r.getTree());
		DSLWalker walker = new DSLWalker(nodes);

		try {
			CommonTree walkerTree = (CommonTree) walker.riddle().getTree();
			DOTTreeGenerator gen = new DOTTreeGenerator();
			StringTemplate walkerTemplate = gen.toDOT(walkerTree);
			System.out.println(walkerTemplate);
		} catch (RecognitionException e) {
			e.printStackTrace();
		}
		
		*/
	}
}