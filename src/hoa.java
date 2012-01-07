import jaggl.OpenGL;

final class hoa extends lm {

   static int f_l;
   static Object[] k = ho.a(4, 76, new Object[1], true);
   Object[] j;


   hoa(Object[] var1) {
      this.j = var1;
   }

   static final void a(int var0, Object[] var1) {
      ++f_l;
      if(var1 != null && var1.length == 87) {
         dsa.a(var0 - 2796, var1);
      } else if(var0 == 2912) {
         if(var1 != null && var1.length == 91) {
            if(((boolean[])((boolean[])var1[63]))[13] && ((boolean[])((boolean[])var1[63]))[4] && -1 >= ~((int[])((int[])var1[1]))[4]) {
               OpenGL.glEnable(2912);
            } else {
               OpenGL.glDisable(2912);
            }

         } else {
            throw new IllegalStateException();
         }
      }
   }

}
