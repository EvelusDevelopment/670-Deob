
final class eha extends lm {

   static int f_l;
   Object[] j;
   static int k;
   static int m;
   static int p;
   static int n;
   static Object[] o = st.a(new Object[1], 7, 21, 5);
   static boolean[] q = new boolean[100];


   static final void a(boolean var0, Object[] var1) {
      if(var1[4] == null) {
         var1[4] = new boolean[1];
      }

      if(null == var1[1]) {
         var1[1] = new int[8];
      }

      ++n;
      if(var0) {
         ((long[])((long[])((Object[])((Object[])((Object[])((Object[])var1[7]))[10]))[6]))[2] = 62L;
      }

   }

   static final String a(int var0, Object[] var1) {
      ++m;
      int var2 = rda.d(0, var1);
      if(~var2 != 0) {
         if(256 < var2) {
            throw new rq();
         } else {
            String var3 = new String((byte[])((byte[])var1[var0]), ((int[])((int[])var1[1]))[0], var2);
            ((int[])((int[])var1[1]))[0] += var2;
            return var3;
         }
      } else {
         return null;
      }
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      aa.a(15022, var1, var0);
      ++k;
      if(var2 != 256) {
         ((int[])((int[])var1[9]))[6] = ((int[])((int[])var1[0]))[0];
      }

      return var0;
   }

   static final Object[] a(int var0, byte[] var1, Object[] var2) {
      try {
         if(null == var2[1]) {
            var2[1] = new int[3];
         }

         ++p;
         Object[] var3 = jta.a((byte)-93, var1, new Object[3]);
         int var4 = fh.a(var3, false);
         if(var4 == 0) {
            boolean var5 = fh.a(var3, false) == 1;
            var2[0] = new byte[256];
            Class_h.a((byte)-71, 256, var3, (byte[])((byte[])var2[0]), 0);
            if(var5) {
               int[] var6 = new int[256];
               int[] var7 = new int[256];

               int var8;
               for(var8 = 0; 256 > var8; ++var8) {
                  var6[var8] = fh.a(var3, false);
               }

               for(var8 = 0; var8 < 256; ++var8) {
                  var7[var8] = fh.a(var3, false);
               }

               byte[][] var30 = new byte[256][];

               int var11;
               for(int var9 = 0; 256 > var9; ++var9) {
                  var30[var9] = new byte[var6[var9]];
                  byte var10 = 0;

                  for(var11 = 0; var30[var9].length > var11; ++var11) {
                     var10 += ipa.a(var3, (int)-115);
                     var30[var9][var11] = var10;
                  }

                  if(null != var3 && var3.length == 6 && var3[3].equals(Integer.valueOf(0)) && var3[3].equals(Integer.valueOf(2))) {
                     po.a((Object[])null, (String[])null, (int[])null, var0 ^ -65, (String)null, (cga[])null);
                  }
               }

               if(var3 != null && -2 == ~var3.length && var3[0].equals(Boolean.valueOf(false))) {
                  ob.a((Object[])null, (String)null, false, (cga[])null);
               }

               byte[][] var31 = new byte[256][];

               int var32;
               for(var32 = 0; 256 > var32; ++var32) {
                  if(var3 != null && -2 == ~var3.length) {
                     Class_v.a = null;
                  }

                  var31[var32] = new byte[var6[var32]];
                  byte var34 = 0;

                  for(int var12 = 0; ~var12 > ~var31[var32].length; ++var12) {
                     var34 += ipa.a(var3, (int)-122);
                     var31[var32][var12] = var34;
                  }
               }

               var2[2] = new byte[256][256];

               for(var32 = 0; 256 > var32; ++var32) {
                  if(var32 != 32 && 160 != var32) {
                     if(null != var3 && (var3.length == 7 && var3[6].equals(Integer.valueOf(2)) || -3 == ~var3.length && var3[0].equals(Boolean.valueOf(false)) || var3.length == 7)) {
                        Class_v.a = null;
                     }

                     for(var11 = 0; var11 < 256; ++var11) {
                        if(32 != var11 && var11 != 160) {
                           byte[] var33 = ((byte[][])((byte[][])var2[2]))[var32];
                           byte[] var15 = (byte[])((byte[])var2[0]);
                           int var16 = var7[var32];
                           int var17 = var16 + var6[var32];
                           int var18 = var7[var11];
                           int var19 = var6[var11] + var18;
                           int var20 = var16;
                           if(var18 > var16) {
                              var20 = var18;
                           }

                           int var21 = var17;
                           if(var3 != null && var3.length == 2 && var3[1].equals(Integer.valueOf(0))) {
                              uga.a((String)null, (Object[])null, (byte)11);
                           }

                           if(var19 < var17) {
                              var21 = var19;
                           }

                           int var22 = var15[var32] & 255;
                           if(var22 > (var15[var11] & 255)) {
                              var22 = 255 & var15[var11];
                           }

                           byte[] var23 = var31[var32];
                           byte[] var24 = var30[var11];
                           int var25 = var20 - var16;
                           int var26 = -var18 + var20;

                           for(int var27 = var20; var21 > var27; ++var27) {
                              int var28 = var24[var26++] + var23[var25++];
                              if(var22 > var28) {
                                 var22 = var28;
                              }
                           }

                           int var14 = -var22;
                           var33[var11] = (byte)var14;
                        }
                     }
                  }
               }

               ((int[])((int[])var2[1]))[1] = var6[32] + var7[32];
            } else {
               ((int[])((int[])var2[1]))[1] = fh.a(var3, false);
            }

            fh.a(var3, false);
            fh.a(var3, false);
            if(var3 != null && (11 == var3.length || var3.length == 1)) {
               Class_v.a = null;
            }

            ((int[])((int[])var2[var0]))[0] = fh.a(var3, false);
            ((int[])((int[])var2[1]))[2] = fh.a(var3, false);
            return var2;
         } else {
            throw new RuntimeException("");
         }
      } catch (RuntimeException var29) {
         throw vt.a(var29, "eha.B(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

   static final void a(Object[] var0, boolean var1) {
      ++f_l;
      if(!var1) {
         a((Object[])((Object[])var0[0]), true);
      }

      tda var2;
      Object[] var4 = (var2 = (tda)pm.a((long)((int[])((int[])var0[12]))[21], qn.g, false)) != null?var2.f_l:null;
      if(null != var4) {
         if(null != var4[6]) {
            ah.d.b((kp)var4[6]);
            var4[6] = null;
         }

         ((lm)(var4 == null?null:var4[11])).a((byte)88);
      }

   }

   eha(Object[] var1) {
      this.j = var1;
   }

}
