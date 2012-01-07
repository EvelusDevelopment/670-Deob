
final class qqa {

   static int c;
   static int d;
   static int b;
   static Object[] a = ed.a(-1, new Object[1], (byte)-100, 63);
   static int f;
   static int g;
   static int e;


   static final Object[] a(boolean var0, Object[] var1, Object[] var2, Object[] var3, Object[] var4) {
      ++f;
      if(var0) {
         a(104, (Object[])((Object[])var1[0]));
      }

      if(null == var2[9]) {
         var2[9] = new boolean[1];
      }

      if(var2[4] == null) {
         var2[4] = new int[3];
      }

      var2[0] = ofa.a(false, var2);
      var2[3] = null;
      Class_i.b((byte)114, var2);
      var2[3] = var1[1];
      StringBuffer var5 = new StringBuffer();
      Object[][] var6;
      int var7;
      Object[] var8;
      if(null != var1[3]) {
         var2[1] = var1[3];
         if(null != var1[0]) {
            if(var3 != null && var3.length == 3) {
               a(false, (Object[])null, new Object[2][], (Object[])null, (Object[])null);
            }

            var6 = (Object[][])((Object[][])var1[0]);

            for(var7 = 0; var6.length > var7; ++var7) {
               var8 = var6[var7];
               var5.append("#define " + (String)var8[0] + " " + (String)var8[1] + '\n');
            }
         }

         var5.append(new String(taa.a(9, (String)var2[1], var3)));
         var2[7] = var5.toString();
      }

      if(var1[2] != null) {
         var2[2] = var1[2];
         var5.setLength(0);
         if(null != var1[4]) {
            if(null != var1 && var1.length == 9 && var1[8].equals(Integer.valueOf(2)) && var1[8].equals(Integer.valueOf(2))) {
               return null;
            }

            var6 = (Object[][])((Object[][])var1[4]);

            for(var7 = 0; ~var7 > ~var6.length; ++var7) {
               var8 = var6[var7];
               var5.append("#define " + (String)var8[0] + " " + (String)var8[1] + '\n');
            }
         }

         var5.append(new String(taa.a(9, (String)var2[2], var3)));
         var2[6] = var5.toString();
      }

      qo.a((int[])((int[])var2[13]), 0, ((int[])((int[])var2[13])).length, -1);
      var2[15] = var3;
      var2[12] = var4;
      return var2;
   }

   static final void a(int var0, Object[] var1, int var2) {
      ++b;
      ((int[])((int[])var1[1]))[0] = var2;
      if(var0 != -18985) {
         a(-62, (Object[])null);
      }

      synchronized(var1[4]) {
         dq.a(var0 + 18886, (Object[])((Object[])var1[4]));
      }
   }

   static final void a(int var0, Object[] var1) {
      if(dua.a((Object[])((Object[])((Object[])((Object[])var1[0]))[35]), (byte)-78) == 2 && ((int[])((int[])var1[1]))[0] == 2) {
         ((int[])((int[])var1[1]))[0] = 1;
      }

      ++c;
      if(((int[])((int[])var1[1]))[0] < 0 || 2 < ((int[])((int[])var1[1]))[0]) {
         ((int[])((int[])var1[1]))[0] = ita.b(var1, (byte)39);
      }

      if(var0 != -26349) {
         a(((int[])((int[])((Object[])((Object[])var1[4]))[0]))[15], (Object[])null);
      }

   }

   static final int a(byte var0, int var1) {
      int var2 = 9 % ((63 - var0) / 58);
      ++d;
      int var3 = 63 & var1;
      int var4 = (251 & var1) >> 6;
      if(18 == var3) {
         if(0 == var4) {
            return 1;
         }

         if(1 == var4) {
            return 2;
         }

         if(var4 == 2) {
            return 4;
         }

         if(3 == var4) {
            return 8;
         }
      } else if(var3 == 19 || var3 == 21) {
         if(0 == var4) {
            return 16;
         }

         if(var4 == 1) {
            return 32;
         }

         if(var4 == 2) {
            return 64;
         }

         if(var4 == 3) {
            return 128;
         }
      }

      return 0;
   }

}
