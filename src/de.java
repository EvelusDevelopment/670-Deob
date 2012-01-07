
final class de {

   static int d;
   static int h;
   static int a;
   static int b;
   static Object[] g;
   static int c;
   static int e;
   static int f;


   static final int a(int var0, Object[] var1) {
      ++a;
      ((int[])((int[])var1[1]))[var0] += 2;
      return ((((byte[])((byte[])var1[2]))[((int[])((int[])var1[1]))[0] - 2] & 255) << 8) + (((byte[])((byte[])var1[2]))[-1 + ((int[])((int[])var1[1]))[0]] & 255);
   }

   static final String a(String var0, int var1) {
      ++f;
      if(var1 != 22994) {
         return (String)null;
      } else {
         int var2 = var0.length();
         int var3 = 0;

         for(int var4 = 0; var4 < var2; ++var4) {
            char var5 = var0.charAt(var4);
            if(var5 == 60 || 62 == var5) {
               var3 += 3;
            }
         }

         StringBuffer var7 = new StringBuffer(var3 + var2);

         for(int var8 = 0; var8 < var2; ++var8) {
            char var6 = var0.charAt(var8);
            if(var6 != 60) {
               if(62 == var6) {
                  var7.append("<gt>");
               } else {
                  var7.append(var6);
               }
            } else {
               var7.append("<lt>");
            }
         }

         return var7.toString();
      }
   }

   static final Object[] a(int var0, int var1, int var2, Object[] var3) {
      if(var3[1] == null) {
         var3[1] = new int[2];
      }

      ++c;
      var3[2] = osa.a(0, new Object[2]);
      ((int[])((int[])var3[1]))[0] = var0;
      ((int[])((int[])var3[1]))[1] = var0;

      int var4;
      for(var4 = 1; ~var0 < ~(var4 + var4) && var4 < var1; var4 += var4) {
         ;
      }

      if(var2 != 2) {
         a((String)g[14], ((int[])((int[])var3[0]))[18]);
      }

      var3[0] = nb.a((byte)88, var4, new Object[5]);
      return var3;
   }

   static final void a(int var0, int var1, int var2, int var3, int var4, int var5, String var6, int var7) {
      ++e;
      Object[] var9 = hf.a(0, new Object[3]);
      if(var1 != 9677) {
         g = (Object[])null;
      }

      ((int[])((int[])var9[1]))[2] = var5 + kda.d;
      ((int[])((int[])var9[1]))[4] = var2;
      ((int[])((int[])var9[1]))[5] = var0;
      var9[2] = var6;
      ((int[])((int[])var9[1]))[1] = var4;
      ((int[])((int[])var9[1]))[0] = var3;
      ((int[])((int[])var9[1]))[3] = var7;
      gt.a(sh.a, -123, (nj)(var9 != null?var9[0]:null));
   }

   static final void a(Object[] var0, int var1) {
      if(var1 == 2) {
         if(null == var0[17]) {
            var0[17] = new boolean[2];
         }

         if(var0[1] == null) {
            var0[1] = new int[5];
         }

         if(null == var0[18]) {
            var0[18] = new long[2];
         }

         ++d;
      }
   }

   static final Object[] a(byte var0, Object[] var1) {
      ++h;
      gb.b(var1, var0 ^ 118);
      uca.a(1, var1, false, false);
      if(var0 != 118) {
         g = new Object[8];
      }

      pha.a(var1, -44);
      return var1;
   }

   static final void a(boolean var0, ta var1) {
      ++b;
      kv.f_i = ca.a(var0, haa.c, (byte)65, true, var1);
      ec.d = upa.a(haa.c, var1, -114);
      fha.m = ca.a(true, il.a, (byte)65, true, var1);
      nsa.c = upa.a(il.a, var1, -125);
      wla.f = ca.a(true, fha.n, (byte)65, true, var1);
      pia.d = upa.a(fha.n, var1, -120);
   }

}
