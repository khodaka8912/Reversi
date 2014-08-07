package info.kenshu.reversi;

public class Board {
	private DiskMap diskMap_;
	private static final int[] DIR = {
		-9, -8, -7,
		-1,      1,
		 7,  8,  9
	};
	
	public Board() {
		diskMap_ = new DiskMap();
	}
	
	public void setAndReverse(Side side, int x, int y) {
		diskMap_.setDisk(side, x, y);
		for (int dir : DIR) {
			diskMap_.setNow(x,y);
			diskMap_.setDir(dir);
			if (diskMap_.hasNext()) {
				Disk next = diskMap_.next();
				if (side != next.getSide()) {
					
				}
			}
		}
		
	}
	
	
//	public boolean checkReverse(int x, int y) {
//
//	}
	
}
