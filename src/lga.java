
final class lga {

   static int a;
   static int h;
   static int j;
   static int f;
   static int e;
   static int b;
   static Object[] c = st.a(new Object[1], 7, 42, 4);
   static int g;
   static int k;
   static int f_l;
   static boolean f_i = false;
   static Object[] d = st.a(new Object[1], 7, 17, 24);


   static final Object[] a(int var0, Object[] var1, String var2, int var3, String var4) {
      ++k;
      var1[0] = var4;
      if(null == var1[1]) {
         var1[1] = new int[1];
      }

      var1[2] = var2;
      ((int[])((int[])var1[var3]))[0] = var0;
      return var1;
   }

   static final void a(boolean var0, Object[] var1) {
      ++h;
      Object[] var2 = (Object[])((Object[])var1[30]);
      if(wna.a(var2, 4) && iha.a(1, (byte)-126, var2) && ela.a(var2, 3)) {
         if(((boolean[])((boolean[])var1[8]))[7]) {
            rs.a(cp.a(ro.a((int)3, var1), -126), var2, -83);
            ((boolean[])((boolean[])var1[8]))[7] = wna.a(var2, 4);
         }

         hna.a(-57, var2);
      }

      Object[] var4;
      Object[] var5;
      for(int var3 = 0; var3 < ((Object[])((Object[])var1[18])).length; ++var3) {
         if(((int[])((int[])((Object[][])((Object[][])var1[18]))[var3][1]))[1] != -1) {
            var4 = (Object[])((Object[])((Object[][])((Object[][])var1[18]))[var3][0]);
            if(tt.a(var4, 0)) {
               var5 = qda.a(((int[])((int[])((Object[][])((Object[][])var1[18]))[var3][1]))[1], (byte)-64, dfa.a);
               Object[] var6 = nc.a(false, var4);
               if(((boolean[])((boolean[])var5[6]))[0]) {
                  if(((int[])((int[])var6[1]))[6] == 3) {
                     if(((int[])((int[])var1[12]))[20] > 0 && kda.d >= ((int[])((int[])var1[12]))[29] && ((int[])((int[])var1[12]))[35] < kda.d) {
                        rs.a(-1, var4, -91);
                        ((int[])((int[])((Object[][])((Object[][])var1[18]))[var3][1]))[1] = -1;
                        continue;
                     }
                  } else if(-2 == ~((int[])((int[])var6[1]))[6] && ((int[])((int[])var1[12]))[20] > 0 && ~kda.d <= ~((int[])((int[])var1[12]))[29] && ((int[])((int[])var1[12]))[35] < kda.d) {
                     continue;
                  }
               }
            }

            if(iha.a(1, (byte)-108, var4) && ela.a(var4, 3)) {
               rs.a(-1, var4, 118);
               ((int[])((int[])((Object[][])((Object[][])var1[18]))[var3][1]))[1] = -1;
            }
         }
      }

      Object[] var7 = (Object[])((Object[])var1[25]);
      if(!var0) {
         a(((int[])((int[])d[2]))[3]);
      }

      if(wna.a(var7, 4)) {
         label103: {
            var4 = nc.a(false, var7);
            if(((int[])((int[])var4[1]))[6] != 3) {
               if(1 == ((int[])((int[])var4[1]))[6]) {
                  if(((int[])((int[])var1[12]))[20] > 0 && kda.d >= ((int[])((int[])var1[12]))[29] && ((int[])((int[])var1[12]))[35] < kda.d) {
                     Class_is.a(1, var7, (byte)6);
                     break label103;
                  }

                  Class_is.a(0, var7, (byte)12);
               }
            } else if(((int[])((int[])var1[12]))[20] > 0 && kda.d >= ((int[])((int[])var1[12]))[29] && ~kda.d < ~((int[])((int[])var1[12]))[35]) {
               var1[31] = null;
               rs.a(-1, var7, -14);
               break label103;
            }

            if(iha.a(1, (byte)-107, var7) && ela.a(var7, 3)) {
               var1[31] = null;
               rs.a(-1, var7, -63);
            }
         }
      }

      if(var2 != null && -2 == ~var2.length && var2[0].equals(Integer.valueOf(1))) {
         mi.g = null;
      }

      for(int var8 = 0; var8 < ((Object[])((Object[])var1[20])).length; ++var8) {
         var5 = ((Object[][])((Object[][])var1[20]))[var8];
         if(null != var5) {
            if(0 >= ((int[])((int[])var5[1]))[6]) {
               if(iha.a(1, (byte)-128, var5) && ela.a(var5, 3)) {
                  ((Object[][])((Object[][])var1[20]))[var8] = null;
               }
            } else {
               --((int[])((int[])var5[1]))[6];
            }
         }
      }

   }

   static final void a(int var0, Object[] var1) {
      ++g;
      var1[4] = ab.a(new Object[2], (byte)108);
      var1[6] = ab.a(new Object[2], (byte)89);
      var1[var0] = ab.a(new Object[2], (byte)-29);
   }

