import jaggl.OpenGL;

final class efa {

   static int a;
   static Object[] b = ed.a(3, new Object[1], (byte)-119, 79);
   static int d;
   static int c;


   static final Object[] a(Object[] var0, int var1) {
      ++c;
      if(var1 != -11426) {
         a((Object[])null, ((int[])((int[])b[0]))[2]);
      }

      uca.a(1, var0, false, false);
      return var0;
   }

   static final void a(Object[] var0, Object[] var1, Object[] var2, int var3) {
      av.a(false, var1, 0);
      ++d;
      via.c = ((float[])((float[])var1[0]))[17];
      float var4 = ((float[])((float[])((Object[])((Object[])var1[28]))[0]))[2];
      float var5 = ((float[])((float[])((Object[])((Object[])var1[28]))[0]))[6];
      float var6 = ((float[])((float[])((Object[])((Object[])var1[28]))[0]))[10];
      float var7 = ((float[])((float[])((Object[])((Object[])var1[28]))[0]))[14];
      int var8 = 0;
      int var9 = Integer.MAX_VALUE;
      int var10 = 0;
      va var11 = (va)((Object[])((Object[])var0[0]))[1];

      va var12;
      int var14;
      for(var12 = var11.p; var11 != var12; var12 = var12.p) {
         vsa var13 = (vsa)var12;
         var14 = (int)(var7 + var4 * (float)(var13.B >> 12) + (float)(var13.z >> 12) * var5 + var6 * (float)(var13.v >> 12));
         if(var9 > var14) {
            var9 = var14;
         }

         if(var10 < var14) {
            var10 = var14;
         }

         ((int[])((int[])var2[3]))[var8++] = var14;
      }

      int var23 = -var9 + var10;
      if(-1601 <= ~(2 + var23)) {
         var14 = 0;
         var23 += 2;
      } else {
         var14 = 1 + dba.a(var23, 53) - nr.b;
         var23 = (var23 >> var14) + 2;
      }

      if(var1 != null && (var1.length == 2 && var1[1].equals(Integer.valueOf(1)) || var1.length == 16)) {
         uba.a((Object[])null, new Object[3][], -22245);
      }

      var8 = 0;
      var12 = var11.p;
      eca.a(var1, 24394, (Object[])((Object[])var2[9]));
      Object[] var15 = (Object[])((Object[])var1[40]);
      Class_k.a(fma.f_wb, var15, -103);
      Class_ds.a((Object[])((Object[])var15[0]), (byte)125);
      int var16 = -86 % ((-6 - var3) / 56);
      ((int[])((int[])var15[1]))[0] = -1;
      int var17 = -2;
      boolean var18 = true;

      for(boolean var19 = true; var11 != var12; cfa.a(var1, var23, var2, false)) {
         ((int[])((int[])var2[1]))[0] = 0;

         int var20;
         for(var20 = 0; var23 > var20; ++var20) {
            ((int[])((int[])var2[8]))[var20] = 0;
         }

         if(var0 != null && 11 == var0.length) {
            cfa.a((Object[])null, -30, (Object[])null, false);
         }

         for(var20 = 0; 64 > var20; ++var20) {
            ((int[])((int[])var2[0]))[var20] = 0;
         }

         for(; var11 != var12; var12 = var12.p) {
            vsa var24 = (vsa)var12;
            if(var19) {
               var17 = var24.x;
               var18 = var24.y;
               var19 = false;
            }

            if(var8 > 0 && (~var17 != ~var24.x || var24.y == !var18)) {
               var19 = true;
               break;
            }

            int var21 = -var9 + ((int[])((int[])var2[3]))[var8++] >> var14;
            if(1600 > var21) {
               int var25;
               int[] var27;
               vsa[] var26;
               if(((int[])((int[])var2[8]))[var21] >= 64) {
                  int var10002;
                  if(((int[])((int[])var2[8]))[var21] == 64) {
                     if(((int[])((int[])var2[1]))[0] == 64) {
                        continue;
                     }

                     int[] var10000 = (int[])((int[])var2[8]);
                     var10002 = ((int[])((int[])var2[8]))[var21];
                     int[] var10004 = (int[])((int[])var2[1]);
                     int var10007 = ((int[])((int[])var2[1]))[0];
                     var10004[0] = ((int[])((int[])var2[1]))[0] + 1;
                     var10000[var21] = var10002 + 1 + var10007;
                  }

                  var26 = ((vsa[][])((vsa[][])var2[2]))[-65 + ((int[])((int[])var2[8]))[var21]];
                  var27 = (int[])((int[])var2[0]);
                  var10002 = -1 + ((int[])((int[])var2[8]))[var21] - 64;
                  var25 = var27[-1 + ((int[])((int[])var2[8]))[var21] - 64];
                  var27[var10002] = var27[-1 + ((int[])((int[])var2[8]))[var21] - 64] + 1;
                  var26[var25] = var24;
               } else {
                  var26 = ((vsa[][])((vsa[][])var2[6]))[var21];
                  var27 = (int[])((int[])var2[8]);
                  var25 = ((int[])((int[])var2[8]))[var21];
                  var27[var21] = ((int[])((int[])var2[8]))[var21] + 1;
                  var26[var25] = var24;
               }
            }
         }

         var15[2] = oea.a((Object[])((Object[])var1[43]), 0 <= var17?var17:-1, false);
         if(var18 && via.c != ((float[])((float[])var1[0]))[17]) {
            rg.a(via.c, var1, 0);
         } else if(1.0F != ((float[])((float[])var1[0]))[17]) {
            rg.a(1.0F, var1, 0);
         }
      }

      if(via.c != ((float[])((float[])var1[0]))[17]) {
         rg.a(via.c, var1, 0);
      }

      av.a(true, var1, 0);
   }

   static final void a(Object[] var0, char var1, int var2) {
      ++a;
      OpenGL.glCallList(((int[])((int[])var0[0]))[var2] + var1);
   }

}
