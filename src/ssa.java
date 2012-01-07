import jaclib.memory.DirectBufferHelper;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

final class ssa {

   static int g;
   static int e;
   static int f;
   static int c;
   static Object[] d = ura.a(-74, new Object[2]);
   static int a;
   static Object[] f_i = fra.a(1, (byte)115, new Object[1]);
   static int b;
   static int j;
   static int h;


   static final void a(int var0) {
      ++f;
      rq.c = 0;
      Object[] var1 = (Object[])((Object[])lba.f[4]);
      int var2 = lga.a(var1, 120);
      int var3 = ro.a(var1, -99);
      boolean var4 = fh.a(var1, false) == 1;
      int var5 = nqa.a(-76, var1);
      cfa.a(0);
      oc.a(-7850, var3);
      int var6 = (-((int[])((int[])var1[1]))[0] + ((int[])((int[])lba.f[1]))[2]) / 16;
      gn.p = new int[var6][4];

      int var7;
      int var8;
      for(var7 = 0; var7 < var6; ++var7) {
         if(var1 != null && -6 == ~var1.length && var1[2].equals(Boolean.valueOf(false))) {
            ko.c = -6;
         }

         for(var8 = 0; var8 < 4; ++var8) {
            gn.p[var7][var8] = lr.a(1, var1);
         }
      }

      Class_f.d = new int[var6];
      ft.b = new byte[var6][];
      var7 = 4 / ((26 - var0) / 46);
      cf.h = new byte[var6][];
      wu.n = new byte[var6][];
      vla.h = new int[var6];
      sia.b = null;
      mja.j = (byte[][])null;
      du.d = new int[var6];
      tqa.b = new byte[var6][];
      pv.b = new int[var6];
      epa.d = new int[var6];
      var6 = 0;

      for(var8 = (var2 + -(rp.c >> 4)) / 8; ~var8 >= ~(((rp.c >> 4) + var2) / 8); ++var8) {
         for(int var9 = (var5 - (wpa.a >> 4)) / 8; ((wpa.a >> 4) + var5) / 8 >= var9; ++var9) {
            Class_f.d[var6] = (var8 << 8) + var9;
            du.d[var6] = dla.a(oe.f, 107, bg.a(true, var8, false, var9, (byte)87));
            epa.d[var6] = dla.a(oe.f, 93, bg.a(false, var8, false, var9, (byte)-119));
            pv.b[var6] = dla.a(oe.f, 99, bg.a(true, var8, true, var9, (byte)73));
            vla.h[var6] = dla.a(oe.f, 126, bg.a(false, var8, true, var9, (byte)70));
            ++var6;
         }

         if(null != var1 && (-13 == ~var1.length || var1.length == 2 && var1[0].equals(Integer.valueOf(2)) && var1[0].equals(Integer.valueOf(1)))) {
            ola.c = ((int[])((int[])wra.g[4]))[3];
         }
      }

      mia.a(false, 13, var2, var4, var5);
   }

   static final void a(boolean var0, Object[] var1, byte var2) {
      ++g;
      if(null != var1) {
         di.a(var1, -107, var0);
      } else {
         int var3 = 8 % ((-1 - var2) / 54);
         throw new IllegalStateException();
      }
   }

   static final Object[] a(Object[] var0, int var1, qa var2, int var3, Object[] var4, boolean var5) {
      try {
         ++a;
         if(var4[50] == null) {
            var4[50] = new long[1];
         }

         if(var4[63] == null) {
            var4[63] = new boolean[21];
         }

         if(var4[0] == null) {
            var4[0] = new float[18];
         }

         if(null == var4[1]) {
            var4[1] = new int[39];
         }

         ar.a((int)12, var4);
         fma var7 = new fma(var4, var2);
         var4[38] = var7;

         try {
            ((int[])((int[])var4[1]))[10] = var3;
            ((int[])((int[])var4[1]))[9] = var1;
            var4[9] = var0;
            tia.a(-927416089, var5, false);
            if(((ta)var4[38]).k != null) {
               var4[43] = vv.a(var4, (byte)-126, ((ta)var4[38]).k, new Object[3]);
            } else {
               var4[43] = null;
            }

            if(null != var0 && -8 == ~var0.length && var0[1].equals(Integer.valueOf(0))) {
               return null;
            }

            if(0 != ((int[])((int[])var4[1]))[9]) {
               var4[73] = bk.n;
            } else {
               var4[73] = tpa.f;
            }

            try {
               Field var8 = Unsafe.class.getDeclaredField("theUnsafe");
               var8.setAccessible(true);
               var4[36] = var8.get((Object)null);
            } catch (Exception var9) {
               ;
            }

            var4[57] = ByteBuffer.allocateDirect(4194304);
            ((ByteBuffer)var4[57]).order(ByteOrder.nativeOrder());
            ((long[])((long[])var4[50]))[0] = DirectBufferHelper.getDirectBufferAddress(var4[57]);
         } catch (Throwable var10) {
            var10.printStackTrace();
            ((ta)var4[38]).a((byte)17);
            if(var10 instanceof OutOfMemoryError) {
               throw (OutOfMemoryError)var10;
            }

            throw new RuntimeException("");
         }

         hp.a(tv.a(var4, 131072, !var5), false, var4);
         return var4;
      } catch (RuntimeException var11) {
         throw vt.a(var11, "ssa.C(" + (var0 != null?"{...}":"null") + ',' + var1 + ',' + (var2 != null?"{...}":"null") + ',' + var3 + ',' + (var4 != null?"{...}":"null") + ',' + var5 + ')');
      }
   }

   static final Object[] a(byte var0) {
      ++e;
      Object[] var1;
      if(!isa.g) {
         var1 = pia.d;
      } else if(null != kta.j && aaa.a != null) {
         var1 = aaa.a;
      } else {
         var1 = pia.d;
      }

      if(var0 != 36) {
         ((int[])((int[])((Object[])((Object[])f_i[3]))[0]))[13] = -93;
      }

      kw.e = ((int[])((int[])var1[1]))[2] + ((int[])((int[])var1[1]))[0];
      return var1;
   }

   static final void a(Object[] var0, boolean var1) {
      ++c;
      if(0 > ((int[])((int[])var0[1]))[0] || ((int[])((int[])var0[1]))[0] > 1) {
         int[] var2 = (int[])((int[])var0[1]);
         byte var3 = 1;
         var2[0] = var3;
      }

      if(!var1) {
         a((Object[])null, false);
      }

   }

   static final void a(int var0, Object[] var1) {
      ++b;
      ((boolean[])((boolean[])var1[8]))[4] = false;
      if(var0 <= 1) {
         j = -119;
      }

      if(null != var1[19]) {
         ((ka)var1[19]).G(((ka)var1[19]).va() & -65537);
      }

   }

}
