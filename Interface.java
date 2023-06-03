import java.util.*;


interface Shape{
  void getArea();
  void getPerimeter();
  }
  
 class Circle implements Shape{
 
   int r;
   
   public Circle(int r){
    this.r=r;
   }
   
   public void getArea(){
    System.out.println("");
    System.out.println("Area of circle="+(3.14*r*r));
   }
   
   public void getPerimeter(){
     System.out.println("");
    System.out.println("Perimeter of circle="+(2*3.14*r));
   }
 }
 
 class Rectangle implements Shape{
 
  int length;
  int width;
  
  public Rectangle(int length,int width){
   
   this.length=length;
   this.width=width;
  
  }
  
  public void getArea(){
  
   System.out.println(" ");
   System.out.println("Area of rectangle:"+(length*width));
  
  }
  
  public void getPerimeter(){
  
   System.out.println(" ");
   System.out.println("Perimeter of rectangle:"+(2*(length*width)));
  
  }
 
 }
 
 
 class Interface{
  
  public static void main(String[] args){
   
		
		Scanner input = new Scanner(System.in);
		
		int ch;
		int radius,length,width;
				
		
		while(true) {
		        System.out.println("1.Circle- Area and Perimeter\n2.Rectangle- Area and Perimeter\n3.Exit");
		
			System.out.println(" ");
			System.out.print("Enter your choice: ");
			ch = input.nextInt();
			
			switch (ch) {
			case 1: {
				System.out.print("Enter Radious of circle: ");
				radius = input.nextInt();
				Shape c = new Circle(radius);
				c.getArea();
				c.getPerimeter();
				break;
			}
			
			case 2: {
				System.out.print("Enter length of rectangle: ");
				length = input.nextInt();
				
				System.out.print("Enter width of rectangle: ");
				width = input.nextInt();
				Shape r = new Rectangle(length,width);
				r.getArea();
				r.getPerimeter();
				break;
			}
			
			case 3: {
			        System.exit(0);
				break;
			}
			
			default:
				System.out.println("Invalid choice");
			}
		}
  }
  
 }
