
public class Fraction {
	private String num;
	private String deno;
	public Fraction(String num, String deno) {
		this.num = num;
        this.deno = deno;
    }

	public String toString() {
        return num + "/"+ deno ; 
    }
	
}
