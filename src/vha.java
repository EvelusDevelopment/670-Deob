import jagdx.IDirect3DDevice;

final class vha {

   static Object[] a;
   static int d;
   static int c;
   static int e;
   static int b;
   static int f;


   static final long a(Object[] var0, byte var1) {
      ++b;
      if(var1 != 78) {
         a = (Object[])null;
      }

      return ((long[])((long[])var0[0]))[0];
   }

   static final void a(Object[] var0, Object[] var1, boolean var2) {
      ++e;
      if(var2) {
         a = (Object[])((Object[])var1[2]);
      }

      IDirect3DDevice.SetIndices(((long[])((long[])var0[50]))[5], ((long[])((long[])var1[6]))[0]);
   }

   static final void a(float var0, float var1, int var2, float[] var3, int var4, int var5, byte var6, int var7, int var8, int var9, float[] var10, int var11, int var12, float var13) {
      ++d;
      var8 -= var2;
      var12 -= var11;
      var5 -= var4;
      if(var6 >= -87) {
         a = (Object[])null;
      }

      float var14 = var3[2] * (float)var12 + var3[0] * (float)var8 + var3[1] * (float)var5;
      float var15 = (float)var12 * var3[5] + var3[4] * (float)var5 + (float)var8 * var3[3];
      float var16 = var3[7] * (float)var5 + (float)var8 * var3[6] + (float)var12 * var3[8];
      float var17;
      float var18;
      if(0 != var9) {
         if(1 == var9) {
            var18 = 0.5F + var16 + var1;
            var17 = 0.5F + var14 + var13;
         } else if(var9 != 2) {
            if(var9 != 3) {
               if(4 == var9) {
                  var18 = 0.5F + -var15 + var0;
                  var17 = 0.5F + var1 + var16;
               } else {
                  var17 = -var16 + var1 + 0.5F;
                  var18 = 0.5F + -var15 + var0;
               }
            } else {
               var17 = 0.5F + var14 + var13;
               var18 = var0 + -var15 + 0.5F;
            }
         } else {
            var18 = var0 + -var15 + 0.5F;
            var17 = -var14 + var13 + 0.5F;
         }
      } else {
         var17 = var14 + var13 + 0.5F;
         var18 = 0.5F + var1 + -var16;
      }

      float var19;
      if(var7 == 1) {
         var19 = var17;
         var17 = -var18;
         var18 = var19;
      } else if(2 != var7) {
         if(var7 == 3) {
            var19 = var17;
            var17 = var18;
            var18 = -var19;
         }
      } else {
         var18 = -var18;
         var17 = -var17;
      }

      var10[0] = var17;
      var10[1] = var18;
   }

   static final void a(int var0, int var1, Object[] var2) {
      ++f;
      if(var0 != -4) {
         a((Object[])null, (byte)-118);
      }

      if(var1 == 4) {
         mqa.a(var2, vb.d, (byte)81, vb.d);
      } else if(var1 == 0) {
         mqa.a(var2, Class_t.c, (byte)117, Class_t.c);
      } else if(var1 == 1) {
         mqa.a(var2, pba.b, (byte)116, pba.b);
      } else if(2 != var1) {
         if(3 == var1) {
            mqa.a(var2, lf.e, (byte)96, lf.e);
         }
      } else {
         mqa.a(var2, kk.c, (byte)103, pba.b);
      }

   }

   static final void a(int var0, Object[] var1) {
      ++c;

      for(int var2 = 0; var2 < ((int[])((int[])nb.g[1]))[0]; ++var2) {
         Object[] var3 = rj.a(var2, nb.g, 60);
         if(null != var3 && -1 == ~((int[])((int[])var3[1]))[0]) {
            ((int[])((int[])var1[0]))[var2] = 0;
            ((int[])((int[])var1[2]))[var2] = 0;
         }
      }

      if(var0 != 2) {
         a = (Object[])null;
      }

      var1[1] = nb.a((byte)98, 128, new Object[5]);
      if(var1 != null && 2 == var1.length && var1[0].equals(Integer.valueOf(0))) {
         gs.a(92, (Object[])null, -115, 121);
      }

   }

}
