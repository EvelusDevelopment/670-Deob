
final class mqa {

   static int e;
   static int k;
   static int c;
   static int d;
   static int f;
   static Object[][] g;
   static int a;
   static int j = -1;
   static int h;
   static int b;
   static int f_i;


   static final void a(Object[] var0, Object[] var1, byte var2, Object[] var3) {
      if(var2 <= 73) {
         a((byte)-86, (Object[])null);
      }

      ++f_i;
      boolean var4 = false;
      if(var1 != ((Object[][])((Object[][])var0[56]))[((int[])((int[])var0[1]))[7]]) {
         ((Object[][])((Object[][])var0[56]))[((int[])((int[])var0[1]))[7]] = var1;
         wd.a(true, var0);
         var4 = true;
      }

      if(((Object[][])((Object[][])var0[22]))[((int[])((int[])var0[1]))[7]] != var3) {
         ((Object[][])((Object[][])var0[22]))[((int[])((int[])var0[1]))[7]] = var3;
         var4 = true;
         te.a(25385, var0);
      }

      if(var4) {
         ((int[])((int[])var0[1]))[23] &= -14;
      }

   }

   static final void a(int var0, int var1, boolean var2, String var3, boolean var4, boolean var5, String var6) {
      ++f;
      ((int[])((int[])cba.a[1]))[0] = 1;
      var6 = var6.toLowerCase();
      short[] var7 = new short[16];
      int var8 = -1;
      String var9 = null;
      if(~var1 != 0) {
         Object[] var10 = jd.a(var1, (byte)-122, bm.c);
         if(var10 == null || var5 != im.a(true, var10)) {
            return;
         }

         if(!im.a(true, var10)) {
            var8 = ((int[])((int[])var10[1]))[0];
         } else {
            var9 = (String)var10[0];
         }
      }

      int var15 = 0;

      for(int var11 = 0; ((int[])((int[])cqa.a[1]))[0] > var11; ++var11) {
         Object[] var12 = us.a(var11, (byte)96, cqa.a);
         if((!var2 || ((boolean[])((boolean[])var12[10]))[1]) && -1 == ((int[])((int[])var12[1]))[35] && 0 == ~((int[])((int[])var12[1]))[4] && ((int[])((int[])var12[1]))[45] == -1 && -1 == ~((int[])((int[])var12[1]))[18] && 0 != ~((String)var12[12]).toLowerCase().indexOf(var6)) {
            if(-1 != var1) {
               if(var5) {
                  if(!var3.equals(ac.a(var1, var9, 29683, var12))) {
                     continue;
                  }
               } else if(var0 != jfa.a(false, var1, var12, var8)) {
                  continue;
               }
            }

            if(var15 >= 250) {
               via.d = -1;
               gf.a = null;
               return;
            }

            if(var7.length <= var15) {
               short[] var13 = new short[var7.length * 2];
               if(null != var12 && (-8 == ~var12.length && var12[0].equals(Integer.valueOf(2)) || -2 == ~var12.length)) {
                  vja.f_i[17] = null;
               }

               for(int var14 = 0; var15 > var14; ++var14) {
                  var13[var14] = var7[var14];
               }

               var7 = var13;
            }

            var7[var15++] = (short)var11;
         }
      }

      via.d = var15;
      gf.a = var7;
      nga.p = 0;
      String[] var17 = new String[via.d];
      if(var4) {
         for(int var16 = 0; var16 < via.d; ++var16) {
            var17[var16] = (String)us.a(var7[var16], (byte)77, cqa.a)[12];
         }

         kt.a(gf.a, var17, (byte)-89);
         kc.b(133, cba.a);
         ((int[])((int[])cba.a[1]))[0] = 2;
      }
   }

   static final void a(byte var0, Object[] var1) {
      if(var0 < 87) {
         j = -50;
      }

      if(null == var1[3]) {
         var1[3] = new boolean[2];
      }

      if(var1[1] == null) {
         var1[1] = new int[6];
      }

      ++e;
   }

   static final boolean a(int var0, byte var1) {
      ++d;
      if(var1 > -111) {
         g = (Object[][])((Object[][])null);
      }

      return var0 == 58 || 48 == var0 || 17 == var0 || 30 == var0 || var0 == 44 || var0 == 8 || 22 == var0;
   }

   static final void a(Object[] var0, int var1) {
      var0[7] = gma.a(((int[])((int[])var0[1]))[5], var1 ^ -116);
      ++b;
      vd.a(var0, true);
      if(var0 == null || 1 != var0.length) {
         for(int var2 = var1 + ((int[])((int[])var0[1]))[4]; 1 <= var2; --var2) {
            short var3 = ((short[])((short[])var0[6]))[var2];
            if(8 < var3 || var3 < -8) {
               break;
            }

            --((int[])((int[])var0[1]))[4];
         }

      }
   }

   static final int a(int var0, int var1, Object[] var2) {
      ++k;
      return var1 != 32007?91:(!pga.a(var0, client.c(var2), 1) && null == var2[61]?-1:(null != var2[2] && ((int[])((int[])var2[2])).length > var0?((int[])((int[])var2[2]))[var0]:-1));
   }

   static final void a(boolean var0, byte[] var1, byte var2) {
      if(var2 < -111) {
         ++c;
         if(bq.b == null) {
            bq.b = hi.newByteBufferWrapper(20000);
         }

         lr.a(var1.length, var1, 20244, 0, bq.b);
         if(var0) {
            byte[] var3 = (byte[])((byte[])bq.b[2]);
            Object[] var4 = jta.a((byte)-91, var3, new Object[3]);
            int var5 = fh.a(var4, false);
            if(var5 == 2) {
               boolean var6 = -2 == ~fh.a(var4, false);
               if(var6) {
                  mc.a(var4, 0);
               }

               mf.a(var4, 6);
            }

            ft.n = new Object[joa.h][];
            int var8 = 0;

            for(var5 = dv.a; mua.d >= var5; ++var5) {
               Object[] var9;
               if(cja.d && var5 >= dv.a && var5 <= mua.d) {
                  var9 = oi.d[-dv.a + var5];
               } else {
                  var9 = null;
               }

               if(var9 != null) {
                  ft.n[var8++] = var9;
               }
            }

            or.a = false;
            kia.g = he.a(-59);
            bq.b = null;
         }

      }
   }

   static final void putIntLE(int var0, Object[] var1, int var2) {
      byte[] var10000 = (byte[])((byte[])var1[2]);
      int[] var10001 = (int[])((int[])var1[1]);
      int var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)var0;
      ++a;
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)(var0 >> 8);
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)(var0 >> 16);
      var10000 = (byte[])((byte[])var1[2]);
      var10001 = (int[])((int[])var1[1]);
      var10004 = ((int[])((int[])var1[1]))[0];
      var10001[0] = ((int[])((int[])var1[1]))[0] + 1;
      var10000[var10004] = (byte)(var0 >> 24);
      if(var2 != -2) {
         j = -90;
      }

   }

   static final boolean a(int var0, int var1, int var2) {
      if(var1 != -682497288) {
         return false;
      } else {
         ++h;
         return var2 >= 1000 && var0 < 1000?true:(var2 < 1000 && 1000 > var0?(!a(var0, (byte)-114)?!a(var2, (byte)-112):true):var2 >= 1000 && 1000 <= var0);
      }
   }

}
