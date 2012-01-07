
final class vd {

   static int c;
   static int e;
   static int f_i;
   static int g;
   static int a;
   static int f;
   static Object[] b = ed.a(32, new Object[1], (byte)-128, 3);
   static int h = -1;
   static Object[] d = ho.a(3, 53, new Object[1], true);


   static final void a(Object[] var0, int var1) {
      ++f_i;
      if(null == var0[var1]) {
         var0[1] = new int[2];
      }

   }

   static final void a(Object[] var0, boolean var1) {
      ++e;
      if(!var1) {
         ((int[])((int[])((Object[])((Object[])b[5]))[5]))[2] = -20;
      }

      int var2;
      if(-1 <= ~((int[])((int[])var0[1]))[3]) {
         if(var0[6] != null && ~((short[])((short[])var0[6])).length == ~((int[])((int[])var0[1]))[4]) {
            var0[8] = new short[((int[])((int[])var0[1]))[4]];

            for(var2 = 0; ((int[])((int[])var0[1]))[4] > var2; ++var2) {
               ((short[])((short[])var0[8]))[var2] = (short)((int)Math.pow(2.0D, (double)var2));
            }

            if(null != var0 && -2 == ~var0.length && var0[0].equals(Integer.valueOf(2))) {
               mqa.a((byte)95, (Object[])null);
            }
         }
      } else {
         var0[6] = new short[((int[])((int[])var0[1]))[4]];
         var0[8] = new short[((int[])((int[])var0[1]))[4]];

         for(var2 = 0; ~var2 > ~((int[])((int[])var0[1]))[4]; ++var2) {
            ((short[])((short[])var0[6]))[var2] = (short)((int)(4096.0D * Math.pow((double)((float)((int[])((int[])var0[1]))[3] / 4096.0F), (double)var2)));
            ((short[])((short[])var0[8]))[var2] = (short)((int)Math.pow(2.0D, (double)var2));
         }
      }

   }

   static final Object[] a(boolean var0, int var1, Object[] var2) {
      ++a;
      Object[] var3;
      synchronized(var2[0]) {
         var3 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var2[0]), (long)var1));
      }

      if(var3 != null) {
         return var3;
      } else {
         byte[] var4 = qn.a(25, var1, (Object[])((Object[])var2[1]), -78);
         var3 = boa.a((byte)-122, new Object[1]);
         if(var4 != null) {
            Object[] var5 = jta.a((byte)-87, var4, new Object[3]);

            while(true) {
               int var6 = fh.a(var5, false);
               if(var6 == 0) {
                  if(var2 != null && var2.length == 5) {
                     a(true, -75, new Object[0][]);
                  }
                  break;
               }

               if(var6 == 1) {
                  ((int[])((int[])var3[0]))[1] = de.a((int)0, var5);
                  ((int[])((int[])var3[0]))[0] = fh.a(var5, false);
                  ((int[])((int[])var3[0]))[2] = fh.a(var5, false);
               }
            }
         }

         synchronized(var2[0]) {
            il.a((long)var1, var3, var0, (Object[])((Object[])var2[0]));
            return var3;
         }
      }
   }

   static final int a(int var0, int var1, int var2, int var3) {
      ++g;
      var0 &= 3;
      return 0 != var0?(var1 != var0?(2 == var0?-var2 + 4095:-var3 + 4095):var3):var2;
   }

   static final Object[] a(int var0, boolean var1, Object[] var2) {
      ++c;
      vb.a('\u83f3', var2);
      ((int[])((int[])var2[1]))[0] = var0;
      var2[2] = new int[((int[])((int[])var2[1]))[0]];
      var2[0] = new int[((int[])((int[])var2[1]))[0]];
      return var1?(Object[])null:var2;
   }

   static final Object[] a(int var0, Object[] var1) {
      ++f;
      hg.a(var1, (int)119);
      uca.a(0, var1, false, true);
      hka.b(var1, (byte)98);
      if(var0 <= 98) {
         d = (Object[])null;
      }

      return var1;
   }

}
