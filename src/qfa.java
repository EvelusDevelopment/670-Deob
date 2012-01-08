import jagdx.IDirect3DDevice;
import jaggl.OpenGL;

final class qfa {

   static int f;
   static int b;
   static int c;
   static int d;
   static int e;
   static int a;


   static final void a(Object[] var0, boolean[][] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      ++c;
      Object[] var10;
      ue var11 = ((ta)(null != (var10 = (Object[])((Object[])var0[11]))?var10[55]:null)).e(30626);
      if(0 < ((int[])((int[])var0[1]))[4] && null != var11) {
         kr.a((Object[])((Object[])var0[11]), (int)62);
         cka.a(20, (Object[])((Object[])var0[11]), false);
         pda.a((Object[])((Object[])var0[11]), -21342, false);
         wma.a(-1000, (Object[])((Object[])var0[11]), false);
         jma.a(119, false, (Object[])((Object[])var0[11]));
         kd.a(3042, (Object[])((Object[])var0[11]), 0);
         jia.a((Object[])((Object[])var0[11]), 0, -2);
         moa.a((byte)108, (Object[])null, (Object[])((Object[])var0[11]));
         ria.d[0] = (float)var3 / (128.0F * (float)((aa)var0[6]).g * (float)var11.e());
         ria.d[3] = 0.0F;
         ria.d[2] = 0.0F;
         ria.d[4] = 0.0F;
         ria.d[1] = 0.0F;
         ria.d[5] = (float)var3 / (128.0F * (float)((aa)var0[6]).g * (float)var11.d());
         ria.d[7] = 0.0F;
         ria.d[11] = 0.0F;
         ria.d[8] = 0.0F;
         ria.d[9] = 0.0F;
         ria.d[6] = 0.0F;
         ria.d[10] = 0.0F;
         ria.d[12] = -(((float)(var3 * var9) / 128.0F - (float)(2 * var7)) / (float)var11.e()) + -1.0F;
         ria.d[13] = 1.0F - ((float)(var4 * 2) + (float)(var3 * var8) / 128.0F) / (float)var11.d();
         ria.d[14] = 0.0F;
         ria.d[15] = 1.0F;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(ria.d, 0);
         ria.d[1] = 0.0F;
         ria.d[3] = 0.0F;
         ria.d[7] = 0.0F;
         ria.d[5] = 0.0F;
         ria.d[15] = 1.0F;
         ria.d[0] = 1.0F;
         ria.d[4] = 0.0F;
         ria.d[8] = 0.0F;
         ria.d[10] = 0.0F;
         ria.d[9] = 1.0F;
         ria.d[14] = 0.0F;
         ria.d[12] = 0.0F;
         ria.d[6] = 1.0F;
         ria.d[2] = 0.0F;
         ria.d[11] = 0.0F;
         ria.d[13] = 0.0F;
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadMatrixf(ria.d, 0);
         if(-1 == ~(7 & ((int[])((int[])var0[1]))[3])) {
            pda.a((Object[])((Object[])var0[11]), -21342, false);
         } else {
            pda.a((Object[])((Object[])var0[11]), -21342, true);
            pga.a((Object[])((Object[])var0[11]), 0);
         }

         nqa.a((Object[])((Object[])var0[0]), (Object[])((Object[])var0[3]), 20798, (Object[])((Object[])var0[5]), (Object[])((Object[])var0[11]), (Object[])((Object[])var0[16]));
         if(var5 <= -30) {
            if(((byte[])((byte[])((Object[])((Object[])((Object[])((Object[])var0[11]))[54]))[2])).length < ((int[])((int[])var0[1]))[2] * 2) {
               ((Object[])((Object[])var0[11]))[54] = jaa.a(new Object[3], 2 * ((int[])((int[])var0[1]))[2], false);
            } else {
               ((int[])((int[])((Object[])((Object[])((Object[])((Object[])var0[11]))[54]))[1]))[0] = 0;
            }

            int var12 = 0;
            Object[] var13 = (Object[])((Object[])((Object[])((Object[])var0[11]))[54]);
            int var14;
            int var15;
            short[] var17;
            int var16;
            int var18;
            if(((boolean[])((boolean[])((Object[])((Object[])var0[11]))[17]))[11]) {
               for(var14 = var6; var14 < var8; ++var14) {
                  var15 = var9 + var14 * ((aa)var0[6]).f_i;
                  if(var13 != null && -17 == ~var13.length && var13[8].equals(Integer.valueOf(2))) {
                     wsa.a((int[])null, -83, (byte)32, (int[])null, false, (int[])null, (int[])null, (Object[])null, (int[])null, 10, (int[])null, (Object[])null, (int[])null, (int[])null);
                  }

                  for(var16 = var9; var16 < var2; ++var16) {
                     if(var1[-var9 + var16][var14 + -var6]) {
                        var17 = ((short[][])((short[][])var0[7]))[var15];
                        if(null != var17) {
                           if(var0 != null && -30 == ~var0.length && var0[15].equals(Boolean.valueOf(false))) {
                              return;
                           }

                           for(var18 = 0; var17.length > var18; ++var18) {
                              ++var12;
                              eda.putShort(var13, var17[var18] & '\uffff');
                           }
                        }
                     }

                     ++var15;
                  }
               }

               if(var13 != null && -3 == ~var13.length && var13[0].equals(Integer.valueOf(0))) {
                  return;
               }
            } else {
               if(null != var0 && 3 == var0.length) {
                  jg.a((int[])null, (int[])null, 1, -83, (int[])null, (int[])null, (int[])null, 31, (int[])null, (int[])null, (Object[])null, (int[])null, (Object[])null, (int[])null, (int[])null, (int[])null, true);
               }

               for(var14 = var6; var8 > var14; ++var14) {
                  var15 = var9 + ((aa)var0[6]).f_i * var14;
                  if(var0 != null && (2 == var0.length && var0[1].equals(Boolean.valueOf(false)) || var0.length == 1 && var0[0].equals(Boolean.valueOf(false)))) {
                     ip.a(-62, 14, (Object[])null, 96, (ya)null, (byte)127, true, 28);
                  }

                  for(var16 = var9; var2 > var16; ++var16) {
                     if(var1[var16 + -var9][-var6 + var14]) {
                        var17 = ((short[][])((short[][])var0[7]))[var15];
                        if(null != var17) {
                           for(var18 = 0; var17.length > var18; ++var18) {
                              nua.a(var13, 1, '\uffff' & var17[var18]);
                              ++var12;
                           }

                           if(null != var0 && 2 == var0.length && var0[1].equals(Integer.valueOf(2)) && var0[1].equals(Integer.valueOf(1))) {
                              return;
                           }
                        }
                     }

                     ++var15;
                  }
               }
            }

            if(0 < var12) {
               Object[] var20 = hha.a((Object[])((Object[])var0[11]), 5123, new Object[1], (byte[])((byte[])var13[2]), ((int[])((int[])var13[1]))[0], 35);
               kna.a(4, var20, var12, (Object[])((Object[])var0[11]), -66, 0);
            }

         }
      }
   }

