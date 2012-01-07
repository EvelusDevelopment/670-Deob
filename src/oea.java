
final class oea {

   static int g;
   static int f_i;
   static int b;
   static int h;
   static int k;
   static int d;
   static int f;
   static int j;
   static int a;
   static int c;
   static int e;


   static final mh a(int var0, Object[] var1) {
      ++f;
      if(var0 != 1) {
         a(-98, (Object[])null, ((int[])((int[])var1[0]))[1]);
      }

      return new mh(var1);
   }

   static final Object[] a(Object[] var0, boolean var1, int var2) {
      if(var0[1] == null) {
         var0[1] = new int[3];
      }

      if(var1) {
         return (Object[])((Object[])var0[11]);
      } else {
         ++j;
         var0[0] = gr.a((int)-1, var0);
         if(var2 == -1) {
            ((int[])((int[])var0[1]))[2] = -1;
         } else {
            ((int[])((int[])var0[1]))[0] = var2 & 16383;
            ((int[])((int[])var0[1]))[1] = var2 >> 14 & 16383;
            ((int[])((int[])var0[1]))[2] = (var2 & 1071120164) >> 28;
         }

         return var0;
      }
   }

   static final void a(Object[] var0, int var1) {
      ++d;
      if(var0[1] == null) {
         var0[1] = new int[3];
      }

      if(null == var0[0]) {
         var0[0] = new boolean[2];
      }

      if(var1 != 31103) {
         a((Object[])null, 15, ((boolean[])((boolean[])var0[13]))[0]);
      }

   }

   static final boolean a(int var0, Object[] var1, Object[] var2) {
      if(var0 != -23705) {
         a(-115, (Object[])null, -92);
      }

      ++h;
      return ~((int[])((int[])var2[0]))[1] == ~((int[])((int[])var1[0]))[1] && ((int[])((int[])var2[0]))[5] == ((int[])((int[])var1[0]))[5] && ~((int[])((int[])var2[0]))[0] == ~((int[])((int[])var1[0]))[0] && ((int[])((int[])var2[0]))[3] == ((int[])((int[])var1[0]))[3] && ~((int[])((int[])var1[0]))[6] == ~((int[])((int[])var2[0]))[6] && ~((int[])((int[])var2[0]))[4] == ~((int[])((int[])var1[0]))[4] && ~((int[])((int[])var1[0]))[2] == ~((int[])((int[])var2[0]))[2];
   }

   static final void a(byte var0, Object[] var1) {
      ++k;
      Object[] var2 = (Object[])((Object[])woa.a(5, var1)[1]);
      ((short[])((short[])var1[13]))[1] = ((short[])((short[])var1[13]))[0] = (short)((int)(((float[])((float[])var2[1]))[2] / 512.0F));
      ((short[])((short[])var1[13]))[3] = ((short[])((short[])var1[13]))[2] = (short)((int)(((float[])((float[])var2[1]))[1] / 512.0F));
      if(var0 != 117) {
         a((Object[])((Object[])var1[18]), 109);
      }

   }

