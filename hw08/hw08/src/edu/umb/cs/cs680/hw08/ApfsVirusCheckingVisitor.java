package edu.umb.cs.cs680.hw08;

public class ApfsVirusCheckingVisitor implements FSVisitor {
	
	private int quarantined = 0;
		
	@Override
	public void visit(ApfsLink link) {
		return;	
	}

	@Override
	public void visit(ApfsDirectory dir) {
		return;
	}
	
	@Override
	public void visit(ApfsFile file) {
		if (file.getName().contains("virus")) {
			quarantined++;
		}
	}
	
	public int getQuarantinedNum() {
		return quarantined;
	}
}