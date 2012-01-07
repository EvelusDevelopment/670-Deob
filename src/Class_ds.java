import jaggl.OpenGL;

final class Class_ds {

   static int a;
   static int f;
   static int e;
   static int d;
   static int c = 0;
   static int g;
   static int b;


   static final boolean a(byte var0, Object[] var1, ta var2) {
      ++g;
      boolean var4;
      if(null != var1 && (var1.length == 16 && ((byte[])((byte[])var1[10])).length == 3 || var1.length >= 24 || -18 == ~var1.length || var1.length == 20 && ((int[])((int[])var1[12])).length == 7)) {
         byte var15 = ((byte[])((byte[])var1[10]))[1];
         short var6 = ((short[])((short[])var1[13]))[1];
         short var7 = ((short[])((short[])var1[13]))[0];
         short var8 = ((short[])((short[])var1[13]))[3];
         short var9 = ((short[])((short[])var1[13]))[2];
         Object[] var10 = es.a(var1, (byte)-13, var2);
         if(cq.h && bqa.f_i) {
            if(102 > tia.f_i) {
               var4 = false;
            } else {
               if(var10 != null && -16 == ~var10.length) {
                  return true;
               }

               if(var6 == var7 && var9 == var8) {
                  if(lt.a(var15, var6, var8, 10412)) {
                     if(!bga.c(var10, 6)) {
                        var4 = false;
                     } else {
                        var4 = true;
                     }
                  } else {
                     var4 = false;
                  }
               } else {
                  int var11 = var6;

                  while(true) {
                     if(var11 > var7) {
                        if(!bga.c(var10, 6)) {
                           var4 = false;
                        } else {
                           var4 = true;
                        }
                        break;
                     }

                     for(int var12 = var8; var12 <= var9; ++var12) {
                        if(~so.f[var15][var11][var12] == ~(-nda.c)) {
                           var4 = false;
                           return var4;
                        }
                     }

                     if(null != var10 && -7 == ~var10.length && var10[0].equals(Integer.valueOf(1)) && var10[0].equals(Integer.valueOf(0))) {
                        nv.a((ta)null, 85, (Object[])null, 78, 3);
                     }

                     ++var11;
                  }
               }
            }
         } else {
            var4 = false;
         }

         return var4;
      } else if(null != var1 && 20 == var1.length && (8 == ((boolean[])((boolean[])var1[8])).length || -8 == ~((boolean[])((boolean[])var1[8])).length)) {
         return uda.a(var2, var1, 15);
      } else if(null != var1 && (18 == var1.length || var1.length == 20 && 2 == ((byte[])((byte[])var1[10])).length && var1[14].equals(Integer.valueOf(0)))) {
         return iq.a(var2, (byte)-128, var1);
      } else {
         Object[] var5;
         if(null != var1 && -17 == ~var1.length && 11 == ((int[])((int[])var1[12])).length) {
            Object[] var14 = (Object[])((Object[])woa.a(5, var1)[1]);
            var5 = wh.a(((byte[])((byte[])var1[10]))[0], (int)((float[])((float[])var14[1]))[2] >> qqa.e, (int)((float[])((float[])var14[1]))[1] >> qqa.e);
            boolean var13;
            if(var5 != null && ((boolean[])((boolean[])((Object[])((Object[])var5[1]))[8]))[4]) {
               var13 = ala.a((int)((float[])((float[])var14[1]))[1] >> qqa.e, (int)((float[])((float[])var14[1]))[2] >> qqa.e, 116, ((byte[])((byte[])var1[10]))[0], dca.a(true, (Object[])((Object[])var5[1])) + dca.a(true, var1));
            } else {
               var13 = lt.a(((byte[])((byte[])var1[10]))[0], (int)((float[])((float[])var14[1]))[2] >> qqa.e, (int)((float[])((float[])var14[1]))[1] >> qqa.e, 10412);
            }

            return var13;
         } else {
            int var3 = 58 % ((var0 + 66) / 46);
            if(var1 != null && -24 <= ~var1.length && var1.length >= 21) {
               var5 = (Object[])((Object[])woa.a(5, var1)[1]);
               var4 = lt.a(((byte[])((byte[])var1[10]))[1], (int)((float[])((float[])var5[1]))[2] >> qqa.e, (int)((float[])((float[])var5[1]))[1] >> qqa.e, 10412);
               return var4;
            } else {
               throw new IllegalStateException();
            }
         }
      }
   }

   static final void a(Object[] var0, byte var1) {
      ++a;
      ((float[])((float[])var0[0]))[1] = 0.0F;
      ((float[])((float[])var0[0]))[4] = 0.0F;
      ((float[])((float[])var0[0]))[3] = 0.0F;
      ((float[])((float[])var0[0]))[0] = 1.0F;
      ((float[])((float[])var0[0]))[2] = 0.0F;
      if(var0 != null && 19 == var0.length) {
         bj.a((byte)-79, (float[])null, (Object[])null);
      }

      ((float[])((float[])var0[0]))[13] = 0.0F;
      ((float[])((float[])var0[0]))[14] = 0.0F;
      if(var1 <= 93) {
         a(((int[])((int[])var0[4]))[0], ((byte[])((byte[])var0[1]))[3]);
      }

      ((float[])((float[])var0[0]))[7] = 0.0F;
      ((float[])((float[])var0[0]))[6] = 0.0F;
      ((float[])((float[])var0[0]))[11] = 0.0F;
      ((float[])((float[])var0[0]))[10] = 1.0F;
      ((float[])((float[])var0[0]))[9] = 0.0F;
      ((float[])((float[])var0[0]))[5] = 1.0F;
      ((float[])((float[])var0[0]))[12] = 0.0F;
      ((float[])((float[])var0[0]))[8] = 0.0F;
      ((float[])((float[])var0[0]))[15] = 1.0F;
   }

   static final void a(boolean var0, int var1, Object[] var2) {
      ++f;
      if(var0) {
         a((Object[])null, (byte)9);
      }

      OpenGL.glDrawBuffer(var1 + '\u8ce0');
   }

   static final int a(int var0, int var1, int var2, byte var3) {
      if(var3 != 122) {
         a((byte)-98, (Object[])null, (ta)null);
      }

      ++b;
      if(jp.o != null) {
         int var4 = var1 >> 9;
         int var5 = var2 >> 9;
         if(var4 >= 0 && var5 >= 0 && var4 <= -1 + rp.c && wpa.a - 1 >= var5) {
            int var6 = var0;
            if(var0 < 3 && (pd.b[1][var4][var5] & 2) != 0) {
               var6 = var0 + 1;
            }

            return jp.o[var6].a(1, var1, var2);
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   static final Object[] a(boolean var0, Object[] var1, Object[] var2) {
      if(var1[1] == null) {
         var1[1] = new int[1];
      }

      ++d;
      lga.a((int)5, var1);
      var1[0] = var2;
      if(!var0) {
         ((boolean[])((boolean[])var1[2]))[35] = false;
      }

      return var1;
   }

   static final void a(int var0, byte var1) {
      if(var1 <= 2) {
         c = -71;
      }

      sm.b = var0;
      ++e;
      dq.a(115, ic.f);
   }

}
