
final class mn extends lm {

   static int f_l;
   static int m;
   static int j;
   static int p;
   static int n;
   Object[] k;
   static int q;
   static int o;


   static final void a(byte var0, int var1) {
      oq.d = -1;
      bp.c = null;
      pda.c = var1;
      ++o;
      bl.a = -1;
      rua.a = null;
      if(var0 > 61) {
         sw.a = 0;
         dl.d = 1;
         kk.a = false;
      }
   }

   mn(Object[] var1) {
      this.k = var1;
   }

   static final void a(Object[] var0, Object[] var1, byte var2, int var3, Object[] var4) {
      wg.a(var4, (byte)101, var3, var0, ((Object[][])((Object[][])var1[3]))[((int[])((int[])var1[1]))[2]]);
      if(var2 == 74) {
         ++f_l;
      }
   }

   static final byte[] a(int[] var0, int var1, int var2, byte var3, Object[] var4) {
      ++n;
      if(!isa.a((byte)-45, var1, var2, var4)) {
         return null;
      } else {
         int var5 = 92 / ((var3 + 53) / 57);
         if(null == ((Object[][])((Object[][])var4[4]))[var2] || ((Object[][])((Object[][])var4[4]))[var2][var1] == null) {
            boolean var6 = qe.a(2, var1, var0, var2, var4);
            if(!var6) {
               td.a(var2, var4, 5);
               var6 = qe.a(2, var1, var0, var2, var4);
               if(!var6) {
                  return null;
               }
            }
         }

         byte[] var7 = ad.a(false, ((Object[][])((Object[][])var4[4]))[var2][var1], -103);
         if(((int[])((int[])var4[1]))[0] == 1) {
            ((Object[][])((Object[][])var4[4]))[var2][var1] = null;
            if(((int[])((int[])((Object[])((Object[])var4[3]))[5]))[var2] == 1) {
               ((Object[][])((Object[][])var4[4]))[var2] = null;
            }
         } else if(((int[])((int[])var4[1]))[0] == 2) {
            ((Object[][])((Object[][])var4[4]))[var2] = null;
         }

         return var7;
      }
   }

   static final void a(Object[] var0, int var1) {
      ++j;
      ((float[])((float[])var0[0]))[1] = 1.0F;
      ((float[])((float[])var0[var1]))[2] = 1.0F;
   }

   static final void a(int var0, int var1, boolean var2, Object[] var3) {
      ++q;
      vha.a(-4, var1, (Object[])((Object[])var3[0]));
      if(!var2) {
         ((long[])((long[])((Object[])((Object[])var3[3]))[0]))[11] = 87L;
      }

      jia.b((Object[])((Object[])var3[0]), var0, 6431);
   }

   static final void a(Object[] var0, byte var1) {
      if(var1 != 79) {
         a(119, ((int[])((int[])var0[1]))[5], false, (Object[])null);
      }

      ++m;
      if(var0[0] == null) {
         var0[0] = new int[4];
      }

   }

   static final boolean a(int var0, Object[] var1, Object[] var2) {
      if(var0 < 45) {
         a(58, 26, true, (Object[])((Object[])((Object[])((Object[])((Object[])((Object[])var2[0]))[2]))[4]));
      }

      ++p;
      return null == var1?false:~((int[])((int[])var2[1]))[0] == ~((int[])((int[])var1[1]))[0] && ((String)var2[0]).equals(var1[0]);
   }

}
