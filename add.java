class Add
{
      public static void main(String[] args)
      {
         int a=10,b=20;
         System.out.println("Before swapping");
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.println("After swapping");
         System.out.println(a);
         System.out.println(b);
       }
}         