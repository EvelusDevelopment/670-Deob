import jagdx.IDirect3DDevice;

final class woa extends ja {

   static int I;
   static int G;
   static int E;
   static int L;
   static int J;
   static int N;
   static Object[] F = sd.a(new Object[1], 79, (byte)125);
   private Object[] H;
   static int A;
   static int B;
   static int[][] C = new int[128][128];
   static int K;
   static Object[] D = ed.a(8, new Object[1], (byte)-117, 41);
   static int M;


   static final void a(int var0, int var1, int var2, boolean var3) {
      ++A;
      if(!var3) {
         Object[] var4 = uia.d[var2][var1];
         Object[] var5 = var4 == null?pea.d:var4;
         int var6 = var0;
         if(fha.r) {
            var6 = 0;
            fha.r = false;
         }

         boolean var7;
         Object[] var8;
         if(mla.d != null) {
            var8 = mla.d;
            var7 = ((int[])((int[])var8[1]))[5] == ((int[])((int[])var5[1]))[5] && ((float[])((float[])var5[2]))[3] == ((float[])((float[])var8[2]))[3] && ((float[])((float[])var8[2]))[2] == ((float[])((float[])var5[2]))[2] && ((float[])((float[])var5[2]))[0] == ((float[])((float[])var8[2]))[0] && ((float[])((float[])var5[2]))[1] == ((float[])((float[])var8[2]))[1] && ((float[])((float[])var8[2]))[4] == ((float[])((float[])var5[2]))[4] && ((float[])((float[])var8[2]))[5] == ((float[])((float[])var5[2]))[5] && ((int[])((int[])var5[1]))[1] == ((int[])((int[])var8[1]))[1] && ~((int[])((int[])var8[1]))[2] == ~((int[])((int[])var5[1]))[2] && var5[3] == var8[3] && var8[0] == var5[0];
            if(var7) {
               return;
            }
         }

         mla.d = var5;
         pg.c = he.a(99);
         ita.g = var6;
         au.d = var6;
         if(au.d == 0) {
            oea.a(false);
         } else {
            hd.d = lu.b;
            ej.a = ps.b;
            spa.c = es.f;
            je.a = gm.a;
            sna.f = ija.b;
            ama.c = ep.b;
            mi.b = ata.d;
            vfa.g = bma.f_l;
            sma.j = client.Cb;
            oh.j = bka.e;
            ee.a = tja.f_i;
            if(null != lu.b) {
               var8 = lu.b;
               var7 = ((boolean[])((boolean[])var8[2]))[0];
               if(var7) {
                  hd.d = Class_cs.a((byte)105, lu.b);
                  lu.b = hd.d;
               }

               if(lu.b != null && mla.d[0] != lu.b) {
                  bq.a(lu.b, (Object[])((Object[])mla.d[0]), -72);
               }
            }

            if(var5 != null && 9 == var5.length) {
               ((int[])((int[])hd.d[10]))[10] = ((int[])((int[])((Object[])((Object[])pea.d[6]))[4]))[0];
            }
         }

      }
   }

   static final Object[] a(int var0, Object[] var1) {
      if(var0 != 5) {
         B = ((int[])((int[])D[7]))[17];
      }

      ++E;
      if(((boolean[])((boolean[])var1[8]))[1]) {
         ((boolean[])((boolean[])var1[8]))[1] = false;
         if(null != var1[3]) {
            ib.a(1, (Object[])((Object[])var1[2]), (Object[])((Object[])var1[6]));
            hi.a((Object[])((Object[])var1[2]), a(5, (Object[])((Object[])var1[3])), (byte)110);
         } else {
            ib.a(var0 ^ 4, (Object[])((Object[])var1[2]), (Object[])((Object[])var1[6]));
         }
      }

      return (Object[])((Object[])var1[2]);
   }

   final void a(char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8) {
      eg.a(this.H, var1, var2, var3, var4, var5, var6, var7, var8);
   }

   static final void a(Object[] var0, int var1, byte var2, int var3) {
      if(var1 == 5) {
         ++G;
         if(null != var0 && -7 == ~var0.length) {
            hm.a(var0, false, var2, var3);
         } else if(null != var0 && var0.length == 8) {
            byte var6 = (byte)(127 + ((255 & var2) >> 1));
            int var7 = var3 * 2;
            ((byte[])((byte[])var0[5]))[var7++] = var6;
            ((byte[])((byte[])var0[5]))[var7] = var6;
         } else {
            kaa.a((byte)45, var2, var3, var0);
         }
      }
   }

