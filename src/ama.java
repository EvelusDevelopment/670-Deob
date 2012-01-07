import jaggl.OpenGL;

final class ama {

   static int g;
   static int f;
   static int b;
   static int d;
   static Object[] c;
   static int a;
   static int e;


   static final Object[] a(int var0, String var1, Object[] var2, Object[] var3) {
      var3[1] = var1;
      var3[0] = var2;
      ++f;
      return var0 > -123?(Object[])null:var3;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Object[] var7) {
      ++b;
      float var8 = 0.35F + (float)var6;
      float var9 = 0.35F + (float)var4;
      float var10 = -1.0F + var8 + (float)var2;
      float var11 = -1.0F + var9 + (float)var0;
      td.a((byte)-125, var7);
      kd.a(3042, var7, var1);
      OpenGL.glColor4ub((byte)(var3 >> 16), (byte)(var3 >> 8), (byte)var3, (byte)(var3 >> 24));
      if(((boolean[])((boolean[])var7[17]))[13]) {
         OpenGL.glDisable('\u809d');
      }

      OpenGL.glBegin(2);
      OpenGL.glVertex2f(var8, var9);
      int var12 = 85 % ((var5 + 72) / 53);
      OpenGL.glVertex2f(var8, var11);
      OpenGL.glVertex2f(var10, var11);
      if(null != var7 && 2 == var7.length && var7[1].equals(Integer.valueOf(1))) {
         uc.b((Object[])null, -127);
      }

      OpenGL.glVertex2f(var10, var9);
      OpenGL.glEnd();
      if(((boolean[])((boolean[])var7[17]))[13]) {
         OpenGL.glEnable('\u809d');
      }

   }

   static final int a(int var0, int var1, int var2, byte var3, int var4, int var5) {
      if(var3 != 84) {
         a((tha)null, (byte)74, (Object[])null);
      }

      ++a;
      if(null == jp.o) {
         return 0;
      } else {
         if(var2 < 3) {
            int var6 = var1 >> 9;
            int var7 = var5 >> 9;
            if(0 > var0 || 0 > var4 || rp.c - 1 < var0 || ~var4 < ~(-1 + wpa.a)) {
               return 0;
            }

            if(1 > var6 || 1 > var7 || -1 + rp.c < var6 || -1 + wpa.a < var7) {
               return 0;
            }

            boolean var8 = 0 != (pd.b[1][var1 >> 9][var5 >> 9] & 2);
            boolean var9;
            boolean var10;
            if(0 == (511 & var1)) {
               var9 = -1 != ~(pd.b[1][var6 - 1][var5 >> 9] & 2);
               var10 = 0 != (2 & pd.b[1][var6][var5 >> 9]);
               if(var9 == !var10) {
                  var8 = (2 & pd.b[1][var0][var4]) != 0;
               }
            }

            if((var5 & 511) == 0) {
               var9 = 0 != (2 & pd.b[1][var1 >> 9][-1 + var7]);
               var10 = (pd.b[1][var1 >> 9][var7] & 2) != 0;
               if(!var9 != !var10) {
                  var8 = -1 != ~(pd.b[1][var0][var4] & 2);
               }
            }

            if(var8) {
               ++var2;
            }
         }

         return jp.o[var2].a(1, var1, var5);
      }
   }

   static final int b(byte var0, Object[] var1) {
      int var2 = 75 % ((6 - var0) / 57);
      ++e;
      return ((int[])((int[])var1[9]))[1];
   }

   static final void a(tha var0, byte var1, Object[] var2) {
      ++d;
      if(null != var0.r) {
         var0.a(8192);
      }

      var0.s = (tha)var2[0];
      var0.r = ((tha)var2[0]).r;
      if(var1 > -76) {
         c = new Object[17];
      }

      var0.r.s = var0;
      var0.s.r = var0;
   }

   static final void a(byte var0, Object[] var1) {
      ++g;
      if(null == var1[1]) {
         var1[1] = new int[1];
      }

      int var2 = -27 % ((-54 - var0) / 51);
   }

}
