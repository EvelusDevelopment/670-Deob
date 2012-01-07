import jaggl.OpenGL;

final class Class_a {

   static int f_i;
   static int d;
   static int f;
   static int h;
   static int b;
   static int e;
   static Object[][] c = new Object[50][];
   static int j;
   static int g;
   static Object[] a;
   static short k = 256;


   static final boolean c(Object[] var0, int var1) {
      ++d;
      if(var1 != 0) {
         a(-124, (Object[])((Object[])var0[6]), 127, ((int[])((int[])var0[6]))[2]);
      }

      return ((OpenGL)var0[3]).setSurface(((long[])((long[])var0[4]))[0]) && pna.a((byte)108, var0);
   }

   static final void a(byte var0, Object[] var1) {
      if(var0 > 97) {
         ++f_i;
         if(null != var1 && var1.length == 21) {
            an.a((Object[])((Object[])var1[12]), (Object[])((Object[])var1[9]), true);
            mn.a((Object[])((Object[])var1[7]), (Object[])((Object[])var1[9]), (byte)74, 1, (Object[])((Object[])var1[10]));
            kaa.a((Object[])((Object[])var1[5]), (Object[])((Object[])var1[9]), 80, (Object[])((Object[])var1[17]));
            tua.b((byte)88, var1);
         } else if(null != var1 && var1.length == 9) {
            sj.a((Object[])((Object[])var1[0]), (byte)-69, (int)1);
            ah.a((Object[])((Object[])var1[0]), (Object[])((Object[])var1[7]), (byte)117);
            sea.a((Object[])((Object[])var1[5]), nt.c((Object[])((Object[])var1[0]), -67), (byte)61);
            we.a(tka.q, (Object[])((Object[])var1[0]), -21748);
            mqa.a((Object[])((Object[])var1[0]), pba.b, (byte)116, Class_t.c);
            mb.a((Object[])((Object[])var1[0]), 13195, ug.a, 0);
            lta.a((byte)46, var1);
            sj.a((Object[])((Object[])var1[0]), (byte)77, (int)1);
            opa.a((Object[])((Object[])var1[0]), false);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final void b(Object[] var0, int var1) {
      ++f;
      if(null == var0 || var0.length != 29 && var0.length != 4) {
         OpenGL.glMatrixMode(5888);
         OpenGL.glLoadMatrixf((float[])((float[])((Object[])((Object[])var0[28]))[0]), var1);

         int var2;
         for(var2 = 0; var2 < ((int[])((int[])var0[1]))[37]; ++var2) {
            Object[] var3 = ((Object[][])((Object[][])var0[30]))[var2];
            int var4 = gaa.a(var3, (byte)-69);
            int var5 = var2 + 16386;
            float var6 = sba.a(var1 + 0, var3) / 255.0F;
            ((float[])((float[])var0[76]))[0] = (float)lba.a(var3, -25699);
            ((float[])((float[])var0[76]))[1] = (float)sla.a(var3, false);
            ((float[])((float[])var0[76]))[2] = (float)fn.a(var3, var1 + 0);
            ((float[])((float[])var0[76]))[3] = 1.0F;
            OpenGL.glLightfv(var5, 4611, (float[])((float[])var0[76]), 0);
            ((float[])((float[])var0[76]))[1] = var6 * (float)(('\uff88' & var4) >> 8);
            ((float[])((float[])var0[76]))[0] = (float)(255 & var4 >> 16) * var6;
            ((float[])((float[])var0[76]))[2] = (float)(var4 & 255) * var6;
            ((float[])((float[])var0[76]))[3] = 1.0F;
            OpenGL.glLightfv(var5, 4609, (float[])((float[])var0[76]), 0);
            OpenGL.glLightf(var5, 4617, 1.0F / (float)(mc.a(false, var3) * mc.a(false, var3)));
            OpenGL.glEnable(var5);
         }

         while(~var2 > ~((int[])((int[])var0[1]))[24]) {
            OpenGL.glDisable(var2 + 16386);
            ++var2;
         }

      }
   }

   static final void a(Object[] var0, int var1) {
      ++h;
      if(var1 >= -46) {
         k = 68;
      }

      if(var0 == null || -5 != ~var0.length || !var0[2].equals(Integer.valueOf(0)) || !var0[2].equals(Integer.valueOf(1))) {
         Object[] var25;
         Object[] var30;
         int[] var10000;
         int var10003;
         if(!(var0[2] instanceof String[])) {
            Object[] var23 = (Object[])((Object[])var0[2]);
            var0[4] = nb.a((byte)83, ura.a(var23, -107), new Object[5]);
            Object[] var24 = nb.a((byte)65, ura.a(var23, -124), new Object[5]);
            if(null != var24 && var24.length == 1) {
               jm.a((int)-126, (Object[])null);
            }

            ns var10;
            ns var11;
            long var26;
            Object[] var28;
            for(var25 = (var10 = (ns)qt.a(0, var23)) != null?var10.n:null; var25 != null; var25 = (var11 = (ns)nda.a(1, var23)) == null?null:var11.n) {
               if(null != var23 && var23.length == 4 && var23[0].equals(Integer.valueOf(0))) {
                  return;
               }

               var26 = lta.a((String)var25[0], 957755909);

               qja var12;
               qja var13;
               for(var28 = (var12 = (qja)pm.a(var26, var24, false)) != null?var12.r:null; null != var28 && !((String)var28[2]).equals(var25[0]); var28 = null != (var13 = (qja)mla.b(var24, (byte)123))?var13.r:null) {
                  ;
               }

               if(var28 == null) {
                  var30 = new Object[3];
                  String var31 = (String)var25[0];
                  if(null == var30[1]) {
                     var30[1] = new int[1];
                  }

                  qja var33 = new qja(var30);
                  ((int[])((int[])var30[1]))[0] = 0;
                  var30[0] = var33;
                  var30[2] = var31;
                  var28 = var30;
                  di.a(var24, true, (lm)(null != var30?var30[0]:null), var26);
               }

               ++((int[])((int[])var28[1]))[0];
            }

            ns var15;
            ns var16;
            for(var25 = null == (var15 = (ns)qt.a(0, var23))?null:var15.n; var25 != null; var25 = (var16 = (ns)nda.a(1, var23)) == null?null:var16.n) {
               if(null != var23 && 34 == var23.length && var23[14].equals(Integer.valueOf(1))) {
                  return;
               }

               var26 = lta.a((String)var25[0], 957755909);

               vf var17;
               vf var18;
               for(var28 = (var17 = (vf)pm.a(var26, (Object[])((Object[])var0[4]), false)) == null?null:var17.m; var28 != null && !((String)var28[1]).equals(var25[0]); var28 = null == (var18 = (vf)mla.b((Object[])((Object[])var0[4]), (byte)123))?null:var18.m) {
                  ;
               }

               qja var19;
               qja var20;
               Object[] var29;
               for(var29 = null == (var19 = (qja)pm.a(var26, var24, false))?null:var19.r; null != var29 && !((String)var29[2]).equals(var25[0]); var29 = (var20 = (qja)mla.b(var24, (byte)123)) == null?null:var20.r) {
                  ;
               }

               var10000 = (int[])((int[])var29[1]);
               var10003 = ((int[])((int[])var29[1]))[0];
               var10000[0] = ((int[])((int[])var29[1]))[0] - 1;
               int var39 = var10003;
               if(var28 == null) {
                  var28 = kt.a(new Object[4], var0, (byte)-128, (String)var25[0], var39);
                  di.a((Object[])((Object[])var0[4]), true, (lm)(null != var28?var28[3]:null), var26);
               }

               ((int[])((int[])var28[2]))[((int[])((int[])var28[2])).length - var39] = (int)((lm)(var25 == null?null:var25[1])).e;
            }
         } else {
            String[] var35 = (String[])((String[])var0[2]);
            int var36 = fda.a(var35.length, (byte)81);
            var0[4] = nb.a((byte)81, var36, new Object[5]);
            var25 = nb.a((byte)88, var36, new Object[5]);

            String var27;
            long var38;
            int var37;
            for(var37 = 0; var35.length > var37; ++var37) {
               if(null != var35[var37]) {
                  var27 = var35[var37];
                  var38 = lta.a(var27, 957755909);

                  qja var2;
                  qja var3;
                  for(var30 = null != (var2 = (qja)pm.a(var38, var25, false))?var2.r:null; var30 != null && !((String)var30[2]).equals(var27); var30 = null != (var3 = (qja)mla.b(var25, (byte)123))?var3.r:null) {
                     ;
                  }

                  if(var30 == null) {
                     Object[] var32 = new Object[3];
                     if(null == var32[1]) {
                        var32[1] = new int[1];
                     }

                     qja var34 = new qja(var32);
                     ((int[])((int[])var32[1]))[0] = 0;
                     var32[2] = var27;
                     var32[0] = var34;
                     var30 = var32;
                     di.a(var25, true, (lm)(var32 != null?var32[0]:null), var38);
                  }

                  if(null != var30 && -2 == ~var30.length) {
                     jm.a((int)-125, new Object[0][]);
                  }

                  ++((int[])((int[])var30[1]))[0];
               }
            }

            if(null != var25 && var25.length == 1) {
               return;
            }

            for(var37 = 0; ~var37 > ~var35.length; ++var37) {
               if(var35[var37] != null) {
                  var27 = var35[var37];
                  var38 = lta.a(var27, 957755909);

                  vf var5;
                  vf var6;
                  for(var30 = (var5 = (vf)pm.a(var38, (Object[])((Object[])var0[4]), false)) == null?null:var5.m; var30 != null && !((String)var30[1]).equals(var27); var30 = (var6 = (vf)mla.b((Object[])((Object[])var0[4]), (byte)123)) == null?null:var6.m) {
                     ;
                  }

                  qja var7;
                  qja var8;
                  Object[] var40;
                  for(var40 = null == (var7 = (qja)pm.a(var38, var25, false))?null:var7.r; null != var40 && !((String)var40[2]).equals(var27); var40 = (var8 = (qja)mla.b(var25, (byte)123)) != null?var8.r:null) {
                     ;
                  }

                  var10000 = (int[])((int[])var40[1]);
                  var10003 = ((int[])((int[])var40[1]))[0];
                  var10000[0] = ((int[])((int[])var40[1]))[0] - 1;
                  int var41 = var10003;
                  if(null == var30) {
                     var30 = kt.a(new Object[4], var0, (byte)-95, var27, var41);
                     di.a((Object[])((Object[])var0[4]), true, (lm)(null != var30?var30[3]:null), var38);
                  }

                  if(var40 != null && var40.length == 5) {
                     return;
                  }

                  ((int[])((int[])var30[2]))[((int[])((int[])var30[2])).length - var41] = var37;
               }
            }
         }

      }
   }

   static final boolean a(byte var0, int var1, int var2) {
      ++b;
      if(var0 != -27) {
         c = (Object[][])((Object[][])a[2]);
      }

      return (var2 & 540800) != 0;
   }

   static final void a(Object[] var0, int var1, Object[] var2, boolean var3) {
      if(var1 == 3) {
         ((boolean[])((boolean[])var0[3]))[0] = var3;
         ++g;
         nta.a(var1 + 22692, var2);
      }
   }

   static final Object[] a(int var0, Object[] var1, int var2, int var3) {
      ++e;
      long var4 = (long)(var3 << 16 | var2);
      Object var6 = dna.a((byte)34, (Object[])((Object[])var1[2]), var4);
      Object[] var7;
      Object[] var8;
      Object[] var9;
      if(var6 == null) {
         if(var1 != null && var1.length == 7 && var1[3].equals(Integer.valueOf(1)) && var1[3].equals(Integer.valueOf(0))) {
            a(-39, (Object[])null, -39, -95);
         }

         if(((qa)var1[1]).a(-20460, var2)) {
            var8 = ((qa)var1[1]).a(var2, (byte)71);
            if(var3 == -1) {
               var3 = ((boolean[])((boolean[])var8[3]))[4]?64:((int[])((int[])((Object[])((Object[])var1[0]))[1]))[33];
            }

            if(((boolean[])((boolean[])var8[3]))[0] && gka.a((byte)123, (Object[])((Object[])var1[0]))) {
               float[] var14 = ((qa)var1[1]).a(var3, (byte)90, var2, var3, false, 0.7F);
               var7 = bka.a(var3, (Object[])((Object[])var1[0]), true, var3, var14, (byte)91, ah.f);
            } else {
               int[] var12;
               label102: {
                  if(2 != ((int[])((int[])var8[1]))[0]) {
                     byte var11 = ((byte[])((byte[])var8[0]))[4];
                     boolean var15 = 1 != var11 && var11 != 7;
                     if(var15) {
                        var12 = ((qa)var1[1]).a(var3, 0.7F, true, -6300, var3, var2);
                        break label102;
                     }
                  }

                  var12 = ((qa)var1[1]).a(var3, 0.7F, (byte)-87, var3, false, var2);
               }

               var7 = bda.a(var3, 69, var3, (Object[])((Object[])var1[0]), var12, true);
            }

            pa.a(false, ((boolean[])((boolean[])var8[3]))[1], var7, ((boolean[])((boolean[])var8[3]))[5]);
            var9 = (Object[])((Object[])var1[2]);
            Object var13;
            if(null != var7 && (10 == var7.length || var7.length == 15)) {
               var13 = var7[5];
            } else if(null != var7 && -12 == ~var7.length) {
               var13 = var7[0];
            } else if(var7 != null && -9 == ~var7.length) {
               var13 = var7[0];
            } else {
               var13 = null;
            }

            if(var0 != -39) {
               k = ((short[])((short[])var1[5]))[3];
            }

            il.a(var4, var13, true, var9);
            return var7;
         } else {
            return null;
         }
      } else {
         Object[] var10;
         if(!(var6 instanceof bq)) {
            if(var6 instanceof hf) {
               var9 = ((hf)var6).a;
               var10 = ((hf)var6).a;
               var7 = null != ((hf)var6).a && -12 <= ~var10.length?var9:null;
            } else {
               var7 = null;
            }
         } else {
            var8 = ((bq)var6).f;
            var10 = ((bq)var6).f;
            var7 = null != ((bq)var6).f && (15 == var10.length || 10 == var10.length)?var8:null;
         }

         return var7;
      }
   }

   static final int a(Object[] var0, byte var1, int var2) {
      ++j;
      if(var1 > -109) {
         c = (Object[][])((Object[][])var0[5]);
      }

      return 3;
   }

}