   static final void a(boolean var0) {
      ++a;
      if(ita.g >= 0) {
         long var1 = he.a(114);
         ita.g = (int)((long)ita.g - (var1 - pg.c));
         if(ita.g > 0) {
            int var3 = (ita.g << 8) / au.d;
            int var4 = -var3 + 255;
            float var5 = (float)var3 / 255.0F;
            bma.f_l = (('\uff00' & vfa.g) * var3 + var4 * ('\uff00' & ((int[])((int[])mla.d[1]))[5]) & 16711680) + ((16711935 & vfa.g) * var3 + var4 * (16711935 & ((int[])((int[])mla.d[1]))[5]) & -16711936) >>> 8;
            float var6 = -var5 + 1.0F;
            client.Cb = var6 * (-sma.j + ((float[])((float[])mla.d[2]))[1]) + sma.j;
            ps.b = (-ej.a + ((float[])((float[])mla.d[2]))[0]) * var6 + ej.a;
            tja.f_i = ee.a + var6 * (-ee.a + ((float[])((float[])mla.d[2]))[3]);
            es.f = spa.c + (((float[])((float[])mla.d[2]))[5] - spa.c) * var6;
            ija.b = ((int[])((int[])mla.d[1]))[2] * var4 + var3 * sna.f >> 8;
            gm.a = (('\uff00' & je.a) * var3 + (((int[])((int[])mla.d[1]))[1] & '\uff00') * var4 & 16711680) + (-16711936 & var4 * (16711935 & ((int[])((int[])mla.d[1]))[1]) + var3 * (16711935 & je.a)) >>> 8;
            ata.d = mi.b + (((float[])((float[])mla.d[2]))[4] - mi.b) * var6;
            bka.e = var6 * (-oh.j + ((float[])((float[])mla.d[2]))[2]) + oh.j;
            if(ama.c != mla.d[3]) {
               ep.b = br.e.a(ama.c, (Object[])((Object[])mla.d[3]), var6, ep.b);
            }

            if(mla.d[0] != hd.d) {
               if(hd.d != null) {
                  lu.b = hd.d;
                  if(lu.b != null) {
                     gpa.a(var4, 255, (byte)-30, lu.b);
                  }
               } else {
                  lu.b = (Object[])((Object[])mla.d[0]);
                  if(null != lu.b) {
                     gpa.a(var4, 0, (byte)-30, lu.b);
                  }
               }
            }
         } else {
            ps.b = ((float[])((float[])mla.d[2]))[0];
            ata.d = ((float[])((float[])mla.d[2]))[4];
            ep.b = (Object[])((Object[])mla.d[3]);
            tja.f_i = ((float[])((float[])mla.d[2]))[3];
            gm.a = ((int[])((int[])mla.d[1]))[1];
            bka.e = ((float[])((float[])mla.d[2]))[2];
            ija.b = ((int[])((int[])mla.d[1]))[2];
            es.f = ((float[])((float[])mla.d[2]))[5];
            bma.f_l = ((int[])((int[])mla.d[1]))[5];
            client.Cb = ((float[])((float[])mla.d[2]))[1];
            if(lu.b != null) {
               ksa.a(2, lu.b);
            }

            ita.g = -1;
            lu.b = (Object[])((Object[])mla.d[0]);
         }

         pg.c = var1;
      }

      if(var0) {
         a((Object[])null, true, -113);
      }

   }

   static final void a(int var0, Object[] var1, int var2) {
      if(var0 == 1) {
         ++g;
         Object[] var4 = vi.a(var1, true, var2);
         if(null != var4) {
            ((lm)(var4 != null?var4[2]:null)).a((byte)123);
            ((Object[][])((Object[][])var1[1]))[((int[])((int[])var4[1]))[0]] = null;
         }

      }
   }

   static final Object[] a(Object[] var0, int var1, boolean var2) {
      ++e;
      if(var2) {
         a((Object[])null, -2);
      }

      return Class_a.a(-39, var0, var1, -1);
   }

   static final Object[] a(Object[] var0, String var1, int var2) {
      ++f_i;
      if(var2 != 1) {
         a(108, (Object[])null, ((int[])((int[])((Object[])((Object[])var0[29]))[18]))[1]);
      }

      if(null == var0[0]) {
         throw new IllegalStateException("");
      } else if(var1 != null) {
         Object[] var5 = new Object[3];
         if(var5[1] == null) {
            var5[1] = new int[1];
         }

         ((int[])((int[])var5[1]))[0] = -1;
         iia var7 = new iia(var5);
         var5[0] = var7;
         var5[2] = var1;
         if(var5 != null && -25 == ~var5.length) {
            return new Object[0][];
         } else {
            Object[] var6 = var5;
            lm var11 = (lm)(var5 == null?null:var5[0]);
            synchronized(var0[1]) {
               client.a(-21, (Object[])((Object[])var0[1]), var11);
               var0[1].notify();
               return var6;
            }
         }
      } else {
         throw new IllegalArgumentException("");
      }
   }

   static final void b(Object[] var0, int var1) {
      ++c;
      var0[0] = ura.a(-13, new Object[2]);
      ((int[])((int[])var0[1]))[1] = var1;
      ((int[])((int[])var0[1]))[0] = 256;
      ((int[])((int[])var0[1]))[2] = 256;
   }

}
