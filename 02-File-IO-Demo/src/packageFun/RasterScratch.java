package packageFun;

public class RasterScratch {

	public static void main(String[] args) {
		
		char [] xbits = {0x50,0x00,0x00,0xA0,0x57,0x21,0x42,0x09};
		


		for (int y = 0; y < xbits.length; y++) {
			StringBuilder mybits = new StringBuilder(Integer.toBinaryString(xbits[y]));
			
			while(mybits.length() < 8) {
				mybits.insert(0, '0');
			}
			for(int p = 0; p < 8; p++) {
				System.out.print(mybits.charAt(p) == '1' ?'X':' ');
			}
		}
	}

}
