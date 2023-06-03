class Product{
  int p_code;
  String p_name;
  int p_price;
 Product(int pc,String pn,int pr){
  p_code = pc;
  p_name = pn;
  p_price = pr;
 }

 void display(){
  System.out.println("Product name:"+p_name+"\n"+"Product code:"+p_code+"\n"+"Product Price:"+p_price);
  System.out.println("\n");
  }
 }

class Program1{
 public static void main(String args[]){
 Product p1 = new Product(100,"Apple",250);
 p1.display();
 Product p2 = new Product(101,"Orange",200);
 p2.display();
 Product p3 = new Product(102,"Grapes",150);
 p3.display();
 
  if(p1.p_price < p2.p_price && p1.p_price < p3.p_price ){
   System.out.println("Product 1 is having the lowest price");
   }
   else if(p2.p_price < p1.p_price && p2.p_price < p3.p_price ){
   System.out.println("Product 2 is having the lowest price");
   }
  else{
   System.out.println("Product 3 is having the lowest price");
  }
 }
 }
