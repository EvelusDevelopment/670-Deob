import jagdx.IDirect3DDevice;
import jaggl.OpenGL;

final class jga {

   static int j;
   static int a;
   static int d;
   static int h;
   static int e;
   static int b;
   static Object[] f = st.a(new Object[1], 7, 41, 28);
   static int f_i;
   static int c;
   static Object[][] g = new Object[2048][];


   static final Object[] a(int var0, byte[] var1, int var2, int var3, Object[] var4, int var5, Object[] var6, boolean var7) {
      ++c;
      if(null != var6 && 87 == var6.length) {
         return eo.a(var3, var6, (byte)-70, var7, var4, var0, var2, var1);
      } else {
         if(var5 != 10206) {
            a(31, true, (Object[])null);
         }

         if(var6 != null && var6.length == 91) {
            return mga.a(var2, var7, var4, var6, var1, var3, 0, var0);
         } else {
            throw new IllegalStateException();
         }
      }
   }

   static final boolean a(int var0) {
      ++f_i;
      if(var0 <= 113) {
         return ((boolean[])((boolean[])f[4]))[2];
      } else if(null == kla.f) {
         return false;
      } else {
         if(((int[])((int[])kla.f[1]))[1] >= 2000) {
            ((int[])((int[])kla.f[1]))[1] -= 2000;
         }

         return ((int[])((int[])kla.f[1]))[1] == 1004;
      }
   }

   static final void a(Object[] var0, int var1, boolean var2) {
      ++e;
      int var3 = sb.a(iia.r, (byte)-77, (Object[])((Object[])((Object[])((Object[])var0[2]))[2]), ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1]) + ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[2];
      if(var0 == null || -2 != ~var0.length) {
         int var4 = roa.a(qga.j, 2, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0], (Object[])((Object[])((Object[])((Object[])var0[2]))[0])) + ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[var1];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if(null != var0 && var0.length == 12) {
            if(var2) {
               int[] var5 = new int[4];
               lna.g.TA(var5);
               lna.g.JA(var3, var4, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1] + var3, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0] + var4);
               if(null != var0 && (var0.length == 2 || -3 == ~var0.length || var0.length == 4)) {
                  lg.a((byte)45, (Object[])null);
               }

