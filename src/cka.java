import jaggl.OpenGL;
import java.awt.Font;
import java.util.Calendar;

final class cka {

   static int a;
   static ta c;
   static int e;
   static int d;
   static Font f;
   static int g;
   static int b;


   static final qta a(int var0, byte[] var1, Object[] var2) {
      ++a;
      if(var1 == null) {
         return null;
      } else {
         try {
            int var3 = 26 % ((35 - var0) / 36);
            return new qta(var1);
         } catch (Exception var4) {
            return null;
         }
      }
   }

   static final String a(int var0, long var1, int var3, boolean var4) {
      ++g;
      Calendar var5;
      if(!var4) {
         ew.a(var1, 9921);
         var5 = ot.b;
      } else {
         sh.a(var1, -87);
         var5 = ot.e;
      }

      int var6 = var5.get(5);
      int var7 = var5.get(2) + 1;
      int var9 = 90 % ((83 - var3) / 35);
      int var8 = var5.get(1);
      int var10 = var5.get(11);
      int var11 = var5.get(12);
      return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var10 / 10 + var10 % 10 + ":" + var11 / 10 + var11 % 10;
   }

   static final void a(int var0, Object[] var1, boolean var2) {
      if(!((boolean[])((boolean[])var1[17]))[26] != !var2) {
         ((boolean[])((boolean[])var1[17]))[26] = var2;
         if(((boolean[])((boolean[])var1[17]))[26] && -1 >= ~((int[])((int[])var1[1]))[23]) {
            OpenGL.glEnable(2912);
         } else {
            OpenGL.glDisable(2912);
         }

         ((int[])((int[])var1[1]))[20] &= -16;
      }

      ++e;
      if(var0 != 20) {
         c = (ta)var1[10];
      }

   }

   static final void a(int var0, Object[] var1, int var2, Object[] var3, int var4) {
      ++b;
      int var5 = qra.a[var0];
      if(null != gba.a((byte)106, var2, var3)) {
         ((int[])((int[])var1[2]))[var5] = var2 | Integer.MIN_VALUE;
         if(var4 == -3631) {
            ni.a(true, var1);
         }
      }
   }

}
