
final class cd extends lm {

   static int q;
   Object[] m;
   static int s;
   static int o;
   private static char[] f_l = new char[64];
   static int k;
   static String r;
   static int n;
   static int p;
   static String j;


   static final void a(int var0, int[] var1, Object[] var2, int var3, int var4, Object[] var5, int var6) {
      if(var6 > -39) {
         f_l = (char[])null;
      }

      ++o;
      if((((int[])((int[])((Object[])((Object[])var2[3]))[9]))[((int[])((int[])var5[1]))[3]] & 4) != 0 && ((int[])((int[])var5[1]))[13] < 0) {
         int var7 = ((int[])((int[])((Object[])((Object[])var2[3]))[23]))[((int[])((int[])var5[1]))[3]] / mc.a;

         while(true) {
            int var8 = (-((int[])((int[])var5[1]))[1] + 1048575 + var7) / var7;
            if(var8 > var3) {
               ((int[])((int[])var5[1]))[1] += var3 * var7;
               if(var2 != null && var2.length == 5) {
                  fsa.a((Object[])null, (int[])null, -99, true, -38);
               }
               break;
            }

            ((on)var5[0]).b(var1, var0, var8);
            var0 += var8;
            var3 -= var8;
            ((int[])((int[])var5[1]))[1] += -1048576 + var8 * var7;
            int var9 = mc.a / 100;
            int var10 = 262144 / var7;
            if(var9 > var10) {
               var9 = var10;
            }

            on var11 = (on)var5[0];
            if(null != var5 && 12 == var5.length) {
               a(75, (int[])null, (Object[])null, -22, -16, (Object[])null, -62);
            }

            if(-1 != ~((int[])((int[])((Object[])((Object[])var2[3]))[20]))[((int[])((int[])var5[1]))[3]]) {
               var5[0] = on.a((hb)var5[3], var11.f(), 0, var11.l());
               vv.a(var5, 112, ((short[])((short[])((Object[])((Object[])var5[5]))[3]))[((int[])((int[])var5[1]))[16]] < 0, (Object[])((Object[])var2[3]));
               ((on)var5[0]).c(var9, var11.g());
            } else {
               var5[0] = on.a((hb)var5[3], var11.f(), var11.g(), var11.l());
            }

            if(((short[])((short[])((Object[])((Object[])var5[5]))[3]))[((int[])((int[])var5[1]))[16]] < 0) {
               ((on)var5[0]).e(-1);
            }

            var11.c(var9);
            var11.b(var1, var0, var4 + -var0);
            if(var11.h()) {
               ((jua)var2[2]).a((kp)var11);
            }
         }
      }

      ((on)var5[0]).b(var1, var0, var3);
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      Object[][] var7 = gqa.b;
      if(var0 != -1) {
         a(-116, -110, (Object[])null);
      }

      for(int var8 = 0; ~var8 > ~var7.length; ++var8) {
         Object[] var9 = var7[var8];
         if(var9 != null && ((int[])((int[])var9[0]))[9] == 2) {
            int var10 = ((int[])((int[])var9[0]))[3];
            int var11 = ((int[])((int[])var9[0]))[8];
            int var12 = ((int[])((int[])var9[0]))[2];
            int var13 = 2 * ((int[])((int[])var9[0]))[7];
            wb.a(false, var12, 0, (byte)-39, var13, var10, var11);
            if(og.a[0] > -1.0F && -11 < ~(kda.d % 20)) {
               cga var14 = wfa.d[((int[])((int[])var9[0]))[4]];
               int var15 = (int)(-12.0F + og.a[0] + (float)var3);
               int var16 = (int)(-28.0F + og.a[1] + (float)var6);
               var14.a(var15, var16);
            }
         }
      }

      ++q;
   }

   cd(Object[] var1) {
      this.m = var1;
   }

   static final void a(int var0, int var1, Object[] var2) {
      ++s;
      ((int[])((int[])((Object[])((Object[])var2[5]))[1]))[17] -= var0;
      ((int[])((int[])((Object[])((Object[])var2[var1]))[1]))[17] += joa.a(var2, (int)3);
   }

   static final float a(int var0, Object[] var1) {
      if(var0 != -20710) {
         a(-65, ((int[])((int[])var1[10]))[9], 60, -36, ((int[])((int[])var1[0]))[10], 57, -105);
      }

      ++k;
      return (-((float[])((float[])var1[0]))[15] + ((float[])((float[])var1[0]))[14]) / (((float[])((float[])var1[0]))[11] - ((float[])((float[])var1[0]))[10]);
   }

   static {
      int var0;
      for(var0 = 0; var0 < 26; ++var0) {
         f_l[var0] = (char)(65 + var0);
      }

      for(var0 = 26; 52 > var0; ++var0) {
         f_l[var0] = (char)(-26 + var0 + 97);
      }

      for(var0 = 52; var0 < 62; ++var0) {
         f_l[var0] = (char)(-52 + 48 + var0);
      }

      f_l[62] = 43;
      f_l[63] = 47;
      n = 1;
      r = "</col>";
      j = "127.0.0.1";
   }
}
