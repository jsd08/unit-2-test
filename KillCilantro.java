public class KillCilantro {

      public static string killCilantro(String t)
      {
         String fixed = "";
         int ii = 0;
      
         while( ii < t.length())
         {
      
            if ( ii + 8 <= t.length() && t.substring(ii, ii+8). equals("cilantro") )
            {
               rw = rw + "parsley";
               ii = ii + 8;
            
            }
            else
            {
               rw = rw + t.charAt(ii);
               ii = ii + 1;
            }
      }
      return rw;
   }

   public static void main(String args[])
   {
        String s = "Cilantro tasts like soap i dont like it";
        
        String done = killCilantro(stuff);
        System.out.println(done);
   }
}
      
     