   static final void a(int var0) {
      ++j;

      for(int var1 = 0; 5 > var1; ++var1) {
         ll.b[var1] = false;
      }

      nca.a = -1;
      es.b = kda.d;
      mra.f = pta.f;
      hh.b = var0;
      jj.z = -1;
      sga.a = woa.M;
      nta.e = -1;
      go.a = qt.e;
      ha.e = 5;
      rf.f = 0;
      mma.a = 0;
      nt.g = qaa.r;
      ln.d = cp.a;
   }

   static final void a(byte var0, Object[] var1) {
      if(var0 >= 3) {
         ((int[])((int[])var1[1]))[1] = 0;
         ((boolean[])((boolean[])var1[5]))[2] = false;
         ++f_l;
         ((int[])((int[])var1[1]))[5] = 0;
         ((int[])((int[])var1[1]))[2] = 0;
         ((int[])((int[])var1[1]))[0] = 0;
      }
   }

   static final Object[] a(int var0, int var1, int var2, Object[] var3, int var4, int var5, Object[] var6) {
      ++f;
      faa[] var7 = null;
      Object[] var8 = qga.a(var1, var3, -128);
      Object[] var10;
      int var11;
      if(var8[0] != null) {
         var7 = new faa[((int[])((int[])var8[0])).length];

         for(int var9 = 0; ~var9 > ~var7.length; ++var9) {
            var11 = ((int[])((int[])var8[0]))[var9];
            Object[] var12;
            synchronized(var6[0]) {
               var12 = (Object[])((Object[])dna.a((byte)34, (Object[])((Object[])var6[0]), (long)var11));
            }

            if(var12 == null) {
               byte[] var13;
               synchronized(var6[1]) {
                  var13 = qn.a(30, var11, (Object[])((Object[])var6[1]), 54);
               }

               var12 = hc.b(83, new Object[2]);
               if(null != var13) {
                  tk.b(-1, var12, jta.a((byte)-86, var13, new Object[3]));
               }

               var10 = var12;
               synchronized(var6[0]) {
                  il.a((long)var11, var12, true, (Object[])((Object[])var6[0]));
               }
            } else {
               var10 = var12;
            }

            var7[var9] = new faa(((int[])((int[])var10[1]))[9], ((int[])((int[])var10[1]))[3], ((int[])((int[])var10[1]))[4], ((int[])((int[])var10[1]))[0], ((int[])((int[])var10[1]))[5], ((int[])((int[])var10[1]))[8], ((int[])((int[])var10[1]))[2], ((boolean[])((boolean[])var10[0]))[0], ((int[])((int[])var10[1]))[1], ((int[])((int[])var10[1]))[6], ((int[])((int[])var10[1]))[7]);
         }
      }

      var10 = new Object[9];
      if(var0 > -89) {
         return (Object[])null;
      } else {
         var11 = ((int[])((int[])var8[1]))[0];
         int var20 = ((int[])((int[])var8[1]))[1];
         int var21 = ((int[])((int[])var8[1]))[3];
         int var14 = ((int[])((int[])var8[1]))[2];
         if(null != var3 && -6 == ~var3.length) {
            return null;
         } else {
            rda.c(1, var10);
            uj.a(var10, -126);
            ((int[])((int[])var10[1]))[0] = var2;
            if(null != var8 && -20 == ~var8.length) {
               return null;
            } else {
               ((int[])((int[])var10[1]))[10] = var5;
               ((int[])((int[])var10[1]))[13] = var4;
               ((int[])((int[])var10[1]))[6] = var11;
               var10[8] = var7;
               ((int[])((int[])var10[1]))[4] = var21;
               if(var7 != null) {
                  var10[5] = new faa[var7.length];
                  var10[4] = 0 > var20?null:var7[var20];
               } else {
                  var10[4] = null;
                  var10[5] = null;
               }

               ((int[])((int[])var10[1]))[2] = var14;
               return var10;
            }
         }
      }
   }

   static final int a(Object[] var0, int var1) {
      ((int[])((int[])var0[1]))[0] += 2;
      int var2 = 99 % ((var1 - 30) / 34);
      ++a;
      return (255 & ((byte[])((byte[])var0[2]))[((int[])((int[])var0[1]))[0] - 2] - 128) + ('\uff00' & ((byte[])((byte[])var0[2]))[-1 + ((int[])((int[])var0[1]))[0]] << 8);
   }

   static final void b(int var0, Object[] var1) {
      ++e;

      wg var2;
      wg var3;
      for(Object[] var6 = (var2 = (wg)gm.a((Object[])((Object[])var1[2]), var0)) == null?null:var2.t; null != var6; var6 = null == (var3 = (wg)dka.a((Object[])((Object[])var1[2]), (byte)115))?null:var3.t) {
         if(du.a((byte)-105, var6)) {
            ((lm)(var6 == null?null:var6[0])).a((byte)103);
            ((tha)(null == var6?null:var6[0])).a(8192);
            ((int[])((int[])var1[1]))[0] += ((int[])((int[])var6[1]))[0];
         }
      }

   }

   static final int c(int var0, Object[] var1) {
      if(var0 <= 123) {
         return 2;
      } else {
         ++b;
         return oga.a((Object[])((Object[])var1[17]), true);
      }
   }

}
