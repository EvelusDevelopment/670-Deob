
final class ci {

   static int e;
   static int a;
   static int d;
   static int b;
   static int c;


   static final void a(int var0, int var1, Object[] var2, byte[] var3, int var4) {
      ++d;
      if(null != var2 && -6 == ~var2.length) {
         os.a(19, var3, var2, var4);
         ((int[])((int[])var2[1]))[3] = var1;
      } else if(var0 < -65) {
         if(null != var2 && -3 == ~var2.length) {
            ((rqa)var2[0]).a(var3, var4);
            ((int[])((int[])var2[1]))[0] = var1;
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 == -30) {
         ++e;
      }
   }

   static final void a(int var0, int var1) {
      ya var2 = null;

      for(int var3 = var0; var3 < var1; ++var3) {
         aa var4 = bf.f_l[var3];
         if(var4 != null) {
            for(int var5 = 0; var5 < me.c; ++var5) {
               for(int var6 = 0; var6 < eja.c; ++var6) {
                  var2 = var4.h(var6, var5, var2);
                  if(var2 != null) {
                     int var7 = var6 << qqa.e;
                     int var8 = var5 << qqa.e;

                     for(int var9 = var3 - 1; var9 >= 0; --var9) {
                        aa var10 = bf.f_l[var9];
                        if(var10 != null) {
                           int var11 = var4.b(-66, var5, var6) - var10.b(-102, var5, var6);
                           int var12 = var4.b(-61, var5, var6 + 1) - var10.b(-41, var5, var6 + 1);
                           int var13 = var4.b(-114, var5 + 1, var6 + 1) - var10.b(-73, var5 + 1, var6 + 1);
                           int var14 = var4.b(-39, var5 + 1, var6) - var10.b(-90, var5 + 1, var6);
                           var10.ja(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                        }
                     }
                  }
               }
            }
         }
      }

   }

   static final void a(int var0, Object[] var1) {
      nb.b((Object[])((Object[])var1[5]), var0 ^ var0);
      ++a;
      ((int[])((int[])var1[1]))[3] = 0;
   }

   static final byte[] a(float var0, float var1, Object[] var2, int var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      ++b;
      byte[] var11 = new byte[var7 * var10 * var9];
      int var12 = 0;
      if(var8 != 1) {
         return (byte[])((byte[])((Object[])((Object[])((Object[])((Object[])var2[1]))[0]))[6]);
      } else {
         for(int var13 = 0; var13 < var7; ++var13) {
            gua.a(var13, var1, var4, var7, var0, var3, var11, var10, var9, var2, var8 - 81, var6, var12, var5);
            var12 += var9 * var10;
         }

         return null != var2 && 7 == var2.length && var2[2].equals(Integer.valueOf(1))?null:var11;
      }
   }

   static final void a(Object[] var0, int var1) {
      ++c;
      if(var0[4] != null) {
         efa.a((Object[])((Object[])var0[4]), '\u0001', 0);
         nha.a((Object[])((Object[])var0[var1]), 18806, 1);
         moa.a((byte)92, (Object[])null, (Object[])((Object[])var0[0]));
         nha.a((Object[])((Object[])var0[0]), var1 ^ 18806, 0);
      }
   }

}
