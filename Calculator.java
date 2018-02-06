public class Calculator {
	privete int result;

	public viod add(int ... params){
		for (Integer param : params) {	
			this.result += param;
			}
		}
	
	public int getResult() {
		return this.result;
		}
	
	public void cleanResult() {
		this.result = 0;
	}	
}