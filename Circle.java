public class Circle extends Figure{
    double radius;
    final double Pi = 3.1415926536;
    Circle(double A){
        radius=A;
    }
    @Override
    public double perimetr(){
        return 2*Pi*radius;
    }
    @Override
    public double area (){
        return Pi*(radius*radius);
    }

    public String toString(){

        return " " + area() + "; " + perimetr();

    }
    @Override
    public  void printAreaAndPerimetr(){
               System.out.println("Площа круга: "+ area()+ "  Периметр круга: "+perimetr());
            }
}


