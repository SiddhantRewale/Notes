class Shape{
	 private int width,height;
	
	 public void setWidth(int width) {
		 this.width=width;
	 }
	 public int getWidth() {
		 return width;
	 }
	 
	 public void setHeight(int height) {
		 this.height=height;
	 }
	 public int getHeight() {
		 return height;
	 }
}
public class Demo {
	public static void main(String[] args) {
		Shape s1=new Shape();
		s1.setWidth(3);
		s1.setHeight(5);
		System.out.println(s1.getWidth()+"\t"+s1.getHeight());
	}

}
