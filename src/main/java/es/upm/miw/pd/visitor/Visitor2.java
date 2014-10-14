package es.upm.miw.pd.visitor;

public class Visitor2 extends Visitor{
	
	private int numAs = 0;
	
	private int numBs = 0;

	@Override
	public void visitElementA(ElementA e) {
		this.numAs = numAs+1;		
	}

	@Override
	public void visitElementB(ElementB e) {
		this.numBs= numBs+1;		
	}

	public int getNumAs() {
		return numAs;
	}

	public int getNumBs() {
		return numBs;
	}


}
