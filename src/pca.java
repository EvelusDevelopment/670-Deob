
final class pca {

   static int a = 0;
   static Object[] c;
   static int f;
   static int d;
   static int e;
   static int b;


   static final boolean a(int var0, byte var1, Object[] var2) {
      try {
         ++b;
         int var3 = tg.a(var2, 8553, 2);
         int var4;
         int var5;
         int var9;
         int var10;
         int var11;
         if(var3 == 0) {
            if(tg.a(var2, 8553, 1) != 0) {
               a(var0, (byte)-126, var2);
            }

            var4 = tg.a(var2, 8553, 6);
            var5 = tg.a(var2, 8553, 6);
            boolean var16 = tg.a(var2, 8553, 1) == 1;
            if(var16) {
               bi.f[lu.c++] = var0;
            }

            if(vo.E[var0] != null) {
               throw new RuntimeException();
            } else {
               Object[] var17 = uja.h[var0];
               Object[] var18 = vo.E[var0] = gga.a(-94, new Object[43]);
               ((int[])((int[])var18[12]))[21] = var0;
               if(jga.g[var0] != null) {
                  kw.b(-119, var18, jga.g[var0]);
               }

               dd.a((byte)0, true, ((int[])((int[])var17[1]))[1], var18);
               ((int[])((int[])var18[12]))[14] = ((int[])((int[])var17[1]))[2];
               if(var18 != null && var18.length == 27) {
                  ofa.b = -105;
               }

               var9 = ((int[])((int[])var17[1]))[0];
               var10 = var9 >> 28;
               var11 = 255 & var9 >> 14;
               int var12 = var9 & 255;
               int var13 = -rs.f + (var11 << 6) + var4;
               ((boolean[])((boolean[])var18[8]))[14] = ((boolean[])((boolean[])var17[0]))[0];
               int var14 = -qm.d + (var12 << 6) + var5;
               ((boolean[])((boolean[])var18[8]))[10] = ((boolean[])((boolean[])var17[0]))[1];
               ((byte[])((byte[])var18[22]))[0] = wua.c[var0];
               ((byte[])((byte[])var18[10]))[0] = ((byte[])((byte[])var18[10]))[1] = (byte)var10;
               if(fr.a(var14, var13, (byte)51)) {
                  ++((byte[])((byte[])var18[10]))[1];
               }

               ul.a(0, var14, var18, var13);
               ((boolean[])((boolean[])var18[8]))[11] = false;
               uja.h[var0] = null;
               return true;
            }
         } else if(var3 == 1) {
            var4 = tg.a(var2, 8553, 2);
            var5 = ((int[])((int[])uja.h[var0][1]))[0];
            ((int[])((int[])uja.h[var0][1]))[0] = (805306368 & (var5 >> 28) + var4 << 28) + (var5 & 268435455);
            return false;
         } else {
            int var6;
            int var7;
            int var8;
            if(2 == var3) {
               var4 = tg.a(var2, 8553, 5);
               var5 = var4 >> 3;
               if(var2 != null && (var2.length == 1 || -2 == ~var2.length || var2.length == 1 && var2[0].equals(Integer.valueOf(0)))) {
                  ota.a((Object[])null, -113, -46);
               }

               var6 = 7 & var4;
               var7 = ((int[])((int[])uja.h[var0][1]))[0];
               var8 = 3 & (var7 >> 28) + var5;
               var9 = var7 >> 14 & 255;
               var10 = 255 & var7;
               if(var6 == 0) {
                  --var9;
                  --var10;
               }

               if(var6 == 1) {
                  --var10;
               }

               if(2 == var6) {
                  ++var9;
                  --var10;
               }

               if(3 == var6) {
                  --var9;
               }

               if(4 == var6) {
                  ++var9;
               }

               if(var6 == 5) {
                  ++var10;
                  --var9;
               }

               if(var6 == 6) {
                  ++var10;
               }

               if(7 == var6) {
                  ++var9;
                  ++var10;
               }

               ((int[])((int[])uja.h[var0][1]))[0] = (var8 << 28) - (-(var9 << 14) + -var10);
               return false;
            } else {
               var4 = tg.a(var2, 8553, 18);
               var5 = var4 >> 16;
               var6 = var4 >> 8 & 255;
               var7 = 255 & var4;
               var8 = ((int[])((int[])uja.h[var0][1]))[0];
               var9 = 3 & (var8 >> 28) + var5;
               if(var1 > -103) {
                  a(-112, new Object[1]);
               }

               var10 = 255 & (var8 >> 14) + var6;
               var11 = 255 & var7 + var8;
               if(var2 != null && (var2.length == 1 || -3 == ~var2.length && var2[0].equals(Integer.valueOf(1)))) {
                  ofa.b = -124;
               }

               ((int[])((int[])uja.h[var0][1]))[0] = var11 + (var10 << 14) + (var9 << 28);
               return false;
            }
         }
      } catch (RuntimeException var15) {
         throw vt.a(var15, "pca.C(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final int[] a(int var0, boolean var1, int var2, int var3, float var4, int var5, int var6, int var7) {
      ++e;
      int[] var8 = new int[var5];
      Object[] var10 = new Object[9];
      mqa.a((byte)123, var10);
      uca.a(0, var10, false, true);
      Class_k.a((byte)121, var10);
      if(null != var10 && (var10.length == 3 || var10.length == 1)) {
         vd.a((Object[])null, true);
      }

      ((int[])((int[])var10[1]))[var3] = var6;
      ((int[])((int[])var10[1]))[1] = var7;
      ((boolean[])((boolean[])var10[3]))[1] = var1;
      ((int[])((int[])var10[1]))[4] = var0;
      ((int[])((int[])var10[1]))[5] = var2;
      ((int[])((int[])var10[1]))[3] = (int)(4096.0F * var4);
      mqa.a(var10, var3 ^ -3);
      foa.a((byte)-97, 1, var5);
      client.a(false, var8, 0, var10);
      return var8;
   }

   static final int a(int var0, Object[] var1) {
      ++d;
      if(var0 != 2) {
         a(36, false, ((int[])((int[])var1[3]))[7], -16, ((float[])((float[])((Object[])((Object[])c[6]))[11]))[1], ((int[])((int[])var1[8]))[1], -110, ((int[])((int[])var1[0]))[0]);
      }

      if(var1[15] != null) {
         if(-2 <= ~((int[])((int[])var1[15])).length) {
            return ((int[])((int[])var1[15]))[0];
         }

         if(null != var1 && 1 == var1.length) {
            ((boolean[])((boolean[])ria.a[3]))[7] = true;
         }

         int var2 = (int)(65535.0D * Math.random());

         for(int var3 = 0; ((int[])((int[])var1[15])).length > var3; ++var3) {
            if(var2 <= ((int[])((int[])var1[5]))[var3]) {
               return ((int[])((int[])var1[15]))[var3];
            }

            var2 -= ((int[])((int[])var1[5]))[var3];
         }
      }

      return -1;
   }

   static {
      Object[] var1 = new Object[2];
      c = var1;
      f = 0;
   }
}
