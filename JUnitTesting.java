package testing;

public class JUnitTesting {
	public int square(int x){
		return x*x;
	}
	
	public int countA(String word){
		int count = 0;
		for(int i = 0; i < word.length(); i++){
			if(word.charAt(i)=='a' || word.charAt(i)=='A'){
				count++;
			}
		}
		return count;
	}
}










/*
Java Collections (one each of Map, List, Set, Tree) Addition, Removal, using Iterators.
JSON Serialization
HTTP URLConnection
JUnit Tests- Done
Threads, Executors, Runnables, Handlers
Model View Controller Pattern
Application Controller Pattern
Client and Server Sockets
Hibernate
Use Case Diagram
Use Case Document
State Diagram
Sequence Diagram
Class Diagram
Activity Diagram */