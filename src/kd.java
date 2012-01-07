import jaggl.OpenGL;

final class kd {

   static int c;
   static int e;
   static int d;
   static int a;
   static int b;


   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      var1[0] = bn.a(var1, 9);
      ++e;
      var1[1] = var0;
      int var3 = 22 / ((var2 + 16) / 45);
      return var1;
   }

   static final void a(Object[] var0, int var1) {
      if(var1 == 3) {
         var0[4] = uw.a(new Object[15], (byte)-124);
         ++b;
         var0[7] = null;
      }
   }

   static final boolean b(Object[] var0, int var1) {
      ++a;
      Object[] var2 = vo.E[((int[])((int[])var0[var1]))[2]];
      if(null == var2) {
         return false;
      } else {
         ra.a(1, -1, ((int[])((int[])var0[1]))[2], var2, ru.e, ((int[])((int[])var0[1]))[1]);
         return true;
      }
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++d;
      if(((int[])((int[])var1[1]))[32] != var2) {
         boolean var3;
         boolean var4;
         byte var5;
         if(1 != var2) {
            if(var2 != 2) {
               if(var2 == 128) {
                  var4 = true;
                  var5 = 3;
                  var3 = true;
               } else {
                  var4 = false;
                  var5 = 0;
                  var3 = true;
               }
            } else {
               var5 = 2;
               var4 = false;
               var3 = true;
            }
         } else {
            var5 = 1;
            var3 = true;
            var4 = true;
         }

         if(var3 != ((boolean[])((boolean[])var1[17]))[20]) {
            OpenGL.glColorMask(var3, var3, var3, true);
            ((boolean[])((boolean[])var1[17]))[20] = var3;
         }

         if(!((boolean[])((boolean[])var1[17]))[7] != !var4) {
            if(!var4) {
               OpenGL.glDisable(3008);
            } else {
               OpenGL.glEnable(3008);
            }

            ((boolean[])((boolean[])var1[17]))[7] = var4;
         }

         if(((int[])((int[])var1[1]))[3] != var5) {
            if(1 != var5) {
               if(var5 != 2) {
                  if(3 != var5) {
                     OpenGL.glDisable(3042);
                  } else {
                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(774, 1);
                  }
               } else {
                  OpenGL.glEnable(3042);
                  OpenGL.glBlendFunc(1, 1);
               }
            } else {
               OpenGL.glEnable(3042);
               OpenGL.glBlendFunc(770, 771);
            }

            ((int[])((int[])var1[1]))[3] = var5;
         }

         ((int[])((int[])var1[1]))[20] &= -13;
         ((int[])((int[])var1[1]))[32] = var2;
      }

      if(var0 != 3042) {
         c = ((int[])((int[])var1[4]))[0];
      }

   }

}