   static final void a(int var0, boolean var1, Object[] var2, Object[] var3, int var4) {
      if(((boolean[])((boolean[])var3[63]))[16]) {
         int var6 = 0;
         byte var5;
         if(var0 == 1) {
            var5 = 6;
         } else if(var0 == 2) {
            var5 = 27;
         } else {
            var5 = 5;
         }

         if(var1) {
            var6 |= 16;
         }

         IDirect3DDevice.SetTextureStageState(((long[])((long[])var3[50]))[5], ((int[])((int[])var3[1]))[7], var5, cr.a(var2, (byte)-78) | var6);
      }

      int var8 = 61 / ((-70 - var4) / 47);
      ++a;
   }

   static final void a(byte var0, Object[] var1) {
      ++b;
      sj.a((Object[])((Object[])var1[3]), (byte)-11, (int)0);
      ah.a((Object[])((Object[])var1[3]), (Object[])((Object[])var1[2]), (byte)92);
      mb.a((Object[])((Object[])var1[3]), 13195, haa.b, 0);
      if(var0 > -91) {
         a((int)-5, (Object[])null);
      }

      roa.a(haa.b, 101, (Object[])((Object[])var1[3]), 0);
      mqa.a((Object[])((Object[])var1[3]), Class_t.c, (byte)109, Class_t.c);
      sea.a((Object[])((Object[])var1[0]), nt.c((Object[])((Object[])var1[3]), 94), (byte)53);
      we.a(tka.q, (Object[])((Object[])var1[3]), -21748);
   }

   static final void a(Object[] var0, byte var1) {
      ((int[])((int[])var0[1]))[5] = 128;
      if(var1 <= -14) {
         ((int[])((int[])var0[1]))[3] = 0;
         ((boolean[])((boolean[])var0[6]))[0] = false;
         ++d;
         ((byte[])((byte[])var0[3]))[0] = 0;
         ((int[])((int[])var0[1]))[6] = -1;
         ((int[])((int[])var0[1]))[8] = 0;
         ((int[])((int[])var0[1]))[4] = -1;
         ((int[])((int[])var0[1]))[1] = 128;
         ((int[])((int[])var0[1]))[0] = 0;
      }
   }

   static final void a(int var0, Object[] var1) {
      ++e;
      if(null == var1[1]) {
         var1[1] = new int[2];
      }

      if(var0 != 10) {
         a(39, false, (Object[])null, (Object[])null, -25);
      }

   }

   static final void a(boolean var0, lua var1, Object[] var2) {
      try {
         if(!var0) {
            ++f;
            kia var3;
            Object[] var6 = null != (var3 = (kia)var1)?var3.f:null;
            if(null != var2[4] && var6 != null && (((int[])((int[])((Object[])((Object[])var2[4]))[1]))[0] != ((int[])((int[])var6[1]))[1] || ((int[])((int[])((Object[])((Object[])var2[4]))[1]))[1] != ((int[])((int[])var6[1]))[0])) {
               throw new RuntimeException();
            } else {
               label56: {
                  if(var6 != null) {
                     ((int[])((int[])var2[1]))[0] = ((int[])((int[])var6[1]))[1];
                     ((int[])((int[])var2[1]))[1] = ((int[])((int[])var6[1]))[0];
                     if(client.f_vb == 0) {
                        break label56;
                     }
                  }

                  if(null == var2[4]) {
                     ((int[])((int[])var2[1]))[0] = 0;
                     ((int[])((int[])var2[1]))[1] = 0;
                  }
               }

               var2[0] = var6;
               Object[] var5;
               if((null != var2?var2[3]:null) == ((ta)(null == (var5 = (Object[])((Object[])var2[2]))?null:var5[6])).e(30626)) {
                  lba.a(122, var2);
               }

            }
         }
      } catch (RuntimeException var7) {
         throw vt.a(var7, "qfa.A(" + var0 + ',' + (var1 != null?"{...}":"null") + ',' + (var2 != null?"{...}":"null") + ')');
      }
   }

}
