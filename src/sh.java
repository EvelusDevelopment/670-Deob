import jaggl.OpenGL;
import java.util.Date;

final class sh {

   static int e;
   static Object[] a = aqa.a(new Object[2], 13);
   static int g;
   static int b;
   static int f;
   static int d;
   static String c = null;


   static final void a(int var0, Object[] var1, Object[] var2) {
      ++g;
      ((int[])((int[])var2[1]))[0] = lr.a(1, var1);
      ((long[])((long[])var2[4]))[0] = Class_i.a(false, var1);
      if(var0 <= 12) {
         a = (Object[])null;
      }

   }

   static final void a(int var0, Object[] var1, boolean var2) {
      ++f;
      OpenGL.glColorMask(-1 != ~(var0 & 1), 0 != (2 & var0), -1 != ~(var0 & 4), 0 != (8 & var0));
      if(var2) {
         a(((long[])((long[])var1[0]))[20], 95);
      }

   }

   static final byte[] a(Object[] var0, byte var1) {
      try {
         if(var1 < 65) {
            a = (Object[])((Object[])a[18]);
         }

         ++b;
         if(null != var0 && 6 == var0.length) {
            if(!((boolean[])((boolean[])var0[0]))[0]) {
               byte[] var2 = (byte[])((byte[])var0[5]);
               return var2;
            } else {
               throw new RuntimeException();
            }
         } else if(null != var0 && var0.length == 5) {
            return vv.a((byte)-28, var0);
         } else {
            throw new IllegalStateException();
         }
      } catch (RuntimeException var3) {
         throw vt.a(var3, "sh.E(" + (var0 != null?"{...}":"null") + ',' + var1 + ')');
      }
   }

   static final void a(int var0, re var1, int var2, Object[] var3) {
      try {
         ++d;
         if(0 == var2) {
            fl var4;
            Object[] var7 = null != (var4 = (fl)var1)?var4.c:null;
            if(null != var3[0] && null != var7 && (~((int[])((int[])var7[1]))[0] != ~((int[])((int[])((Object[])((Object[])var3[0]))[1]))[1] || ((int[])((int[])var7[1]))[1] != ((int[])((int[])((Object[])((Object[])var3[0]))[1]))[0])) {
               throw new RuntimeException();
            } else {
               label59: {
                  var3[4] = var7;
                  if(var7 != null) {
                     ((int[])((int[])var3[1]))[0] = ((int[])((int[])var7[1]))[0];
                     ((int[])((int[])var3[1]))[1] = ((int[])((int[])var7[1]))[1];
                     if(client.f_vb == 0) {
                        break label59;
                     }
                  }

                  if(null == var3[0]) {
                     ((int[])((int[])var3[1]))[0] = 0;
                     ((int[])((int[])var3[1]))[1] = 0;
                  }
               }

               Object[] var6;
               if((null == var3?null:var3[3]) == ((ta)((var6 = (Object[])((Object[])var3[var0])) == null?null:var6[6])).e(30626)) {
                  lba.a(124, var3);
               }

            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var8) {
         throw vt.a(var8, "sh.B(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + var2 + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   static final void a(long var0, int var2) {
      ++e;
      if(var2 >= -79) {
         a(-94L, -1);
      }

      ot.e.setTime(new Date(var0));
   }

}
