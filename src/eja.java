import java.util.Random;

final class eja {

   static int c;
   static int f;
   static int d;
   static int b;
   static int e = 1;
   static int a;
   static float[] g = new float[4];


   static final void a(byte var0, Object[] var1) {
      if(var0 != 114) {
         a((byte)-30, new Object[0]);
      }

      var1[6] = gma.a(((int[])((int[])var1[1]))[2], 46);
      ++a;
      Random var2 = new Random((long)((int[])((int[])var1[1]))[2]);
      var1[8] = new short[512];
      if(0 < ((int[])((int[])var1[1]))[4]) {
         if(var1 != null && var1.length == 3 && var1[0].equals(Integer.valueOf(2))) {
            jk.a(-126, (Object[])null, -24112);
         }

         for(int var3 = 0; var3 < 512; ++var3) {
            ((short[])((short[])var1[8]))[var3] = (short)cl.a(90, var2, ((int[])((int[])var1[1]))[4]);
         }
      }

   }

   static final Object[] a(int var0, Object[] var1, Object[] var2, Object[] var3, Object[] var4, byte var5) {
      ++d;
      if(null == var4[1]) {
         var4[1] = new int[2];
      }

      ((int[])((int[])var4[1]))[0] = 0;
      ((int[])((int[])var4[1]))[1] = 0;
      var4[3] = sj.a(64, new Object[3], (byte)-73);
      var4[2] = null;
      var4[0] = var3;
      var4[2] = var2;
      if(var5 <= 60) {
         return (Object[])null;
      } else {
         var4[4] = var1;
         if(null != var4[4]) {
            ((int[])((int[])var4[1]))[1] = jla.a((Object[])((Object[])var4[4]), (byte)-121, 1);
         }

         if(null != var4[0]) {
            ((int[])((int[])var4[1]))[0] = jla.a((Object[])((Object[])var4[0]), (byte)106, 1);
         }

         return var4;
      }
   }

   static final boolean a(Object[] var0, boolean var1) {
      boolean var2 = jp.o == wd.a;
      int var3 = 0;
      short var4 = 0;
      byte var5 = 0;
      if(var0 != null && 43 == var0.length) {
         hr.a(var0, 21357);
      } else if(var0 != null && -25 == ~var0.length) {
         oea.a((byte)117, var0);
      } else {
         mma.a(13778, var0);
      }

      if(((short[])((short[])var0[13]))[1] >= 0 && ((short[])((short[])var0[13]))[3] >= 0 && ((short[])((short[])var0[13]))[0] < c && ((short[])((short[])var0[13]))[2] < me.c) {
         short var6 = 0;

         int var7;
         int var8;
         for(var7 = ((short[])((short[])var0[13]))[1]; var7 <= ((short[])((short[])var0[13]))[0]; ++var7) {
            for(var8 = ((short[])((short[])var0[13]))[3]; var8 <= ((short[])((short[])var0[13]))[2]; ++var8) {
               Object[] var9 = ws.a((int) ((byte[])((byte[])var0[10]))[0], var7, var8);//check
               if(var9 != null) {
                  Object[] var10 = aca.a(var0, (int)126);
                  Object[] var11 = (Object[])((Object[])var9[3]);
                  if(var11 == null) {
                     var9[3] = var10;
                  } else {
                     while(var11[0] != null) {
                        var11 = (Object[])((Object[])var11[0]);
                     }

                     var11[0] = var10;
                  }

                  if(var2 && (rb.d[var7][var8] & -16777216) != 0) {
                     var3 = rb.d[var7][var8];
                     var4 = esa.g[var7][var8];
                     var5 = wk.e[var7][var8];
                  }

                  if(!var1 && var9[6] != null && ((short[])((short[])((Object[])((Object[])var9[6]))[14]))[0] > var6) {
                     var6 = ((short[])((short[])((Object[])((Object[])var9[6]))[14]))[0];
                  }
               }
            }
         }

         if(var2 && (var3 & -16777216) != 0) {
            for(var7 = ((short[])((short[])var0[13]))[1]; var7 <= ((short[])((short[])var0[13]))[0]; ++var7) {
               for(var8 = ((short[])((short[])var0[13]))[3]; var8 <= ((short[])((short[])var0[13]))[2]; ++var8) {
                  if((rb.d[var7][var8] & -16777216) == 0) {
                     rb.d[var7][var8] = var3;
                     esa.g[var7][var8] = var4;
                     wk.e[var7][var8] = var5;
                  }
               }
            }
         }

         if(var1) {
            mqa.g[aha.b++] = var0;
         } else {
            var7 = jp.o == wd.a?1:0;
            if(eb.c(46, var0)) {
               if(kca.a(var0, 27381)) {
                  var0[11] = usa.e[var7];
                  usa.e[var7] = var0;
               } else {
                  var0[11] = ri.f_l[var7];
                  ri.f_l[var7] = var0;
                  bla.b = true;
               }
            } else {
               var0[11] = sfa.g[var7];
               sfa.g[var7] = var0;
            }
         }

         Object[] var12 = mha.a((byte)125, new Object[2], (Object[])((Object[])woa.a(5, var0)[1]));
         if(var1) {
            ((float[])((float[])var12[1]))[0] -= (float)var6;
            sra.a(var0, var12, 1);
         }

         return true;
      } else {
         return false;
      }
   }

   static final void a(Object[] var0, int var1, Object[] var2) {
      if(var1 != 0) {
         e = -85;
      }

      ++f;
      if(null != var0 && var0.length == 30 && var0[15].equals(Integer.valueOf(1))) {
         coa.a(-125, (Object[])null, (Object[])null);
      }

      while(true) {
         int var3 = fh.a(var0, false);
         if(var3 == 0) {
            return;
         }

         int var4;
         if(var3 != 1) {
            if(var3 != 3) {
               if(var3 == 4) {
                  ((int[])((int[])var2[1]))[1] = fh.a(var0, false);
               } else if(5 != var3) {
                  if(6 == var3) {
                     var2[2] = new int[fh.a(var0, false)];

                     for(var4 = 0; ((int[])((int[])var2[2])).length > var4; ++var4) {
                        ((int[])((int[])var2[2]))[var4] = fh.a(var0, false);
                     }
                  }
               } else {
                  var2[3] = new int[fh.a(var0, false)];

                  for(var4 = 0; ((int[])((int[])var2[3])).length > var4; ++var4) {
                     ((int[])((int[])var2[3]))[var4] = fh.a(var0, false);
                  }

                  if(var2 != null && var2.length == 20 && var2[3].equals(Boolean.valueOf(false))) {
                     return;
                  }
               }
            } else {
               ((int[])((int[])var2[1]))[0] = fh.a(var0, false);
            }
         } else {
            var4 = fh.a(var0, false);
            if(var2 != null && -3 == ~var2.length && var2[1].equals(Integer.valueOf(0)) && var2[1].equals(Integer.valueOf(2))) {
               a((Object[])null, 0, (Object[])null);
            }

            var2[0] = new int[var4];

            for(int var5 = 0; ~var5 > ~((int[])((int[])var2[0])).length; ++var5) {
               ((int[])((int[])var2[0]))[var5] = fh.a(var0, false);
               if(0 != ((int[])((int[])var2[0]))[var5] && 2 == ((int[])((int[])var2[0]))[var5]) {
                  ;
               }
            }
         }
      }
   }

}
