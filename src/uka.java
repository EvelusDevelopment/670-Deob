import jaggl.OpenGL;

final class uka {

   static int[] d = new int[200];
   static int g;
   static int c;
   static boolean e = false;
   static Object[] f = rh.a(false, new Object[0]);
   static int a;
   static int b;
   static Object[] h = ed.a(4, new Object[1], (byte)-126, 14);


   static final void a(int var0, int var1, int var2, Object[] var3) {
      ++c;
      synchronized(var3) {
         int var5 = -117 / ((var1 - 61) / 49);
         if(var0 < 0) {
            for(int var6 = 0; 16 > var6; ++var6) {
               ((int[])((int[])var3[13]))[var6] = var2;
            }

            if(null != var3 && -11 == ~var3.length) {
               return;
            }
         } else {
            ((int[])((int[])var3[13]))[var0] = var2;
         }

      }
   }

   static final Object[] a(int var0, int var1, int var2, boolean var3, int var4, Object[] var5, int var6, int[] var7) {
      ++b;
      if(var4 != '\u84f5') {
         ((int[])((int[])f[1]))[9] = -78;
      }

      if(!((boolean[])((boolean[])var5[17]))[27] && (!ol.a((byte)66, var0) || !ol.a((byte)80, var6))) {
         if(((boolean[])((boolean[])var5[17]))[5]) {
            return tm.a(var5, '\u84f5', var7, new Object[7], var2, 26115, var0, var3, var6, var1);
         } else {
            Object[] var8 = new Object[7];
            int var12 = fda.a(var0, (byte)81);
            int var14 = fda.a(var6, (byte)81);
            ne.a(var8, var4 ^ -34007);
            kaa.a(3553, var12, ah.f, var8, var14, vk.f, var5, 2);
            ((int[])((int[])var8[1]))[5] = var6;
            ((int[])((int[])var8[1]))[6] = var0;
            sda.a(var7, var8, 0, true, var0, 0, var6, 0, -var6 + var14, 0);
            ((float[])((float[])var8[6]))[0] = (float)var0 / (float)var12;
            ((boolean[])((boolean[])var8[3]))[3] = false;
            ((float[])((float[])var8[6]))[1] = (float)var6 / (float)var14;
            if(var5 != null && (-8 == ~var5.length || 6 == var5.length && var5[1].equals(Integer.valueOf(2)))) {
               gca.a(new Object[0][], 39, (Object[])null, (Object[])null, 103, -23, (byte)27, new Object[1][]);
            }

            ((boolean[])((boolean[])var8[3]))[2] = true;
            pda.a(false, false, var8, false);
            return var8;
         }
      } else {
         return tm.a(var5, 3553, var7, new Object[7], var2, 26115, var0, var3, var6, var1);
      }
   }

   static final int a(Object[] var0, byte var1) {
      int var2 = 30 / ((-32 - var1) / 40);
      ++a;
      return ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[5] + ((int[])((int[])var0[1]))[3] + ((int[])((int[])var0[1]))[2];
   }

   static final void a(Object[] var0, int var1) {
      ++g;
      if(var1 == 3008) {
         if(!((boolean[])((boolean[])var0[63]))[20]) {
            OpenGL.glDisable(3008);
         } else {
            OpenGL.glEnable(3008);
         }

      }
   }

}
