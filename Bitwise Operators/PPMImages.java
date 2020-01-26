import java.io.File;
import javax.swing.JFileChooser;
public class PPMImages {
	public void hideMessage(String message) {
		JFileChooser jc = new JFileChooser();
		File f = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\pineapple.ppm");
		File f2 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\cat.ppm");
		File f3 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\dog.ppm");
		File f4 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\drink.ppm");
		File f5 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\monalisa.ppm");
		PPMImage ppm = new PPMImage(f);
		PPMImage ppm2 = new PPMImage(f2);
		PPMImage ppm3 = new PPMImage(f3);
		PPMImage ppm4 = new PPMImage(f4);
		PPMImage ppm5 = new PPMImage(f5);
		int a = 0;
		for(int j = 0 ; j < message.length() ; j++) {
			for(int k = 0 ; k >= 0 ; k--) {
				if((((message.charAt(a) & (1 << (k - 1))) == 0))) {
					ppm.getPixelData()[j] &= -1;
				}
				else {
					ppm.getPixelData()[j] |= 1;
				}
			}
			a++;
		}
		int b = 0;
		for(int j = 0 ; j < message.length() ; j++) {
			for(int k = 0 ; k >= 0 ; k--) {
				if((((message.charAt(b) & (1 << (k - 1))) == 0))) {
					ppm2.getPixelData()[j] &= -1;
				}
				else {
					ppm2.getPixelData()[j] |= 1;
				}
			}
			b++;
		}
		int c = 0;
		for(int j = 0 ; j < message.length() ; j++) {
			for(int k = 0 ; k >= 0 ; k--) {
				if((((message.charAt(c) & (1 << (k - 1))) == 0))) {
					ppm3.getPixelData()[j] &= -1;
				}
				else {
					ppm3.getPixelData()[j] |= 1;
				}
			}
			c++;
		}
		int d = 0;
		for(int j = 0 ; j < message.length() ; j++) {
			for(int k = 0 ; k >= 0 ; k--) {
				if((((message.charAt(d) & (1 << (k - 1))) == 0))) {
					ppm4.getPixelData()[j] &= -1;
				}
				else {
					ppm4.getPixelData()[j] |= 1;
				}
			}
			d++;
		}
		int e = 0;
		for(int j = 0 ; j < message.length() ; j++) {
			for(int k = 0 ; k >= 0 ; k--) {
				if((((message.charAt(e) & (1 << (k - 1))) == 0))) {
					ppm5.getPixelData()[j] &= -1;
				}
				else {
					ppm5.getPixelData()[j] |= 1;
				}
			}
			e++;
		}
	}
	public void recoverMessage() {
		File f = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\pineapple.ppm");
		File f2 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\cat.ppm");
		File f3 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\dog.ppm");
		File f4 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\drink.ppm");
		File f5 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\monalisa.ppm");
		PPMImage jar = new PPMImage(f);
		PPMImage jar2 = new PPMImage(f2);
		PPMImage jar3 = new PPMImage(f3);
		PPMImage jar4 = new PPMImage(f4);
		PPMImage jar5 = new PPMImage(f5);
		String k = "";
		recoverMessage(8, k, jar);
		recoverMessage(8, k, jar2);
		recoverMessage(8, k, jar3);
		recoverMessage(8, k, jar4);
		recoverMessage(8, k, jar5);
	}
	@SuppressWarnings("unused")
	public void recoverMessage(int i, String message, PPMImage ppmi) {
		int j = i;
		String mess = "";
		int k = 0;
		String bit = "";
		char t = '1';
		for(int y = 0 ; y < 8 ; y++) {
			if((ppmi.getPixelData()[j] & 1 ) == 0) {
				bit += "0";
			}
			else {
				bit += "1";
			}
			i += 1;
		}
		j++;
		recoverMessage(j, mess, ppmi);
	}
	public void grayscale() {
		File f = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\pineapple.ppm");
		File f2 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\cat.ppm");
		File f3 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\dog.ppm");
		File f4 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\drink.ppm");
		File f5 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\monalisa.ppm");
		PPMImage jar = new PPMImage(f);
		PPMImage jar2 = new PPMImage(f2);
		PPMImage jar3 = new PPMImage(f3);
		PPMImage jar4 = new PPMImage(f4);
		PPMImage jar5 = new PPMImage(f5);
		for(int i = 0 ; i < jar.getPixelData().length ; i +=3) {
			char red = jar.getPixelData()[i];
			char green = jar.getPixelData()[i + 1];
			char blue = jar.getPixelData()[i + 2];
			jar.getPixelData()[i] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			jar.getPixelData()[i + 1] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			jar.getPixelData()[i + 2] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));

