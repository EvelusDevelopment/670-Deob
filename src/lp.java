import jagdx.IDirect3DDevice;

final class lp {

   static int a;
   static int f;
   static int c;
   static int e;
   static int b;
   static int h;
   static int d;
   static int[] g = new int[2];


   static final int a(int var0, Object[] var1) {
      if(var0 != 16) {
         a(-72, ((int[])((int[])((Object[])((Object[])var1[0]))[2]))[8], -120, (byte[])((byte[])var1[3]), -97, -64);
      }

      ++d;
      return null != var1[16]?((ka)var1[16]).ra():0;
   }

   static final void a(boolean var0, Object[] var1) {
      ((int[])((int[])var1[1]))[11] = 81;
      ((int[])((int[])var1[1]))[8] = 8;
      ((int[])((int[])var1[1]))[5] = 409;
      ((int[])((int[])var1[1]))[4] = 1024;
      ((int[])((int[])var1[1]))[9] = 1024;
      ((int[])((int[])var1[1]))[7] = 4;
      ((int[])((int[])var1[1]))[1] = 0;
      ((int[])((int[])var1[1]))[3] = 204;
      ++f;
      if(!var0) {
         a(94, (Object[])((Object[])var1[26]));
      }

   }

   static final void a(byte var0, Object[] var1, Object[] var2, Object[] var3) {
      if(var0 >= -30) {
         ((long[])((long[])var1[8]))[0] = -36L;
      }

      ++h;
      int var4 = va.a(var3, (byte)-75);
      int var5 = nba.a(var3, (byte)-112);
      if(eva.b(-58, var3) != tu.c) {
         throw new bba(var3, "");
      } else {
         if(0 <= var4) {
            gj.a(var1, 12, hna.a((byte)87, wg.z, var2), (byte)118, var4);
         }

         if(var5 >= 0) {
            gua.a(12, var5, hna.a((byte)27, wg.z, var2), 58, var1);
         }

      }
   }

   static final void a(Object[] var0, Object[] var1, int var2) {
      if(var2 != -5251) {
         a(true, (Object[])null);
      }

      ++b;
      synchronized(var0[3]) {
         ama.a((tha)(null != var1?var1[1]:null), (byte)-106, (Object[])((Object[])var0[3]));
         ++((int[])((int[])var0[1]))[0];
         var0[3].notifyAll();
      }
   }

   static final Object[] a(boolean var0, Object[] var1, int var2, byte[] var3, Object[] var4, byte var5, int var6, Object[] var7, Object[] var8) {
      if(var5 > -107) {
         g = (int[])((int[])var4[1]);
      }

      ++a;
      if(!((boolean[])((boolean[])var4[17]))[27] && (!ol.a((byte)-73, var6) || !ol.a((byte)-110, var2))) {
         if(((boolean[])((boolean[])var4[17]))[5]) {
            return eba.a(1, var2, var3, var0, var6, var8, var1, new Object[7], var4, var7, '\u84f5');
         } else {
            Object[] var9 = new Object[7];
            int var15 = fda.a(var6, (byte)81);
            if(null != var4 && (25 == var4.length || var4.length == 2)) {
               return null;
            } else {
               int var17 = fda.a(var2, (byte)81);
               ne.a(var9, 83);
               kaa.a(3553, var15, var1, var9, var17, var8, var4, 2);
               if(var1 != null && -15 == ~var1.length && var1[3].equals(Boolean.valueOf(false)) && var1[3].equals(Boolean.valueOf(false))) {
                  nd.a((Object[])null, 8, -33, 114, -110, false, -61, (byte)-36, new Object[11][]);
               }

               ((int[])((int[])var9[1]))[6] = var6;
               ((int[])((int[])var9[1]))[5] = var2;
               hr.a(var6, var3, true, (byte)94, var7, 0, 0, var9, 0, var2, var17 + -var2);
               ((boolean[])((boolean[])var9[3]))[3] = false;
               ((float[])((float[])var9[6]))[0] = (float)var6 / (float)var15;
               ((boolean[])((boolean[])var9[3]))[2] = true;
               ((float[])((float[])var9[6]))[1] = (float)var2 / (float)var17;
               pda.a(false, false, var9, false);
               return var9;
            }
         }
      } else {
         return eba.a(1, var2, var3, var0, var6, var8, var1, new Object[7], var4, var7, 3553);
      }
   }

   static final void a(int var0, int var1, int var2, byte[] var3, int var4, int var5) {
      ++e;
      if(var2 > var1) {
         var4 = var2 - var1 >> 2;
         if(var0 <= -91) {
            var5 += var1;

            while(true) {
               --var4;
               if(-1 < ~var4) {
                  var4 = -var1 + var2 & 3;

                  while(true) {
                     --var4;
                     if(0 > var4) {
                        return;
                     }

                     var3[var5++] = 1;
                  }
               }

               var3[var5++] = 1;
               var3[var5++] = 1;
               var3[var5++] = 1;
               var3[var5++] = 1;
            }
         }
      }
   }

   static final Object[] a(byte var0, int var1, int var2, Object[] var3, Object[] var4, Object[] var5, Object[] var6) {
      ji.b((byte)-100, var5);
      ++c;
      if(var0 > -32) {
         a(-1, -54, -51, (byte[])((byte[])var3[6]), 90, -31);
      }

      var5[4] = ita.a(var5, (byte)9);
      var5[2] = var6;
      ((int[])((int[])var5[1]))[1] = var1;
      var5[0] = var3;
      ((int[])((int[])var5[1]))[0] = var2;
      var5[5] = var4;
      ((long[])((long[])var5[3]))[0] = IDirect3DDevice.CreateRenderTarget(((long[])((long[])((Object[])((Object[])var5[2]))[50]))[5], var2, var1, wg.a((byte)98, (Object[])((Object[])var5[5]), (Object[])((Object[])var5[0])), 0, 0, false);
      return var5;
   }

}