   static final ka a(Object[] var0, int var1, Object[] var2, Object[] var3, ta var4, boolean var5, int var6) {
      ++J;
      int var7;
      if(null != var2[9] && 1 < var1) {
         var7 = -1;

         for(int var8 = 0; var8 < 10; ++var8) {
            if(((int[])((int[])var2[2]))[var8] <= var1 && ((int[])((int[])var2[2]))[var8] != 0) {
               var7 = ((int[])((int[])var2[9]))[var8];
            }
         }

         if(null != var0 && 2 == var0.length) {
            la.b = null;
         }

         if(~var7 != 0) {
            return a(var0, 1, us.a(var7, (byte)22, (Object[])((Object[])var2[7])), var3, var4, var5, var6);
         }
      }

      var7 = var6;
      if(var5) {
         return (ka)((Object[])((Object[])((Object[])((Object[])D[10]))[0]))[0];
      } else {
         if(var3 != null) {
            var7 = var6 | mo.a(true, var3);
         }

         ka var16;
         synchronized(((Object[])((Object[])var2[7]))[4]) {
            var16 = (ka)dna.a((byte)34, (Object[])((Object[])((Object[])((Object[])var2[7]))[4]), (long)(var4.G << 29 | ((int[])((int[])var2[1]))[46]));
         }

         if(var16 == null || var4.d(var16.va(), var7) != 0) {
            if(var16 != null) {
               var7 = var4.a(var7, var16.va());
            }

            int var9 = var7;
            if(null != var2[5]) {
               var9 = var7 | '\u8000';
            }

            if(var0 != null && (2 == var0.length || var0.length == 1)) {
               la.b = null;
            }

            if(var2[14] != null || var0 != null) {
               var9 |= 16384;
            }

            if(128 != ((int[])((int[])var2[1]))[30]) {
               var9 |= 1;
            }

            if(128 != ((int[])((int[])var2[1]))[30]) {
               var9 |= 2;
            }

            if(((int[])((int[])var2[1]))[30] != 128) {
               var9 |= 4;
            }

            ii var10 = ii.a((Object[])((Object[])((Object[])((Object[])var2[7]))[7]), ((int[])((int[])var2[1]))[8], (int)0);
            if(var10 == null) {
               return null;
            }

            if(var10.a < 13) {
               var10.a(2);
            }

            var16 = var4.a(var10, var9, ((int[])((int[])((Object[])((Object[])var2[7]))[1]))[2], 64 + ((int[])((int[])var2[1]))[7], ((int[])((int[])var2[1]))[27] + 850);
            if(((int[])((int[])var2[1]))[30] != 128 || 128 != ((int[])((int[])var2[1]))[13] || -129 != ~((int[])((int[])var2[1]))[47]) {
               var16.v(((int[])((int[])var2[1]))[30], ((int[])((int[])var2[1]))[13], ((int[])((int[])var2[1]))[47]);
            }

            int var11;
            if(var2[14] != null) {
               for(var11 = 0; var11 < ((short[])((short[])var2[14])).length; ++var11) {
                  if(null != var2[4] && ((byte[])((byte[])var2[4])).length > var11) {
                     var16.q(((short[])((short[])var2[14]))[var11], la.b[255 & ((byte[])((byte[])var2[4]))[var11]]);
                  } else {
                     var16.q(((short[])((short[])var2[14]))[var11], ((short[])((short[])var2[0]))[var11]);
                  }
               }

               if(null != var0 && -5 == ~var0.length && var0[0].equals(Integer.valueOf(2))) {
                  la.b = null;
               }
            }

            if(var2[5] != null) {
               if(var0 != null && (var0.length == 1 || var0.length == 4 && var0[1].equals(Integer.valueOf(2)))) {
                  jfa.a(false, 17, (Object[])null, 96);
               }

               for(var11 = 0; ((short[])((short[])var2[5])).length > var11; ++var11) {
                  var16.DA(((short[])((short[])var2[5]))[var11], ((short[])((short[])var2[13]))[var11]);
               }
            }

            if(var0 != null) {
               for(var11 = 0; 10 > var11; ++var11) {
                  for(int var12 = 0; var12 < rsa.b[var11].length; ++var12) {
                     if(~sfa.a[var11][var12].length < ~((int[])((int[])var0[5]))[var11]) {
                        var16.q(rsa.b[var11][var12], sfa.a[var11][var12][((int[])((int[])var0[5]))[var11]]);
                     }
                  }

                  if(var2 != null && var2.length == 3) {
                     it.a((Object[])null, (byte)100);
                  }
               }

               if(null != var3 && (9 == var3.length || -10 == ~var3.length)) {
                  uga.a((Object[])null, -21482, -125);
               }
            }

            var16.G(var7);
            synchronized(((Object[])((Object[])var2[7]))[4]) {
               il.a((long)(var4.G << 29 | ((int[])((int[])var2[1]))[46]), var16, true, (Object[])((Object[])((Object[])((Object[])var2[7]))[4]));
            }
         }

         if(null != var3) {
            var16 = var16.a((byte)1, var7, true);
            bqa.a(0, 1, var16, var3);
         }

         var16.G(var6);
         return var16;
      }
   }

