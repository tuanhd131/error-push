package Learning;

public class ViDuThis {
	int x;
	int y;

	ViDuThis(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("truoc khi truyen den phuong thuc cong2() ");
		System.out.println("x= " + this.x + " y= " + this.y);
		cong2(this);
		System.out.println("sau khi truyen den phuong thuc cong2()");
		System.out.println("x= " + this.x + " y= " + this.y);
	}

	void cong2(ViDuThis o) {
		o.x += 2;
		o.y += 2;
	}
}