               var6 = ((cga)var0[10]).f();
               var7 = ((cga)var0[10]).d();
               var8 = ((cga)var0[7]).f();
               var9 = ((cga)var0[7]).d();
               ((cga)var0[10]).a(var3, (-var7 + ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0]) / 2 + var4);
               ((cga)var0[7]).a(-var8 + var3 + ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1], (((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0] - var9) / 2 + var4);
               lna.g.JA(var3, var4, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1] + var3, ((cga)var0[8]).d() + var4);
               ((cga)var0[8]).b(var3 + var6, var4, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1] + -var6 + -var8, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0]);
               var10 = ((cga)var0[9]).d();
               lna.g.JA(var3, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0] + var4 - var10, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1] + var3, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0] + var4);
               ((cga)var0[9]).b(var3 + var6, var4 - (-((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0] + var10), -var8 + ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1] + -var6, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0]);
               lna.g.JA(var5[0], var5[1], var5[2], var5[3]);
            }
         } else if(var0 != null && -8 == ~var0.length) {
            uf.a((byte)-12, var4, var0, var3, var2);
         } else {
            if(null == var0 || var0.length != 9) {
               throw new IllegalStateException();
            }

            lna.g.b(var3 - 2, var4, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1] + 4, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0] + 2, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[8], 0);
            lna.g.b(-1 + var3, 1 + var4, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1] + 2, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0], 0, 0);
         }

         int var14;
         if(null != var0 && var0.length == 12) {
            var14 = ((cga)var0[10]).f() + var3;
            var6 = ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1] + (var3 - ((cga)var0[7]).f());
            var7 = var4 + ((cga)var0[8]).d();
            var8 = ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0] + var4 - ((cga)var0[9]).d();
            var9 = var6 + -var14;
            var10 = -var7 + var8;
            int var11 = mu.a(var1 ^ 3, var0) * var9 / 10000;
            int[] var12 = new int[4];
            lna.g.TA(var12);
            lna.g.JA(var14, var7, var14 + var11, var8);
            es.a(var14, -128, var7, var9, var0, var10);
            lna.g.JA(var14 + var11, var7, var6, var8);
            ((cga)var0[11]).b(var14, var7, var9, var10);
            lna.g.JA(var12[0], var12[1], var12[2], var12[3]);
         } else if(null != var0 && var0.length == 7) {
            var14 = mu.a(0, var0) * ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1] / 10000;
            lna.g.r(var3, var4 + 2, var14, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0] - 2, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[7], 0);
            lna.g.r(var14 + var3, var4 + 2, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1] - var14, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0] - 2, 0, 0);
         } else {
            if(null == var0 || 9 != var0.length) {
               throw new IllegalStateException();
            }

            var14 = mu.a(0, var0) * ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1] / 10000;
            int[] var16 = new int[4];
            lna.g.TA(var16);
            lna.g.JA(var3, var4 + 2, var3 + var14, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0] + var4);
            ((cga)var0[6]).b(var3, 2 + var4, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1], ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0]);
            lna.g.JA(var16[0], var16[1], var16[2], var16[3]);
         }

         Object[] var17 = eoa.b;
         String var15 = (String)var17[3];
         String var18 = var15;
         if(10000L < -((long[])((long[])var0[4]))[0] + he.a(95)) {
            var18 = var15 + " (" + ((int[])((int[])sba.a(true, eoa.b)[1]))[0] + ")";
         }

         ((ja)var0[0]).a(4 + var4 + ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[0] / 2 + ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[6], var18, (byte)-126, -1, var3 + ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[1] / 2, ((int[])((int[])((Object[])((Object[])var0[2]))[1]))[4]);
      }
   }

   static final void a(boolean var0, Object[] var1) {
      ++h;
      eg.a((byte)-125, var1);
      cna.a((byte)48, var1);
      if(!var0) {
         a((Object[])null, (Object[])null, 1);
      }

      rla.b(var1, 6);
      no.a(var1, 63);
      dw.a(false, var1);
      ql.a(var1, 0);
      if(null != var1 && var1.length == 87) {
         nd.b(var1, 3);
      } else {
         if(var1 == null || var1.length != 91) {
            throw new IllegalStateException();
         }

         Class_m.a(19, var1);
      }

      sja.a(-123, var1);
      me.a(-122, var1);
      hoa.a(2912, var1);
      Class_s.a(var1, (byte)114);
      if(var1 != null && 87 == var1.length) {
         tua.a((byte)8, var1);
      } else {
         if(var1 == null || var1.length != 91) {
            throw new IllegalStateException();
         }

         if(((boolean[])((boolean[])var1[63]))[8]) {
            OpenGL.glEnable(3042);
         } else {
            OpenGL.glDisable(3042);
         }
      }

      wm.a(var1, -21452);
      if(var1 != null && var1.length == 87) {
         IDirect3DDevice.a(((long[])((long[])var1[50]))[5], 15, ((boolean[])((boolean[])var1[63]))[20]);
      } else {
         if(var1 == null || var1.length != 91) {
            throw new IllegalStateException();
         }

         uka.a(var1, (int)3008);
      }

      for(int var2 = ((int[])((int[])var1[1]))[8] - 1; 0 <= var2; --var2) {
         sj.a(var1, (byte)-63, var2);
         wd.a(true, var1);
         te.a(25385, var1);
         hsa.a(var1, -2375);
      }

      ki.a(var1, (byte)62);
      mi.b((byte)-119, var1);
   }

   static final Object[] a(Object[] var0, Object[] var1, int var2) {
      int var3 = 107 / ((var2 - 15) / 59);
      hka.a(var0, (byte)-36);
      ++a;
      aa.a(15022, var1, var0);
      return var0;
   }

   static final void a(int var0, boolean var1, Object[] var2) {
      ++d;
      if(null != var2[4]) {
         efa.a((Object[])((Object[])var2[4]), '\u0000', 0);
         if(var0 > 69) {
            nha.a((Object[])((Object[])var2[0]), 18806, 1);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf((float[])((float[])((Object[])((Object[])((Object[])((Object[])var2[0]))[11]))[0]), 0);
            OpenGL.glMatrixMode(5888);
            nha.a((Object[])((Object[])var2[0]), 18806, 0);
            if(~((int[])((int[])((Object[])((Object[])var2[0]))[1]))[33] != ~((int[])((int[])var2[1]))[0]) {
               int var3 = 128 * (((int[])((int[])((Object[])((Object[])var2[0]))[1]))[33] % 5000) / 5000;

               for(int var4 = 0; 64 > var4; ++var4) {
                  OpenGL.glProgramLocalParameter4fvARB('\u8620', var4, (float[])((float[])var2[9]), var3);
                  var3 += 2;
               }

               if(((boolean[])((boolean[])((Object[])((Object[])var2[2]))[5]))[0]) {
                  ((float[])((float[])var2[3]))[0] = (float)(((int[])((int[])((Object[])((Object[])var2[0]))[1]))[33] % 4000) / 4000.0F;
               } else {
                  OpenGL.glProgramLocalParameter4fARB('\u8620', 65, 0.0F, 0.0F, 0.0F, 1.0F);
               }

               if(null != var2 && -2 == ~var2.length && var2[0].equals(Integer.valueOf(0))) {
                  ci.a(new Object[1][], (int)0);
               }

               ((int[])((int[])var2[1]))[0] = ((int[])((int[])((Object[])((Object[])var2[0]))[1]))[33];
            }

         }
      }
   }

   static final boolean a(Object[] var0, byte var1) {
      ++b;
      return var1 > -33?((boolean[])((boolean[])((Object[])((Object[])f[11]))[1]))[8]:null != var0[15] && ((int[])((int[])var0[15])).length > 1;
   }

   static final Object[] a(float var0, float var1, int var2, float var3) {
      ++j;
      Object[][] var4 = os.b;
      synchronized(os.b) {
         if(var2 != 2) {
            f = (Object[])null;
         }

         if(qqa.g != 0) {
            Class_cs.a(var0, var1, var3, os.b[--qqa.g], (byte)125);
            return os.b[qqa.g];
         } else {
            return bl.a((byte)-122, var1, new Object[2], var0, var3);
         }
      }
   }

}
