
package inheritance_cir_cly;


public class Clyinder extends Circle {
     protected int len;

     public void setLen(int rad,int len) {
       //  super.setRad(rad);
        this.len = len;
    }

//    @Override
//    public void setRad(int rad) {
//        super.setRad(rad); 
//    }

    
 @Override
    public double Area() {
      
        return len*rad*rad*3.14;
    }

    
   
     
}
