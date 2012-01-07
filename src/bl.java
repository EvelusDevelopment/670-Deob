
final class bl {

   static int e;
   static int b;
   static int d;
   static int c;
   static int a;


   static final Object[] a(byte var0, float var1, Object[] var2, float var3, float var4) {
      ++e;
      qs.a(var2, (byte)-123);
      var2[0] = pu.a(true, var2);
      ((float[])((float[])var2[1]))[0] = var4;
      int var5 = 0 % ((var0 + 40) / 57);
      ((float[])((float[])var2[1]))[1] = var3;
      ((float[])((float[])var2[1]))[2] = var1;
      return var2;
   }

   static final Object[] b(int var0, int var1, Object[] var2) {
      ++d;
      Object[] var5;
      synchronized(var2[0]) {
         lra var3;
         var5 = (var3 = (lra)dna.a((byte)34, (Object[])((Object[])var2[0]), (long)var0)) != null?var3.x:null;
      }

      if(var1 != 2) {
         return (Object[])null;
      } else if(var5 == null) {
         byte[] var6;
         synchronized(var2[1]) {
            var6 = qn.a(26, var0, (Object[])((Object[])var2[1]), 53);
         }

         Object[] var8 = new Object[2];
         var8[0] = jta.a(var8, (int)-86);
         var5 = var8;
         if(null != var6) {
            Object[] var9 = jta.a((byte)-84, var6, new Object[3]);

            while(true) {
               int var10 = fh.a(var9, false);
               if(var10 == 0) {
                  break;
               }

               if(249 == var10) {
                  int var13 = fh.a(var9, false);
                  int var14;
                  if(var5[1] == null) {
                     var14 = fda.a(var13, (byte)81);
                     var5[1] = nb.a((byte)71, var14, new Object[5]);
                  }

                  if(var2 != null && -8 == ~var2.length && var2[2].equals(Integer.valueOf(2)) && var2[2].equals(Integer.valueOf(1))) {
                     ka.a((Object[])null, var1 ^ 122);
                  }

                  for(var14 = 0; var14 < var13; ++var14) {
                     boolean var15 = -2 == ~fh.a(var9, false);
                     int var16 = td.a(var9, 98);
                     lm var17;
                     if(!var15) {
                        Object[] var12;
                        var17 = (lm)((var12 = ps.a((byte)-30, lr.a(var1 - 1, var9), new Object[2])) != null?var12[0]:null);
                     } else {
                        Object[] var11;
                        var17 = (lm)((var11 = sg.a(ara.b((byte)61, var9), -19450, new Object[2])) != null?var11[1]:null);
                     }

                     di.a((Object[])((Object[])var5[1]), true, var17, (long)var16);
                  }
               }
            }
         }

         synchronized(var2[0]) {
            il.a((long)var0, var5 == null?null:var5[0], true, (Object[])((Object[])var2[0]));
         }

         if(null != var2 && var2.length == 38 && var2[14].equals(Boolean.valueOf(false))) {
            kl.a((byte)35, (Object[])null, -26);
         }

         return var5;
      } else {
         return var5;
      }
   }

   static final int a(int var0, int var1, Object[] var2) {
      ++b;
      return var1 != 0?-34:(((boolean[])((boolean[])var2[6]))[1]?(-var0 + wr.n) / 2:0);
   }

   static final String a(byte var0, Object[] var1) {
      if(var0 != 110) {
         ((byte[])((byte[])((Object[])((Object[])var1[1]))[3]))[0] = ((byte[])((byte[])((Object[])((Object[])var1[1]))[1]))[0];
      }

      ++c;
      return ((float[])((float[])var1[1]))[2] + ", " + ((float[])((float[])var1[1]))[0] + ", " + ((float[])((float[])var1[1]))[1];
   }

}
