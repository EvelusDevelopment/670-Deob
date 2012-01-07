import jaggl.OpenGL;

final class wma {

   static int a;
   static int d;
   static int[] e;
   static int b;
   static int c;
   static Object[] f = fra.a(0, (byte)-120, new Object[1]);


   static final void a(Object[] var0, int var1) {
      ++b;
      if(var1 == 5) {
         if(null == var0[1]) {
            var0[1] = new int[5];
         }

      }
   }

   static final void a(int var0, int var1, int var2, byte var3) {
      ++c;
      var2 = var2 * hba.a((Object[])((Object[])tu.d[26]), 0) >> 8;
      if(var0 == -1 && !qk.d) {
         ht.a(true);
      } else if(-1 != var0) {
         label32: {
            if(var0 == si.b) {
               boolean var4;
               if(0 == dl.d) {
                  var4 = oc.c(-69, qs.h);
               } else {
                  var4 = true;
               }

               if(var4) {
                  break label32;
               }
            }

            if(var2 != 0 && !qk.d) {
               rf.a(var1, vra.d, var0, 0, (byte)-59, false, var2);
               ac.a((byte)-93);
            }
         }
      }

      int var5 = -40 % ((var3 - 45) / 48);
      if(var0 != si.b) {
         br.j = null;
      }

      si.b = var0;
   }

   static final void a(int var0, Object[] var1, boolean var2) {
      ++a;
      if(!var2 != !((boolean[])((boolean[])var1[17]))[30]) {
         if(var2) {
            OpenGL.glEnable(2929);
         } else {
            OpenGL.glDisable(2929);
         }

         ((int[])((int[])var1[1]))[20] &= -16;
         ((boolean[])((boolean[])var1[17]))[30] = var2;
      }

      if(var0 != -1000) {
         a((Object[])((Object[])var1[3]), 15);
      }

   }

   static final int a(int var0) {
      if(var0 != 5) {
         a(((int[])((int[])f[17]))[37], (Object[])null, true);
      }

      ++d;
      return gg.c++;
   }

}
