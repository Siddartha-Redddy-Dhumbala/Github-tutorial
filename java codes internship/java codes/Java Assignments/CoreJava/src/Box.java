
class Box
{
    double width, height, depth;
  
    
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
  
   
    Box()
    {
        width = height = depth = 0;
    }
}
     class BoxOne
    {
        public static void main(String args[])
        {
          
            Box mybox1 = new Box(10, 20, 15);
            Box mybox2 = new Box();
        }
    }