   woa(Object[] var1, ta var2, Object[] var3) {
      super(var2, var3);
      this.H = var1;
   }

   static final void a(byte var0) {
      ++I;
      short var1 = 1024;
      short var2 = 3072;
      if(Class_n.a) {
         var2 = 4096;
         if(sna.a) {
            var1 = 2048;
         }
      }

      if((float)var1 > qv.f_i) {
         qv.f_i = (float)var1;
      }

      if((float)var2 < qv.f_i) {
         qv.f_i = (float)var2;
      }

      for(int var3 = 34 / ((-59 - var0) / 50); sma.h >= 16384.0F; sma.h -= 16384.0F) {
         ;
      }

      while(0.0F > sma.h) {
         sma.h += 16384.0F;
      }

      if(!Class_n.a) {
         int var4 = fha.o >> 9;
         int var5 = hq.a >> 9;
         int var6 = Class_ds.a(jca.n, fha.o, hq.a, (byte)122);
         int var7 = 0;
         int var8;
         if(var4 > 3 && var5 > 3 && -4 + rp.c > var4 && -4 + wpa.a > var5) {
            for(var8 = -4 + var4; ~var8 >= ~(4 + var4); ++var8) {
               for(int var9 = -4 + var5; ~var9 >= ~(4 + var5); ++var9) {
                  int var10 = jca.n;
                  if(3 > var10 && fr.a(var9, var8, (byte)51)) {
                     ++var10;
                  }

                  int var11 = 0;
                  if(null != je.f[2] && ((byte[][][])((byte[][][])je.f[2]))[var10] != null) {
                     var11 = 8 * (255 & ((byte[][][])((byte[][][])je.f[2]))[var10][var8][var9]) << 2;
                  }

                  if(null != jp.o && null != jp.o[var10]) {
                     int var12 = -jp.o[var10].b(-31, var9, var8) + var11 + var6;
                     if(var12 > var7) {
                        var7 = var12;
                     }
                  }
               }
            }
         }

         var8 = 1536 * (var7 >> 2);
         if(786432 < var8) {
            var8 = 786432;
         }

         if(var8 < 262144) {
            var8 = 262144;
         }

         if(var8 <= nn.G) {
            if(nn.G > var8) {
               nn.G += (var8 - nn.G) / 80;
            }
         } else {
            nn.G += (-nn.G + var8) / 24;
         }
      }

   }

   final void HA(char var1, int var2, int var3, int var4, boolean var5) {
      eg.a(this.H, var1, var2, var3, var4, var5);
   }

   static final cn b(Object[] var0, int var1) {
      if(var1 != 262144) {
         a(-65, new Object[0], ((byte[])((byte[])F[13]))[3], (Object[])null, 49);
      }

      ++L;
      return new cn(var0);
   }

   static final void a(int var0, int var1, int var2, Object[] var3) {
      ++K;
      if(var2 <= -109) {
         ((int[])((int[])var3[6]))[var0] = var1;
         ((int[])((int[])var3[23]))[var0] = (int)(Math.pow(2.0D, 5.4931640625E-4D * (double)var1) * 2097152.0D + 0.5D);
      }
   }

   static final void a(int var0, Object[] var1, byte var2, Object[] var3, int var4) {
      int var5 = -126 % ((var2 + 57) / 46);
      ++N;
      if(null != var3 && var3.length == 87) {
         if(null != var3[82]) {
            bma.b(0, (Object[])((Object[])var3[82]));
         }

         IDirect3DDevice.DrawPrimitive(((long[])((long[])var3[50]))[5], Class_k.a(true, var1), var4, var0);
      } else if(var3 != null && var3.length == 91) {
         gf.a(var1, var4, 126, var0, var3);
      } else {
         throw new IllegalStateException();
      }
   }

}
