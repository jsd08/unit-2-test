public class KillCilantro {

      public static String killCilantro(String t)
      {
         String rw = "";
         int i = 0;
      
         while( i < t.length())
         {
      
            if ( i + 8 <= t.length() && t.substring(i, i+8). equals("cilantro") )
            {
               rw = rw + "parsley";
               i = i + 8;
            
            }
            else
            {
               rw = rw + t.charAt(i);
               i = i + 1;
            }
      }
      return rw;
   }

   public static void main(String args[])
   {
        String s = "Cilantro tasts like soap i dont like it";
        
        String done = killCilantro(s);
        System.out.println(done);
   }
}
      
     
