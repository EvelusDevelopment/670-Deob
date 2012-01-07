
final class io {

   static int c;
   static int e;
   static int f;
   static Object[] b = st.a(new Object[1], 7, 3, 17);
   static int d;
   static int a;
   static int g;


   static final Object[] a(byte var0, Object[] var1, boolean var2, Object[] var3, int var4, Object[] var5, Object[] var6) {
      ++c;
      gk.b(5, var5);
      int var7 = -71 / ((var0 - 72) / 34);
      ((boolean[])((boolean[])var5[5]))[0] = false;
      var5[4] = sj.a(64, new Object[3], (byte)-96);
      var5[2] = sj.a(500, new Object[3], (byte)-57);
      var5[3] = sj.a(30, new Object[3], (byte)-59);
      var5[8] = sj.a(50, new Object[3], (byte)-92);
      ((boolean[])((boolean[])var5[5]))[1] = var2;
      var5[0] = var6;
      ((int[])((int[])var5[1]))[0] = var4;
      var5[6] = var1;
      if(null != var1 && var1.length == 1) {
         gk.b(5, (Object[])null);
      }

      var5[7] = var3;
      if(var5[0] != null) {
         int var8 = oh.a((Object[])((Object[])var5[0]), (byte)104) - 1;
         jla.a((Object[])((Object[])var5[0]), (byte)35, var8);
      }

      if(uha.g == var5[6]) {
         var5[9] = new String[]{null, null, null, null, null, gj.a(((int[])((int[])var5[1]))[0], 83, gj.f_pb)};
         if(client.f_vb == 0) {
            return var5;
         }
      }

      var5[9] = new String[]{null, null, null, null, null, null};
      return var5;
   }

   static final void a(Object[] var0, int var1) {
      ++a;
      if(var1 < 31) {
         a(((int[])((int[])b[0]))[4], (Object[])((Object[])((Object[])((Object[])b[4]))[8]));
      }

      if(!((boolean[])((boolean[])var0[63]))[14]) {
         int var2;
         int var3;
         if(null == ((ta)var0[38]).E) {
            var2 = 0;
            var3 = 0;
         } else {
            var2 = ((ta)var0[38]).E.e();
            var3 = ((ta)var0[38]).E.d();
         }

         Object[] var4 = (Object[])((Object[])var0[66]);
         if(0 != var2 && 0 != var3) {
            dh.a(9, (float)var2, (float)var3, -1.0F, 1.0F, var4, 0.0F, 0.0F);
         } else {
            Class_ds.a(var4, (byte)124);
         }

         sea.a(var4, (Object[])((Object[])var0[19]), (byte)62);
         bpa.a((Object[])((Object[])var0[19]), (byte)78, var0);
         ((boolean[])((boolean[])var0[63]))[14] = true;
      }

   }

   static final Object a(Object[] var0, byte var1) {
      if(var0 != null && var0.length == 1 && var0[0].equals(Integer.valueOf(2))) {
         wea.b((int)9, (Object[])null);
      }

      ++d;
      lm var2;
      if(((lm[])((lm[])((Object[])((Object[])var0[3]))[2]))[-1 + ((int[])((int[])var0[1]))[0]] == var0[4]) {
         if(var1 != 45) {
            b = (Object[])((Object[])var0[0]);
         }

         do {
            if(((int[])((int[])var0[1]))[0] >= ((int[])((int[])((Object[])((Object[])var0[3]))[1]))[0]) {
               return null;
            }

            lm[] var10000 = (lm[])((lm[])((Object[])((Object[])var0[3]))[2]);
            int[] var10001 = (int[])((int[])var0[1]);
            int var10004 = ((int[])((int[])var0[1]))[0];
            var10001[0] = ((int[])((int[])var0[1]))[0] + 1;
            var2 = var10000[var10004].f;
         } while(((lm[])((lm[])((Object[])((Object[])var0[3]))[2]))[-1 + ((int[])((int[])var0[1]))[0]] == var2);

         var0[4] = var2.f;
         var0[2] = var2;
         return var2;
      } else {
         var2 = (lm)var0[4];
         var0[2] = var2;
         var0[4] = var2.f;
         return var2;
      }
   }

   static final void a(Object[] var0, boolean var1) {
      if(var0[7] == null) {
         var0[7] = new boolean[1];
      }

      if(!var1) {
         ++f;
      }
   }

   static final boolean a(int var0, Object[] var1) {
      ++e;
      return var1[var0] != null?((ka)var1[16]).XA():false;
   }

   static final int a(byte var0, Object[] var1) {
      ++g;
      return var0 != -126?-57:((byte[])((byte[])var1[10]))[3];
   }

}
