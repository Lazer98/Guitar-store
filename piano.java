package guitars;

public class piano extends instrument{
	private int octave;
	public piano(int price, String company,int octave) {
		super(price, company);
		this.setOctave(octave);
}
	public int getOctave() {
		return octave;
	}
	public void setOctave(int octave) {
		this.octave = octave;
	}

	public int getCode() {
		return code;
	}
	@Override
	public String toString() {
		return "piano [octave=" + octave + ", price=" + price + ", company=" + company + ", code=" + code + "]";
	}
}