			int fn = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			int mx = 255;
			if(fn > mx) {
				fn = mx;
			}
			jar.getPixelData()[i] = (char) fn;
			jar.getPixelData()[i + 1] = (char) fn;
			jar.getPixelData()[i + 2] = (char) fn;
		}
		jar.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\grayscale_pineapple.ppm");
		for(int i = 0 ; i < jar2.getPixelData().length ; i +=3) {
			char red = jar2.getPixelData()[i];
			char green = jar2.getPixelData()[i + 1];
			char blue = jar2.getPixelData()[i + 2];
			jar2.getPixelData()[i] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			jar2.getPixelData()[i + 1] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			jar2.getPixelData()[i + 2] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));

			int fn = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			int mx = 255;
			if(fn > mx) {
				fn = mx;
			}
			jar2.getPixelData()[i] = (char) fn;
			jar2.getPixelData()[i + 1] = (char) fn;
			jar2.getPixelData()[i + 2] = (char) fn;
		}
		jar2.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\grayscale_cat.ppm");
		for(int i = 0 ; i < jar3.getPixelData().length ; i +=3) {
			char red = jar3.getPixelData()[i];
			char green = jar3.getPixelData()[i + 1];
			char blue = jar3.getPixelData()[i + 2];
			jar3.getPixelData()[i] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			jar3.getPixelData()[i + 1] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			jar3.getPixelData()[i + 2] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));

			int fn = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			int mx = 255;
			if(fn > mx) {
				fn = mx;
			}
			jar3.getPixelData()[i] = (char) fn;
			jar3.getPixelData()[i + 1] = (char) fn;
			jar3.getPixelData()[i + 2] = (char) fn;
		}
		jar3.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\grayscale_dog.ppm");
		for(int i = 0 ; i < jar4.getPixelData().length ; i +=3) {
			char red = jar4.getPixelData()[i];
			char green = jar4.getPixelData()[i + 1];
			char blue = jar4.getPixelData()[i + 2];
			jar4.getPixelData()[i] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			jar4.getPixelData()[i + 1] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			jar4.getPixelData()[i + 2] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));

			int fn = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			int mx = 255;
			if(fn > mx) {
				fn = mx;
			}
			jar4.getPixelData()[i] = (char) fn;
			jar4.getPixelData()[i + 1] = (char) fn;
			jar4.getPixelData()[i + 2] = (char) fn;
		}
		jar4.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\grayscale_drink.ppm");
		for(int i = 0 ; i < jar5.getPixelData().length ; i +=3) {
			char red = jar5.getPixelData()[i];
			char green = jar5.getPixelData()[i + 1];
			char blue = jar5.getPixelData()[i + 2];
			jar5.getPixelData()[i] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			jar5.getPixelData()[i + 1] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			jar5.getPixelData()[i + 2] = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));

			int fn = (char) ((red * 0.299) + (green * 0.587) + (blue * 0.114));
			int mx = 255;
			if(fn > mx) {
				fn = mx;
			}
			jar5.getPixelData()[i] = (char) fn;
			jar5.getPixelData()[i + 1] = (char) fn;
			jar5.getPixelData()[i + 2] = (char) fn;
		}
		jar5.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\grayscale_monalisa.ppm");
	}
	public void sepia() {
		File f = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\pineapple.ppm");
		File f2 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\cat.ppm");
		File f3 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\dog.ppm");
		File f4 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\drink.ppm");
		File f5 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\monalisa.ppm");
		PPMImage jar = new PPMImage(f);
		PPMImage jar2 = new PPMImage(f2);
		PPMImage jar3 = new PPMImage(f3);
		PPMImage jar4 = new PPMImage(f4);
		PPMImage jar5 = new PPMImage(f5);
		for(int i = 0 ; i < jar.getPixelData().length ; i +=3) {

			char red = jar.getPixelData()[i];
			char green = jar.getPixelData()[i + 1];
			char blue = jar.getPixelData()[i + 2];
			int fn1 = (char) ((red * 0.393) + (green * 0.769) + (blue * 0.189));
			int fn2 = (char) ((red * 0.349) + (green * 0.686) + (blue * 0.168));
			int fn3 = (char) ((red * 0.272) + (green * 0.534) + (blue * 0.131));
			int mx = 255;
			if(fn1 > mx) {
				fn1 = mx;
			}
			jar.getPixelData()[i] = (char) ((fn1));
			if(fn2 > mx) {
				fn2 = mx;
			}
			jar.getPixelData()[i + 1] = (char) ((fn2));
			if(fn3 > mx) {
				fn3 = mx;
			}
			jar.getPixelData()[i + 2] = (char) ((fn3));
		}
		for(int i = 0 ; i < jar2.getPixelData().length ; i +=3) {

			char red = jar2.getPixelData()[i];
			char green = jar2.getPixelData()[i + 1];
			char blue = jar2.getPixelData()[i + 2];
			int fn1 = (char) ((red * 0.393) + (green * 0.769) + (blue * 0.189));
			int fn2 = (char) ((red * 0.349) + (green * 0.686) + (blue * 0.168));
			int fn3 = (char) ((red * 0.272) + (green * 0.534) + (blue * 0.131));
			int mx = 255;
			if(fn1 > mx) {
				fn1 = mx;
			}
			jar2.getPixelData()[i] = (char) ((fn1));
			if(fn2 > mx) {
				fn2 = mx;
			}
			jar2.getPixelData()[i + 1] = (char) ((fn2));
			if(fn3 > mx) {
				fn3 = mx;
			}
			jar2.getPixelData()[i + 2] = (char) ((fn3));
		}
		for(int i = 0 ; i < jar3.getPixelData().length ; i +=3) {

			char red = jar3.getPixelData()[i];
			char green = jar3.getPixelData()[i + 1];
			char blue = jar3.getPixelData()[i + 2];
			int fn1 = (char) ((red * 0.393) + (green * 0.769) + (blue * 0.189));
			int fn2 = (char) ((red * 0.349) + (green * 0.686) + (blue * 0.168));
			int fn3 = (char) ((red * 0.272) + (green * 0.534) + (blue * 0.131));
			int mx = 255;
			if(fn1 > mx) {
				fn1 = mx;
			}
			jar3.getPixelData()[i] = (char) ((fn1));
			if(fn2 > mx) {
				fn2 = mx;
			}
			jar3.getPixelData()[i + 1] = (char) ((fn2));
			if(fn3 > mx) {
				fn3 = mx;
			}
			jar3.getPixelData()[i + 2] = (char) ((fn3));
		}
		for(int i = 0 ; i < jar4.getPixelData().length ; i +=3) {

			char red = jar4.getPixelData()[i];
			char green = jar4.getPixelData()[i + 1];
			char blue = jar4.getPixelData()[i + 2];
			int fn1 = (char) ((red * 0.393) + (green * 0.769) + (blue * 0.189));
			int fn2 = (char) ((red * 0.349) + (green * 0.686) + (blue * 0.168));
			int fn3 = (char) ((red * 0.272) + (green * 0.534) + (blue * 0.131));
			int mx = 255;
			if(fn1 > mx) {
				fn1 = mx;
			}
			jar4.getPixelData()[i] = (char) ((fn1));
			if(fn2 > mx) {
				fn2 = mx;
			}
			jar4.getPixelData()[i + 1] = (char) ((fn2));
			if(fn3 > mx) {
				fn3 = mx;
			}
			jar4.getPixelData()[i + 2] = (char) ((fn3));
		}
		for(int i = 0 ; i < jar5.getPixelData().length ; i +=3) {

			char red = jar5.getPixelData()[i];
			char green = jar5.getPixelData()[i + 1];
			char blue = jar5.getPixelData()[i + 2];
			int fn1 = (char) ((red * 0.393) + (green * 0.769) + (blue * 0.189));
			int fn2 = (char) ((red * 0.349) + (green * 0.686) + (blue * 0.168));
			int fn3 = (char) ((red * 0.272) + (green * 0.534) + (blue * 0.131));
			int mx = 255;
			if(fn1 > mx) {
				fn1 = mx;
			}
			jar5.getPixelData()[i] = (char) ((fn1));
			if(fn2 > mx) {
				fn2 = mx;
			}
			jar5.getPixelData()[i + 1] = (char) ((fn2));
			if(fn3 > mx) {
				fn3 = mx;
			}
			jar5.getPixelData()[i + 2] = (char) ((fn3));
		}
		jar.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\sepia_pineapple.ppm");
		jar2.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\sepia_cat.ppm");
		jar3.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\sepia_dog.ppm");
		jar4.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\sepia_drink.ppm");
		jar5.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\sepia_monalisa.ppm");
	}
	public void negative() {
		File f = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\pineapple.ppm");
		File f2 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\cat.ppm");
		File f3 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\dog.ppm");
		File f4 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\drink.ppm");
		File f5 = new File("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\monalisa.ppm");
		PPMImage jar = new PPMImage(f);
		PPMImage jar2 = new PPMImage(f2);
		PPMImage jar3 = new PPMImage(f3);
		PPMImage jar4 = new PPMImage(f4);
		PPMImage jar5 = new PPMImage(f5);
		int a = 0;
		for(int j = 0 ; j < jar.getPixelData().length ; j++) {
			jar.getPixelData()[a] = (char) (255 - jar.getPixelData()[a]); 
			a++;
		}
		int b = 0;
		for(int j = 0 ; j < jar2.getPixelData().length ; j++) {
			jar2.getPixelData()[b] = (char) (255 - jar2.getPixelData()[b]); 
			b++;
		}
		int c = 0;
		for(int j = 0 ; j < jar3.getPixelData().length ; j++) {
			jar3.getPixelData()[c] = (char) (255 - jar3.getPixelData()[c]); 
			c++;
		}
		int d = 0;
		for(int j = 0 ; j < jar4.getPixelData().length ; j++) {
			jar4.getPixelData()[d] = (char) (255 - jar4.getPixelData()[d]); 
			d++;
		}
		int e = 0;
		for(int j = 0 ; j < jar5.getPixelData().length ; j++) {
			jar5.getPixelData()[e] = (char) (255 - jar5.getPixelData()[e]); 
			e++;
		}
		jar.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\negative_pineapple.ppm");
		jar2.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\negative_cat.ppm");
		jar3.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\negative_dog.ppm");
		jar4.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\negative_drink.ppm");
		jar5.writeImage("C:\\Users\\Sidgu_000\\workspace\\HW6ppm\\images\\negative_monalisa.ppm");
	}
	public static void main(String[] args) {
		PPMImages j = new PPMImages();
		
		//Takes about 13 minutes to run
		j.negative();     
		j.grayscale();
		j.sepia();
		
//		String message = "bitwise operators\0";
//		j.hideMessage(message);
//		j.recoverMessage();
	}
}