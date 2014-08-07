package info.kenshu.reversi;

public class Disk {
	private Side side_;
	
	public Disk(Side side) {
		side_ = side;
	}
	
	public void reverse() {
		side_ = (side_ == Side.BLACK) ? Side.WHITE : Side.BLACK;
	}
	
	public Side getSide() {
		return side_;
	}

}

enum Side {
	BLACK,
	WHITE
}
