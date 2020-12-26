public class Charge                                     //Main class
{
        private final double x,y,z;                     //Instance variables

        public Charge(double c1,double c2,double c3)    //parameterized constructor
        {
                x=c1;
                y=c2;
                z=c3;
        }

        public double potential(double rx,double ry)    //Instance Method
        {
                double kx=1.23;
                double x1=rx-x;
                double x2=ry-y;
                return kx*x1*x2;
        }

        public String toString()                        //Instance method
        {
                return x+"x: "+y+ "y: "+z+ "z: ";
        }

        public static void main(String[] args)          //Main method
        {
                double x=Double.parseDouble(args[0]);
                double y=Double.parseDouble(args[1]);
                Charge charge1=new Charge(1.2,2.3,4.5);
                Charge charge2=new Charge(1.5,2.4,4.9);
                double result1=charge1.potential(x,y);
                double result2=charge2.potential(x,y);
                System.out.println("Result 1 "+result1);
                System.out.println("Result 2 "+result2);
        }
}
