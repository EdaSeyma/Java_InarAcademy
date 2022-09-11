
public class CoordinateRectangle {

	public static void main(String[] args) {
   int x=50;
   int y=100;
   
   if(x==50 || x==-50) {
	   
	   y= (int)(Math.random()*100-50);
   }
   if(y==100 || y==-100) {
	   y= (int)(Math.random()*200-100);
   }
   
   System.out.println("x y"+ x +" "+y);
	}
	


}
