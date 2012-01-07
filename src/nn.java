import jagtheora.misc.SimplePeer;

final class nn extends ja {

   static short D;
   static Object[] B = ho.a(8, 58, new Object[1], true);
   static int L;
   static int A;
   static int J;
   static int K;
   static int G = 0;
   static int C;
   static short H = 205;
   static int F;
   private Object[] M;


   nn(Object[] var1, ta var2, Object[] var3) {
      super(var2, var3);
      this.M = var1;
   }

   static final cga a(ta var0, int var1, Object[] var2) {
      ++A;
      if(0 > ((int[])((int[])var2[1]))[4]) {
         return null;
      } else {
         cga var3 = (cga)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var2[2]))[0]), (long)((int[])((int[])var2[1]))[var1]);
         if(null == var3) {
            jja.a(var0, 2, var2);
            var3 = (cga)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var2[2]))[0]), (long)((int[])((int[])var2[1]))[4]);
         }

         return var3;
      }
   }

   static final void a(Object[] var0, byte var1) {
      ++L;
      if(var1 != -30) {
         B = new Object[2];
      }

      ((int[])((int[])var0[1]))[0] = -1;
   }

   static final void a(boolean var0, int var1, Object[] var2, re var3) {
      try {
         ++K;
         if(!var0) {
            int var8 = 1 << var1;
            Object[] var9 = wk.a((byte)121, var3);
            if(var3 == null) {
               ((int[])((int[])var2[1]))[3] &= ~var8;
               ((Object[][])((Object[][])var2[4]))[var1] = null;
               if(-1 == ~((int[])((int[])var2[1]))[3]) {
                  ((int[])((int[])var2[1]))[1] = 0;
                  ((int[])((int[])var2[1]))[2] = 0;
               }
            } else {
               if((((int[])((int[])var2[1]))[3] | var8) != var8) {
                  if(~((int[])((int[])var2[1]))[2] != ~mma.a(var9, 82).c() || ((int[])((int[])var2[1]))[1] != mma.a(var9, -100).b()) {
                     throw new RuntimeException();
                  }
               } else {
                  ((int[])((int[])var2[1]))[1] = mma.a(var9, -123).b();
                  ((int[])((int[])var2[1]))[2] = mma.a(var9, -100).c();
                  Object[] var5;
                  if((null == var2?null:var2[3]) == ((ta)(null == (var5 = (Object[])((Object[])var2[2]))?null:var5[55])).e(30626)) {
                     Class_f.a((byte)-87, (Object[])((Object[])var2[2]));
                  }
               }

               ((int[])((int[])var2[1]))[3] |= var8;
               ((Object[][])((Object[][])var2[4]))[var1] = var9;
            }

            Object[] var7;
            if((null == var2?null:var2[3]) == ((ta)((var7 = (Object[])((Object[])var2[2])) == null?null:var7[55])).e(30626)) {
               gha.a(var2, var1, true);
            } else {
               ((int[])((int[])var2[1]))[0] |= var8;
            }

         }
      } catch (RuntimeException var10) {
         throw vt.a(var10, "nn.D(" + var0 + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ',' + (var3 != null?"{...}":"null") + ')');
      }
   }

   final void HA(char var1, int var2, int var3, int var4, boolean var5) {
      qr.a(this.M, var1, var2, var3, var4, var5);
   }

   static final int b(byte var0, Object[] var1) {
      ++J;
      return var0 != -76?105:((int[])((int[])((Object[])((Object[])var1[1]))[1]))[3];
   }

   static final boolean a(int var0, int var1, int var2) {
      ++C;
      if(var1 >= -17) {
         b((Object[])null, ((int[])((int[])B[3]))[4]);
      }

      return (var0 & '\u8000') != 0;
   }

   static final void b(Object[] var0, int var1) {
      ++F;
      if(null != var0[10]) {
         ((SimplePeer)var0[10]).a();
      }

      if(var0[7] != null) {
         ((SimplePeer)var0[7]).a();
         var0[7] = null;
      }

      if(var0[5] != null) {
         ((SimplePeer)var0[5]).a();
         var0[5] = null;
      }

      ((SimplePeer)var0[12]).a();
      if(var1 >= -115) {
         H = 35;
      }

      ((SimplePeer)var0[4]).a();
      ((SimplePeer)var0[6]).a();
   }

   final void a(char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8) {
      qr.a(this.M, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   static final int a(int var0, int var1) {
      return esa.g != null?esa.g[var0][var1] & '\uffff':0;
   }

}
