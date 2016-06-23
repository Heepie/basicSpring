package org.heepie.Calc;

public class MyCalc {
	private Calc calcurator;
	private int parm1, parm2;
	
	public Calc getCalcurator() {
		return calcurator;
	}
	
	public void setCalcurator(Calc calcurator) {
		this.calcurator = calcurator;
	}
	
	public int getParm1() {
		return parm1;
	}
	
	public void setParm1(int parm1) {
		this.parm1 = parm1;
	}
	
	public int getParm2() {
		return parm2;
	}
	
	public void setParm2(int parm2) {
		this.parm2 = parm2;
	}
	
	public void add() {
		calcurator.add(this.parm1, this.parm2);
	}
	
	public void multi() {
		calcurator.multi(parm1, parm2);
	}
	
	public void div() {
		calcurator.div(parm1, parm2);
	}
	
	public void minus() {
		calcurator.minus(parm1, parm2);
	}
}
